
package Entidades;

public class AsignaciondiariaDeEstadoDeIncidente implements Reporte{
    
    private int idReporte;
    private String tituloReporte;

    public AsignaciondiariaDeEstadoDeIncidente() {
    }

    
    public AsignaciondiariaDeEstadoDeIncidente(int idReporte, String tituloReporte) {
        this.idReporte = idReporte;
        this.tituloReporte = tituloReporte;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getTituloReporte() {
        return tituloReporte;
    }

    public void setTituloReporte(String tituloReporte) {
        this.tituloReporte = tituloReporte;
    }
    
    @Override
    public void generarReporte(int idReporte) {
        
    }
    
    public void generarAsignaciones(){
        
    }
            
            
    
}
