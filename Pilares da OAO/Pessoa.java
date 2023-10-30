public class Pessoa { // aqui criei a herança pai
    protected String nome; //o protected acessa informações através do super

    public Pessoa(String nome) {
        this.nome = nome; //aqui eu atribuo o valor nome para o Pai
    }

    public void setNome(String nome) { // Realiza alterações no nome salvo no objeto
        this.nome = nome;
    }

    public String getNome() { // Consulto o nome salvo no objeto
        return this.nome;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }
}
