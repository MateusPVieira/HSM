package sistemafaturamento;

/**
 *
 * @author math_
 */
public class  Filiais extends Empresa{
// Atributos    
    private String nomRep;
    private float fatAnual;
    private String ende;
    private int codFilial;

// Metodos

    public Filiais() {
    }

    public String getNomRep() {
        return nomRep;
    }

    public void setNomRep(String nomRep) {
        this.nomRep = nomRep;
    }

    public float getFatAnual() {
        return fatAnual;
    }

    public void setFatAnual(float fatAnual) {
        this.fatAnual = fatAnual;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }

    public int getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(int codFilial) {
        this.codFilial = codFilial;
    }
    
    
}
