package co.edu.uniquindio.poo.gestioshospitalariapii.model;

public class Persona {
    private String nombre;
    private int edad;
    private String tel;
    private String id;
    private String correo;

    public Persona(String correo, int edad, String id, String nombre, String tel) {
        this.correo = correo;
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.tel = tel;
    }
    //

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
