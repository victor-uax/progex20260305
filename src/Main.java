public class Main {
    public static void main(String[] args) {

        CentroFP centrofp1 = new CentroFP(20);

        Alumno alumno1 = new Alumno(1,"Luca", "veterinaria", 54);
        Alumno alumno2 = new Alumno(2,"Mario", "farmacia", 3);
        Alumno alumno3 = new Alumno(3,"PapuGod", "DAM", 13);
        Alumno alumno4 = new Alumno(4,"El kiko", "ADE", 87);
        Alumno alumno5 = new Alumno(5,"Marquitos", "forestal", 90);
        Alumno alumno6 = new Alumno(6,"Luis", "aeroespacial", 18);

        System.out.println(centrofp1.registrarAlumno(alumno1));
        System.out.println(centrofp1.registrarAlumno(alumno2));
        System.out.println(centrofp1.registrarAlumno(alumno3));
        System.out.println(centrofp1.registrarAlumno(alumno4));
        System.out.println(centrofp1.registrarAlumno(alumno5));
        System.out.println(centrofp1.registrarAlumno(alumno6));




        System.out.print(centrofp1.mostrarAlumnos());


        System.out.println(centrofp1.contarAlumnos());

        System.out.println(centrofp1.buscarAlumno(2));
        System.out.println(centrofp1.buscarAlumno(1241223));
    }
}