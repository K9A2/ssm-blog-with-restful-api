import Vue from 'vue'
import App from './App.vue'
import router from './router'

Vue.config.productionTip = false

/* eslint-disable no-unused-vars */
let app = new Vue({
  el: '#app',
  router,
  components: { App }
})
