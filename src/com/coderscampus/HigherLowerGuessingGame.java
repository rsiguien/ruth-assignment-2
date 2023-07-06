package com.coderscampus;

import java.util.Scanner;

public class HigherLowerGuessingGame {

	public static void main(String[] args) {
		NumberChecker nc = new NumberChecker();
        Scanner scanner = new Scanner(System.in);
        Integer flag = null;
        int guess_counter = 1;
        boolean win = false;
        int rnd_num = nc.randomizer();
        
        //this is for debugging purposes only
        //System.out.println("The number to guess was: " + rnd_num);
        
        while( guess_counter <= 5){
            
        	//this is for debugging purposes only
        	//System.out.println("Guess count: " + guess_counts);
            
            while(flag == null) {

                System.out.print("Pick a number between 1 and 100 ");
                int num_entry = Integer.parseInt(scanner.nextLine());
                
                if(nc.validateNumRange(num_entry) != null) {
                    
                	//this is for debugging purposes only
                	//System.out.println(num_entry);
                    
                    if(num_entry > rnd_num){
                        System.out.println("Please pick a lower number ");
                        break;
                    }
                        
                    if(num_entry < rnd_num){
                        System.out.println("Please pick a higher number ");
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
            
            flag = null;
            
            if(win) {
                // this is to exit the outer loop
                break;
            }
            
            if(guess_counter == 5)
            {
                System.out.println("You Lose!!!");
                System.out.println("The number to guess was: " + rnd_num);
            }
            
            
            guess_counter++;
            
        }
        
            scanner.close();
        
    }
    
}


	


