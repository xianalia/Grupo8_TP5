



package grupo8_tp5;



public class Grupo8_TP5 {

    
    public static void main(String[] args) {

        Formulario formulario = new Formulario();
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        
       Directorio directorio = new Directorio();
      Contactos contacto1 = new Contactos("43490401", "kevin", "garcia", "san luis", "los caminos de la vida");
      Contactos contacto2 = new Contactos("43321312", "ximena", "cuello", "san luis", "calle sin nombre");
      Contactos contacto3 = new Contactos("35493213", "ian", "chiti", "tucuman", "calle siempre viva");
      Contactos contacto4 = new Contactos("33490401", "facundo", "garcia", "mendoza", "calle angosta");
      Contactos contacto5 = new Contactos("23490401", "sancho", "poncho", "cordoba", "calle no tan angosta");
       

    }
    
}