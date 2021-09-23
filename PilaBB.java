package clase14sep;

import java.util.Scanner;
import java.util.Random;

public class PilaBB {

    public void PilaB() {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int tope = 0, opt = 0, cont=0;
        
        char[] pila = new char[26];
        char letra = 'A';
        do {
            System.out.println("1 - llenar\n"
                    + "2 - eliminar\n"
                    + "3 - mostrar\n"
                    + "4 - contador\n"
                    + "5 - salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    
                    for (int i = 0; i < 26; i++) {
                        if (tope < 26) {
                            pila[tope] = letra;//abc[i];
                            letra++;
                            tope++;
                        } else {
                            System.out.println("pila llena....");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (tope > 0) {
                        System.out.println("dato eliminado..." + tope);
                        //restar unidad a tope, para poder reutilizar la posicion 
                        tope--;
                    } else {
                        System.out.println("no hay elementos para eliminar....");
                    }
                    break;
                case 3:
                    if (tope > 0) {
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println(pila[(int) (Math.random() * (26))]);
                        }
                    } else {
                        System.out.println("pila vacia....");
                    } 
                    break;

                case 4:
                    
                    if(tope>0){
                        for (int i = 0; i<26; i++){
                            cont=0;
                            for(int j=0; j<26; j++){
                                cont++;
                                if(pila[i]==tope){
                                } if(cont>0){
                                    System.out.println("La letra: " + pila[i] + " se repite: " + cont + " veces");
                                }
                            }
                        }
                    }
                    break;
            }
        } while (opt != 5);
    }
}
