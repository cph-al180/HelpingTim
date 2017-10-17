/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.helptim2;

import java.util.*;

/**
 *
 * @author Andreas
 */
public class Random {

    public static void main(String[] args) {
        int numberOfParticipants = 1000;
        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < numberOfParticipants; i++) {
            randomNumber = (int) Math.floor(Math.random() * 101);
            //Participants.add(new Particpant(randomNumber));
            
        }
    }

}
