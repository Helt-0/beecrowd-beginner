import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double dataLine[] = new double[3], dataLine2[] = new double[3];
        String Line, Line2;
        int i;

        
        Scanner input = new Scanner(System.in);
        Line = input.nextLine();
        Line2 = input.nextLine();
        
        input.close();

        for(i=0; i<3; i++) {

            dataLine[i] = Double.parseDouble(Line.split(" ")[i]);
            
            dataLine2[i] = Double.parseDouble(Line2.split(" ")[i]);
        
            
        }
        
        

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", (dataLine[1] * dataLine[2]) + 
        (dataLine2[1] * dataLine2[2])));

    }
 
}