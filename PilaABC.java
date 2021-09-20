package clase14sep;
import java.util.Scanner;

public class PilaABC {
    public void abece(){
        Scanner sc = new Scanner(System.in);
        int opt = 0, tope = 0;
        //variables globales.
        char [] pila = 
        {'a','b','c','d','e','f','g','h','i','j','k','l','m',
            'n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        //Aquí declaro los datos con los que se llenara la pila.
                
        do{
            System.out.println("1.- llenar \n"
            + "2.- mostrar \n"
            + "3.- eliminar \n"
            + "4.- salir \n");
            //Se declaran las opciones que se veran como opciones elegibles a la hora de ejecutar el código.
            
            switch (opt = sc.nextInt()) {
                //Dentro de esto, declaramos que hará cada opción al momento de elegirla.
                
                case 1:
                    if(tope<27){
                        //Se declara que si nuestra varibale global "tope" es menor a 27 los datos vacios se 
                        //llenaran con los datos que declaramos antes.
                        System.out.println("Se llenaron los espacios disponibles");
                        tope=27;
                        //Ponemos que el limite de datos dentro de la pila sera 27.
                    }else{
                        System.out.println("Todos los espacios disponibles estan llenos");
                        //En caso de que ya esten llenos los 27 espacios e intentemos añadir más, aparecera
                        //ese texto.
                    }
                    break;
                    
                case 2:
                    if(tope>0){
                    //Se declara que si la variable global "tope" es mayor a 0, indica que ya hay datos y pasa
                    //al bucle siguiente.
                        for(int i = tope-1; i>=0; i--){
                        System.out.println(" " + pila[i]);
                        //Bucle que muestra el contenido en la pila, como es de tipo LIF0 se muestra primero el ultimo
                        //ingresado, realizando el ciclo desde el valor que tiene "tope", restando 1 en cada iteracion.
                        }
                    } else {
                        System.out.println("Pila vacía, no hay elementos para mostrar");
                        //En caso de que no haya ningún dato ingresado aún, se mostrara ese texto.
                    }
                    break;
                    
                case 3:
                    if(tope>0){
                        //Se declara que si la variable global "tope" es mayor a 0, indica que ya hay datos y 
                        //pasa a lo siguiente.
                        System.out.println("Dato eliminado..." + pila[tope-1] + " de la posici+on: " + tope);
                        //Dentro de esta línea se muestra cual es el dato eliminado y de que posición se elimina.
                        tope--;//tope=tope-1;
                        //Indica que a tope se le quitara 1 espacio lleno para que haga la función de eliminar.
                    } else {
                        System.out.println("Pila vacía, no hay elementos para eliminar");
                        //En caso de que no haya ningín dato dentro de la pila, se mostrara ese texto.
                    }
                    break;
                    
            }
        }while(opt !=4);
        //Hasta aquí se acaban las opciones elegibles y al elegir se cierra el bucle de opciones, por lo que 
        //acaba la ejecución.
    }
    
}
    