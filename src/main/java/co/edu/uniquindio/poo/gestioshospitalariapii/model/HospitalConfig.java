package co.edu.uniquindio.poo.gestioshospitalariapii.model;

public  class HospitalConfig {
    private static HospitalConfig instancia;
    private String horarioAtencio;
    private int numeroMaxPacientes;
    private String reglasFacturacion;

    private HospitalConfig(String horarioAtencio, int numeroMaxPacientes, String reglasFacturacion) {
        this.horarioAtencio = horarioAtencio;
        this.numeroMaxPacientes = numeroMaxPacientes;
        this.reglasFacturacion = reglasFacturacion;
    }
    public static HospitalConfig getInstancia(String horarioAtencio,int numeroMaxPacientes, String reglasFacturacion){
        if(instancia == null){
            instancia = new HospitalConfig(horarioAtencio, numeroMaxPacientes, reglasFacturacion);
        }
        return instancia;
    }

    //
    public String getHorarioAtencio() {
        return horarioAtencio;
    }

    public void setHorarioAtencio(String horarioAtencio) {
        this.horarioAtencio = horarioAtencio;
    }

    public int getNumeroMaxPacientes() {
        return numeroMaxPacientes;
    }

    public void setNumeroMaxPacientes(int numeroMaxPacientes) {
        this.numeroMaxPacientes = numeroMaxPacientes;
    }

    public String getReglasFacturacion() {
        return reglasFacturacion;
    }

    public void setReglasFacturacion(String reglasFacturacion) {
        this.reglasFacturacion = reglasFacturacion;
    }
}
