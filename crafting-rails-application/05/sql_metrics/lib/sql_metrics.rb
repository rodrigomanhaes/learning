require 'active_support/notifications'
require 'mongo_mapper'
require 'sql_metrics/mute_middleware'
require 'sql_metrics/engine'
require 'thread'

MongoMapper.database = "sql_metrics-#{Rails.env}"

module SqlMetrics
  def self.queue
    @queue ||= Queue.new
  end

  def self.thread
    @thread ||= Thread.new do
      while args = queue.pop
        SqlMetrics::Metric.store!(args)
      end
    end
  end

  def self.finish!
    queue << nil
    thread.join
    @thread = nil
    thread
  end
end

SqlMetrics.queue
SqlMetrics.thread

ActiveSupport::Notifications.subscribe /^sql\./ do |*args|
  SqlMetrics.queue << args unless SqlMetrics.mute?
end
