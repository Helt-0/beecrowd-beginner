import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double n, conv[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        double c, d5, d2, d, u5, u2, moeda1, moeda050, moeda020, moeda010, moeda05, moeda01;  
        
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();

        input.close();

        c = (int)(n/conv[0]);
        d5 = (int)(n%conv[0])/conv[1];
        d2 = (int)((n%conv[0])%conv[1])/conv[2];
        d = (int)(((n%conv[0])%conv[1])%conv[2])/conv[3];
        u5 = (int)((((n%conv[0])%conv[1])%conv[2])%conv[3])/conv[4];
        u2 = (int)(((((n%conv[0])%conv[1])%conv[2])%conv[3])%conv[4])/conv[5];
        
        moeda1 = ((((((n%conv[0])%conv[1])%conv[2])%conv[3])%conv[4])%conv[5])/conv[6];

        
        
        moeda050 = (((((((n%conv[0])%conv[1])%conv[2])%conv[3])%conv[4])%conv[5]%conv[6])/conv[7]);
        moeda020 = ((((((((n%conv[0])%conv[1])%conv[2])%conv[3])%conv[4])%conv[5]%conv[6])%conv[7])/conv[8]);
        moeda010 = (((((((((n%conv[0])%conv[1])%conv[2])%conv[3])%conv[4])%conv[5]%conv[6])%conv[7])%conv[8])/conv[9]);
        moeda05 = (((((((((n%conv[0])%conv[1])%conv[2])%conv[3])%conv[4])%conv[5]%conv[6])%conv[7])%conv[8]%conv[9])/conv[10]);
        moeda01 = Math.round((((((((((n%conv[0])%conv[1])%conv[2])%conv[3])%conv[4])%conv[5]%conv[6])%conv[7])%conv[8]%conv[9]%conv[10])/conv[11])*100/100);
        
        System.out.println("NOTAS:");
        System.out.println((int)c+" nota(s) de R$ 100.00");
        System.out.println((int)d5+" nota(s) de R$ 50.00");
        System.out.println((int)d2+" nota(s) de R$ 20.00");
        System.out.println((int)d+" nota(s) de R$ 10.00");
        System.out.println((int)u5+" nota(s) de R$ 5.00");
        System.out.println((int)u2+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)moeda1+" moeda(s) de R$ 1.00");
        System.out.println((int)moeda050+" moeda(s) de R$ 0.50");
        System.out.println((int)moeda020+" moeda(s) de R$ 0.25");
        System.out.println((int)moeda010+" moeda(s) de R$ 0.10");
        System.out.println((int)moeda05+" moeda(s) de R$ 0.05");
        System.out.println((int)moeda01+" moeda(s) de R$ 0.01");


        
 
    }
 
}