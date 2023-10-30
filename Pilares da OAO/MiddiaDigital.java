import java.util.ArrayList;

public class MiddiaDigital extends Midia {
  protected String Album;

ArrayList<MiddiaDigital> middiaDigital = new ArrayList<>();


  public MiddiaDigital(String tipo, String nomeMidia, boolean disponivel, String Album) {
      super(tipo, nomeMidia, disponivel);
      this.Album = Album;
    
      middiaDigital.add(this);
  }

  public void setAlbum(String Album) { // Realiza alterações no nome salvo no objeto
      this.Album = Album;
  }

  public String getAlbum() { // Consulto o nome salvo no objeto
      return this.Album;
      
  }
  
  public String toString() {
      return "O album da mídia é: " + this.Album;
  }

  public static void listarMiddiaDigital() {
    for(int i = 0; i < MiddiaDigital.midia.size(); i++) {
        System.out.println(i + " - " + MiddiaDigital.midia.get(i).toString());
    }
}
}

