package co.edu.uniquindio.poo.gestioshospitalariapii.model;

public class Medicamento {
    private String nombreMedicamento;
    private String dosis;

    public Medicamento(String nombreMedicamento, String dosis) {
        this.nombreMedicamento = nombreMedicamento;
        this.dosis = dosis;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}

