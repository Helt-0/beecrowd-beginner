import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      int X;
      double Y, Z;
      
      Scanner input = new Scanner(System.in);

      X = input.nextInt();
      Y = input.nextDouble();

      Z = X/Y;
      System.out.println(String.format("%.3f km/l", Z));
 
    }
 
}