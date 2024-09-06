package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if ((numVictoriasA < 0 || numVictoriasB < 0) || (numVictoriasA > 7 && numVictoriasB <6 ) || (numVictoriasB > 7 && numVictoriasA <6 ) || (numVictoriasA > 7 && numVictoriasB > 7)){
            return"invalido";
        }else if (numVictoriasA < 6 && numVictoriasB < 6) {
            return "Aun no ha terminado";
        }else if((numVictoriasA - numVictoriasB >= 2) || (numVictoriasB - numVictoriasA >=2)) {
            return (numVictoriasA > numVictoriasB) ? "Gano A" : "Gano B";  
        }else if (numVictoriasA == 6 || numVictoriasB == 6) {
        return (numVictoriasA == 6) ? "Gano A" : "Gano B";
        }else{
            return"invalido";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
