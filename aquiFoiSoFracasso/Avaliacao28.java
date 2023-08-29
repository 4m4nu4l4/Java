import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.InputVerifier;

import java.util.ArrayList;
import java.util.HashSet;

public class Avaliacao28 {
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
    case 6:
    ArrayList<String> alunos = new ArrayList<>();

    alunos.add("João");
    alunos.add("Maria");
    alunos.add("Pedrinho");
    alunos.add("Emanuele");
    alunos.add("José");

    for (String lista1 : alunos) {
        System.out.println("aqui é só a lista1:" + alunos);
    }

    ArrayList<String> conceitos = new ArrayList<>();
    conceitos.add("Atendeu");
    conceitos.add("Não atendeu");
    conceitos.add("Parcialmente atendeu");
    conceitos.add("Não atendeu de jeito nenhum");

    for (String lista2 : conceitos) {
        System.out.println("aqui é só a lista2:" + conceitos);
    }

 /*    ArrayList<String> listastres = new ArrayList<>(listasum.size() + listasdois.size());
    listastres.addAll(listasum);
    listastres.addAll(listasdois);

    System.out.println("Aqui é o total da lista:" + listastres);*/

/*do {
    System.out.println("João");
    System.out.println("Maria");
    System.out.println("Pedrinho");
    System.out.println("Emanuele");
    System.out.println("José");

 try {
    (consulta : String)
    switch (consulta){
        case 0:
    }
}*/







}
