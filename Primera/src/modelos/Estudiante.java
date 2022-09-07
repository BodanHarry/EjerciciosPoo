package modelos;
/**
 * @author hebod
 * @version 1.0
 * @created 24-ago-2022 3:40:29 PM
 */
public class Estudiante {

	private String apellido;
	private String carrera;
	private String codigo;
	private String nombre;
	public Asignatura m_Asignatura [] = new Asignatura[6];

	public Estudiante(){

	}

    public Estudiante(String codigo,String nombre, String apellido, String carrera) {
        this.apellido = apellido;
        this.carrera = carrera;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getM_Asignatura() {
        return m_Asignatura;
    }

    public void setM_Asignatura(Asignatura[] m_Asignatura) {
        this.m_Asignatura = m_Asignatura;
    }

   

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    
    
	public void finalize() throws Throwable {

	}
}//end Estudiante