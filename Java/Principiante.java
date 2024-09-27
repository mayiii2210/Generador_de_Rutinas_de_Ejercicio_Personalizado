package Java;


public class Principiante extends Rutina {
    public Principiante() {
        nivel = "Principiante";
        intensidad = 1; 
    }

    @Override
    public void mostrarRutina() {
        System.out.println("Rutina de " + nivel + ":");
        System.out.println("1. 10 minutos de estiramiento");
        System.out.println("2. 15 minutos de caminata");
        System.out.println("3. 3 series de 10 sentadillas");
    }
}
