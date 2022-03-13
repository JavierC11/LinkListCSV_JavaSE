
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


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 
        LinkListCalculations Mylist = new LinkListCalculations();
        ManejarCSV archivo = new ManejarCSV();
        archivo.LeerArchivo("C:\\Users\\javie_c2zwkpq\\OneDrive\\Documentos\\5to Semestre\\Programacion III\\1er Prueba\\ListaD.csv");
         
        archivo.insertarFinal("javier", "ing", 100.00f );
        archivo.BorrarFinal();
        archivo.Aumentar();
        
      
        
            
            
/*               public void imprimirLinea() {
        for (int i = 0; i < partes.length; i++){
            
            System.out.print(partes[i]+"------------");
        }
    }
*/

               
       
    }   
}
