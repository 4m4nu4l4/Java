import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;

public class Autor extends Pessoa {
    private String nacionalidade;
    
    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
            try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Autor", //errado aqui esta o erro corrigir por favor (mude para o mysql se possivel) ass: davi gamer 123 XD
                "root",
                "")) {

            System.out.println("Inserindo os valores de autor");
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO biblioteca.Autor VALUES (?, ?, ?)")) {
                sc.setLong(1, 0);
                sc.setString(2, this.nome);
                sc.setString(3, this.nacionalidade);
                sc.executeUpdate();

                System.out.println("Usuário inserido");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao inserir usuário: " + exception.getMessage());
        }
    }

    public static void ListarAutores() {
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "")) {

        System.out.println("Realizando SELECT de autor");
            try (PreparedStatement sc = connManager.prepareStatement("SELECT id, nome, nacionalidade FROM biblioteca.Autor")) {
                try (ResultSet ra = sc.executeQuery()) {
                    if (ra.next()) {
                        long id = ra.getLong("id");
                        String nome = ra.getString("nome");
                        String nacionalidade = ra.getString("nacionalidade");

                        System.out.println("ID: " + id + ", Nome: " + nome + ", Nacionalidade: " + nacionalidade);
                    } else {
                        System.out.println("Autor não encontrado");
                    }
                }
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao realizar SELECT: " + exception.getMessage());
        }
    }  
        
    public Autor(String nome) {
        this(nome, "Brasil");
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String toString() {
        return super.toString() + ". Nacionalidade: " + this.nacionalidade;
    }

}