import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private ArrayList<Midia> midias;
    public static List<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.midias.add(livro);
    }

    public void listarMidias() {
        for (int i = 0; i < midias.size(); i++) {
            System.out.println(i + " - " + midias.get(i).toString());
        }
    }

    public String getNome() {
        return nome;
    }
}
