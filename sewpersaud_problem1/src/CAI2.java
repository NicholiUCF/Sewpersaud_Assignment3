import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI2

{
	 public static void main(String[] args) {
		 SecureRandom number = new SecureRandom();
	     Scanner answer = new Scanner(System.in);
	     Random pos = new Random();
	     

			
			int firstNum = number.nextInt(9);
	        int secondNum = number.nextInt(9);

	        System.out.println("How much is " + firstNum + " times " + secondNum + "?");
	       
	       int answer1 = answer.nextInt();
	         
	        if (answer1 == (firstNum * secondNum)) {
	        	int posR = pos.nextInt(4);
	        	switch(posR) {
	        	case 0 : System.out.println("Very Good!"); break;
	        	case 1 : System.out.println("Excellent!"); break;
	        	case 2 : System.out.println("Nice Work!"); break;
	        	case 3 : System.out.println("Keep up the good work!"); break;
	        	}
	        }
	        while (answer1 != (firstNum * secondNum)) {
	        	int negR = pos.nextInt(4);
	        	switch(negR) {
	        	case 0 : System.out.println("No. Please try again."); break;
	        	case 1 : System.out.println("Wrong. Try once more"); break;
	        	case 2 : System.out.println("Don't give up!"); break;
	        	case 3 : System.out.println("No. Keep trying."); break;
	        	
	        }
	        	int answer2 = answer.nextInt();
	        		if (answer2 == (firstNum * secondNum)) {
	        			int posR = pos.nextInt(4);
	    	        	switch(posR) {
	    	        	case 0 : System.out.println("Very Good!"); break;
	    	        	case 1 : System.out.println("Excellent!"); break;
	    	        	case 2 : System.out.println("Nice Work!"); break;
	    	        	case 3 : System.out.println("Keep up the good work!"); break;
	    	        	}
	    	        	break;
	        		}
	 }
	  
   }
}
