/*
	      Problem:
          We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
*/
import java.util.Scanner;

public class hasTeen{
			public static void main(String args[]){
				        int input = 0;
				        boolean teen = true;
						Scanner keyboard = new Scanner(System.in);
						System.out.println("Enter the age of three people");
						//prompts the user for input 3 times
						for(int i = 0;i<3;i++){
								 input = keyboard.nextInt();
							}
						//checks if the inputs meet the requirement
						if(input >=13 && input <=19){
								System.out.println("atleast one of them is a teen.");
							}
						else{
								System.out.println("No one is a teen here.");
							}
				}

	}