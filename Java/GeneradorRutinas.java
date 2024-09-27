package Java;

import java.util.Scanner;

public class GeneradorRutinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rutina rutina = null;

        System.out.println("Seleccione su nivel de condición física:");
        System.out.println("1. Principiante");
        System.out.println("2. Intermedio");
        System.out.println("3. Avanzado");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                rutina = new Principiante();
                break;
            case 2:
                rutina = new Intermedio();
                break;
            case 3:
                rutina = new Avanzado();
                break;
            default:
                System.out.println("Opción no válida. Seleccione un número entre 1 y 3.");
                return;
        }

        rutina.mostrarRutina();

        System.out.println("\n¿Desea ajustar la intensidad semanalmente? (sí/no)");
        scanner.nextLine();
        String respuesta = scanner.nextLine();

        while (respuesta.toLowerCase().contains("si")) {
            if (rutina.intensidad == 1) {
                rutina = new Intermedio();
                System.out.println("\nHas subido al nivel Intermedio. Nueva rutina:");
            } else if (rutina.intensidad == 2) {
                rutina = new Avanzado();
                System.out.println("\nHas subido al nivel Avanzado. Nueva rutina:");
            } else {
                System.out.println("\nYa has alcanzado el nivel máximo de intensidad.");
            }

            rutina.mostrarRutina();

            System.out.println("\n¿Desea seguir ajustando la intensidad semanalmente? (sí/no)");
            respuesta = scanner.nextLine();
        }

        System.out.println("¡Gracias por usar el Generador de Rutinas ❤️!");
        scanner.close();
    }
}
