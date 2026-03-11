<script setup lang="ts">
import { ref } from 'vue'
import type { Card } from '@/types/card'

defineProps<{
  card?: Card
}>()

// Consider using vite glob to load all cards
const getImage = (name: string, type: string) => {
  let category = ""
  switch (type) {
    case "PERSON":
      category = "people"
      break;
    case "EVENT":
      category = "events";
      break;
    case "SILO":
      category = "silo";
      break;
    case "CAMP":
      category = "camps";
      break;
  }
  return `/cards/${category}/${name}.png`;
}
</script>

<template>
  <div v-if="card" class="card-container selectable-card">
    <img class="card-image" :src="getImage(card.imageName, card.type)" />
  </div>
  <div v-else class="card-container">
  </div>
</template>
<style scoped>
* {
  --card-height: calc(318px/2);
  --card-width: calc(229px/2);
}

.card-container {
  background-color: grey;
  width: var(--card-width);
  height: var(--card-height);
  border: 3px solid transparent;
  border-radius: 6%;
  overflow: hidden;
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 5px;

}

.selectable-card:hover {
  border-color: aqua;
  transform: scale(1.1);
}

.card-image {
  clip-path: inset(3px 3px 3px 3px round 5%);
  width: calc(100% + 8px);
  height: calc(100% + 8px);
  /* clip-path: rect(1px var(--card-width) var(--card-height * 0.8) 1px round 5%); */
  /* border-radius: 5px; */
  /* border: 2px solid red; */

}
</style>
