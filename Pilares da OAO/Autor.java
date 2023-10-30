import java.util.ArrayList;

public class Autor extends Pessoa { 
    private String nacionalidade;
    private static ArrayList<Autor> autores = new ArrayList<Autor>();

    public Autor(String nome, String nacionalidade) {
        // Chama o metodo construtor da super classe (new Pessoa)
        super(nome);
        this.nacionalidade = nacionalidade;

        autores.add(this);
    }
    // aqui eu tenho um exemplo de polimorfismo estático
    // pq tem sobrecargas de métodos

    public Autor(String nome) { 
        this(nome, "Brasil");
        /*super(nome);
        this.nacionalidade = "Brasil";

        autores.add(this);*/
    }

    public void setNacionalidade(String nacionalidade) { //(encapsulamento) set -> atribui
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() { //(encapsulamento) get -> solicita/pega
        return this.nacionalidade;
    }

    public static ArrayList<Autor> getAutores() {
        return autores;
    }

    public String toString() { // Polimorfismo dinamico
        return super.toString() + ". Nacionalidade: " + this.nacionalidade;
    }

    public static void listarAutores() {
        for(int i = 0; i < autores.size(); i++) {
            System.out.println(i + " - " + autores.get(i).toString());
        }
    }
}