
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        LocalDate currentDate = LocalDate.now();
        int diaAc = currentDate.getDayOfMonth();
        int mesAc = currentDate.getMonthValue();
        int annoAc = currentDate.getYear();
        int edad;
        if (mes < mesAc || (mes == mesAc && dia <= diaAc)){
            edad = annoAc - anno;
        }else {
            edad = annoAc -anno - 1;
        }
        String respuesta = "usted tiene " + edad + " años";
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
