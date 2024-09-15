import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int age, y, m, d, conv[] = {365, 30};

        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        
        input.close();

        y = age / conv[0];
        m = (age % conv[0]) / conv[1];
        d = (age % conv[0]) % conv[1];
        
        System.out.println(y + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");


 
    }
 
}