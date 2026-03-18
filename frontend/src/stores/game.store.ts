import { ref } from 'vue'
import { defineStore } from 'pinia'
import type { Game } from '@/types/game.type'

export const useGameStore = defineStore('game', () => {
  const game = ref<Game | null>(null)
  const isLoading = ref(false)
  const error = ref<Error | null>(null)

  async function fetchGame(id: string): Promise<Game | null> {
    isLoading.value = true
    error.value = null
    try {
      const res = await fetch(`http://localhost:8080/game?id=${id}`)
      if (!res.ok) throw new Error('Failed to fetch game')
      game.value = await res.json() as Game
    } catch (e) {
      throw e
    } finally {
      isLoading.value = false
    }
    return game.value

  }

  return { game, isLoading, error, fetchGame }
})
