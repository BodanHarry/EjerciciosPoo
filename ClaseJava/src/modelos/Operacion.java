package modelos;

/**
 * @author hebod
 * @version 1.0
 * @created 07-sep-2022 3:23:50 PM
 */
public class Operacion {

    private Persona persona = new Persona();

    public Operacion() {

    }

    public Operacion(String nom, String ape, int edad){
        this.persona = new Persona (nom,ape,edad);
        
    }
    public String evaluarEdad(int edad) {
        if(persona.getEdad()>=18) return "Mayor de edad";
                return "Menor de edad";
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Operacion{" + "persona=" + persona + '}';
    }
    
    
}//end Operacion
