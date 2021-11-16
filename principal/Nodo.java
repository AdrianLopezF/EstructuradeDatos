package principal;

import java.util.Random;

public class Nodo {
    String dato;
    Nodo siguiente; //Dirección del siguiente nodo.
    public Nodo(String d, Nodo sig){
        dato=d;
        siguiente=sig;
    }
}

class Lista{
    Nodo inicio, otros;
    int cont=0;
    public Lista(){
        inicio=null;
        otros=null;
    }
    
    public boolean Vacia(){
        return inicio==null;
    }
    
    public void agregar(String d){
        cont++;
    if(Vacia()){
        inicio=new Nodo(d, inicio);
        otros=inicio;
    } else {
        inicio=new Nodo(d, inicio);
    }
    }
    
    public void mostrar(){
        if(Vacia()){
                System.out.println("Lista vacía");
        } else {
                Nodo next=inicio;
        while(next!=null){
            System.out.print("[" + next.dato + "]->");
            next=next.siguiente;
                }
    }
    
}
    public String eliminar(){
        String eliminado=inicio.dato;
        if(cont==1){
            inicio=null;
            otros=inicio;
        } else {
            inicio=inicio.siguiente;
        }
        return eliminado;
    }
    
    public boolean Buscar(String d){
        boolean encontrado=false;
        Nodo next=inicio;
        while(encontrado!=true && next!=null){
            if(d.equals(next.dato)){
                encontrado=true;
            } else {
                next=next.siguiente;
            }
            if(encontrado==true)break;
        }
        return encontrado;
    }
    
    public static String[] Palabra(int cantidad){
        String[] palabrita=new String[cantidad];
        Random rn=new Random();
        char[] A={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','X','Y','Z'};
        char[] B={'0','1','2','3','4','5','6','7','8','9'
            + 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','X','Y','Z'
            + 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] C={'#','$','%','&','@',};
        
        for (int i = 0; i < cantidad; i++) {
			palabrita[i] = A[(int) (Math.floor(Math.random() * ((A.length - 1) - 0 + 1) + 0))] + " "
					+ B[(int) (Math.random()*(64-1))+1]+" "
                                          + C[(int) (Math.floor(Math.random() * ((C.length - 1) - 0 + 1) + 0))];
        }
        return palabrita;
}
    
    public static void imprimir(String[] nombresGenerados){
        for (int i = 0; i < nombresGenerados.length; i++) {
			System.out.println(nombresGenerados[i]);
    }
}
}


