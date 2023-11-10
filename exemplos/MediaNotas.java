package exemplos;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // cin

        System.out.println("Digite a nota 1:");
        Float nota1 = scan.nextFloat();
        System.out.println("Digite a nota 2:");
        Float nota2 = scan.nextFloat();
        System.out.println("Digite a nota 3:");
        Float nota3 = scan.nextFloat();

        Float calcNota = (nota1 + nota2 + nota3) /3;
        System.out.println("A média das notas é " + calcNota);
    }

    
}