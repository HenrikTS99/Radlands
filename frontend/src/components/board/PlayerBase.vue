<script setup lang="ts">
import { ref } from 'vue';
import CardContainer from '@/components/card/CardContainer.vue';
import type { Card } from '@/types/card';

const card1: Card = {
  name: "Argo Yesky",
  imageName: "argo_yesky",
  type: "PERSON"
}
const card2: Card = {
  name: "Argo Yesky",
  imageName: "magnus_karv",
  type: "PERSON"
}

const waterSilo: Card = {
  name: "Water Silo",
  imageName: "water_silo",
  type: "SILO"
}


const raiders: Card = {
  name: "Raiders",
  imageName: "raiders",
  type: "EVENT"
}

defineProps<{
  isSelf: boolean
}>()

</script>
<template>
  <div class="base" :id="isSelf ? 'self-base' : 'enemy-base'">
    <div class="card-column event-column">
      <CardContainer />
      <CardContainer />
      <CardContainer />
    </div>
    <div class="card-columns-container">
      <div class="card-column">
        <CardContainer />
        <CardContainer :card="card1" />
        <CardContainer :card="card2" />
      </div>

      <div class="card-column">
        <CardContainer />
        <CardContainer :card="card1" />
        <CardContainer :card="card2" />
      </div>
      <div class="card-column">
        <CardContainer />
        <CardContainer :card="card1" />
        <CardContainer :card="card2" />
      </div>

    </div>
    <div class="card-column bonus-column">
      <CardContainer :card="waterSilo" />
      <CardContainer :card="raiders" />
    </div>
  </div>
</template>
<style scoped>
.base {
  display: flex;
  justify-content: center;
}

#self-base {}

#enemy-base {
  transform: scaleY(-1);
  transform: rotate(180deg);
}

.card-columns-container {
  display: flex;
  justify-content: center;
  border: 1px solid lightblue;
}

.card-column {
  border: 3px solid black;
  border-radius: 8px;
  margin: 1em;
}

.event-column {
  margin-right: 3em;
}

.bonus-column {
  margin-left: 3em;
}
</style>
