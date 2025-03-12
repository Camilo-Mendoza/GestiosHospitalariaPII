package co.edu.uniquindio.poo.gestioshospitalariapii.model;

import java.time.LocalDateTime;

public class Paciente extends Persona implements ClonarPaciente {
    private HistorialMedico historialMedico;


    public Paciente(String correo, int edad, String id, String nombre, String tel, HistorialMedico historialMedico) {
        super(correo, edad, id, nombre, tel);
        this.historialMedico = historialMedico;
    }

    @Override
    public Paciente clonarPaciente() {
        return new Paciente(getCorreo(), getEdad(), getId(), getNombre(), getTel(), historialMedico.clonarHistorial());
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }
    public boolean esPalindromo() {
        String nombreLimpio = getNombre().replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(nombreLimpio).reverse().toString().equals(nombreLimpio);
    }
    public boolean tieneDosVocalesIguales() {
        String nombreLimpio = getNombre().toLowerCase();
        long count = nombreLimpio.chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .distinct()
                .count();
        return count >= 2;
    }

    public boolean solicitarCita(Hospital hospital, Doctor doctor, LocalDateTime fechaHora) {
        return hospital.reservarCita(doctor, this, fechaHora);
    }

    public boolean cancelarCita(Hospital hospital, LocalDateTime fechaHora) {
        return hospital.cancelarCita(this, fechaHora);
    }


}
