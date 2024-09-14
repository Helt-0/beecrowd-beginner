import java.io.IOException;
 import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    int NUMBER, HOURS;
    double  APH, SALARY;
    
    Scanner input = new Scanner(System.in);
    
    NUMBER = input.nextInt();
    HOURS =  input.nextInt();
    APH = input.nextDouble();

    SALARY = (HOURS * APH);

    System.out.println("NUMBER = " + NUMBER);
    System.out.println("SALARY = U$ " + String.format("%.2f", SALARY)); 
    

    }
 
}