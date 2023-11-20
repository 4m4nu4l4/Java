import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class MidiaDigital extends Midia {
    private String album;

    public MidiaDigital(String titulo, String album, boolean disponivel) {
        super(titulo, album, disponivel);
        this.album = album;
        try (Connection connManager = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Autor",
                "root",
                "")) {

            System.out.println("Inserindo os valores de autor");
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO biblioteca.Autor VALUES (?, ?, ?)")) {
                sc.setLong(1, 0);
                sc.setString(2, this.titulo);
                sc.setString(3, this.album);
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
                + ". Álbum: " + this.album
                + ". Disponível: " + (super.getDisponivel() ? "Sim" : "Não");
    }

}
