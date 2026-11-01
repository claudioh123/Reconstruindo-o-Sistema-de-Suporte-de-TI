public class Chamado {

    private static int totalChamados = 0;
    private int numero;
    private String descricao;
    private String status;
    private Computador computador;
    private Tecnico tecnico;


    public Chamado(){
        totalChamados++;
    }
    public static int getTotalChamados(){
        return totalChamados;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getDescricao (){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public Computador getComputador(){
        return computador;
    }
    public void setComputador(Computador computador){
        this.computador = computador;
    }

    public Tecnico getTecnico(){
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }
}
