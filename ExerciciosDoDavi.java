import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciciosDoDavi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int a, b, c;
        double delta, x1, x2;
       
        do {
            System.out.println("Digite qual exercicio deseja ver");
            System.out.println("1- Media");
            System.out.println("2- área cubo");
            System.out.println("3- Volume");
            System.out.println("4- Programa que verifica se o segundo valor é o dobro do primeiro");
            System.out.println("5- Programa que calcula bhaskara");
            System.out.println("6- Media de viagem");
            System.out.println("7- Programa que calcula o percentual de imposto que paga");
            System.out.println("8- Programa que verifica se o numero é par");
            System.out.println("9- Programa que compara 2 string");
            System.out.println("10- Conversão de string pra integer");
            System.out.println("11-Programa Salario");
            opcao= sc.nextInt();


            switch (opcao) {
               
                case 1:
                {
                    System.out.println("Digite a nota um: ");
                    int notaUm = sc.nextInt();
                    System.out.println("Digite a nota dois: ");
                    int notaDois = sc.nextInt();
                    System.out.println("Digite a nota três: ");
                    int notaTres = sc.nextInt();

                    int media = (notaUm + notaDois + notaTres) / 3;
                    System.out.println("A média é: " + media);
                    break;
                }

                  case 2:
                  {
                    System.out.println("Programa que calcula área\n");
                    System.out.println("Digite Lado A");
                    float ladoA = sc.nextFloat();
                    System.out.println("Digite Lado B");
                    float ladoB = sc.nextFloat();

                    float areaquadrado = (ladoA+ladoB)*2;

                    System.out.println("Sua aréa é " + areaquadrado);

                  break;
                

                  }

                  case 3:
                  {
                    System.out.println("Programa que calcula Volume");
                    System.out.println("\nDigite a Altura do Objeto");
                    float alturaex3 = sc.nextFloat();
                    System.out.println("Digite a Largura do Obejto");
                    float larguraex3 = sc.nextFloat();
                    System.out.println("Digite o Comprimento");
                    float comprimentoex3 = sc.nextFloat();

                    float volumex3=(alturaex3*larguraex3*comprimentoex3);
                    System.out.println("Seu volume é" + volumex3);

                     break;

                  }

                  case 4 :

                  {

                      System.out.println("Digite o primeiro Valor");
                      int primeirovalorex4 = sc.nextInt();
                      System.out.println("Digite o segundo valor");
                      int segundovalorex4 = sc.nextInt();

                      int formulaex4 = (primeirovalorex4*2);

                      if(segundovalorex4>formulaex4)
                      {
                        System.out.println("Segundo valor é o dobro do primeiro");
                      }

                      else

                     System.out.println("Segundo valor é menor que o drobro do primeiro");

                     break;


                    }

                    case 5:
                    {

                      System.out.println("Programa que calcula bhaskara");

                    System.out.println("Digite o valor de A");
                     a =  sc.nextInt();
                     System.out.println("Digite o vlaor de B");
                     b = sc.nextInt();
                     System.out.println("Digite o valor de C");
                     c = sc.nextInt();


                   
 
                     delta = (b * b) + (-4 * (a * c));
 
                     System.out.println("Delta: " + delta);
 
                    if (delta >= 0) {
 
                      x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
                      x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
                     System.out.println("x1 = " + x1);
                       System.out.println("x2 = " + x2);
 
                    } 
                    
                    else 
                 System.out.println("Delta não possui raiz!");

                 break;

                }

                 case 6:
                 {

                    System.out.println("Programa que calcula a velocidade media de uma viagem");

                    System.out.println("Digite a Distancia da viagem");
                    float distanciaex6 = sc.nextFloat();
                    System.out.println("Digite o tempo de viagem");
                    float tempoex6 = sc.nextFloat();


                    float formulavelocidade = (distanciaex6/tempoex6);

                    System.out.println("Velocidade media é" + formulavelocidade);



                 }

                 case 7:
                
                 {

                    System.out.println("Program que Calcula imposto");
                    System.out.println("\nQuanto voce fatura?");
                    float faturaex7 = sc.nextFloat();
                    System.out.println("Digite quanto de imposto voce Paga");
                    float impostoex7 = sc.nextFloat();


                    float formulaex7 = (faturaex7/ impostoex7);

                    System.out.println("Voce está pagando de imposto %" + formulaex7);






                 }


                 case 8:

                 {

                    System.out.println("Programa que verifica se é par ou impar");

                    System.out.println("Digite o Numero");
                    int valorex8 = sc.nextInt();

                    if(valorex8%2==0)

                {
                    System.out.println("Numero é par");

            
                }

                else

                System.out.println("Numero Não é par");


                 }


                 case 9:
                 {
                 
                      
                      String comparacao2 = new String("10");
                      

                      String variavel1ex9 = "10";
                    

                      if (variavel1ex9.equals(comparacao2))
                     {

                        System.out.println("Os numeros são iguais");
                     }

                     else
                     
                     System.out.println("Numero não é igual");
                      

                     break;

                 }


                 case 10 :

                 {
                      
                     System.out.print("Conversão de string pra integer\n");
                    String variavel10 = ".";
                    Integer.parseInt(variavel10= "11");
                   
                    {
                        System.out.println( variavel10 );

                    }

                 }
            

                 case 11:

                 {

                 System.out.println("Programa Salario\n");

                System.out.println("Informe o valor base que você recebe");
                float valorbase11 = sc.nextFloat();

                if( valorbase11 <= 1903.98 )
                {

                    System.out.println("Voce está insento de imposto ");

                }

                if (valorbase11 >= 1903.99 && valorbase11 <= 2826.65)
                {

                    System.out.println("valor de imposto de renda é 7,5% ");
                    
                }



                 if (valorbase11 >= 2826.66 && valorbase11<=3751.05)
                {

                    System.out.println("valor de imposto de renda é  15%");
                    
                }



                if  (valorbase11 == 3751.06 && valorbase11 <= 4664.68)
                
                {

                    System.out.println("valor de imposto de renda é 22,5");
                    
                }




                 if(valorbase11 > 4664.68)
                {
                    System.out.println("valor de imposto de renda é 22,7");
                    
                }
                 

                 }
                

                   



                    



                default:
                    break;
            }

            System.out.println("Deseja voltar ao menu? (1-Sim; 0-Não)");
            opcao = sc.nextInt();
    
        } while(opcao != 0);
        sc.close();
    }
}