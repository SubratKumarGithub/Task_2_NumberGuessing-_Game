package Techno_Hacks_Internship;
import java.util.Random;
import java.util.Scanner;
public class Task_2_Number_Guessing_game {
   public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    Random random =new Random();
    int min=1;
    int max=100;
    int randomNumber =random.nextInt(max +1);
    int attempts =0;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("            ");
    System.out.println("I've selected a random number between 1 and 100. Try to guess it!");

    while(true){
        System.out.println("Enter your guess");
    int userguess =sc.nextInt();
    attempts++;

    if(userguess<min || userguess>100){
    System.out.println("please enter a number between 10 to 100");}
    else if (userguess < randomNumber){
        System.out.println("try a higher number");
    }
        else if(userguess>randomNumber){
            System.out.println("Try a lower number");
        
        }
        else{
            System.out.println("Congratulation !! You  guessed the correct  " + randomNumber +  " i.e " +attempts+ " attempts ");
        break;
        }
    
    }
    sc.close();
   }
}
