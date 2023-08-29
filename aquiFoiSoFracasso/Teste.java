import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.InputVerifier;

import java.util.ArrayList;
import java.util.HashSet;

public class Teste{
    public static void main(String[] args) {
        System.out.println("prova");
        Scanner scan = new Scanner(System.in);
        int opcao = 0;


/*Desenvolva um programa em Java que permita aos usuários realizar operações simples de manipulação
 de dados de alunos, utilizando estruturas de controle, tratamento de erros, vetores e coleções. 
 O programa deve incluir os seguintes recursos: 

 * Crie um ou mais coleções de strings para armazenar os nomes de alunos e seus conceitos.
   * Os conceitos podem ser 'O', 'B', 'S' ou 'I'.
   * 
   * Caso seja criada mais de uma coleção, os nomes e os conceitos sempre devem corresponder no índice.
      * Exemplo: João está no índice 0 das coleções e seu conceito está no índice 0 das coleções.
   
* Crie um vetor de inteiros para armazenar a quantidade de cada conceito.
   * O vetor deve ter 4 posições, uma para cada conceito.
   * O vetor deve ser inicializado com 0 em todas as posições.
   * O vetor deve ser atualizado sempre que um novo conceito for inserido.

* Implemente um menu de opções numeradas que permita aos usuários:

   * Inserir um novo aluno e seu conceito.
   * Listar todos os alunos e seus conceitos.
   * Calcular e exibir a quantidade de cada conceito.
   * Exibir os alunos com o conceito mais alto.
   * Encerrar o programa. 
   * 
   * Utilize estruturas de controle "if", "for" e "while" para realizar as operações de acordo com as escolhas dos usuários.

Implemente tratamento de erros para garantir que os conceitos inseridas sejam `char` válidos.*/


do {
    System.out.println("Atividade avaliativa ----------------");

    try {
        opcao = scan.nextInt();
    } catch (InputMismatchException e) {
        opcao = -1;
        scan.next();
    }

    switch (opcao) {
        case 0:
            System.out.println("Obrigado pela atenção!");
            break;
    }
   
    case 1:
    HashSet<String> boletim = new HashSet<String>();
    
    String[] conceito = {"A", "B", "C", "D", "F"};
    int[] qntdConceitos = {0, 3, 7, 10};

    for (var qntdConceitos = 0; qntdConceitos < qntdConceitos.length; qntdConceitos++) {
        for (conceito = 0; conceito < conceito.length; conceito++) {
            baralho.add(numeros[numero] + " de " + nipes[nipe]);
        }

    String [] alunos = {"Maria", "Carol", "Manu", "Matheus"}
    for (String pessoa : alunos) {
        System.out.println(pessoa);

    }

    // Imprima as quantidades de cada conceito
    for (int i = 0; i < conceitos.length; i++) {
        System.out.println("Conceito " + conceito[i] + ": " + quantidades[i]);
    }
}

/*case 5:
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
 */






}






}

