package Java;

public class Intermedio extends Rutina {
    public Intermedio() {
        nivel = "Intermedio";
        intensidad = 2; 
    }

    @Override
    public void mostrarRutina() {
        System.out.println("Rutina de " + nivel + ":");
        System.out.println("1. 5 minutos de estiramiento");
        System.out.println("2. 20 minutos de trote");
        System.out.println("3. 4 series de 15 sentadillas");
    }
}
