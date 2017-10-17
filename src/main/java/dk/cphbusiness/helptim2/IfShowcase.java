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
public class IfShowcase {
    
    public static void main(String[] args) {
        
        List<Person> USERS = new ArrayList<>();
        Person USER_2 = new Person(200, 200, "Bob");
        USERS.add(new Person(100, 100, "Billy"));
        Person USER_1 = new Person(420, 360, "Tim");
        USERS.add(USER_1);
        USERS.add(USER_2);
        
        //We want to find out how many users have a speed of 200 or greater
        //
        
        //For each Object inside USERS
        for(int i = 0; i < USERS.size(); i++){
            if(USERS.get(i).speed > 250){
                USERS.get(i).money = USERS.get(i).money + 50;
                System.out.println(USERS.get(i).name);
            }
            else{
                System.out.println(USERS.get(i).name + " is slow as f");
            }
        }

        System.out.println("End");
    }
    
    
    
}
