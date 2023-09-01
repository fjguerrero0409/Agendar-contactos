
package ventana;


public class Persona {
     private String nombre,correo,numero;

    public Persona(String nombre, String correo, String numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumero() {
        return numero;
    }
      
    
}
