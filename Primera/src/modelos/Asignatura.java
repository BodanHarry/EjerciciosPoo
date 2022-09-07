package modelos;

/**
 * @author hebod
 * @version 1.0
 * @created 24-ago-2022 3:40:28 PM
 */
public class Asignatura {

	private String codigo;
	private int creditos;
	private String nombre;

	public Asignatura(){

	}

        public Asignatura(String codigo, int creditos, String nombre) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        
    
	public void finalize() throws Throwable {

	}
        
}//end Asignatura