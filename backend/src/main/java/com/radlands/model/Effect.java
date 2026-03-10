package com.radlands.model;

public enum Effect {
    // Junk effects
    INJURE,
    RESTORE,
    DRAW,
    PUNK,
    RAID,
    WATER,
    // Other effects
    DAMAGE,
    DESTROY;

    public boolean isJunk() {
        return this != DAMAGE && this != DESTROY;
    }
}
