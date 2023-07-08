package com.coderscampus;

import java.util.Scanner;

public class HigherLowerGuessingGame {

	public static void main(String[] args) {
		NumberChecker nc = new NumberChecker();
        Scanner scanner = new Scanner(System.in); 
        boolean is_valid = false;
        int guess_counter = 1;
        boolean win = false;
        int rnd_num = nc.randomizer();
        
        //this is for debugging purposes only
        //System.out.println("The number to guess was: " + rnd_num);
        
        while( guess_counter <= 5){
            
        	//this is for debugging purposes only
        	//System.out.println("Guess count: " + guess_counts);
            
            while(!is_valid) {

                System.out.print("Pick a number between 1 and 100 ");
                int num_entry = Integer.parseInt(scanner.nextLine());
                
                if(nc.validateNumRange(num_entry) != null) {
                    
                	//this is for debugging purposes only
                	//System.out.println(num_entry);
                    
                    if(num_entry > rnd_num){
                        System.out.println("Please pick a lower number ");
                        is_valid=true;
                        break;
                    }
                        
                    if(num_entry < rnd_num){
                        System.out.println("Please pick a higher number ");
                        is_valid=true;
                        break;
                    }
                        
                    
                    if(num_entry == rnd_num)
                    {
                        System.out.println("You Win!!!");
                        win = true;
                        break;
                    }
                }
                else 
                {
                    System.out.println("Your guess is not between 1 and 100. Try again... "); 
                    break;
                }

            }
            
           
            
            if(win) {
                // this is to exit the outer loop
                break;
            }
            
            if(guess_counter == 5)
            {
                System.out.println("You Lose!!!");
                System.out.println("The number to guess was: " + rnd_num);
            }
            
            if(is_valid) {
            	guess_counter++;
            	is_valid=false;
            	
            }
            	
            
        }
        
            scanner.close();
        
    }
    
}


	


