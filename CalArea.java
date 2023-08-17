import java.util.Scanner;

public class CalArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // cin

        System.out.println("Diga o lado 1 do quadrado:");
        Float lado1 = scan.nextFloat();
        System.out.println("Diga o lado 2 do quadrado:");
        Float lado2 = scan.nextFloat();
       
        Float calcNota = (lado1 * lado2);
        System.out.println("A área é " + calcNota);
    }

    
}