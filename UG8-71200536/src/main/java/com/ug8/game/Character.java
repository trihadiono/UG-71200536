package com.ug8.game;

public abstract class Character implements ObjectAttack {
    public Character (String string, int int1, int int2){
        super();
    }
    protected int damage;
    protected String name;
    protected int health;

    public void showCharacterInfo(){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public boolean isDie(){
        if (health <=0) return true;
        else {
            return false;
        }
    }
    public abstract int attacked();
}
