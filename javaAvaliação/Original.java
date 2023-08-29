/*Desenvolva um programa em Java que permita aos usuários realizar operações simples de manipulação
 de dados de alunos, utilizando estruturas de controle, tratamento de erros, vetores e coleções. 
 O programa deve incluir os seguintes recursos: 

 * Crie um ou mais coleções de strings para armazenar os nomes de alunos e seus conceitos. ✓
   * Os conceitos podem ser 'O', 'B', 'S' ou 'I'. ✓
   * 
   * Caso seja criada mais de uma coleção, os nomes e os conceitos sempre devem corresponder no índice.
      * Exemplo: João está no índice 0 das coleções e seu conceito está no índice 0 das coleções.
   
* Crie um vetor de inteiros para armazenar a quantidade de cada conceito.
   * O vetor deve ter 4 posições, uma para cada conceito. ✓
   * O vetor deve ser inicializado com 0 em todas as posições. ✓
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Original {
    public static void main(String[] args) {
        System.out.println("prova");
        Scanner scan = new Scanner(System.in);
    //    int opcao = 0;


        ArrayList<String> nomes = new ArrayList<>(); //aqui eu criei as duas coleções em string
        ArrayList<String> conceitos = new ArrayList<>(/*"A", "B", "C", "D", "E"*/); //tentei colocar aqui dentro pq achei que era o certo, mas deu erro
        int[] qntdConceitos = new int[4]; //armazena a quantidade de cada conceito


While (true); {
    System.out.println("Digite 1 para - Add novo aluno e seu conceito");
    System.out.println("Digite 2 para - fazer a listagem dos alunos e seus conceitos");
    System.out.println("Digite 3 para - Calcular e exibir a quantidade de cada conceito");
    System.out.println("Digite 4 para - exibir os alunos com o conceito mais alto");
    System.out.println("Digite 5 - Encerrar o programa");
    System.out.println("Escolha entre 1 a 4");
}

    int escolha = scan.nextInt();
    scan.nextLine();

    switch (escolha) {
        case 1:
            System.out.print("Nome do aluno: ");
            String nome = scan.nextLine();
            System.out.print("Diga o conceito O, B, S, ou I");
            String conceito = scan.nextLine();

            if (conceito.matches (["O, B, S, I"])) { //aqui eu to expeficando 
                nome.add(nome);
                conceito.add(conceito);

            
      switch (conceito){
        case "O":
        qntdConceitos[0]++;  //numeros dos conceitos
        break;
        case "B":
        qntdConceitos[4]++;
        break;
        case "S":
        qntdConceitos[6]++;
        break;
        case "I":
        qntdConceitos[8]++;
        break;
    } 
} 
/*switch (conceito) {
    case "O":
    case "B":
    case "S":        isso foi uma tentativa
    case "I":
        break;
    default:
        System.out.println("Conceito inválido. Use O, B, S ou I.");
} */

    System.out.println("Aluno adicionado");
     /*else {
    System.out.println("Conceito inválido. só aceito O, B, S ou I.");
    }*/

    break;

        case 2:
                System.out.println("\nLista de Alunos e Conceitos:");
                    for (int i = 0; i < nomes.size(); i++) {
                        String nomeAluno = nomes.get(i);
                        String conceitoAluno = conceitos.get(i);
                            System.out.println("Nome: " + nomeAluno + ", Conceito: " + conceitoAluno);
    }
    break;
       case 3:
                    System.out.println("\nQuantidade de cada Conceito:"); // valores dos conceitos aleatorios
                    System.out.println("O: " + qntdConceitos[0]);
                    System.out.println("B: " + qntdConceitos[1]);
                    System.out.println("S: " + qntdConceitos[2]);
                    System.out.println("I: " + qntdConceitos[3]);
                    break;
        
        case 4:
                    exibirMaisAlto(nomes, conceitos);
                    break;
        case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida (1-5).");
            }
        
    

    // Função para exibir alunos com o conceito mais alto
    public static void exibirMaisAlto(ArrayList<String> nomes, ArrayList<String> conceitos) {
        HashMap<String, Integer> conceitoCount = new HashMap<>(); 

        for (String conceito : conceitos) {
            conceitoCount.put(conceito, conceitoCount.getOrDefault(conceito, 0) + 1); //pega o conceito que se iniciou no 0 e vai add mais 1
        }

        int maxCount = 0; 
        for (String conceito : conceitoCount.keySet()) { // esse aqui é para obter as chaves do HashMap
            if (conceitoCount.get(conceito) > maxCount) { //o conceito precisa ser maior que 0
                maxCount = conceitoCount.get(conceito);
            }
        }

        System.out.println("\nAlunos com o conceito mais alto:");
        for (int i = 0; i < nomes.size(); i++) {
            if (conceitos.get(i).equals("")) {
                System.out.println("Nome: " + nomes.get(i) + ", Conceito: " + conceitos.get(i));
            }
        }
    }
}


/*
 * }
 * private static void While(boolean b) {
 * }
 * }
 */

/*
 * Professor, venho por meio desse comentário dizer que eu me perdi na minha
 * prórpia lógica, e entrei em desespero, se vc olhar na pasta no
 * meu Github aquiFoiUmFracasso vai entender como minha cabeça ficou
 */

 