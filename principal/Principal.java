package principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Lista R=new Lista();
        Scanner esc=new Scanner(System.in);
        int opt=0;
        do{
            System.out.println("\n1 mostrar"
            + "\n2 agregar"
            + "\n3 eliminar"
            + "\n4 buscar"
            + "\n5 generar palabra"
            + "\n6 salir");
            
            switch(opt=esc.nextInt()){
                
                case 1:
                    R.mostrar();
                    break;
                    
                case 2:
                    System.out.println("Ingrese el dato a agregar");
                    esc.nextLine();
                    R.agregar(esc.nextLine());
                    break;
                    
                case 3:
                    R.eliminar();
                        System.out.println("Se elimino el nodo");
                    break;
                    
                case 4:
                    System.out.println("Ingrese el dato a buscar");
                    esc.nextLine();
                    if(R.Buscar(esc.nextLine())){
                        System.out.println("El dato si se encuentra en la posición: " + R.cont);
                    } else {
                        System.out.println("Valor no encontrado");
                    }
                    break;
                    
                case 5:
                    R.imprimir(R.Palabra(1));
                    break;
            }
            
        }while(opt!=6);
    }
    
}
