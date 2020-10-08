import java.util.Scanner;
/**
 *a program that will ask the user how many heights the user would like to enter, in cm. IT will then read in that many heights.
 * @author Ahmad zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner 
		Scanner input = new Scanner(System.in);
		//output a mesage to the user
		System.out.println("How many heights would you like to enter");
		//ge input from user
		int amountHeights = input.nextInt();
		//output the user for their heights on separate lines
		System.out.println("Please enter the heights on separate lines");
		//make an array which gets the heights on seerate lines
		int[] Heights = new int[amountHeights];
		//get the input from user using a for loop
		for (int i = 0; i < amountHeights; i++){
			Heights [i] = input.nextInt();
		}
		//initiliaize a variable for addition of all heights
		int sum =0;
		// call the heights lentght multiple times to fulfil the condition of adding the heights together
    for(int i = 0; i < Heights.length;i++){
			//add the grade to sum
			sum = sum + Heights[i];
		}
		//calculate the average of the heights
	int average = sum/amountHeights;
	
	System.out.println("The average height is " + average);
	System.out.println("The heights above average are");
		//if the specific nuber is bigger than the average it prints it out
		for (int i = 0; i < Heights.length; i++){
			if(Heights[i] > average){
				System.out.println(Heights[i]);
			}
			else{	
			}
		}
  }
}
