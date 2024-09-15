import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int n, c, d5, d2, d, u5, u2, u;

        int notas[] = {100, 50, 20, 10, 5, 2, 1};

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println(n);

        input.close();

        c = n/notas[0];
        if(c>0){n = n - (100*c);}
        d5 = n/notas[1];
        if(d5>0){n = n - (50*d5);}
        d2 = n/notas[2];
        if(d2>0){n = n - (20*d2);}
        d = n/notas[3];
        if(d>0){n = n - (10*d);}
        u5 = n/notas[4];   
        if(u5>0){n = n - (5*u5);}
        u2 = n/notas[5];
        if(u2>0){n = n - (2*u2);}
        u = n/notas[6];
        
        
        System.out.println(c +" nota(s) de R$ 100,00");
        System.out.println(d5 +" nota(s) de R$ 50,00");
        System.out.println(d2 +" nota(s) de R$ 20,00");
        System.out.println(d +" nota(s) de R$ 10,00");
        System.out.println(u5 +" nota(s) de R$ 5,00");
        System.out.println(u2 +" nota(s) de R$ 2,00");
        System.out.println(u +" nota(s) de R$ 1,00");

        
 
    }
 
}