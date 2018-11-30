<template>
  <div id="index" class="index-list container">
    <div class="index-item" v-for="(post, index) in posts" :key="index">
      <div class="date">{{post.modifyTime}}</div>
      <router-link :to="{ name: 'blog', params: { payload: JSON.stringify(post) } }">
        <h1>{{post.title}}</h1>
      </router-link>
      <div class="description">
        {{post.description}}
        <router-link :to="{ name: 'blog', params: { payload: JSON.stringify(post) } }">
          <div class="read-more">
            <a>阅读原文...</a>
          </div>
        </router-link>
      </div>
      <tag-list v-bind:tag="post.tag"></tag-list>
    </div>
  </div>
</template>

<script>

import axios from 'axios'

import TagList from './TagList.vue'

export default {
  name: 'index_post_list',
  components: {
    TagList
  },
  data: function () {
    return {
      posts: []
    }
  },
  mounted: function () {
    axios
      .get('/api/profile/all')
      .then(response => {
        this.posts = JSON.parse(response.data.body)
        this.posts.forEach(function (post) {
          post.tag = post.tag.split(', ')
          post.modifyTime = post.modifyTime.split(' ')[0]
        })
      })
      .catch(function (err) {
        console.log(err)
      })
  }
}

</script>

<style scoped>
  @import url('../../static/css/style.css');

  h1 {
    color: #3f51b5;
    font-weight: 400;
    margin: 0.5rem 0;
  }

  .index-list {
    margin: 2rem auto;
    min-height: calc(100vh - 360.451px);
  }

  .index-item {
    margin-bottom: 2rem;
    padding-top: 1rem;
    padding-left: 1rem;
    padding-right: 1rem;
    background-color: #ffffff;
    box-shadow: 0 1px 2px rgba(151, 151, 151, 0.58);
    border-radius: 2px;
  }

  .description {
    padding-bottom: 0.5rem;
    line-height: 1.8rem;
  }

  .date {
    text-align: left;
    color: #727272;
    font-weight: 700;
    margin: 0;
    display: inline;
  }

  .read-more {
    display: inline;
    padding: 0.3rem;
    color: #3f51b5;
    border-radius: 2px;
  }

  .read-more:hover {
    background-color: #eaecf7;
  }
</style>
