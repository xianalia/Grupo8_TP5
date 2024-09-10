package grupo8_tp5;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Directorio {
     private TreeMap<Long, Contactos> contactos;
     
      public Directorio() {
        contactos = new TreeMap<>();
      }
       public void agregarContacto(Long telefono, Contactos contacto) {
        contactos.put(telefono, contacto);
    }

    public Contactos buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

    public Set<Long> buscarTelefonoApellido(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contactos> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public ArrayList<Contactos> buscarContactosCiudad(String ciudad) {
        ArrayList<Contactos> contactosCiudad = new ArrayList<>();
        for (Contactos c : contactos.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosCiudad.add(c);
            }
        }
        return contactosCiudad;
    }

    public void borrarContacto(Long telefono) {
        contactos.remove(telefono);
       
    }
}

