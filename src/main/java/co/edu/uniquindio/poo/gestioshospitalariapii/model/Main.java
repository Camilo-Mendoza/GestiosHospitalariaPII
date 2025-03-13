package co.edu.uniquindio.poo.gestioshospitalariapii.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
                // Configuración del hospital (Singleton)
                HospitalConfig config = HospitalConfig.getInstancia("8:00 AM - 6:00 PM", 100, "Reglas estándar de facturación");
                System.out.println("Configuración del hospital: " + config.getHorarioAtencio());

                // Creación del hospital
                Hospital hospital = new Hospital("Hospital Central");

                // Creación de doctores
                Doctor doctor1 = new Doctor("dr.john@hospital.com", 45, "D001", "Dr. John Doe", "123456789", "Cardiología");
                hospital.agregarDoctor(doctor1);

                // Creación de pacientes con historiales médicos
                Medicamento med1 = new Medicamento("Paracetamol", "500mg");
                Enfermedad enf1 = new Enfermedad("Gripe", LocalDate.of(2023, 5, 20));
                HistorialMedico historial1 = new HistorialMedico(Arrays.asList(med1), Arrays.asList(enf1));
                Paciente paciente1 = new Paciente("jane.doe@email.com", 30, "P001", "Anna", "987654321", historial1);
                hospital.agregarPaciente(paciente1);

                // Clonación del paciente y su historial médico
                Paciente pacienteClon = paciente1.clonarPaciente();
                System.out.println("Paciente clonado: " + pacienteClon.getNombre());

                // Reservar una cita
                LocalDateTime fechaCita = LocalDateTime.of(2025, 3, 15, 10, 30);
                boolean citaReservada = paciente1.solicitarCita(hospital, doctor1, fechaCita);
                System.out.println("Cita reservada: " + citaReservada);

                // Cancelar una cita
                boolean citaCancelada = paciente1.cancelarCita(hospital, fechaCita);
                System.out.println("Cita cancelada: " + citaCancelada);

                // Verificar si el nombre del paciente es palíndromo
                System.out.println("¿El nombre del paciente es palíndromo? " + paciente1.esPalindromo());

                // Verificar si el paciente tiene al menos dos vocales iguales
                System.out.println("¿El paciente tiene dos vocales iguales? " + paciente1.tieneDosVocalesIguales());
        }


}