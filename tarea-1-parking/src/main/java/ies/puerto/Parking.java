package ies.puerto;

import java.util.Scanner;

/**
 * @author odeleondev
 * @version 1.0.0
 */
public class Parking {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double tarifaHOra = 1.50;
        int totalVehiculos = 0;
        float totalHorasRegistradas = 0;
        float totalCalculosTarifa = 0;
        float importeTotalCalculado = 0;
        int opcion = 0;
        String matricula;

        System.out.println("Introduzca su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();

        do {
            System.out.println("========================");
            System.out.println("      PARKING MENÚ      ");
            System.out.println("========================");
            System.out.println("1. Registrar vehículos");
            System.out.println("2. Calcular tarifa de estacionamiento");
            System.out.println("3. Mostrar resumen del día");
            System.out.println("4. Salir");

            System.out.println("Elija una de las anteriores opciones para continuar");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int cantidadVehiculos;

                    do {
                        System.out.println("Cuántos vehículos quieres registrar?");
                        cantidadVehiculos = scanner.nextInt();

                        if (cantidadVehiculos <= 0) {
                            System.out.println("Debe ser un número entero positivo");
                        }
                     } while (cantidadVehiculos <= 0);
                    scanner.nextLine();

                    for (int i = 1; i <= cantidadVehiculos; i++) {
                        System.out.println("vehículo "+ i);
                        System.out.println("Matrícula:");
                        matricula = scanner.nextLine();

                        float horas;
                        do {
                            System.out.println("Horas estacionadas:");
                            horas = scanner.nextFloat();

                            if (horas <= 0) {
                                System.out.println("Las horas deben ser mayores que 0");
                            }
                        } while (horas <= 0);
                        scanner.nextLine();
                         totalVehiculos++;
                         totalHorasRegistradas += horas;
                    }
                    System.out.println("Operación hecha correctamente");
                    System.out.println("Vehículos registrados en esta operación: "+ cantidadVehiculos);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    System.out.println("Salida del sistema con exito");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}

