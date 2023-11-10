package exemplos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Digite a idade: ");
            try{
                int idade = entrada.nextInt();
                System.out.println("A idade digitada foi: "+idade);
                break;
            }catch(InputMismatchException eMismatch){
                System.out.println("Digite um número inteiro!");
                entrada.next();
            }
        }while (true);
        entrada.close();

       /*  Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite a sua idade => "); //cout
        int idade = scanner.nextInt(); //cin
        System.out.println(" A idade digitada é: "+idade);
        scanner.close();*/

        /*int valor = 2;
        System.out.println(valor += ++valor);
        valor = 2;
        System.out.println(valor += valor++);*/
    }
}
