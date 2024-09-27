package Java;

public class Avanzado extends Rutina {
    public Avanzado() {
        nivel = "Avanzado";
        intensidad = 3; 
    }

    @Override
    public void mostrarRutina() {
        System.out.println("Rutina de " + nivel + ":");
        System.out.println("1. 5 minutos de estiramiento");
        System.out.println("2. 30 minutos de carrera");
        System.out.println("3. 5 series de 20 sentadillas");
    }
}
