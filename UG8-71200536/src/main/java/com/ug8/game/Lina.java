package com.ug8.game;

public class Lina extends MagicCharacter{
    public Lina(String string, int int1, int int2) {
        super(string, int1, int2);
    }
    public boolean skill (Character character) {
        this.mana = mana;
        if (mana == 60) {
            return damage == 600;
        } else {
            return false;
        }
    }

    public void attack(Character character) {
        return;
    }
}
