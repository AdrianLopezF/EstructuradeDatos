package clase3nov;
import java.util.Scanner;

public class ListaEnlazada {
    static class Nodo{
            
        String dato;
        Nodo sig;
        
        }
    
    public static void mostrar(String name, Nodo next){
        System.out.println(name + " ");
        while(next != null){
            System.out.println(next.dato + " ");
            next = next.sig;
        }
    }
    
    public static void agregar(){
        Nodo inicio=null;
        Nodo otros;
        Scanner sc=new Scanner(System.in);
        String lel;
        
        if(inicio==null){
            
            System.out.println("Ingresa el valor");
            lel=sc.nextLine();
            inicio = new Nodo();
       inicio.dato = lel;
       inicio.sig = null;
       
        } else {
            
       otros = new Nodo();
       otros.dato = sc.nextLine();
       otros.sig = inicio;
       inicio = otros;
       
        }
    }
    
    public static void eliminar(){
        Nodo inicio=null;
        Nodo otros;
        if(inicio!=sig){
            otros = inicio;
            inicio = inicio.sig;
            otros = null;
        } else {
            inicio = null;
            sig = null;
        }
    }
    
    public void ListaNodos(){
        ListaEnlazada R = new ListaEnlazada();
        Scanner esc=new Scanner(System.in);
        int opt=0;
        
        do{
            System.out.println("\n1 mostrar"
            + "\n2 agregar"
            + "\n3 eliminar"
            + "\n4 salir");
            
            switch(opt=esc.nextInt()){
                
                case 1:
                    R.mostrar();
                    break;
                    
                case 2:
                    R.agregar();
                    break;
                case 3:
                    R.eliminar();
                    break;
            }
            
        }while(opt!=4);
    }
}
