package sistemaeventos;

/**
 *
 * @author math_
 */
public class Palestra {
  private String titulo;
  private String horarioInicio;
  private String horarioFim;   
  // private String palestrante;
  private String descri;
  private float cargaHorariaPalestra;
  

    public Palestra() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public float getCargaHorariaPalestra() {
        return cargaHorariaPalestra;
    }

    public void setCargaHorariaPalestra(float cargaHorariaPalestra) {
        this.cargaHorariaPalestra = cargaHorariaPalestra;
    }
  
  
  
}
