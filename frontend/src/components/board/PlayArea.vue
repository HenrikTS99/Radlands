<script setup lang="ts">
import { ref } from 'vue';
import PlayerBase from '@/components/board/PlayerBase.vue';
import type { Card } from '@/types/card';


</script>

<template>
  <PlayerBase :isSelf="false" />
  <PlayerBase :isSelf="true" />
</template>

<style scoped></style>
