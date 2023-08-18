////////////
////////////
////////////
////////////

import java.util.InputMismatchException;
import java.util.Scanner;
/* h g */

public class AtividadesDeRevisao {
    public static void main(String[] args) {
        System.out.println("Exercícios de Java da Manu");
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("lista 1 ----------------------------");
            System.out.println("Digite 1 para - Calcular a média");
            System.out.println("Digite 2 para - Calcular a área");
            System.out.println("Digite 3 para - Calcular o volume");
            System.out.println("Digite 4 para - avaliar se um valor é o dobro do outro");
            System.out.println("Digite 5 para - calcular báskara");
            System.out.println("Digite 6 para - calcular velocidade");
            System.out.println("Digite 7 para - calcular imposto");
            System.out.println("Digite 8 para - calcular se é impar ou par");
            System.out.println("Digite 9 para - Comparar dois valores strings");
            System.out.println("Digite 10 para - transformar string em int");
            System.out.println("Digite 11 para - calcular o imposto de renda");

            try {
                opcao = scan.nextInt(); // aqui chama oq ja foi digitado
            } catch (InputMismatchException e) { // só aceita números pq o e?
                opcao = -1;
                scan.next(); // pede p digitar dnv
            }

            switch (opcao) {
                case 0:
                    System.out.println("Obrigado pela atenção!");
                    break;

                case 1:
                    System.out.println("Digite a nota um: ");
                    int nota1 = scan.nextInt();
                    System.out.println("Digite a nota dois: ");
                    int nota2 = scan.nextInt();
                    System.out.println("Digite a nota três: ");
                    int nota3 = scan.nextInt();

                    int calMedia = (nota1 + nota2 + nota3) / 3;
                    System.out.println("A média é: " + calMedia);
                    break;

                case 2:
                    System.out.println("Informe o lado 1 do quadrado: ");
                    int lado1 = scan.nextInt();
                    System.out.println("Informe o ladfo 2 do quadrado: ");
                    int lado2 = scan.nextInt();

                    int calArea = (lado1 * lado2);
                    System.out.println("A área do quadrado é: " + calArea);
                    break;

                case 3:
                    System.out.println("Informe a altura: ");
                    int altura = scan.nextInt();
                    System.out.println("Informe o comprimento: ");
                    int comp = scan.nextInt();
                    System.out.println("Informe o lado: ");
                    int lado = scan.nextInt();

                    int calVol = (altura * comp * lado);
                    System.out.println("O volume é: " + calVol);
                    break;

                    case 4:
                    System.out.println("Informe o valor que será dobrado: ");
                    int numx2 = scan.nextInt();
                    System.out.println("Informe o valor que quer comparar: ");
                    int num = scan.nextInt();
                    
                    if (num > numx2) {
                        System.out.println("O número comparado é maior");
                    } else {
                        System.out.println("O número comparado é menor");
                    }
                      break;
                      
                    case 5:
                    System.out.println("Informe o valor de a:");
                    Float a = scan.nextFloat();
                    System.out.println("Informe o valor de b:");
                    Float b = scan.nextFloat();
                    System.out.println("Informe o valor de c:");
                    Float c = scan.nextFloat();

                    Float delta = (b * b) + (- 4 * (a * c));
                    Float restoConta = - b + delta;
                    Float restoConta1 = - b - delta;
                    Float fim = (restoConta / (2 * a));
                    Float fim1 = (restoConta1 / (2 * a));

                    System.out.println("Os resultados são:" +fim    +fim1);
                    System.out.println("---------------------------");
                    break;

                    case 6:
                    System.out.println("diga a distância do trajeto:");
                    Float km = scan.nextFloat();
                    System.out.println("diga o tempo:");
                    int oras = scan.nextInt();

                    Float velocid = (km / oras);
                    System.out.println("A velocidade média é:" +velocid);
                    break;

                    case 7:
                    System.out.println("Diga seu faturamento");
                    double dindin = scan.nextDouble();
                    //System.out.println("Digao percentual:");
                    //double porcento = scan.nextDouble();

                    double calImposto = (dindin * 25)/100;

                    System.out.println("a porcentagem do seu imposto é:" +calImposto);
                    break;

                    case 8:
                    System.out.println("Digite um valor:");
                    int numero = scan.nextInt();

                    if (numero % 2 == 0){
                        System.out.println("Esse valor é par");
                    } else {
                        System.out.println("Esse valor é ímpar");
                    }
                    break;

                    case 9:
                    System.out.println("Diga a 1 palavra:");
                    String str = scan.next();
                    System.out.println("Diga a 2 palavra:");
                    String str1 = scan.next();

                    if(str.equals(str1)){
                        System.out.println("os valores são iguais");
                    }
                    else{
                        System.out.println("os valores são diferentes");
                    }
                    break;
                    
                    case 10: 
                    try {
                        String valor = "46.9";
                        float num1 = Float.parseFloat(valor);
                        int numeroInteiro = (int) num1;
                        System.out.println(numeroInteiro);
                    } catch (Exception e) {
                    System.out.println("Digite um valor valido");
                    }
                    break; // ainda n entendi bem isso 

                    case 11:
                    System.out.println("Digite o salario");
                    double sal = scan.nextDouble();
                    if(sal <= 1903.98){
                        System.out.println("Isento");
                    }
                    if(sal > 1903.98 && sal <= 2826.65){
                        System.out.println("7,5% de imposto");
                    }
                    if(sal > 2826.65 && sal <= 3751.05){
                        System.out.println("15% de imposto");
                    }
                    if(sal > 3751.05 && sal <= 4664.68){
                        System.out.println("22,5% de imposto");
                    }
                    if(sal > 4664.68){
                        System.out.println("27,5% de imposto");
                    }
                break; //poderia usar o try e o catch

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
}while(opcao!=0);

// em cada case eu preciso abrir um scanner? n entendi 
scan.close();}}
