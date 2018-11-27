import Vue from 'vue'
import Router from 'vue-router'

import App from './App.vue'
import Index from './page/Index.vue'
import Blog from './page/Blog.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'App',
      component: App
    },
    {
      path: '/home',
      name: 'index',
      component: Index
    },
    {
      path: '/blog/:name',
      name: 'blog',
      component: Blog
    }
  ]
})
