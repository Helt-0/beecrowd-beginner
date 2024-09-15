import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int Line[] = new int[3], a, b, c, maior;

        Scanner input = new Scanner(System.in);
       
        for(int i = 0; i<3; i++) {
            Line[i] = input.nextInt();
        }

        a = Line[0];
        b = Line[1];
        c = Line[2];    

        input.close();

        maior = (a + b + Math.abs(a - b)) / 2;
        

        if(maior > c) {
            System.out.println(maior + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }
 
    }
 
}