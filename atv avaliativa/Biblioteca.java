//import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Biblioteca {
    private String nome;
    
    public Biblioteca(String nome) {
        this.nome = nome;

        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Autor",
                "root",
                "")) {

            System.out.println("Inserindo os valores de autor");
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO biblioteca.biblio VALUES (?, ?)")) {
                sc.setLong(1, 0);
                sc.setString(2, this.nome);
                sc.executeUpdate();

                System.out.println("Usuário inserido");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao inserir usuário: " + exception.getMessage());
        }
    }

  public static void listarBiblioteca() {
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "")) {

        System.out.println("Realizando SELECT de autor");
            try (PreparedStatement sc = connManager.prepareStatement("SELECT id, nome FROM biblioteca.Biblio")) {
                try (ResultSet ra = sc.executeQuery()) {
                    if (ra.next()) {
                        long id = ra.getLong("id");
                        String nome = ra.getString("nome");
                      
                        System.out.println("ID: " + id + ", Nome: " + nome);
                    } else {
                        System.out.println("Biblioteca não encontrada");
                    }
                }
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao realizar SELECT: " + exception.getMessage());
        }
    }  
    public String toString() {
        return "Nome: " + this.nome;
    }
}
