import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Criar usuário");
            System.out.println("2. Alterar usuário");
            System.out.println("3. Excluir usuário");
            System.out.println("4. Visualizar usuários");
            System.out.println("5. Logar");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeCriar = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailCriar = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaCriar = scanner.nextLine();

                    Usuário usuarioCriar = new Usuário(0, nomeCriar, emailCriar, senhaCriar);
                    usuarioCriar.inserirUsuario();
                    break;

                case 2:
                    System.out.print("ID do usuário a ser alterado: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = scanner.nextLine();
                    System.out.print("Nova senha: ");
                    String novaSenha = scanner.nextLine();

                    Usuário usuarioAlterar = new Usuário(idAlterar, novoNome, novoEmail, novaSenha);
                    usuarioAlterar.atualizarUsuario();
                    break;

                case 3:
                    System.out.print("ID do usuário a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    Usuário usuarioExcluir = new Usuário(idExcluir, null, null, null);
                    usuarioExcluir.excluirUsuario();
                    break;

                case 4:
                    Usuário.visualizarUsuarios();
                    break;

                case 5:
                    // Implemente a lógica de login conforme necessário
                    System.out.println("Funcionalidade de login não implementada neste exemplo.");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
