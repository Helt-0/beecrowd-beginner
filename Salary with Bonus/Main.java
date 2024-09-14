import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    String NAME;
    double SALARY, TOTALSALES, BONUS, TOTAL;

    Scanner input = new Scanner(System.in);

    NAME = input.nextLine();
    SALARY = input.nextDouble();
    TOTALSALES = input.nextDouble();
    

    BONUS = (TOTALSALES * 0.15);

    TOTAL = BONUS + SALARY;

    System.out.println("TOTAL = R$ " + String.format("%.2f", TOTAL));

    input.close();
 
    }
 
}