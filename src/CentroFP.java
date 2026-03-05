public class CentroFP {

    // atributos
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    /**
     * Constructor de la clase CentroFP
     * @param cant_max_alumnos número máximo que se le asignará a MAX_ALUMNOS recibido como parámetro
     */
    public CentroFP(int cant_max_alumnos) {
        MAX_ALUMNOS = cant_max_alumnos;
    }

    /**
     * Metodo que busca un alumno en el array alumnos por su id
     * @param id del Alumno buscado
     * @return el Alumno completo si lo ha encontrado o null si no lo ha encontrado
     */
    public Alumno buscarAlumno(int id){
        boolean seguirBuscando = true;
        Alumno alumnoBuscado = null;

        for( int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++ ){
            if( alumnos[i] != null && alumnos[i].getId() == id ){
                alumnoBuscado = alumnos[i];
                seguirBuscando = false;
            }
        }
        return alumnoBuscado;
    }   //
}
