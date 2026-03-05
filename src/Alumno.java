public class Alumno {

    // atributos
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    /**
     * Metodo constructor de la clase Alumno
     * @param id del alumno
     * @param nombre del alumno
     * @param tituloFP título de cada alumno
     * @param edad edad del alumno
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Devuelve el id pedido del alumno
     * @return int id
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del alumno
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el título de FP asignado al alumno
     * @return String tituloFP
     */
    public String getTituloFP() {
        return tituloFP;
    }

    /**
     * Devuelve la edad del alumno
     * @return int edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve toda la información del Alumno
     * @return String con toda la información del Alumno
     */
    public String toString(){
        StringBuilder sb = new StringBuilder("El alumno {");
        sb.append(String.format(" id: %d,", this.id));
        sb.append(String.format(" nombre: %s,", this.nombre));
        sb.append(String.format(" título FP: %s", this.tituloFP));
        sb.append(String.format(" edad: %d", this.edad));
        sb.append(String.format("}"));

        return sb.toString();
    }


}
