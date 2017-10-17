/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.helptim2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andreas
 */
public class Main {

    public static void main(String[] args) {
        
        //Making some weapons
        Weapon sword = new Weapon();
        sword.name = "420Sword";
        sword.damage = 420;
        
        Weapon gun = new Weapon();
        gun.name = "360gun";
        gun.damage = 360;
        
        //Making Assassin
        Assassin assassin = new Assassin();
        
        //Making Tim
        Person tim = new Person(420, 200, "Tim");
        tim.alive = true;
        tim.weapon = sword;
        tim.cars = new ArrayList<>();
        tim.words = new ArrayList<>();
        
        //Making Andreas
        Person andreas = new Person(360, 0, "Andreas");
        andreas.alive = true;
        andreas.weapon = gun;
        
        //Some varibles
        int moneyToGive = 420;
        int speedToLose = 60;
        
        //Operating on tim
        tim.money = tim.money + moneyToGive;
        tim.speed = tim.speed - speedToLose;
        tim.isRunning = true;
        
        Car car1 = new Car();
        car1.name = "DopeCar";
        car1.modelNo = "420B";
        Car car2 = new Car();
        car2.name = "EvenMoreDopeCar";
        car2.modelNo = "360C";
        Car car3 = new Car();
        car3.name = "SomeCar";
        car3.modelNo = "C3PO";
        
        //Adding Strings to Tim's List<String> Words
        tim.cars.add(car1);
        tim.cars.add(car2);
        tim.cars.add(car3);
        //tim.words.remove(1);
        //tim.name = tim.words.get(2);
        //tim.words.size()
        
        tim.words.add("Dope");
        tim.words.add("Hello");
        
        //Operating on Andreas
        andreas.money = andreas.money + moneyToGive;
        andreas.money = andreas.money * 2;
        andreas.speed = andreas.speed - (speedToLose/2);
        
        //Changing names people
        assassin.ChangeName(tim, "Bob");
        assassin.ChangeName(andreas, "Billy");
        
        System.out.println("Tim money: " + tim.money);
        System.out.println("Tim speed: " + tim.speed);
        System.out.println("Is tim running?: " + tim.isRunning);
        System.out.println("Tim name?: " + tim.name);
        System.out.println("Tim weapon 1: " + tim.weapon.name);
        
        System.out.println("Tim list: " + tim.cars.get(0).name);
        System.out.println("Tim list: " + tim.cars.get(1).name);
        System.out.println("Tim list: " + tim.cars.get(2));
        System.out.println("Word 1: " + tim.words.get(0));
        
        
        System.out.println();
        
        System.out.println("Andreas money: " + andreas.money);
        System.out.println("Andreas speed: " + andreas.speed);
        System.out.println("Is andreas running?: " + andreas.isRunning);
        System.out.println("Andreas name?: " + andreas.name);
        System.out.println("Andreas weapon: " + andreas.weapon.name);
        
    }

}
