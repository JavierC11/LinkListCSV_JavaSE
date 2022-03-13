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
public class Node {
    public String nombre;
    public String puesto;
    public float salario;
    public Node next;//puntero 

       public Node(String nombre, String puesto, float salario){
      //  this.correlativo = correlativo;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.next = null;
    }
}
