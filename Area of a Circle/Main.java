import java.io.IOException;
import java.util.Scanner;
 

 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      double π=3.14159,A,R;

      Scanner input = new Scanner(System.in);
        
      R = input.nextDouble();

      A = π * R * R;

      System.out.println("A="+String.format("%.4f",A));
 
      input.close();
    }
 
}