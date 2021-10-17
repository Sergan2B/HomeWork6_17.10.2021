package com.company;

public class Boss  extends GameEntity{

    String nameBossB = "Mirana";
    Weapon e01 = new Weapon();
    public Boss() {}

    public Boss(String nameBossApostleB) {
        System.out.println("Имя босса: " + nameBossApostleB);
    }

    public Boss (int health, int damage, String nameBossB) {
        this.health = health;
        this.damage = damage;
        System.out.println("Имя босса: " + nameBossB);
        System.out.println("Здоровье босса равно: " + health);
        System.out.println("Урон босса равен: " + damage);
        System.out.println("Тип оружия: " + e01.getTypeOfWeapon());
        System.out.println("Имя оружия: " + e01.getNameWeapon());

        System.out.println("_________________------_____________");
    }
    public String printInfo(){
        return health + " = Здоровье босса \n" + damage + " = Урон босса \n" + nameBossB + " = Имя босса \n" + e01.getNameWeapon() + " = Имя оружия \n" + e01.getTypeOfWeapon() + " = Тип оружия \n";
    }
}
