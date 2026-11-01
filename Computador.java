public class Computador
{

    private String patrimonio;
    private String modelo;
    private String sistemaOperacional;
    private boolean ligado;


    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }




    void ligar(){
        ligado = true;
    }

    void desligar(){
        ligado = false;

    }

    void exibirInformacoes(){
        System.out.println("Informações dos Computadores");
        System.out.println("Patrimonio : " + patrimonio);
        System.out.println("Modelo : " + modelo);
        System.out.println("sistemaOperacional : " + sistemaOperacional);
        System.out.println("Status : " + ligado);

    }
}