/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CSV;
/**
 *
 * @author javie_c2zwkpq
 */
public class LinkListCalculations {
    
     
    public Node cabeza = null;
    public int longitud = 0;
    
     public void insertarPrincipio(String nombre, String puesto, float salario){
        Node nodo = new Node(nombre, puesto, salario);
        nodo.next = cabeza;
        cabeza = nodo;
        longitud++;

    }    public void AumentarPuesto(){
        Node puntero = cabeza;
       while(puntero != null){
            if ( "Guardián".equals(puntero.puesto)){
                puntero.salario += 500;
            }
            puntero = puntero.next;
       }   
    }
    
    

    
     public void insertarFinal(String nombre, String puesto, float salario){
        Node nodo = new Node(nombre, puesto, salario);
        if(cabeza== null){
           cabeza= nodo;
        }else{
        Node puntero = cabeza;
        while(puntero.next != null){
            puntero = puntero.next; 
        }
        puntero.next = nodo;
        }
       // imprimir();
        longitud++;
    }
     
         public void eliminarUltimo(){
        if(cabeza != null){
            if(cabeza.next == null){
                cabeza = null;
            }else{
            Node puntero = cabeza;
            while(puntero.next.next !=null){
                puntero = puntero.next;
            }
            puntero.next = null;
            longitud--;
            }
        }
        }
         
         
         
     
        public void imprimir(){
        Node temp= this.cabeza;
        System.out.println("\n\n\n--------------------------------------\n");
        System.out.println("Corre  - Nombre   -   Puesto   -   Salario\n");
        int corre = longitud;
        while(temp!= null){
            corre=longitud+1;
            System.out.println(  "  " + temp.nombre  + ".  -  " + temp.puesto + 
                    "   -   " + String.valueOf(temp.salario)  + "\n");            
            temp= temp.next;
            
        }
        
    }
     
     
}
