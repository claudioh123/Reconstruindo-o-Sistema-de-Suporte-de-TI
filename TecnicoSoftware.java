public class TecnicoSoftware extends Tecnico implements Atendimento{

    private String software;

    public String getSoftware(){
        return software;
    }
    public void setSoftware(String software){
        this.software = software;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Tecnico de Software " + getNome() + " esta realizando o atendimento na " + software);
    }
}
