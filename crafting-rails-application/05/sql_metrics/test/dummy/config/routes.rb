Dummy::Application.routes.draw do
  resources :users

  resources :sql_metrics, :only => [:index, :destroy]
end
