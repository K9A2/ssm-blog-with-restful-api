<template>
  <div id="navigation">
    <div class="container">
      <div class="icon">
        <a href="index">
          <img id="avatar" src="/static/img/icon.jpg">
        </a>
      </div>
      <div class="list">
        <ul class="nav-list">
          <li class="nav-list-item">
            <router-link to="/">
              <a href="/">首页</a>
            </router-link>
            <!--<a href="/">首页</a>-->
          </li>
          <li class="nav-list-item">
            <a href="/about">关于我</a>
          </li>
          <li class="nav-list-item">
            <a href="http://u4813096.viewer.maka.im/k/OQHMX6E6?from=timeline">狗粮合集</a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {}
  }
}
</script>

<style scoped>
@import url('../../static/css/style.css');

#navigation {
  height: 3.25rem;
  background-color: #3f51b5;
  display: block;
  margin: 0 auto;
  width: 100%;
  top: 0;
  left: 0;
  z-index: 9999;
}

.icon {
  display: block;
  float: left;
  width: 3.25rem;
  height: 3.25rem;
  text-align: center;
}

a {
  color: #ffffff;
  text-decoration: none;
  line-height: 3.25rem;
}

.icon img {
  width: 2rem;
  height: 2rem;
  margin: 0 auto;
  border-radius: 50%;
  overflow: hidden;
  display: inline-block;
  vertical-align: middle;
}

.list {
  height: 3.25rem;
}

.nav-list {
  color: inherit;
  list-style-type: none;
  margin: 0;
  padding: 0;
  display: inline-block;
  text-align: center;
}

.nav-list-item {
  display: block;
  float: left;
  height: 3.25rem;
  line-height: 3.25rem;
  padding-left: 10px;
  padding-right: 10px;
  list-style-type: none;
  margin-right: 0;
  margin-bottom: 0;
}
</style>
