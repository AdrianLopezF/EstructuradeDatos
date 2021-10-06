package clase14sep;

import java.util.Random;
import java.util.Scanner;

public class PilasTam {
    
    public void union(){
     
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int opt=0; // variable global.
        System.out.println("Tamaño de pila A");//En esta linea de codigo imprimimos la pregunta hacia el usuario.
        int a=sc.nextInt();//En esta linea guardamos el dato que haya introducido el usuario.
        int pilaA[]=new int[a];//con esto definimos que el dato que nos dio el usuario será el tamañano de la pila correspondiente.
        System.out.println("Tamaño de pila B");//En esta linea de codigo imprimimos la pregunta hacia el usuario.
        int b=sc.nextInt();//En esta linea guardamos el dato que haya introducido el usuario.
        int pilaB[]=new int[a];//con esto definimos que el dato que nos dio el usuario será el tamañano de la pila correspondiente.
        
        if(a>=b){ //con este "if" indicamos que si el valor "a" ingresado por el usuario es mayor o igual 
            //al de "b".
        int pilaC[]=new int[a]; //PilaC tomará el tamaño de la pila del valor ingresado en "a"
        
        do{
            System.out.println("\n1- Llenar pila A y B"
                    + "\n2- Mostrar pila A y B"
                    + "\n3- Vacíar pilas"
                    + "\n4- Unir pilas"
                    + "\n5- Mostrar pila C"
                    + "\n6- Salir");
            //En lo mostrado arriba se muestra el menú que se mostrará al usuario.
            
            switch(opt=sc.nextInt()){
                case 1:
                    for(int i=0; i<a;i++){ 
                        pilaA[i]=(int)(Math.random()*100+1); //Dentro del arreglo indicamos que se agregará un
                        //valor aleatorio del 0 al 100 dentro de los limites de "a" en la pilaA.
                    }
                    for(int i=0; i<b;i++){
                        pilaB[i]=(int)(rn.nextInt(200-100+1)+100);//Dentro del arreglo indicamos que se agregará un
                        //valor aleatorio del 100 al 200 dentro de los limites de "b" en la pilaB.
                    }
                    break;
                    
                case 2:
                    System.out.println("Pila A");
                    for(int i=a-1;i>=0;i--){
                        System.out.println(" " + pilaA[i]);
                        //Con este arreglo mostramos los valores que se encuentran dentro de la pila.
                    }
                    System.out.println("Pila B");
                        for(int i=b-1;i>=0;i--){
                        System.out.println(" " + pilaB[i]);
                        //Con este arreglo mostramos los valores que se encuentran dentro de la pila.
                    }
                    break;
                    
                case 3:
                    for (int i=0;i<a;i++){
                        pilaA[i]=0; //Con este arreglo declaramos que al usar esta opción del menú los valores
                        //que hay dentro de la pila se vuelven automaticamente 0, vaciando la pila.
                    }
                    for (int i=0;i<b;i++){
                        pilaB[i]=0; //Con este arreglo declaramos que al usar esta opción del menú los valores
                        //que hay dentro de la pila se vuelven automaticamente 0, vaciando la pila.
                    }
                    break;
                case 4:
                    int tope=0; //si lo agregamos aqui, cada vez que ejecutamos la opcion 2, empezara desde 0.
                    System.out.println("Unión de pilas terminada");
                    for(int i=a-1;i>=0;i--){ //Se le coloca "a-1" por que si el usuario ingresa un 
                        //tamaño de 5, el conteo empieza desde el 0, y como tal no existe una 
                        //posición 5, entonces comienza desde el 4.
                        pilaC[tope]=pilaA[i]+pilaB[i]; //Con esto declaramos que los valores que estarán en la
                        //pilaC serán la suma de los valores que se encuentren en la misma posición en las pilas.
                        tope++;
                    }
                    //tope = 0; --> Si lo ponemos aqui, decimos que cada que acabe la ejecucion del caso 2 el tope
                    //se reiniciara a 0.
                break;
                    
                case 5:
                    System.out.println("Pila C");
                        for(int i=a-1;i>=0;i--){
                        System.out.println(" " + pilaC[i]);
                        //Con este arreglo mostramos los valores que se encuentran dentro de la pila.
                        //Aquí es donde se muestra que ya se suman los valores y que ya estan agregados en la pilaC.
                    }
                break;
                        
            }
        }while(opt!=6);//Con esto indicamos que si se selecciona la opción 6, el programa finaliza.
        }
        {
            int pilaC[]=new int[b];
        
        do{
            System.out.println("\n1- Llenar pila A y B"
                    + "\n2- Mostrar pila A y B"
                    + "\n3- Vacíar pilas"
                    + "\n4- Unir pilas"
                    + "\n5- Mostrar pila C"
                    + "\n6- Salir");
            
            switch(opt=sc.nextInt()){
                case 1:
                    for(int i=0; i<a;i++){
                        pilaA[i]=(int)(Math.random()*100+1);
                    }
                    for(int i=0; i<b;i++){
                        pilaB[i]=(int)(rn.nextInt(200-100+1)+100);
                    }
                    break;
                    
                case 2:
                    System.out.println("Pila A");
                    for(int i=a-1;i>=0;i--){
                        System.out.println(" " + pilaA[i]);
                    }
                    System.out.println("Pila B");
                        for(int i=b-1;i>=0;i--){
                        System.out.println(" " + pilaB[i]);
                    }
                    break;
                    
                case 3:
                    for (int i=0;i<a;i++){
                        pilaA[i]=0;
                    }
                    for (int i=0;i<b;i++){
                        pilaB[i]=0;
                    }
                    break;
                case 4:
                    int tope=0; //si lo agregamos aqui, cada vez que ejecutamos la opcion 2, empezara desde 0.
                    System.out.println("Unión de pilas terminada");
                    for(int i=a-1;i>=0;i--){ //Se le coloca "a-1" pq si el usuario ingresa un 
                        //tamaño de 5, el conteo empieza desde el 0, y como tal no existe una 
                        //posición 5, entonces comienza desde el 4.
                        pilaC[tope]=pilaA[i]+pilaB[i];
                        tope++;
                    }
                    //tope = 0; --> Si lo ponemos aqui, decimos que cada que acabe la ejecucion del caso 2 el tope
                    //se reiniciara a 0.
                break;
                    
                case 5:
                    System.out.println("Pila C");
                        for(int i=b-1;i>=0;i--){
                        System.out.println(" " + pilaC[i]);
                    }
                break;
                        
            }
        }while(opt!=6);
        }
    }
    
}
