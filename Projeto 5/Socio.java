package sistemafaturamento;

/**
 *
 * @author math_
 */
public class Socio {
    //Atributos
    private String nomComp;
    private String cpf;
    private String telSocio;
    private String dNascSoc;
    
    //Metodos

    public Socio() {
    }

    public String getNomComp() {
        return nomComp;
    }

    public void setNomComp(String nomComp) {
        this.nomComp = nomComp;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelSocio() {
        return telSocio;
    }

    public void setTelSocio(String telSocio) {
        this.telSocio = telSocio;
    }

    public String getdNascSoc() {
        return dNascSoc;
    }

    public void setdNascSoc(String dNascSoc) {
        this.dNascSoc = dNascSoc;
    }
}
