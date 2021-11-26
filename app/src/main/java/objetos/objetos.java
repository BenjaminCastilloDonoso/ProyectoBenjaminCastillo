package objetos;

public class objetos {
    private int id;
    private String[] mes = {"Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    private String[] curso = {"1°A","1°B","2°A","3°A","3°B","4°A","4°B","5°A","5°B","6°A","6°B","7°A","7°B","8°A","K°A","K°B"};
    private String[] motivo = {"Fines pertinentes","Asignación familiar","Direccion de movilizacion","Caja de compensasión"};

    public objetos(){
        id = 1;
    }

    public objetos(int id, String[] mes, String[] curso, String[] motivo) {
        this.id = id;
        this.mes = mes;
        this.curso = curso;
        this.motivo = motivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String[] getCurso() {
        return curso;
    }

    public void setCurso(String[] curso) {
        this.curso = curso;
    }

    public String[] getMotivo() {
        return motivo;
    }

    public void setMotivo(String[] motivo) {
        this.motivo = motivo;
    }
}
