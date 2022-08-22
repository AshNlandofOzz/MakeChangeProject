package SkillDistilleryProject;

import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the purchase amount: ");
		double price = scan.nextDouble();
		System.out.println("Enter the amount paid: ");
		double amount= scan.nextDouble();
		double change = amount - price;
		System.out.printf("You get $%,.2f change", change);
		System.out.println("");
		changeCalc(price, amount);	
				
		
		scan.close();
	}
	public static void changeCalc(double cost, double paid) {

		double change = paid - cost;
			if (change >= 20) {
					 System.out.println((int)(change/20) + ": Twenty" );
					 change = change % 20;
				 }
			 if (change >= 10) {
				 System.out.println((int)(change/10) + ": Ten" );
				 change = change % 10;
			 } 
			 if (change >= 5) {
				 System.out.println((int)(change/5) + ": Five" );
				 change = change % 5;
			 }  
			 if (change >= 1) {
				 System.out.println((int)(change/1) + ": One" );
				 change = change % 1;
			 }  
			 if (change >= .25) {
				 System.out.println((int)(change/.25) + ": Quarter" );
				 change = change % .25;
			 }  
			 if (change >= .10) {
				 System.out.println((int)(change/.10) + ": Dime" );
				 change = change % .10;
			 }  
			 if (change >= .05) {
				 System.out.println((int)(change/.05) + ": Nickel" );
				 change = change % .05;
			 }  
			 if (change >= .01) {
				 System.out.println((int)(change/.01) + ": Penny" );
				 change = change % .05;
			 }  
			 if (change == 0) {
				 System.out.println("No change due. ");
			 }
			 if (change < 0){
				 System.out.println("System error. Not enough money tendered.");
			 }

		}
	}
