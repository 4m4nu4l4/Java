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
            System.out.println("6 - Emprestar livro");
            System.out.println("7 - Devolver livro");
            System.out.println("8 - Adicionar mídia");
            System.out.println("9 - Emprestar mídia");
            System.out.println("10 - Devolver mídia");
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
                    new MidiaDigital(titulo, album, true);
                    break;
                }
                case 4: {
                    System.out.println("Digite o nome da biblioteca");
                    String nomeBiblioteca = sc.next();
                    new Biblioteca(nomeBiblioteca);
                    break;
                }
                // case 5: {
                //     int posicaoBiblioteca = -1;
                //     do {
                //         Biblioteca.listarBibliotecas();
                //         try {
                //             posicaoBiblioteca = sc.nextInt();
                //             if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                //                 throw new Exception("Biblioteca inválida");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Biblioteca inválida");
                //             posicaoBiblioteca = -1;
                //         }
                //     } while (posicaoBiblioteca < 0);

                //     Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                //     int posicaoLivro = -1;
                //     do {
                //         Livro.listarLivros();
                //         try {
                //             posicaoLivro = sc.nextInt();
                //             if (posicaoLivro >= Livro.getLivros().size()) {
                //                 throw new Exception("Livro inválido");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Livro inválido");
                //             posicaoLivro = -1;
                //         }
                //     } while (posicaoLivro < 0);

                //     Livro livro = Livro.getLivros().get(posicaoLivro);

                //     biblioteca.adicionarLivro(livro);
                //     break;
                // }
                // case 6: {
                //     int posicaoBiblioteca = -1;
                //     do {
                //         Biblioteca.listarBibliotecas();
                //         try {
                //             posicaoBiblioteca = sc.nextInt();
                //             if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                //                 throw new Exception("Biblioteca inválida");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Biblioteca inválida");
                //             posicaoBiblioteca = -1;
                //         }
                //     } while (posicaoBiblioteca < 0);

                //     Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                //     int posicaoLivro = -1;
                //     do {
                //         biblioteca.listarLivros();
                //         try {
                //             posicaoLivro = sc.nextInt();
                //             if (posicaoLivro >= Livro.getLivros().size()) {
                //                 throw new Exception("Livro inválido");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Livro inválido");
                //             posicaoLivro = -1;
                //         }
                //     } while (posicaoLivro < 0);

                //     Livro livro = biblioteca.getLivros().get(posicaoLivro);
                //     try {
                //         livro.emprestar();
                //     } catch (Exception e) {
                //         System.out.println(e.getMessage());
                //     }

                //     break;
                // }
                // case 7: {
                //     int posicaoBiblioteca = -1;
                //     do {
                //         Biblioteca.listarBibliotecas();
                //         try {
                //             posicaoBiblioteca = sc.nextInt();
                //             if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                //                 throw new Exception("Biblioteca inválida");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Biblioteca inválida");
                //             posicaoBiblioteca = -1;
                //         }
                //     } while (posicaoBiblioteca < 0);

                //     Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                //     int posicaoLivro = -1;
                //     do {
                //         biblioteca.listarLivros();
                //         try {
                //             posicaoLivro = sc.nextInt();
                //             if (posicaoLivro >= Livro.getLivros().size()) {
                //                 throw new Exception("Livro inválido");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Livro inválido");
                //             posicaoLivro = -1;
                //         }
                //     } while (posicaoLivro < 0);

                //     Livro livro = biblioteca.getLivros().get(posicaoLivro);
                //     try {
                //         livro.devolver();
                //     } catch (Exception e) {
                //         System.out.println(e.getMessage());
                //     }
                //     break;
                // }
                // case 8: {
                //     int posicaoBiblioteca = -1;
                //     do {
                //         Biblioteca.listarBibliotecas();
                //         try {
                //             posicaoBiblioteca = sc.nextInt();
                //             if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                //                 throw new Exception("Biblioteca inválida");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Biblioteca inválida");
                //             posicaoBiblioteca = -1;
                //         }
                //     } while (posicaoBiblioteca < 0);

                //     Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                //     int posicaoMidiaDigital = -1;
                //     do {
                //         MidiaDigital.listarMidiaDigitals();
                //         try {
                //             posicaoMidiaDigital = sc.nextInt();
                //             if (posicaoMidiaDigital >= MidiaDigital.getMidiasDigitals().size()) {
                //                 throw new Exception("Midia Digital inválido");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Midia Digital inválido");
                //             posicaoMidiaDigital = -1;
                //         }
                //     } while (posicaoMidiaDigital < 0);

                //     MidiaDigital midiaDigital = MidiaDigital.getMidiasDigitals().get(posicaoMidiaDigital);

                //     biblioteca.adicionarMidiaDigital(midiaDigital);
                //     break;
                // }
                // case 9: {
                //     int posicaoBiblioteca = -1;
                //     do {
                //         Biblioteca.listarBibliotecas();
                //         try {
                //             posicaoBiblioteca = sc.nextInt();
                //             if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                //                 throw new Exception("Biblioteca inválida");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Biblioteca inválida");
                //             posicaoBiblioteca = -1;
                //         }
                //     } while (posicaoBiblioteca < 0);

                //     Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                //     int posicaoMidiaDigital = -1;
                //     do {
                //         biblioteca.listarMidias();
                //         try {
                //             posicaoMidiaDigital = sc.nextInt();
                //             if (posicaoMidiaDigital >= MidiaDigital.getMidiasDigitals().size()) {
                //                 throw new Exception("Midia Digital inválido");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Midia Digital inválido");
                //             posicaoMidiaDigital = -1;
                //         }
                //     } while (posicaoMidiaDigital < 0);

                //     MidiaDigital midiaDigital = biblioteca.getMidiasDigitals().get(posicaoMidiaDigital);
                //     try {
                //         midiaDigital.emprestar();
                //     } catch (Exception e) {
                //         System.out.println(e.getMessage());
                //     }

                //     break;
                // }
                // case 10: {
                //     int posicaoBiblioteca = -1;
                //     do {
                //         Biblioteca.listarBibliotecas();
                //         try {
                //             posicaoBiblioteca = sc.nextInt();
                //             if (posicaoBiblioteca >= Biblioteca.getBibliotecas().size()) {
                //                 throw new Exception("Biblioteca inválida");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Biblioteca inválida");
                //             posicaoBiblioteca = -1;
                //         }
                //     } while (posicaoBiblioteca < 0);

                //     Biblioteca biblioteca = Biblioteca.getBibliotecas().get(posicaoBiblioteca);

                //     int posicaoMidiaDigital = -1;
                //     do {
                //         biblioteca.listarMidias();
                //         try {
                //             posicaoMidiaDigital = sc.nextInt();
                //             if (posicaoMidiaDigital >= MidiaDigital.getMidiasDigitals().size()) {
                //                 throw new Exception("Midia Digital inválido");
                //             }
                //         } catch (Exception e) {
                //             System.out.println("Midia Digital inválido");
                //             posicaoMidiaDigital = -1;
                //         }
                //     } while (posicaoMidiaDigital < 0);

                //     MidiaDigital midiaDigital = biblioteca.getMidiasDigitals().get(posicaoMidiaDigital);
                //     try {
                //         midiaDigital.devolver();
                //     } catch (Exception e) {
                //         System.out.println(e.getMessage());
                //     }
                //     break;
                // }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}
