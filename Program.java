//import stuff here
import java.util.Scanner;
//
//Your code here
public class program8{
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        num1 = numScanner.nextInt();
        
        System.out.println("Enter another integer");
        num2 = numScanner.nextInt();
                
        Calculator calc = new Calculator(num1, num2);
        System.out.println("The sum is " + calc.getSum());
        System.out.println("The difference is " + calc.getDifference());
        System.out.println("The product is " + calc.getProduct());
        System.out.println("The average is " + calc.getAverage());
        System.out.println("The absolute value is " + calc.getAbsValue());
        System.out.println("The max value is " + calc.getMaxValue());
        System.out.println("The min value is " + calc.getMinValue());
    }
}
        
//Paste console output below:
/*
Enter an integer
13
Enter another integer
20
The sum is 33
The difference is -7
The product is 260
The average is 16.5
The absolute value is 7
The max value is 20
The min value is 20

*/
