import type { Card } from '@/types/card';

export interface Player {
  id: number
  playerHand: Card[]
  water: number
  camps: Card[]
  waterSiloOnHand: boolean
  raiderInPlay: boolean
  playArea: Card[][]
  eventQueue: Card[]
}
