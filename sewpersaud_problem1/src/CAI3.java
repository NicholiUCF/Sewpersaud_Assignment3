import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class CAI3 {
	
	public static void main(String[] args) {
		quiz();
	
	}
public static void quiz() {
	int lmao = 1;
	while ( lmao == 1){
    	   SecureRandom number = new SecureRandom();
    	    Scanner answer = new Scanner(System.in);
    	    Random pos = new Random();
    		int firstNum = number.nextInt(9);
    	    int secondNum = number.nextInt(9);
          float correct = 0;
          float incorrect = 0;
    	    
       System.out.println("What is " + firstNum + " times " + secondNum +"");
       
       int answer1 = answer.nextInt();
       
       if (answer1 == (firstNum * secondNum)) {
       	int posR = pos.nextInt(4);
       	switch(posR) {
       	case 0 : System.out.println("Very Good!"); break;
       	case 1 : System.out.println("Excellent!"); break;
       	case 2 : System.out.println("Nice Work!"); break;
       	case 3 : System.out.println("Keep up the good work!"); break;
       	}
       	correct = correct + 1;
       }
       else {
       	int negR = pos.nextInt(4);
       	switch(negR) {
       	case 0 : System.out.println("No. Please try again."); break;
       	case 1 : System.out.println("Wrong. Try once more"); break;
       	case 2 : System.out.println("Don't give up!"); break;
       	case 3 : System.out.println("No. Keep trying."); break;
       	
       	}
       	incorrect = incorrect + 1; 
 }
       //Second Question
       int f2rstNum = number.nextInt(9);
	    int s2condNum = number.nextInt(9);
       System.out.println("What is " + f2rstNum + " times " + s2condNum +"");
       
       int answer2 = answer.nextInt();
       
       if (answer2 == (f2rstNum * s2condNum)) {
       	int posR = pos.nextInt(4);
       	switch(posR) {
       	case 0 : System.out.println("Very Good!"); break;
       	case 1 : System.out.println("Excellent!"); break;
       	case 2 : System.out.println("Nice Work!"); break;
       	case 3 : System.out.println("Keep up the good work!"); break;
       	}
       	correct = correct + 1;
       }
       else {
       	int negR = pos.nextInt(4);
       	switch(negR) {
       	case 0 : System.out.println("No. Please try again."); break;
       	case 1 : System.out.println("Wrong. Try once more"); break;
       	case 2 : System.out.println("Don't give up!"); break;
       	case 3 : System.out.println("No. Keep trying."); break;
       	
       	}
       	incorrect = incorrect + 1; 
       }
  // Third Question
       int f3rstNum = number.nextInt(9);
	    int s3condNum = number.nextInt(9);
       System.out.println("What is " + f3rstNum + " times " + s3condNum +"");
       
       int answer3 = answer.nextInt();
       
       if (answer3 == (f2rstNum * s2condNum)) {
       	int posR = pos.nextInt(4);
       	switch(posR) {
       	case 0 : System.out.println("Very Good!"); break;
       	case 1 : System.out.println("Excellent!"); break;
       	case 2 : System.out.println("Nice Work!"); break;
       	case 3 : System.out.println("Keep up the good work!"); break;
       	}
       	correct = correct + 1;
       }
       else {
       	int negR = pos.nextInt(4);
       	switch(negR) {
       	case 0 : System.out.println("No. Please try again."); break;
       	case 1 : System.out.println("Wrong. Try once more"); break;
       	case 2 : System.out.println("Don't give up!"); break;
       	case 3 : System.out.println("No. Keep trying."); break;
       	
       	}
       	incorrect = incorrect + 1; 
       }
       
       //question 4
       int f4rstNum = number.nextInt(9);
	    int s4condNum = number.nextInt(9);
       System.out.println("What is " + f4rstNum + " times " + s4condNum +"");
       
       int answer4 = answer.nextInt();
       
       if (answer4 == (f4rstNum * s4condNum)) {
       	int posR = pos.nextInt(4);
       	switch(posR) {
       	case 0 : System.out.println("Very Good!"); break;
       	case 1 : System.out.println("Excellent!"); break;
       	case 2 : System.out.println("Nice Work!"); break;
       	case 3 : System.out.println("Keep up the good work!"); break;
       	}
       	correct = correct + 1;
       }
       else {
       	int negR = pos.nextInt(4);
       	switch(negR) {
       	case 0 : System.out.println("No. Please try again."); break;
       	case 1 : System.out.println("Wrong. Try once more"); break;
       	case 2 : System.out.println("Don't give up!"); break;
       	case 3 : System.out.println("No. Keep trying."); break;
       	
       	}
       	incorrect = incorrect + 1; 
       }
//Question 5 
       int f5rstNum = number.nextInt(9);
	    int s5condNum = number.nextInt(9);
       System.out.println("What is " + f5rstNum + " times " + s5condNum +"");
       
       int answer5 = answer.nextInt();
       
       if (answer5 == (f5rstNum * s5condNum)) {
       	int posR = pos.nextInt(4);
       	switch(posR) {
       	case 0 : System.out.println("Very Good!"); break;
       	case 1 : System.out.println("Excellent!"); break;
       	case 2 : System.out.println("Nice Work!"); break;
       	case 3 : System.out.println("Keep up the good work!"); break;
       	}
       	correct = correct + 1;
       }
       else {
       	int negR = pos.nextInt(4);
       	switch(negR) {
       	case 0 : System.out.println("No. Please try again."); break;
       	case 1 : System.out.println("Wrong. Try once more"); break;
       	case 2 : System.out.println("Don't give up!"); break;
       	case 3 : System.out.println("No. Keep trying."); break;
       	
       	}
       	incorrect = incorrect + 1; 
       }
		int f6rstNum = number.nextInt(9);
	    int s6condNum = number.nextInt(9);
   ;
	    
   System.out.println("What is " + f6rstNum + " times " + s6condNum +"");
   
   int answer6 = answer.nextInt();
   
   if (answer6 == (f6rstNum * s6condNum)) {
   	int posR = pos.nextInt(4);
   	switch(posR) {
   	case 0 : System.out.println("Very Good!"); break;
   	case 1 : System.out.println("Excellent!"); break;
   	case 2 : System.out.println("Nice Work!"); break;
   	case 3 : System.out.println("Keep up the good work!"); break;
   	}
   	correct = correct + 1;
   }
   else {
   	int negR = pos.nextInt(4);
   	switch(negR) {
   	case 0 : System.out.println("No. Please try again."); break;
   	case 1 : System.out.println("Wrong. Try once more"); break;
   	case 2 : System.out.println("Don't give up!"); break;
   	case 3 : System.out.println("No. Keep trying."); break;
   	
   	}
   	incorrect = incorrect + 1; 
}
   //Second Question
   int f7rstNum = number.nextInt(9);
    int s7condNum = number.nextInt(9);
   System.out.println("What is " + f7rstNum + " times " + s7condNum +"");
   
   int answer7 = answer.nextInt();
   
   if (answer7 == (f7rstNum * s7condNum)) {
   	int posR = pos.nextInt(4);
   	switch(posR) {
   	case 0 : System.out.println("Very Good!"); break;
   	case 1 : System.out.println("Excellent!"); break;
   	case 2 : System.out.println("Nice Work!"); break;
   	case 3 : System.out.println("Keep up the good work!"); break;
   	}
   	correct = correct + 1;
   }
   else {
   	int negR = pos.nextInt(4);
   	switch(negR) {
   	case 0 : System.out.println("No. Please try again."); break;
   	case 1 : System.out.println("Wrong. Try once more"); break;
   	case 2 : System.out.println("Don't give up!"); break;
   	case 3 : System.out.println("No. Keep trying."); break;
   	
   	}
   	incorrect = incorrect + 1; 
   }
// Third Question
   int f8rstNum = number.nextInt(9);
    int s8condNum = number.nextInt(9);
   System.out.println("What is " + f8rstNum + " times " + s8condNum +"");
   
   int answer8 = answer.nextInt();
   
   if (answer8 == (f8rstNum * s8condNum)) {
   	int posR = pos.nextInt(4);
   	switch(posR) {
   	case 0 : System.out.println("Very Good!"); break;
   	case 1 : System.out.println("Excellent!"); break;
   	case 2 : System.out.println("Nice Work!"); break;
   	case 3 : System.out.println("Keep up the good work!"); break;
   	}
   	correct = correct + 1;
   }
   else {
   	int negR = pos.nextInt(4);
   	switch(negR) {
   	case 0 : System.out.println("No. Please try again."); break;
   	case 1 : System.out.println("Wrong. Try once more"); break;
   	case 2 : System.out.println("Don't give up!"); break;
   	case 3 : System.out.println("No. Keep trying."); break;
   	
   	}
   	incorrect = incorrect + 1; 
   }
   
   //question 9
   int f9rstNum = number.nextInt(9);
    int s9condNum = number.nextInt(9);
   System.out.println("What is " + f4rstNum + " times " + s9condNum +"");
   
   int answer9 = answer.nextInt();
   
   if (answer9 == (f9rstNum * s9condNum)) {
   	int posR = pos.nextInt(4);
   	switch(posR) {
   	case 0 : System.out.println("Very Good!"); break;
   	case 1 : System.out.println("Excellent!"); break;
   	case 2 : System.out.println("Nice Work!"); break;
   	case 3 : System.out.println("Keep up the good work!"); break;
   	}
   	correct = correct + 1;
   }
   else {
   	int negR = pos.nextInt(4);
   	switch(negR) {
   	case 0 : System.out.println("No. Please try again."); break;
   	case 1 : System.out.println("Wrong. Try once more"); break;
   	case 2 : System.out.println("Don't give up!"); break;
   	case 3 : System.out.println("No. Keep trying."); break;
   	
   	}
   	incorrect = incorrect + 1; 
   }
//Question 10
   int f0rstNum = number.nextInt(9);
    int s0condNum = number.nextInt(9);
   System.out.println("What is " + f0rstNum + " times " + s0condNum +"");
   
   int answer0 = answer.nextInt();
   
   if (answer0 == (f0rstNum * s0condNum)) {
   	int posR = pos.nextInt(4);
   	switch(posR) {
   	case 0 : System.out.println("Very Good!"); break;
   	case 1 : System.out.println("Excellent!"); break;
   	case 2 : System.out.println("Nice Work!"); break;
   	case 3 : System.out.println("Keep up the good work!"); break;
   	}
   	correct = correct + 1;
   }
   else {
   	int negR = pos.nextInt(4);
   	switch(negR) {
   	case 0 : System.out.println("No. Please try again."); break;
   	case 1 : System.out.println("Wrong. Try once more"); break;
   	case 2 : System.out.println("Don't give up!"); break;
   	case 3 : System.out.println("No. Keep trying."); break;
   	
   	}
   	incorrect = incorrect + 1; 
   }

   float ten = 10;
   float total = correct / ten;
if (total >= .75) {
	System.out.println("Congratulations, you are ready to go to the next level!");
}
else {
		System.out.println("Please ask your teacher for extra help");
	}
 int lma2 = answer.nextInt();

 System.out.println("Do you want to try again? Yes = 1 No = 0");
 if ( lma2 == 0) {
	 break;
 }
 }
}

}  






