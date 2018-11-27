<template>
  <div class="tag-list">
    <li class="tag-item" v-for="(t, index) in tag" :key="index">
      <a v-bind:href="'tag/' + t">{{t}}</a>
    </li>
  </div>
</template>

<script>
export default {
  props: {
    tag: {
      type: Array,
      required: true
    }
  }
}
</script>

<style scoped>
.tag-list {
  border-top: 1px solid #bebebe;
  padding-top: 1rem;
  padding-bottom: 1rem;
}

.tag-list:last-child {
  margin-right: 0;
}

.tag-item {
  display: inline-block;
  color: #ffffff;
  padding: 0.5rem 1rem;
  margin-right: 0.5rem;
  border-radius: 2px;
}

.tag-item:hover {
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.26);
}

.tag-item a {
  color: #ffffff;
}

.tag-item:nth-child(1) {
  background: #8bc34a;
}

.tag-item:nth-child(2) {
  background: #673ab7;
}

.tag-item:nth-child(3) {
  background: #ff9800;
}

.tag-item:nth-child(4) {
  background: #f44336;
}

.tag-item:nth-child(5) {
  background: #00abc0;
}
</style>
