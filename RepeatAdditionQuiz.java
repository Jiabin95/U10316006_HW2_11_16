import java.util.Scanner;
import java.util.ArrayList;
public class RepeatAdditionQuiz {
  /**Main method*/
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    
    //Create a list to store the answer
    ArrayList<Integer> list = new ArrayList<>();
    int answer = number1 + number2;
 	
    // Create a Scanner
    Scanner input = new Scanner(System.in);
   

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    int input1 = input.nextInt(); //Read a input1 from the input
    
    					
    
    while (input1 != answer) {
	for(int i =0 ; i < list.size(); i++){
	     if(input1 == list.get(i))
                 System.out.print("You already entered " + input1 + "\n");   		
	}
 		     list.add(input1);//Add the input1 if it is not in the list
     		     System.out.print("Wrong answer. Try again. What is " 
                     + number1 + " + " + number2 + "? ");
                     input1 = input.nextInt();
    }  
    System.out.println("You got it!");
  }
}
