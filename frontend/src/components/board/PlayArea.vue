<script setup lang="ts">
import { onMounted } from 'vue';
import PlayerBase from '@/components/board/PlayerBase.vue';
import { useGameStore } from '@/stores/game.store'

const store = useGameStore()

onMounted(async () => {
  try {
    await store.fetchGame('1')
  } catch (e) {
    console.error("Failed to fetch game:", e);
  }
})

</script>

<template>
  <PlayerBase :isSelf="false" />
  <PlayerBase :isSelf="true" />

  <div v-if="store.isLoading">Loading...</div>
  <div v-else-if="store.error">Error: {{ store.error }}</div>
  <div v-else-if="store.game">
    <p>Decksize: {{ store.game.deckSize }}</p>
    <p>Turn: {{ store.game.turn }}</p>
    <p v-if="store.game.myHand">Your hand: {{ store.game.myHand.length }} cards</p>

    <div v-for="player in store.game.players" :key="player.id">
      {{ player.playerHand }}
    </div>
  </div>
</template>

<style scoped></style>
