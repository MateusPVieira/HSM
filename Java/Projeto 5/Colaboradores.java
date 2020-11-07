package sistemafaturamento;

/**
 *
 * @author math_
 */
public class Colaboradores {
// Atributos
    private String nomeComp;
    private int matricula;
    private float salanual;
    private boolean vinculo;
    
// Metodos

    public Colaboradores() {
    }

    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalanual() {
        return salanual;
    }

    public void setSalanual(float salanual) {
        this.salanual = salanual;
    }

    public boolean isVinculo() {
        return vinculo;
    }

    public void setVinculo(boolean vinculo) {
        this.vinculo = vinculo;
    }
    
   public void contratacao() {
       if (isVinculo() == false) {
           setVinculo(true);           
       } else {
           System.out.println("Erro! Colaborador já trabalha em outra empresa");
       }
   }
        
}
