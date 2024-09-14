import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int R;
        double pi = 3.14159, VOLUME;

        Scanner input = new Scanner(System.in);

        R = input.nextInt();

        VOLUME = (4/3.0) * pi * R * R * R;

        System.out.println("VOLUME = " + String.format("%.3f", VOLUME));
 
    }
 
}