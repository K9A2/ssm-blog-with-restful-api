<template>
  <div>
    <navigation></navigation>
    <blog-title></blog-title>
    <foot></foot>
  </div>
</template>

<script>

/* 页面组件 */
import Navigation from '../components/Navigation.vue'
import BlogTitle from '../components/BlogTitle.vue'
import Foot from '../components/Foot.vue'

export default {
  name: 'blog',
  components: {
    /* 基础组件 */
    navigation: Navigation,
    blogTitle: BlogTitle,
    foot: Foot
  },
  data: function () {
    return {}
  },
  mounted: function () {
    let post = this.$route.params['payload']
    if (typeof post === 'undefined') {
      // 用户刷新页面的时候无法从 query 中获取 post 对象, 所以需要从sessionStorage 中获取 post 对象
      post = sessionStorage['post']
    } else {
      // 用户从其他页面跳转过来, query 中已经包含了 post 对象
      sessionStorage['post'] = post
    }
    console.log(JSON.parse(post))
  }
}

</script>

<style>
  @import url('../../static/css/style.css');
</style>
