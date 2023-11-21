public class Midia {
    
    public String titulo;
    public boolean disponivel;

    public Midia(String titulo, boolean disponivel) {
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public String toString() {
        return "Título: " + this.titulo + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }

    public void emprestar() throws Exception {
        if (!this.disponivel) {
            throw new Exception("Midia não está disponível");
        }
        this.disponivel = false;
    }

    public void devolver() throws Exception {
        if (this.disponivel) {
            throw new Exception("Midia já está disponível");
        }
        this.disponivel = true;
    }

}
