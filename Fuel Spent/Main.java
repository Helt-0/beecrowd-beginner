import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int hours, speed;

        double liters;

        Scanner input = new Scanner(System.in);
        hours = input.nextInt();
        speed = input.nextInt();
 
        double h = hours;
        double s = speed;

        input.close();

        liters = (h * s)/12;

        System.out.println(String.format("%.3f",liters));


    }
 
}