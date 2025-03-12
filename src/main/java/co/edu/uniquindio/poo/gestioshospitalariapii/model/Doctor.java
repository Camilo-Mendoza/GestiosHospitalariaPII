package co.edu.uniquindio.poo.gestioshospitalariapii.model;

public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String correo, int edad, String id, String nombre, String tel, String especialidad) {
        super(correo, edad, id, nombre, tel);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
