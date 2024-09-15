import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int x, h, m, s;
        int conv[] = {3600, 60};


        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        input.close();

        h = x / conv[0];
        m = (x % conv[0]) / conv[1];
        s = (x % conv[0]) % conv[1];
        System.out.println(h + ":" + m + ":" + s);
        

    }
 
}