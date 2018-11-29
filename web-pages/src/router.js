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
      component: App
    },
    {
      path: '/home',
      component: Index
    },
    {
      path: '/index',
      component: App
    },
    {
      path: '/index.html',
      component: App
    },
    {
      path: '/blog/:id',
      component: Blog
    }
  ]
})
