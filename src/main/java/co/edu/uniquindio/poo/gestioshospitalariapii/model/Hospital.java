package co.edu.uniquindio.poo.gestioshospitalariapii.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
    private List<Paciente> pacientes;
    private List<Doctor> doctores;
    private List<Cita> citas;
    private String nombre;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
        this.doctores = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //crud pacientes
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPaciente(String id) {
        pacientes.removeIf(p -> p.getId().equals(id));
    }

    public Paciente buscarPaciente(String id) {
        return pacientes.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void actualizarPaciente(String id, Paciente nuevoPaciente) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getId().equals(id)) {
                pacientes.set(i, nuevoPaciente);
                break;
            }
        }
    }

    //crud doctroes
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void eliminarDoctor(String id) {
        doctores.removeIf(p -> p.getId().equals(id));
    }

    public Doctor buscarDoctor(String id) {
        return doctores.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void actualizarDoctor(String id, Doctor nuevoDoctor) {
        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getId().equals(id)) {
                doctores.set(i, nuevoDoctor);
                break;
            }
        }
    }

    // reservar cita
    public boolean reservarCita(Doctor doctor, Paciente paciente, LocalDateTime fechaHora) {
        if (doctor == null || paciente == null) {
            System.out.println("Error: Doctor o paciente inválidos.");
            return false;
        }

        Cita nuevaCita = new Cita(doctor, fechaHora, paciente);
        citas.add(nuevaCita);
        System.out.println("Cita reservada con éxito.");
        return true;
    }
    // cancelar cita
    public boolean cancelarCita(Paciente paciente, LocalDateTime fechaHora) {
        boolean eliminado = citas.removeIf(c -> c.getPacienteAtendido().equals(paciente) && c.getHoraCita().equals(fechaHora));
        if (eliminado) {
            System.out.println("Cita cancelada con éxito.");
            return true;
        }
        System.out.println("No se encontró la cita para cancelar.");
        return false;
    }
    //

    // Listar citas por fecha
    public List<Cita> listarCitasPorFecha(LocalDateTime fecha) {
        return citas.stream()
                .filter(c -> c.getHoraCita().toLocalDate().equals(fecha.toLocalDate()))
                .collect(Collectors.toList());
    }

}

