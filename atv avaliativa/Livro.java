import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, String autor, boolean disponivel) {
        super(titulo, disponivel);
        this.titulo = titulo;

         try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Autor",
                "root",
                "")) {

            System.out.println("Inserindo os valores de autor");
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO biblioteca.Autor VALUES (?, ?, ?)")) {
                sc.setLong(1, 0);
                sc.setString(2, this.titulo);
                sc.setString(3, this.autor);
                sc.executeUpdate();

                System.out.println("Usuário inserido");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao inserir usuário: " + exception.getMessage());
        }  
    }
     public static void listarLivros() {
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "")) {

        System.out.println("Realizando SELECT de autor");
            try (PreparedStatement sc = connManager.prepareStatement("SELECT id, nome FROM biblioteca.Biblio")) {
                try (ResultSet ra = sc.executeQuery()) {
                    if (ra.next()) {
                        long id = ra.getLong("id");
                        String titulo = ra.getString("titulo");
                        String autor = ra.getString("autor");

                        System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autor);
                    } else {
                        System.out.println("Livros não encontrados");
                    }
                }
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao realizar SELECT: " + exception.getMessage());
        }
    }  
    // public String toString() {
    //     return "Nome: " + this.nome;
    // }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }
}
