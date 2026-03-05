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

    /**
     * Busca el primer hueco libre en el array alumnos
     * @return la posición del primer hueco libre en el caso de que lo encuentre o -1 si no ha encontrado hueco libre
     */
    private int buscarPrimerHuecoLibre(){
        int posicionPrimerHuecoLibre = -1;
        boolean seguirBuscando = true;

        for( int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++ ){
            if( alumnos[i] == null ){
                posicionPrimerHuecoLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionPrimerHuecoLibre;
    }

    /**
     * Registra un Alumno recibido en el array alumnos. Primero comprueba si hay hueco libre, en el caso de que haya busca a ese Alumno para verificar que no esté duplicado. En el caso de que no esté duplicado se registra en la posición del primer hueco libre
     * @param alumno, el alumno entero
     * @return true si ha podido ser registrado correctamente o false si no ha podido ser registrado
     */
    public boolean registrarAlumno(Alumno alumno){
        boolean alumnoRegistrado  = false;
        int primerHuecoLibre;

        primerHuecoLibre = buscarPrimerHuecoLibre();

        if( primerHuecoLibre != -1 ){
            if( buscarAlumno(alumno.getId()) == null ){
                alumnos[primerHuecoLibre] = alumno;
                alumnoRegistrado = true;
            }
        }
        return alumnoRegistrado;
    }


    /**
     * Recorre el array de alumnos y muestra por pantalla toda la información de los alumnos en cuyas posiciones no estén vacías
     * @param
     * @return nada
     */
    public void mostrarAlumnos(){
        for(  int i = 0; i < MAX_ALUMNOS; i++ ){
            if( alumnos[i] != null ){
                alumnos.toString();
            }
        }
    }

    /**
     *Recorre el array alumnos y por cada posición que no esté vacía le suma 1 al contador de alumnos
     * @return int cantidad de Alumno en el array alumnos
     */
    public int contarAlumnos(){
        int contadorAlumnos  = 0;

        for( int i = 0; i < MAX_ALUMNOS; i++ ){
            if( alumnos[i] != null ){
                contadorAlumnos++;
            }
        }
        return contadorAlumnos;
    }

}
