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
            System.out.println("3 - Criar Mídia");
            System.out.println("4 - Criar biblioteca");
            System.out.println("5 - Adicionar livro");
            System.out.println("6 - Emprestar livro");
            System.out.println("7 - Devolver livro");
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
                        Autor.listarAutores();
                        try {
                            posicaoAutor = sc.nextInt();
                            if (posicaoAutor >= Autor.getAutores().size()) {
                                throw new Exception("Autor inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Autor inválido");
                            posicaoAutor = -1;
                        }
                    } while (posicaoAutor < 0);

                    Autor autor = Autor.getAutores().get(posicaoAutor);
                    new Livro(titulo, autor, true);
                    break;
                }
                case 3: {
                    System.out.println("Digite o tipo de mídia");
                    String tipoMidia = sc.next();
                    System.out.println("Digite o nome da mídia:");
                    String nomeMidia = sc.next();

                    Midia objetoMidia = new Midia(tipoMidia, nomeMidia, true);
                    Midia objetoMidia2 = new Midia(tipoMidia, nomeMidia, false);
                    Midia.midia.add(objetoMidia);
                    // System.out.println("Digite o tipo de mídia");
                    // String TipoMidia = sc.next();
                    // System.out.println("Digite o nome da mídia:");
                    // String NomeMidia = sc.next();
                    // int posicaoMidia = -1;

                    // String tipo = objetoMidia.getTipo();
                    // criada
                    // String nome = objetoMidia.getNomeMidia();
                    // String disponivel = objetoMidia.getdisponivel();

                    int posicaoMidia = -1;

                    do {
                        Midia.listarMidia();
                        try {
                            posicaoMidia = sc.nextInt();
                            if (posicaoMidia >= 0 && posicaoMidia < Midia.midia.size()) {
                                objetoMidia = Midia.midia.get(posicaoMidia);

                                System.out.println("Digite o novo tipo da mídia:");
                                String novoTipo = sc.next();
                                objetoMidia.setTipo(novoTipo);

                                System.out.println("Digite o novo nome da mídia:");
                                String novoNome = sc.next();
                                objetoMidia.setNomeMidia(novoNome);

                                System.out.println("Mídia atualizada com sucesso!");
                            } else {
                                throw new Exception("Mídia inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Mídia inválida. Por favor, tente novamente.");
                            posicaoMidia = -1;
                            sc.nextLine();
                        }
                    } while (posicaoMidia < 0);
                }
                case 4: {
                    System.out.println("Digite o nome da biblioteca:");
                    String nomeBiblioteca = sc.next();
                    Biblioteca novaBiblioteca = new Biblioteca(nomeBiblioteca);
                    Biblioteca.bibliotecas.add(novaBiblioteca);
                    System.out.println("Biblioteca criada :)");
                    break;
                }

                case 5: {
                    int posicaoBiblioteca = -1;
                    Biblioteca bibliotecaSelecionada = null;
                
                    System.out.println("Bibliotecas disponíveis:");
                    for (int i = 0; i < Biblioteca.bibliotecas.size(); i++) {
                        System.out.println(i + " - " + Biblioteca.bibliotecas.get(i).getNome());
                    }
                
                    do { 
                        try {
                            posicaoBiblioteca = sc.nextInt();
                            if (posicaoBiblioteca >= 0 && posicaoBiblioteca < Biblioteca.bibliotecas.size()) {
                                bibliotecaSelecionada = Biblioteca.bibliotecas.get(posicaoBiblioteca);
                            } else {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida. Por favor, tente novamente.");
                            posicaoBiblioteca = -1;
                            sc.nextLine();
                        }
                    } while (posicaoBiblioteca < 0);
                
                    int posicaoLivro = -1;
                    Livro livroSelecionado = null;
                
                    System.out.println("Livros disponíveis:");
                    for (int i = 0; i < Livro.livros.size(); i++) {
                        System.out.println(i + " - " + Livro.livros.get(i));
                    }
                
                    do {
                        try {
                            posicaoLivro = sc.nextInt();
                            if (posicaoLivro >= 0 && posicaoLivro < Livro.livros.size()) {
                                livroSelecionado = Livro.livros.get(posicaoLivro);
                            } else {
                                throw new Exception("Livro inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Livro inválido. Por favor, tente novamente.");
                            posicaoLivro = -1;
                            sc.nextLine();
                        }
                    } while (posicaoLivro < 0);
                
                    
                    bibliotecaSelecionada = Biblioteca.bibliotecas.adicionarLivro(posicaoLivro);
                    
                    System.out.println("Livro adicionado à biblioteca com sucesso!");
                    break;
                }
                
                case 6: {
                    int posicaoBiblioteca = -1;
                    do {
                        Biblioteca bibliotecas = Biblioteca.bibliotecas.listarBibliotecas();
                        try {
                            posicaoBiblioteca = sc.nextInt();
                            if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    do {
                        biblioteca.listarLivros();
                        try {
                            posicaoLivro = sc.nextInt();
                            if (posicaoLivro >= Livro.livros.size()) {
                                throw new Exception("Livro inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    Livro livro = biblioteca.livros.get(posicaoLivro);
                    try {
                        livro.emprestar();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 7: {
                    int posicaoBiblioteca = -1;
                    do {
                        Biblioteca.listarBibliotecas();
                        try {
                            posicaoBiblioteca = sc.nextInt();
                            if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    do {
                        biblioteca.listarLivros();
                        try {
                            posicaoLivro = sc.nextInt();
                            if (posicaoLivro >= Livro.livros.size()) {
                                throw new Exception("Livro inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    Livro livro = biblioteca.livros.get(posicaoLivro);
                    try {
                        livro.devolver();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
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
