package com.ug8.game;

public abstract class PhysicalCharacter extends Character{
    public PhysicalCharacter(String string, int int1, int int2) {
        super(string, int1, int2);
    }
    private int armor;

    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
    }

    @Override
    public int attacked() {
        return 0;
    }
}
