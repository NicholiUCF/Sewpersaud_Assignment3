import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
    public static void main(String[] args) {
        //generate random numbers
        SecureRandom number = new SecureRandom();
        Scanner answer = new Scanner(System.in);


		
		int firstNum = number.nextInt(9);
        int secondNum = number.nextInt(9);

        System.out.println("How much is " + firstNum + " times " + secondNum + "?");

      
		int answer1 = answer.nextInt();

        if (answer1 == (firstNum * secondNum)) {
            System.out.println("Very Good!");}
            else {
            while (answer1 != (firstNum * secondNum)) {
                System.out.println("No. Please try again.");
				int answer2 = answer.nextInt();

                 if (answer2 == (firstNum * secondNum)) {
                    System.out.println("Very Good!");
                    	break;
                 }
            }
        }
    }        
}


