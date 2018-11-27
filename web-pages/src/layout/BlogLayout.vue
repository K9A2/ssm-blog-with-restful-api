<template>
  <div>
    <navigation></navigation>
    <blog-title></blog-title>
    <index-post-list></index-post-list>
    <foot></foot>
  </div>
</template>

<script>
/* 基础组件 */
import Navigation from '../components/Navigation'
import BlogTitle from '../components/BlogTitle'
import IndexPostList from '../components/IndexPostList'
import Foot from '../components/Foot'

export default {
  name: 'BaseLayout',
  components: {
    navigation: Navigation,
    blogTitle: BlogTitle,
    indexPostList: IndexPostList,
    foot: Foot
  }
}
</script>

<style scoped>
</style>
