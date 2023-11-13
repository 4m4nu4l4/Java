package ExercicioBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuário {

    public int id;
    public String nome;
    public String email;
    public String senha;

    public Usuário(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void inserirUsuario() {
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/usuario",
                "root",
                "")) {

            System.out.println("Inserindo os valores nas variáveis");
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO usuario.usuario VALUES (?, ?, ?, ?)")) {
                sc.setLong(1, 0); // auto-incremento no banco de dados
                sc.setString(2, this.nome);
                sc.setString(3, this.email);
                sc.setString(4, this.senha);
                sc.executeUpdate();

                System.out.println("Usuário inserido");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao inserir usuário: " + exception.getMessage());
        }
    }

    public void atualizarUsuario() {
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/usuario",
                "root",
                "")) {

            System.out.println("Alterar valores dos usuários");
            try (PreparedStatement sc = connManager.prepareStatement("UPDATE usuario.usuario SET nome=?, email=?, senha=? WHERE id=?")) {
                sc.setString(1, this.nome);
                sc.setString(2, this.email);
                sc.setString(3, this.senha);
                sc.setInt(4, this.id);
                sc.executeUpdate();

                System.out.println("Usuário atualizado com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao atualizar usuário: " + exception.getMessage());
        }
    }

    public void excluirUsuario() {
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/usuario",
                "root",
                "")) {

            System.out.println("Excluindo usuário");
            try (PreparedStatement sc = connManager.prepareStatement("DELETE FROM usuario.usuario WHERE id=?")) {
                sc.setInt(1, this.id);
                sc.executeUpdate();

                System.out.println("Usuário excluído com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao excluir usuário: " + exception.getMessage());
        }
    }

    public static void visualizarUsuarios() {
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/usuario",
                "root",
                "")) {

            System.out.println("Visualizando usuários");
            try (PreparedStatement sc = connManager.prepareStatement("SELECT * FROM usuario.usuario");
                 ResultSet rs = sc.executeQuery()) {

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String senha = rs.getString("senha");

                    System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Senha: " + senha);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao visualizar usuários: " + exception.getMessage());
        }
    }
}
