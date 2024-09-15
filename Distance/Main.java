import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int vx = 60, vy = 90, dy, ty;

        Scanner input = new Scanner(System.in);
        dy = input.nextInt();

        ty = 2*dy;
        
        input.close();

        System.out.println(ty + " minutos");
        

 
    }
 
}