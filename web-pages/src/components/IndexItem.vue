<template>
  <div class="index-item">
    <div class="date">{{date}}</div>
    <a href="./git_repo_non22.html">
      <h1>{{title}}</h1>
    </a>
    <div class="description">
      {{description}}
      <div class="read-more">
        <a href="{{readMore}}">阅读原文...</a>
      </div>
    </div>
    <div class="tag-list">
      <div class="tag-item">
        <a href="./tag.html?tag=Git">Git</a>
      </div>
      <div class="tag-item">
        <a href="./tag.html?tag=SSH">SSH</a>
      </div>
      <div class="tag-item">
        <a href="./tag.html?tag=Repository">Repository</a>
      </div>
      <div class="tag-item">
        <a href="./tag.html?tag=Server">Server</a>
      </div>
    </div>
  </div>
</template>

<script>
</script>

<style scoped>
@import url('../../static/css/..');
</style>
