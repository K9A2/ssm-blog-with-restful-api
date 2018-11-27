<template>
  <div class="foot">
    <p>Copyright © 2014 - {{ currentYear }} stormlin.</p>
    <p>All Rights Reserved.</p>
    <p>
      <a href="http://www.miitbeian.gov.cn">备案号：粤ICP备16029958号-1</a>
    </p>
  </div>
</template>

<script>
export default {
  computed: {
    /* 获取当前年份 */
    currentYear: function () {
      var date = new Date()
      var year = date.getFullYear()
      return year.toString()
    }
  }
}
</script>

<style scoped>
.foot {
  color: #fff;
  font-size: 0.8rem;
  padding: 1rem 0;
  text-align: center;
  background-color: #3f51b5;
  min-height: 6.5rem;
}

a {
  color: #ffffff;
  text-decoration: none;
}
</style>
