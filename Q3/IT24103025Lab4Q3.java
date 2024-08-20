import java.util.Scanner;

public class IT24103025Lab4Q3
        
		public static void main(String[] args) {
		  
		  //declare the variables
		  int number;
		  String result;
		  
		  //Create a scanner object to read input
		  Scanner input =new Scanner(System.in);
		  
		  //prompt the user to enter a number
		  System.out.print("Enter a number: ');
		  number=input.nextInt();
		  
		  result=(number>0) ? "the number is :positive" :
		          (number<0) ?"the number is :negative" :
				  "the number is:zero"
				 
		 System.out.println(result);
   }
}   