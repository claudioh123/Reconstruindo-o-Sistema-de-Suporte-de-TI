public class TecnicoHardware extends Tecnico implements Atendimento{
    private String hardware;

    public String getHardware(){
        return hardware;
    }
    public void setHardware(String hardware){
        this.hardware = hardware;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Tecnico de Hardware " + getNome() + " esta realizando o atednimento na " + hardware);
    }
}
