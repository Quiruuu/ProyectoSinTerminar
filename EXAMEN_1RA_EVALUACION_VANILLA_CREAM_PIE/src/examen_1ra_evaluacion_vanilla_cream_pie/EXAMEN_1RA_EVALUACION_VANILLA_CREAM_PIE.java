package examen_1ra_evaluacion_vanilla_cream_pie;
import clases_examen.DatosIntegrantes;
import clases_examen.Pelicula;
public class EXAMEN_1RA_EVALUACION_VANILLA_CREAM_PIE {
    public static void main(String[] args) {
        DatosIntegrantes.imprimirDatosEquipo();
        DatosIntegrantes.imprimirProblemasResueltos();
        System.out.println("------------------------------------------");
        System.out.println("CLASE PELICULA");
        Pelicula miPelicula = new Pelicula("Gato con botas: el último deseo", "Cinepolis", 72);       
        miPelicula.imprimirDatos();     
        miPelicula.evaluarEdad(16);
    }
    
}
