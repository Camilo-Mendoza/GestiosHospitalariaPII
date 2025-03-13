package co.edu.uniquindio.poo.gestioshospitalariapii.model;

import java.time.LocalDateTime;

public class Cita {
    private LocalDateTime horaCita;
    private Paciente pacienteAtendido;
    private Doctor doctorEncargado;

    public Cita(Doctor doctorEncargado, LocalDateTime horaCita, Paciente pacienteAtendido) {
        this.doctorEncargado = doctorEncargado;
        this.horaCita = horaCita;
        this.pacienteAtendido = pacienteAtendido;
    }

    @Override
    public String toString(){
        return "Cita con el Dr. " + doctorEncargado.getNombre() +
                " para el paciente " + pacienteAtendido.getNombre() +
                " el " + horaCita.toString();

    }
//
    public Doctor getDoctorEncargado() {
        return doctorEncargado;
    }

    public void setDoctorEncargado(Doctor doctorEncargado) {
        this.doctorEncargado = doctorEncargado;
    }

    public LocalDateTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(LocalDateTime horaCita) {
        this.horaCita = horaCita;
    }

    public Paciente getPacienteAtendido() {
        return pacienteAtendido;
    }

    public void setPacienteAtendido(Paciente pacienteAtendido) {
        this.pacienteAtendido = pacienteAtendido;
    }
}
