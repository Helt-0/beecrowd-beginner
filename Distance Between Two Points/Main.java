import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double p1[] = new double[2], p2[] = new double[2], a, b, c, d,  distance;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            p1[i] = input.nextDouble();
        }

        for (int i = 0; i < 2; i++) {   
            p2[i] = input.nextDouble();
        }

        input.close();

        a = p1[0];
        b = p1[1];
        c = p2[0];
        d = p2[1];

        distance = Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2));

        System.out.println(String.format("%.4f", distance));       
    }
 
}