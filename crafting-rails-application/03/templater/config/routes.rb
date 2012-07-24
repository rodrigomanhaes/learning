Templater::Application.routes.draw do
  resources :users
  resources :sql_templates
  match 'cms/*page', to: 'cms#respond'
end
