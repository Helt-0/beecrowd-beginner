import java.io.IOException;
import java.util.Scanner; 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int x,y,soma;
       
       Scanner input = new Scanner(System.in);
       Scanner inputy = new Scanner(System.in);

       x = input.nextInt();
       y = inputy.nextInt();
       
       soma = x + y;

       System.out.printf("X = ", soma );
 
       input.close();
       inputy.close();
    }
}