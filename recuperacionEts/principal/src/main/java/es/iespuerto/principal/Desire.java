package es.iespuerto.principal;

/**
 * @version 1.0 Maria Desire Sanchez Alvarez
 * 
 */
public class Desire {
    private String nombre;
    private String apellido1;
    private String apellido2;

    /**
     * Metodo constructor por defecto
     */
    public Desire(){

    }

    /**
     * Metodo constructor parametrizado
     * @param nombre Nombre del alumno
     */
    public Desire(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Metodo constructor parametrizado
     * @param nombre Nombre del alumno
     * @param apellido1 Apellido del alumno
     */
    public Desire(String nombre, String apellido1) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    /**
     * Metodo constructor parametrizado
     * @param nombre Nombre del alumno
     * @param apellido1 Primer Apellido del alumno
     * @param apellido2 Segundo Apellido del alumno
     */
    public Desire(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * Metodo que realizara la validacion de las propiedades de la clase
     * @param nombre Nombre del alumno
     * @param apellido1 Primer Apellido del alumno
     * @param apellido2 Segundo Apellido del alumno
     */
    public void ValidarNombre(String nombre, String apellido1, String apellido2){

    }

    
}
