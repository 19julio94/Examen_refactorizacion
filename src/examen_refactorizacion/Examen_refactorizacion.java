package examen_refactorizacion;

import java.util.Scanner;

/**
 *
 * @author jpatriciodasilva
 */
public class Examen_refactorizacion {

    public static boolean esPrimo = false;
    public static int tDigitos = 3;

    public static void main(String arg[]) {

        int numDigito = 0;
        tDigitos=introducirDigito();
        for (int nComparar = 1; nComparar <= 99999; nComparar++) {
            int divEntera = nComparar;

            int contador = 0;
            numDigito=contadorDivisionEntera(nComparar);

            

            if (numDigito == tDigitos) {
                if (nComparar < 4) {
                    esPrimo = true;
                } else {
                    if (nComparar % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contadorDivisores = 0;
                        int i1 = 1;
                        int limite = (nComparar - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }
                        esPrimo = calculaNumDivisores(i1, limite, nComparar, contadorDivisores);
                        
                    }
                }

                if (esPrimo == true) {
                    System.out.println(nComparar);
                }
            }
        }
    }

    public static int introducirDigito() {
        Scanner obx = new Scanner(System.in);
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
         tDigitos = obx.nextInt();
        

           

       
            if (tDigitos <= 0) {
                System.out.println("Ingrese un numero mal por favor ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
                tDigitos = obx.nextInt();

            
        }
        return tDigitos;
    }
 public static int contadorDivisionEntera(int numComparar) {
        int ndigitos;
        
        int divisionEntera = numComparar;
        int contador = 0;
        while (divisionEntera != 0) {
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        ndigitos = contador;
        return ndigitos;
    }
 public static boolean calculaNumDivisores(int i1, int limite, int numComparar, int contadorDivisores) {
        boolean esPrimo = false;
        while (i1 <= limite) {
            if (numComparar % i1 == 0) {
                contadorDivisores++;
            }
            i1 += 2;
            if (contadorDivisores == 2) {
                i1 = limite + 1;
            }
        }
        if (contadorDivisores == 1) {
            esPrimo = true;
        }
        return esPrimo;
    }

}
