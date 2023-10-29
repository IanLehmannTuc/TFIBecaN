package controlador;

public class MainPrueba2 {
    public static void main(String[] args) {
        // Aquí puedes agregar tu código de prueba
        System.out.println("¡Hola desde el método main!");

        // Ejemplo: Crear instancias de tus clases y realizar pruebas
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Equipo A");
        equipo1.setDescripcion("Descripción del Equipo A");

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Equipo B");
        equipo2.setDescripcion("Descripción del Equipo B");

        Partido partido1 = new Partido(equipo1, equipo2, 2, 1);
        ResultadoEnum resultado = partido1.resultado();
        System.out.println("Resultado del partido: " + resultado);
    }
}
