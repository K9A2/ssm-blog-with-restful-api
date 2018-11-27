<template>
  <div id="blog-title">
    <div class="container">
      <slot name="main"></slot>
      <slot name="sub"></slot>
    </div>
  </div>
</template>

<script>
export default {}
</script>

<style scoped>
@import url('../../static/css/style.css');

#blog-title {
  padding: 1rem 0;
  margin-top: 0;
  font-size: 1rem;
  color: #ffffff;
  min-height: 5rem;
  text-align: center;
  background-color: #3f51b5;
}

h1 {
  font-size: 3rem;
  color: #ffffff;
  margin: 0;
  font-weight: 500;
  word-break: normal;
  text-align: center;
}

h2 {
  font-size: 1.5rem;
  color: #fff;
  margin: 0;
  font-weight: 500;
  word-break: normal;
}
</style>
