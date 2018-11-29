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
    alert(this.$route.params.id)
  }
}

</script>

<style>
  @import url('../../static/css/style.css');
</style>
