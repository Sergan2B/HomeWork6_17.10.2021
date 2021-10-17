package com.company;

public class Main {

    public static void main(String[] args) {
	// Создать класс Weapon (Оружие), с приватными полями тип оружия и название оружия.
        //СДЕЛАНО
        //Создать класс GameEntity (Игровая сущность), выделить все общие поля которые присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
        //СДЕЛАНО
        //Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем сложного типа данных Weapon (то есть дать оружие боссу). Также добавить геттеры и сеттеры для этого поля.
        //СДЕЛАНО
        //В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию о боссе.
        //СДЕЛАНО

        //ДЗ на сообразительность:
        //Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
        //СДЕЛАНО
        //Создать класс Skeleton (Скелет), унаследовать от Босса.
        //СДЕЛАНО
        //Добавить поле (кол-во стрел) и добавить геттеры и сеттеры.
        //СДЕЛАНО
        //Переопределить родительский метод printInfo в классе Skeleton
        //СДЕЛАНО
        //В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2 экземпляра скелета и заполнить данными)
        //СДЕЛАНО
        //затем распечатать всю информацию о скелетах.
        //СДЕЛАНО

         /*                                                            Условие задачи
        System.out.println("------------------------");
        
        Boss c03 = new Boss("Apostle");
        c03.setHealth(500);
        c03.setDamage(20);
        System.out.println("Здоровье босса Апостола равно: "+c03.getHealth() + "\nУрон босса Апостола равен: " + c03.getDamage());
        System.out.println("_______________________");

        Boss c02 = new Boss(1500, 90, "Sergan");
        System.out.println(c02); */


        Boss c05 = new Boss();
        c05.setHealth(1500);
        c05.setDamage(35);
        System.out.println(c05.printInfo());

        Skeleton k01 = new Skeleton();
        int aaa01 = (int) (Math.random()*100);
        k01.setArrows(aaa01);
        System.out.println("У скелета " + k01.getArrows() + " стрел");
        k01.setHealth(300);
        k01.setDamage(15);
        System.out.println(k01.printInfo());

        Skeleton k02 = new Skeleton();
        int aaa02 = (int) (Math.random()*100);
        k02.setArrows(aaa02);
        System.out.println("У скелета " + k02.getArrows() + " стрел");
        k02.setHealth(300);
        k02.setDamage(15);
        System.out.println(k02.printInfo());
    }
}
