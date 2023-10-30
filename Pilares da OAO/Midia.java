import java.util.ArrayList;

public class Midia {
  protected String tipo;
  protected String NomeMidia;//o protected acessa informações através do super
  protected boolean disponivel;

public static ArrayList<Midia> midia = new ArrayList<>();

  public Midia(String tipo, String NomeMidia, boolean disponivel) {
      this.tipo = tipo; //aqui eu atribuo o valor nome para o Pai
      this.NomeMidia = NomeMidia;
      this.disponivel = disponivel;

      midia.add(this);
  }

  public void setTipo(String tipo) { // Realiza alterações no nome salvo no objeto
      this.tipo = tipo;
  }

  public void setNomeMidia(String NomeMidia) {
      this.NomeMidia = NomeMidia;
  }

  public void setdisponive(boolean disponivel) {
      this.disponivel = disponivel;
  }

  public String getTipo() { // Consulto o nome salvo no objeto
      return this.tipo;
      
  }
  public String getNomeMidia() {
      return this.NomeMidia;
      
  }

  public boolean getdisponivel() {
      return this.disponivel;
      
  }

  public void emprestar() throws Exception {
    if (!this.disponivel) {
        throw new Exception(" não está disponível");
    }
    this.disponivel = false;
}

public void devolver() throws Exception {
    if (this.disponivel) {
        throw new Exception(" já está disponível");
    }
    this.disponivel = true;
}

  public String toString() {
      return "O tipo da mídia é: " + this.tipo + " E o nome é: " + this.NomeMidia + "Ele" + this.disponivel + "está disponível";
  }

  public static void listarMidia() {
    for(int i = 0; i < midia.size(); i++) {
        System.out.println(i + " - " + midia.get(i).toString());
    }
}
}