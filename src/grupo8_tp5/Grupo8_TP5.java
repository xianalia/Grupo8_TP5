package grupo8_tp5;

import java.util.logging.Level;

public class Grupo8_TP5 {

    public static void main(String[] args) {

        Formulario formulario = new Formulario();
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);

        Directorio directorio = new Directorio();
        Contactos contacto1 = new Contactos("43490401", "kevin", "garcia", "san luis", "los caminos de la vida");
        directorio.agregarContacto(Long.parseLong("11111111"), contacto1);
        
        
        Contactos contacto2 = new Contactos("43321312", "ximena", "cuello", "san luis", "calle sin nombre");
        directorio.agregarContacto(Long.parseLong("222222"), contacto2);
        
        Contactos contacto3 = new Contactos("35493213", "ian", "chiti", "tucuman", "calle siempre viva");
        directorio.agregarContacto(Long.parseLong("3333"), contacto3);
        
        Contactos contacto4 = new Contactos("33490401", "facundo", "garcia", "mendoza", "calle angosta");
        directorio.agregarContacto(Long.parseLong("444444444"), contacto4);
        
        Contactos contacto5 = new Contactos("23490401", "sanchoo", "poncho", "cordoba", "calle no tan angosta");
        directorio.agregarContacto(Long.parseLong("555555555"), contacto5);

    }

}
