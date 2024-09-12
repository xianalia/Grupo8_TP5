
package grupo8_tp5.clases;

public class Contacto {
    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String dirección;

    public Contacto(int dni, String nombre, String apellido, String ciudad, String dirección) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.dirección = dirección;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "Contacto{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", direcci\u00f3n=" + dirección + '}';
    }
    
    
}

