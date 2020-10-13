package sistemafaturamento;
public class Empresa {
//Atributos
    private String cnpj;
    private String dInau;
    private String LisSocFili;
    private String DadosSede;
    private boolean eSede;
    private String nomeSede;
    private String nomeFilial;
    
    //Metodos

    public Empresa() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getdInau() {
        return dInau;
    }

    public void setdInau(String dInau) {
        this.dInau = dInau;
    }

    public String getLisSocFili() {
        return LisSocFili;
    }

    public void setLisSocFili(String LisSocFili) {
        this.LisSocFili = LisSocFili;
    }

    public String getDadosSede() {
        return DadosSede;
    }

    public void setDadosSede(String DadosSede) {
        this.DadosSede = DadosSede;
    }

    public boolean iseSede() {
        return eSede;
    }

    public void seteSede(boolean eSede) {
        this.eSede = eSede;
    }

    public String getNomeSede() {
        return nomeSede;
    }

    public void setNomeSede(String nomeSede) {
        this.nomeSede = nomeSede;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }
    
    
            
}
