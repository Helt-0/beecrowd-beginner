import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    double Points[] = new double[3], A, B, C;
    String Line;

    Scanner input = new Scanner(System.in);

    Line = input.nextLine();

    input.close();

    for (int i = 0; i < 3; i++) {
      Points[i] = Double.parseDouble(Line.split(" ")[i]);
    }

    A = Points[0];
    B = Points[1];
    C = Points[2];

    System.out.println("TRIANGULO: " + String.format("%.3f", ((A * C) / 2)));
    System.out.println("CIRCULO: " + String.format("%.3f", (3.14159 * (C * C))));
    System.out.println("TRAPEZIO: " + String.format("%.3f", (((A + B) * C) / 2)));
    System.out.println("QUADRADO: " + String.format("%.3f", (B * B)));
    System.out.println("RETANGULO: " + String.format("%.3f", (A * B)));

  }

}