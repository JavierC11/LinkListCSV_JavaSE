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

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;

public class ManejarCSV {
    
  private BufferedReader Lector;
    private String Linea;
    public String partes[] ;
    public static LinkListCalculations Mylist = new LinkListCalculations();
    
    
    public void LeerArchivo(String nombreArchivo)
    {
        try {
            Lector = new BufferedReader (new FileReader (nombreArchivo));
            System.out.print("Nombre,                                       Puesto,                                       Salario (Cargando...)\n");
            System.out.print("----------------------------------------------------------------------------------------------------------------\n\n");
            while ((Linea = Lector.readLine()) != null) {
                partes = Linea.split(";");
//                System.out.println(partes[2]);
                     System.out.println();
                Mylist.insertarPrincipio(partes[0], partes[1],  Float.valueOf(partes[2]));
                }
            
            Mylist.imprimir();

            Lector.close();
            Linea = null;
            partes=null;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }

    }
    
    public void insertarFinal(String nombre, String puesto, float salario){
        Mylist.insertarFinal(nombre, puesto, salario);
        Mylist.imprimir();
    }
    
    public void BorrarFinal(){
        Mylist.eliminarUltimo();
        Mylist.imprimir();
    }
    
    
    public void Aumentar(){
        Mylist.AumentarPuesto();
        Mylist.imprimir();
    }
    
    
    
    
    
  

}
