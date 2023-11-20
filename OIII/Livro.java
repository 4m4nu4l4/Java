import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Livro extends Midia {
    private Autor autor;

    public Livro(String titulo, Autor autor, boolean disponivel) {
        super(titulo, disponivel);
        this.autor = autor;

         try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Autor",
                "root",
                "")) {

            System.out.println("Inserindo os valores de autor");
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO biblioteca.Autor VALUES (?, ?)")) {
                sc.setLong(1, 0);
                sc.setString(2, this.titulo);
                sc.setString(2, this.autor);
                sc.executeUpdate();

                System.out.println("Usuário inserido");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao inserir usuário: " + exception.getMessage());
        }
     
       // bibliotecas.add(this);
    }

    public String toString() {
        return "Título: " + super.getTitulo()
            + ". Autor: " + this.autor.getNome() 
            + ". Disponível: " + (super.getDisponivel() ? "Sim" : "Não");
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }
}
