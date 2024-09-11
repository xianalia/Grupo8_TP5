
package grupo8_tp5;

import grupo8_tp5.clases.Contacto;
import grupo8_tp5.clases.Directorio;


public class Grupo8_TP5 {

    
    public static void main(String[] args) {
        Contacto contacto = new Contacto(33757395, "Ximena", "Cuello", "San Luis", "Mitre 358");
        
        Directorio directorio = new Directorio();
        
        directorio.agregarContacto(2664560514L, contacto);
        
        directorio.buscarContacto(2664560514L);
    }
    
}
