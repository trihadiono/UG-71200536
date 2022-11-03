package com.ug8.game;

public abstract class MagicCharacter extends Character {

    public MagicCharacter(String string, int int1, int int2) {
        super(string, int1, int2);
    }
    private int mana;

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
    }

    @Override
    public int attacked() {
        return 0;
    }
}
