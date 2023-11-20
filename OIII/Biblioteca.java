//import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    
    
    public Biblioteca(String nome) {
        this.nome = nome;
        //this.livros = new ArrayList<>();
        //this.midiasDigitals = new ArrayList<>();

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
     
       // bibliotecas.add(this);
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    // public void adicionarLivro(Livro livro) {
    //     this.livros.add(livro);
    // }

    // public void adicionarMidiaDigital(MidiaDigital midiaDigitals) {
    //     this.midiasDigitals.add(midiaDigitals);
    // }

    // public void listarLivros() {
    //     for(int i = 0; i < this.livros.size(); i++) {
    //         System.out.println(i + " - " + this.livros.get(i).toString());
    //     }
    // }

    // public void listarMidias() {
    //     for(int i = 0; i < this.midiasDigitals.size(); i++) {
    //         System.out.println(i + " - " + this.midiasDigitals.get(i).toString());
    //     }
    // }

    // public static ArrayList<Biblioteca> getBibliotecas() {
    //     return bibliotecas;
    // }

    // public ArrayList<Livro> getLivros() {
    //     return this.livros;
    // }

    // public ArrayList<MidiaDigital> getMidiasDigitals() {
    //     return this.midiasDigitals;
    // }

    // public static void listarBibliotecas() {
    //     for(int i = 0; i < bibliotecas.size(); i++) {
    //         Biblioteca biblioteca = bibliotecas.get(i);
    //         System.out.println(i + " - " + biblioteca.toString());
    //     }
    // }
}
