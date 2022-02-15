package tiempoJava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import lectura.Leer;

public class Principal {
     public static void main(String[] args) {
         LocalDate hoy, fechaCaducidad;
         LocalTime hora;
         long dias;
         int annoCaducidad, mesCaducidad, diaCaducidad;

         DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm");

         hoy = LocalDate.now();
         hora = LocalTime.now();
         fechaCaducidad = LocalDate.of(2022, 2, 28); // Escribir aquí la fecha de caducidad
         dias = ChronoUnit.DAYS.between(hoy, fechaCaducidad);


         System.out.println("Buenos días");

         System.out.println("Hoy es " + hoy.format(formatoFecha) + " Hora: " + hora.format(formatoHora));
         System.out.println("La fecha de caducidad es: " + fechaCaducidad.format(formatoFecha));
         System.out.print("Días hasta la fecha de caducidad: ");
         if (dias>=0)
             System.out.println(dias);
         else
             System.out.println("El producto está caducado.");

         System.out.println("\nProbemos con otra fecha de caducidad.");
         System.out.print("Indique el año de la fecha de caducidad de un determinado producto: ");
         annoCaducidad = Leer.datoInt();
         System.out.print("Indique el mes: ");
         mesCaducidad = Leer.datoInt();
         System.out.print("Indique el día: ");
         diaCaducidad = Leer.datoInt();
         fechaCaducidad =LocalDate.of(annoCaducidad, mesCaducidad, diaCaducidad);
         dias = ChronoUnit.DAYS.between(hoy, fechaCaducidad);

         System.out.println("Hoy es " + hoy.format(formatoFecha) + " Hora: " + hora.format(formatoHora));
         System.out.println("La fecha de caducidad es: " + fechaCaducidad.format(formatoFecha));
         System.out.print("Días hasta la fecha de caducidad: ");
         if (dias>=0)
             System.out.println(dias);
         else
             System.out.println("El producto está caducado.");
     }
}
