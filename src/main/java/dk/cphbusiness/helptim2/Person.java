package dk.cphbusiness.helptim2;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    public int speed;
    public int money;
    public String name;
    public boolean isRunning = false;
    public Weapon weapon;
    public List<Car> cars;
    public List<String> words;
    
    public boolean alive;

    public Person(int speed, int money, String name) {
        this.speed = speed;
        this.money = money;
        this.name = name;
    }

    public Person() {
    }
    
    
    
    
    
   
    
}
