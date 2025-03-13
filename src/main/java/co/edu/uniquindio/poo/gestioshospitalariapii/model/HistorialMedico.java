package co.edu.uniquindio.poo.gestioshospitalariapii.model;

import java.util.ArrayList;
import java.util.List;

public class HistorialMedico implements ClonarHistorialMedico {
    private List<Medicamento> medicamentos;
    private List<Enfermedad> enfermedades;

    public HistorialMedico(List<Medicamento> medicamentos, List<Enfermedad> enfermedades) {
        this.medicamentos = new ArrayList<>(medicamentos);
        this.enfermedades = new ArrayList<>(enfermedades);
    }
    //

    public List<Medicamento> getMedicamentos() {
        return new ArrayList<>(medicamentos);
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = new ArrayList<>(medicamentos);
    }

    public List<Enfermedad> getEnfermedades() {
        return new ArrayList<>(enfermedades);
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = new ArrayList<>(enfermedades);
    }

    @Override
    public HistorialMedico clonarHistorial() {
        try {
            HistorialMedico clon = (HistorialMedico) super.clone();
            clon.medicamentos = new ArrayList<>(this.medicamentos);
            clon.enfermedades = new ArrayList<>(this.enfermedades);
            return clon;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonarPaciente el historial médico", e);
        }
    }
}