package sistemaeventos;
public class Evento {
    private String nomeEvento;
    private String responsavel;
    private String dataInicioEvento;
    private String dataFimEvento;
    private float cargaHorariaEvento;
    private String lista;
    private float totPal;
    private int totnPal;
    
// Métodos

    public Evento() {
        nomeEvento = "Null";
        responsavel = "Null";
        dataInicioEvento = "Null";
        dataFimEvento = "Null";
        cargaHorariaEvento = 0;
        lista = " ";       
                
        
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDataInicioEvento() {
        return dataInicioEvento;
    }

    public void setDataInicioEvento(String dataInicioEvento) {
        this.dataInicioEvento = dataInicioEvento;
    }

    public String getDataFimEvento() {
        return dataFimEvento;
    }

    public void setDataFimEvento(String dataFimEvento) {
        this.dataFimEvento = dataFimEvento;
    }

    public float getCargaHorariaEvento() {
        return cargaHorariaEvento;
    }

    public void setCargaHorariaEvento(float cargaHorariaEvento) {
        this.cargaHorariaEvento = cargaHorariaEvento;
    }
    
    // Métodos especiais

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public float getTotPal() {
        return totPal;
    }

    public void setTotPal(float totPal) {
        this.totPal = totPal;
    }

    public int getTotnPal() {
        return totnPal;
    }

    public void setTotnPal(int totnPal) {
        this.totnPal = totnPal;
    }
    

    @Override
    public String toString() {
        return "Evento{" + "nomeEvento=" + nomeEvento + ", responsavel=" + responsavel + ", dataInicioEvento=" + dataInicioEvento + ", dataFimEvento=" + dataFimEvento + ", cargaHorariaEvento=" + cargaHorariaEvento + '}';
    }
    
    
            
    
}
