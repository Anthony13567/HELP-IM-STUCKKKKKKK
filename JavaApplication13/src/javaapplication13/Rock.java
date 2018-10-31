/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Random;
import java.util.*;

/**
 *
 * @author talberdav
 */
public class Rock {



public static void main(String[] args) 
{ 
    String personPlay; //User's play -- "R", "P", or "S" 
    String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
    int computerInt; //Randomly generated number used to determine 
                     //computer's play 
    String response; 


    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    System.out.println();

    //Generate computer's play (0,1,2) 
    computerInt = generator.nextInt(3)+1; 

    //Translate computer's randomly generated play to 
    //string using if //statements 

    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 


    //Get player's play from input-- note that this is 
    // stored as a string 
    System.out.println("Enter your play: "); 
    personPlay = scan.next();

    //Make player's play uppercase for ease of comparison 
    personPlay = personPlay.toUpperCase(); 

    //Print computer's play 
    System.out.println("Computer play is: " + computerPlay); 


    //See who won. Use nested ifs 

    if (personPlay.equals(computerPlay)) 
       System.out.println("It's a tie!"); 
    else if (personPlay.equals("R")) 
       if (computerPlay.equals("S")) 
          System.out.println("Rock crushes scissors. You win!!");
    else if (computerPlay.equals("P")) 
            Sy
