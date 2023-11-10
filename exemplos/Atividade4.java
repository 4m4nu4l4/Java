package exemplos;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeSet;

//Read more: http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx#ixzz8B4L3fIdm
/* h g */

public class Atividade4 {
    public static void main(String[] args) {
        System.out.println("Exercícios de Java da Manu");
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("lista 4 ----------------------------");
            System.out.println("Digite 1 para - questione a quantidade de notas a ser informada, receba as notas e calcule a média");
            System.out.println("Digite 2 para -imprima um arrays com Foreach");
            System.out.println("Digite 3 para - programa que leia 10 valores double e salve em um array, depois imprima esses valores");
            System.out.println("Digite 4 para - leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares");
            System.out.println("Digite 5 para - possua uma collection que represente as 52 cartas do baralho, imrpima elas");
            System.out.println("Digite 6 para - programa que una duas listas de inteiros");
            System.out.println("Digite 7 para - programa que simule a fila de atendimento de um banco");
            System.out.println("Digite 8 para - receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano");
            System.out.println("Digite 9 para - arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3");
            System.out.println("Digite 10 para - calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média");
            

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
                    
                      System.out.println("diga a quantidades de notas a ser informada:");
                      int qntd = scan.nextInt();
                      
                      float[] vetor = new float[qntd];
                     
                      
                      for(int i=0; i< qntd; i++){
                      System.out.print("Digite todas as notas:");
                      float notas = scan.nextFloat();
                      vetor[i] = scan.nextInt();
                      //criar um vetor com a quantidade de notas q ele digitar
                      }
                      
                      int media = 0;
                      
                      for (int i = 1; i <= qntd; i++) {
                      System.out.print("Informe a nota " + i + ": ");
                      double nota = scan.nextDouble();
                      soma += nota;
                      }
                      
                      double media = soma / qntd;
                      System.out.println("A média das notas é: " + media);
                      
                      scan.close();
                      break;
                      

                case 2:
                    System.out.println("Aqui havera uma linda listagem");
                    String[] pessoas = { "Emanuele, maria, matheus, dhebora, carolaine, sarah" };
                    for (String pessoa : pessoas) {
                        System.out.println(pessoa);
                     }   
                     break;
                    

                case 3:
                    double[] arrayy = new double[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Digite o valor " + (i + 1));
                        arrayy[i] = scan.nextDouble(); // conecta a variavel do array ao contador
                        }
                        break;

                case 4:
                    int[] quatro = new int[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Digite o valor " + (i + 1));
                        quatro[i] = scan.nextInt(); 
                    }
                    break;

                case 5:
                    HashSet<String> baralho = new HashSet<String>();
                    // hash.add("Às de Paus");

                    String[] nipes = { "Paus", "Copas", "Espadas", "Ouros" };
                    String[] numeros = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "Q", "J", "K" };

                    for (int nipe = 0; nipe < nipes.length; nipe++) {
                        for (int numero = 0; numero < numeros.length; numero++) {
                            baralho.add(numeros[numero] + " de " + nipes[nipe]);
                        }
                    }

                    for (String carta : baralho) {
                        System.out.println(carta);   
                    }
                    break;

                    /*
                     * String nipe = scan.next();
                     * // qntd[52] = scan.next
                     * for(i=0;i<52;i++) {
                     * System.out.println("esses são todos os nipes" + (i + 1));
                     * }
                     * for (i=0;i<52;i++) {
                     * System.out.ptintln("esses são todos os números: ")
                     * }
                     */

                case 6:
                    // Crie um programa que una duas listas de inteiros.
                    // String lista1 = "aqui é a lista de coisas para levar para o retiro";
                    // String lista2 = "aqui é como vc precisa ir";

                    ArrayList<String> listasum = new ArrayList<>();
                    // listas.add(lista1);
                    // listas.add(lista2);
                    listasum.add("roupa de cama");
                    listasum.add("travesseiro");
                    listasum.add("pasta e escova de dente");
                    listasum.add("garrafinha");
                    listasum.add("bíblia");

                    for (String lista1 : listasum) {
                        System.out.println("aqui é só a lista1:" + lista1);
                    }

                    ArrayList<String> listasdois = new ArrayList<>();
                    listasdois.add("coração aberto");
                    listasdois.add("sem julgamentos");
                    listasdois.add("cabeça aberta a mudanças");
                    listasdois.add("sede do espírito santo");
                    listasdois.add("e disciplina");

                    for (String lista2 : listasdois) {
                        System.out.println("aqui é só a lista2:" + lista2);
                    }

                    ArrayList<String> listastres = new ArrayList<>(listasum.size() + listasdois.size());
                    listastres.addAll(listasum);
                    listastres.addAll(listasdois);

                    System.out.println("Aqui é o total da lista:" + listastres);
                    
                    break;

                    // Crie um programa que simule a fila de atendimento de um banco
                case 7:
                // essa eu n entendi mesmo
                break;
               // }

               case 8:
               // essa aqui eu até entendi como eu faria, mas nao tive tempo pois estou sem pc

                case 9:
                int[] array1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
                int[] array2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

                int[] arrayInter = new int[20]; 20 pq vai juntar o tam das duas

                for(int i = 0; i< 10; i++) {
                   arrayInter[i * 2] = arrayInter; // na minha cabeça isso aqui faz total sentido, ta certo?
                   arrayInter = array1 + array2;
                }

                //imprimir todos eles
                System.out.println("array 1:");
                for (int value : array1) {
                    System.out.println(value + "array 1: ");
                }
                System.out.println("array 2:");
                for (int value : array2) {
                    System.out.println(value + "array 2: ");
                }
                System.out.println("array integrado:");
                for (int value : arrayInter) {
                    System.out.println(value + "array Integrado: ");
                }
                break;

//Crie um programa que leia 20 valores, calcule a média aritmética desses valores 
//e imprima os valores que são inferiores a esta média.
                case 10:
                System.out.println("diga 20 valores:");
                int[] valores = new int[20];
                int  i;
                float calculo;


                for (i = 0; i < 20; i++){
                    System.out.println("Digite o " + (i+1) + "º valor");
                    valores[i] = scan.nextInt();
                    calculo += valores[i];
                }

                float media = calculo/valores.length;

                System.out.println("Média: " + media);
                for (int valor : valores){
                    if(valor < media){
                        System.out.println(valor + " é menor que a média");
                        menor = true;
                    }
                }
            }
// if e else dentro do for




        } while (opcao != 0);
    }
}