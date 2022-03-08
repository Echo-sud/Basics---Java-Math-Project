
import java.util.*;

public class QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //1
        System.out.print("Please print a double below ");
        double alpha = console.nextDouble();
        System.out.print("Please print a double below ");
        double beta = console.nextDouble();
        System.out.print("Here is the larger number! " + Math.max(alpha,beta));
        System.out.println("  ");
        //2
        System.out.print("Please print a double below");
        double x = console.nextDouble();
        System.out.print("Here is your number cubed! " + Math.pow(x, 3.0));
        System.out.println("  ");
        //3
        System.out.print("Please print a double below ");
        double base = console.nextDouble();
        System.out.print("Please print a double below ");
        double exponet = console.nextDouble();
        System.out.print("Here is " + base + " to the power of " + exponet + " "+ Math.pow(base,exponet));
        System.out.println("  ");
        //4
        System.out.print("Please print a double below ");
        double num = console.nextDouble();
        System.out.print("Here is your number rounded to the nerast whole number! " + Math.round(num));
        System.out.println("  ");
        //5
        System.out.print("Please print a double below ");
        double num2 = console.nextDouble();
        System.out.print("Here is the square root of your number! " + Math.sqrt(num2));
        System.out.println("  ");
        //6
        System.out.print("Pretend you are creating a right triangle, enter below what you want the length of sideA to be! ");
        double sideA = console.nextDouble();
        System.out.print("Pretend you are creating a right triangle, enter below what you want the length of sideB to be! ");
        double sideB = console.nextDouble();
        double sqrd1 = sideA * sideA;
        double sqrd2 = sideB * sideB;
        double formula = sqrd1 + sqrd2;
        System.out.print("This is the hypotenuse of your triangle! " + Math.sqrt(formula));
        System.out.println("  ");
        
        
        
        
        
        
}
}