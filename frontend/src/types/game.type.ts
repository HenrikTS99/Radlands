import type { Card } from '@/types/card';
import type { Player } from '@/types/player.type';

export interface Game {
  players: Player[]
  deckSize: number
  turn: number
  myPlayerId: number
  myHand: Card[]
}
