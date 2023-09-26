//Time and Space complexity at the bottom
//Test cases at the bottom
import java.util.Stack;
public class PostFixCalculator {
	
	static int solve(String str) {
	      Stack<Integer> stack=new Stack<>(); //creating a new stack ( one stack for the operands)
	    
	      //Using a for loop to go through each of the characters 
	      for(int i=0;i<str.length();i++) {
	    	  
	    	//making a character named chr
	    	  char chr=str.charAt(i); //Therefore we can evaluate each character in the for loop and see if we should push it to the stack
	    	  
	    	  //using an if statement to check if its a operator or operand
	    	  if(chr>='0' && chr<='9') {//if an operand 
	    		  stack.push('0'-chr); // then we push it to the stack  
	    	  
	    	   // If the character is an operator, then we pop the nums out and apply the operator
	    	  }else {
	    		  int result;//initializing result of the two nums
	    		  int num1=stack.pop();  //popping out num1
	    		  int num2=stack.pop();  //popping out num2
	    		  
	    		  //using a switch statements to apply the operators to the operands
	    		  switch(chr) {
	    		  case'+': //for + operator
	    			  result=num1+num2; //result calc for addition
	    			  stack.push(result); //pushing the add result to the stack
	    			  break;
	    		  case'-': // for - operator
	    			  result=num1-num2; //result calc for subtraction
	    			  stack.push(result); //pushing the subtract result to the stack
	    			  break;
	    		  case'*': // for * operator
	    			  result=num1*num2; //result calc for multiplication
	    			  stack.push(result); //pushing the multiplication result to the stack
	    			  break;
	    		  case'/': // for / operator
	    			  result=num1/num2; // result calc for division 
	    			  stack.push(result);//pushing the division result ot the stack
	    			  break;	 				  
	    		  }
	    	  }    	
	      }
		return stack.pop(); //Popping out the result (top element) left in the stack
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eq = "3 5 + 1 -"; // initializing the equation
		eq = eq.replaceAll("\\s", ""); //using the replaceall method to get rid of the space between the operators/operands
		System.out.println(solve(eq)); // calling the solve method to solve the postfix equation	
		
		/*Time Complexity: O(n)
		 * Space Complexity:O(n) 
		 */
		
		/*Test Cases:
		 * If the equation has a letter in it or invalid operand
		 * Eg)
		 *  String equation =" a45*1-";\
		 * In the switch statement at the bottom add:
		 * default:
		 * System.out.println("Invalid operand in equation");
		 * break;
		 * 
		 * Could implement a scanner so users can enter their equation instead of hardcording it in
		 * import java.util.Stack;
		 * Scanner Sc = new Scanner(System.in);
		 * System.out.println("Enter in a postfix expression: ");
		 * eq = sc.nextLine();
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
}
