import java.util.Scanner;

public class LoopConstruct {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	double[] numbers = new double [5];
    	
    	for (int i = 0; i < numbers.length; i++) {
    		System.out.print("Input number: ");
    		numbers[i] = input.nextDouble();
    		
    	}
    		
    	double total = 0;
    	double max = numbers[0];
    	double min = numbers[0];
    	double average = 0;
    	
    	for (int i = 0; i < numbers.length; i ++) {
    		total += numbers[i]; 
    		
    		if (numbers[i] > max) {
    	        max = numbers[i];
    		
    		}
    		if (numbers[i] < min) {
    			min = numbers[i];
    
    	    }
        }
    	
    	average = total / numbers.length ;
    	
    	System.out.println("Total: " + total);
    	System.out.println("Average: " + average );
    	System.out.println("Maximum: " + max);
    	System.out.println("Minimum: " + min);
    	System.out.println("20% Interest: " + (total * 0.2));
    	
    	input.close();
    } 
    	
}
