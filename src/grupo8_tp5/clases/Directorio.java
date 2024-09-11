
package grupo8_tp5.clases;

import grupo8_tp5.clases.Contacto;
import java.util.Map;
import java.util.TreeMap;


public class Directorio {
    private TreeMap <Long, Contacto> contactos;

    public Directorio() {
        this.contactos = new TreeMap ();
    }
    
    public void agregarContacto (Long telefono, Contacto contacto){
        contactos.put(telefono, contacto);
    }
    
    public void buscarContacto(Long telefono) {
        System.out.println(contactos.get(telefono));
}
}


