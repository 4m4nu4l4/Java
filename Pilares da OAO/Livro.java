import java.util.ArrayList;

public class Livro extends Midia{
    public String titulo;
    public Autor autor;
    public boolean disponivel;

    public static ArrayList<Livro> livros = new ArrayList<>();

    public Livro(String titulo,String nomeMidia, Autor autor, boolean disponivel) {
        super(titulo, nomeMidia, disponivel);
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;

        livros.add(this);
    }

    public String toString() {
        return "Título: " + this.titulo 
            + ". Autor: " + this.autor.getNome() 
            + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }

    public static void listarLivros() {
        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i).toString());
        }
    }

    public static void listarLivrosPorAutor(Autor autor) {
        for(int i = 0; i < livros.size(); i++) {
            if (livros.get(i).autor == autor) {
                System.out.println(i + " - " + livros.get(i).toString());
            }
        }
    }
}
