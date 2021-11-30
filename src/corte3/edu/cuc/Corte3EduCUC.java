package corte3.edu.cuc;

import java.util.Scanner;

public class Corte3EduCUC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seguir = 1;
        while (seguir == 1) {

            int cant_estudiantes, i, j;
            double corte, suma = 0, promedio, general = 0, minima = 0;
            String nombre;

            System.out.println("Digite El Numero De Estudiantes Que Posee El Curso: ");
            cant_estudiantes = scanner.nextInt();
            String[] nombres_estudiantes = new String[cant_estudiantes];
            double[] nota_final = new double[cant_estudiantes];
            System.out.println("\n \n");
            // Nombre De Los Estudiantes
            for (i = 0; i < nombres_estudiantes.length; i++) {
                System.out.println("Estudiante N* " + (i + 1) + " Digite Su Nombre: ");
                nombres_estudiantes[i] = scanner.next();
                System.out.println("\n");
            }

            // Nota De Los Estudiantes
            for (i = 0; i < nota_final.length; i++) {
                promedio = 0;
                for (j = 0; j < 3; j++) {
                    System.out.println(
                            "Digite La Nota Del Corte N*" + (j + 1) + " Del Estudiante " + nombres_estudiantes[i]);
                    corte = scanner.nextDouble();
                    if (j == 0) {
                        suma = corte * 0.3;
                    } else {
                        if (j == 1) {
                            suma = corte * 0.3;
                        } else {
                            if (j == 2) {
                                suma = corte * 0.4;
                            }
                        }
                    }
                    System.out.println("\n \n");

                    promedio = promedio + suma;
                }
                nota_final[i] = promedio;
                general = general + nota_final[i];
            }
            general = general / cant_estudiantes;

            System.out.println("\n \n");
            for (i = 0; i < nombres_estudiantes.length; i++) {
                System.out.println("/////////////////////////////////////////////////////////////////");
                System.out.println("Estudiante: " + nombres_estudiantes[i]);
                System.out.println("Nota Final: " + nota_final[i]);
                System.out.println("Promedio General: " + general);
                if (nota_final[i] >= 3.5) {
                    System.out.println("Usted Aprobo La Asignatura");
                } else {
                    System.out.println("Usted Desaprobo La Asignatura");
                }
            }

            System.out.println("\n \n \n");
            System.out.println("Decea Volver a Ejecutar");
            System.out.println("Presione 1 Para Continuar");
            System.out.println("Presione 0 Para cancelar");
            seguir = scanner.nextInt();

        }

    }
}
