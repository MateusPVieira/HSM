package sistemaeventos;

/**
 *
 * @author math_
 */
public class Palestrante {
  private String nomePalestrante;
  private String contatoPalestrante;
  private float valorHora;
  private float maValor;
  private float meValor;
  private String PaleMaValor;
  private String PaleMeValor;
         

    public Palestrante() {
        this.maValor = 0;
        this.meValor = 1000000;
    }

    public String getNomePalestrante() {
        return nomePalestrante;
    }

    public void setNomePalestrante(String nomePalestrante) {
        this.nomePalestrante = nomePalestrante;
    }

    public String getContatoPalestrante() {
        return contatoPalestrante;
    }

    public void setContatoPalestrante(String contatoPalestrante) {
        this.contatoPalestrante = contatoPalestrante;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getMaValor() {
        return maValor;
    }

    public void setMaValor(float maValor) {
        this.maValor = maValor;
    }

    public float getMeValor() {
        return meValor;
    }

    public void setMeValor(float meValor) {
        this.meValor = meValor;
    }

    public String getPaleMaValor() {
        return PaleMaValor;
    }

    public void setPaleMaValor(String PaleMaValor) {
        this.PaleMaValor = PaleMaValor;
    }

    public String getPaleMeValor() {
        return PaleMeValor;
    }

    public void setPaleMeValor(String PaleMeValor) {
        this.PaleMeValor = PaleMeValor;
    }

    @Override
    public String toString() {
        return "\n" + nomePalestrante + "\nContato Palestrante: " + contatoPalestrante + "\nValor Hora R$: " + valorHora;
    }
  
  
}
