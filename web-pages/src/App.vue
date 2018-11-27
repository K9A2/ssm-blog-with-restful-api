<template>
  <div>
    <index></index>
  </div>
</template>

<script>
// 首页
import Index from './page/Index'

export default {
  name: 'app',
  components: {
    index: Index
  }
}
</script>

<style scoped>
  @import url('../static/css/style.css');
</style>
