package exemplos;
////////////
////////////
////////////
////////////

import java.util.InputMismatchException;
import java.util.Scanner;
/* h g */

public class Atv2 {
    public static void main(String[] args) {
        System.out.println("Exercícios de Java da Manu");
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("lista 1 ----------------------------");
            System.out.println("Digite 1 para - receber tres notas calcule a media e diga se foi aprovado");
            System.out.println("Digite 2 para - receber um numero e indique o mes que representa");
            System.out.println("Digite 3 para - simular jogo da forca");
            System.out.println("Digite 4 para - imprimir a tabuada de 0 a 10");
            System.out.println("Digite 5 para - receba uma String e imprima linha a linha suas letras");
            System.out.println("Digite 6 para - soma de todos os n\u00FAmeros \u00EDmpares e m\u00FAltiplos de 7 entre 1 e 500");
            System.out.println("Digite 7 para - entrada de notas do aluno");
            System.out.println("Digite 8 para - imprima o fatorial");
            System.out.println("Digite 9 para - receba a altera e o peso e calcule o IMC");
           

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
                    System.out.println("digite nota 1");
                    float nota1 = scan.nextInt();
                    System.out.println("digite nota 2");
                    float nota2 = scan.nextInt();
                    System.out.println("digite a nota 3");
                    float nota3 = scan.nextInt();

                    double media = (nota1 + nota2 + nota3) / 3;
                    if (media > 7) {
                        System.out.println("Aprovado");
                    } else {
                        System.out.println("Reprovado");
                    }
                    break;

                case 2:
                    System.out.println("escreva o numero que vc deseja saber o mês:");
                    int numMes = scan.nextInt();
                    switch (numMes){
                        case 1:
                            System.out.println("Janeiro");
                            break;
                        case 2:
                            System.out.println("Fevereiro");
                            break;
                        case 3:
                            System.out.println("Março");
                            break;
                        case 4:
                            System.out.println("Abril");
                            break;
                        case 5:
                            System.out.println("Maio");
                            break;
                        case 6:
                            System.out.println("Junho");
                            break;
                        case 7:
                            System.out.println("Julho");
                            break;
                        case 8:
                            System.out.println("Agosto");
                            break;
                        case 9:
                            System.out.println("Setembro");
                            break;
                        case 10:
                            System.out.println("Outubro");
                            break;
                        case 11:
                            System.out.println("Novembro");
                            break;
                        case 12:
                            System.out.println("Dezembro");
                            break;
                        default:
                            System.out.println("Mês inválido");
                            break;
                    }
                
                    break;

                case 3:
                    // não consegui :( 

                    case 4:
                     System.out.println("Diga aqui o numero que deseja ver a tabuada");
                     int numero = scan.nextInt();

                      for(int i = 0; i < 10; i++){

                     System.out.println(numero + " x " + (i + 1) + " = " + numero * (i + 1));
                    }
                      break;
                      
                    case 5:
                    System.out.println("Digite oq quiser e veja se repetir :)");
                    String texto = scan.nextLine();

                         for(int i = 0; i < texto.length(); i++){

                            System.out.println(texto.charAt(i));
                        }
                    break;

                    case 6:
                    System.out.println("soma de todos os n\u00FAmeros \u00EDmpares e m\u00FAltiplos de 7 entre 1 e 500");
                    int valor = 0;
                    for (int i = 1; i < 500; i++)
                    if (i % 2 != 0 && i % 7 == 0){
                        valor += i;
                    }//sou de humanas odiei esse
                    break;

                    case 7:
                    System.out.println("média de 3 notas de um aluno da autoescola");
                    
                     System.out.println("digite nota 1");
                    float notaAuto1 = scan.nextInt();
                    System.out.println("digite nota 2");
                    float notaAuto2 = scan.nextInt();
                    System.out.println("digite a nota 3");
                    float notaAuto3 = scan.nextInt();

                    boolean continuar = true;
                    for (int i = 0; true; i++){
                        notaAuto1[i] = scanner.nextInt();
                        if ( notaAuto1[i] && notaAuto2[i] && notaAuto3[i] < 0 ){
                            continuar = false;
                        } // nao consegui prosseguir nessa
                    break;

                    case 8:
                    System.out.println("digite o numero que deseja saber o fatorial");
                    System.out.println("Digite um numero");
                    int fator = scan.nextInt();
                    int fatorial = 1;
                        for (int i = 1; i <= fator; i++){
                            fator *= i;
                        }
                    break;

                    case 9:
                    System.out.println("Digite a sua altura (em metros e com virgula)");
                    double altura = sc.nextDouble();
                    System.out.println("Digite o seu peso (em kilos)");
                    double peso = sc.nextDouble();
                    double altura2 = altura * altura;
                    double imc = peso / altura2; 

                        if(imc < 18.5){
                            System.out.println("Abaixo do peso");
                        } else if(imc >= 18.5 && imc <= 24.9){
                            System.out.println("Peso ideal");
                            } else if(imc >= 25 && imc <= 29.9){
                                System.out.println("Levemente acima do peso");
                                } else if(imc >= 30 && imc <= 34.9){
                                    System.out.println("Obesidade grau 1");
                                     } else if(imc >= 35 && imc <= 39.9){
                                        System.out.println("Obesidade grau 2");
                                        } else if(imc >= 40){
                                            System.out.println("Obesidade grau 3 (mórbida)");
                                        }
                    break;
                    
                    case 10: // não consegui
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
}while(opcao!=0);
scan.close();}
