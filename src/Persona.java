public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    private String apellidos;

    public String getApellidos() {
        return apellidos();
    }

    private String apellidos() {
        return null;
    }
    private int edad;
    public int getEdad;

    Persona() {
        nombre = "Juan Carlos";
        apellidos = "Gómez";
        edad = 15;
    }

    Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public void MayorEdad() {
        if (edad < 18) {
            System.out.println("La persona es menor de edad");
        } else {
            System.out.println("La persona es mayor de edad");
        }
    }
    public void NombreCompleto() {

    }
}
