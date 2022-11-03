package com.ug8.game;

public class DragonKnight extends PhysicalCharacter {

    public DragonKnight(String string, int int1, int int2) {
        super(string, int1, int2);
    }
    private int dragonFormAttack;
    public void skill(){
        int dragonFormAttack = 2;
    }
    public void attack(Character character) {
        return;
    }
}
