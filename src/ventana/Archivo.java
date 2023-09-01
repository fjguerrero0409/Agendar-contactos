
package ventana;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo {
    
    private File archivo;
    
    public void crearArchivo(){
        archivo = new File("agendaContactos.txt");
        try {
            if(archivo.createNewFile()){
                //archi voCreado
            }
        } catch (IOException ex) {
            System.err.println("Error,"+ex);  
        }
       
    }
    
    public void escribirTexto(Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo,true); // con true sirve para añadir mas texto al archivo txt.
            escribir.write(persona.getNombre()+"%"+persona.getCorreo()+"%"+persona.getNumero()+"\r\n");
            escribir.close();
            
        } catch (IOException ex) {
            System.err.println("Error,"+ex);
        }
            
        }
    
    
}
