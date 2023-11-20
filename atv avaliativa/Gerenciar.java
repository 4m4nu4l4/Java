import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("Minha Biblioteca");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar autor");
            System.out.println("2 - Criar livro");
            System.out.println("3 - Criar mídia digital");
            System.out.println("4 - Criar biblioteca");
            System.out.println("5 - Adicionar livro");
            System.out.println("6 - Adicionar mídia");
        
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                op = 99;
            }

            switch (op) {
                case 0: {
                    System.out.println("Sair....");
                    break;
                }
                case 1: {
                    System.out.println("Digite o nome do autor");
                    String nome = sc.next();
                    System.out.println("Digite o nacionalidade do autor");
                    String nacionalidade = sc.next();
                    new Autor(nome, nacionalidade);
                    break; 
                }
                case 2: {
                    System.out.println("Digite o titulo");
                    String titulo = sc.next();
                    int posicaoAutor = -1;
                    do {
                   
                        
                    } while (posicaoAutor < 0);

                }
                case 3: {
                    System.out.println("Digite o titulo");
                    String titulo = sc.next();
                    System.out.println("Digite o album");
                    String album = sc.next();
                    //new MidiaDigital(titulo, album, true);
                    break;
                }
                case 4: {
                    System.out.println("Digite o nome da biblioteca");
                    String nomeBiblioteca = sc.next();
                    new Biblioteca(nomeBiblioteca);
                    break;
                }
                case 5: {
                    Autor.ListarAutores();
                }
              
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}
