import java.util.InputMismatchException;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sistema = "Gerenciamento de TI";
        String tecnico = "Claudio Magalhaes";
        int versao = 26;
        String status = "online";
        int chamadoAberto = 0;


        System.out.println("Nome do sistema :" +sistema);
        System.out.println("Versao :" + versao);
        System.out.println("Tecnico responsavel :" + tecnico);
        System.out.println("Status do sistema :" + status);

        if (chamadoAberto > 0 ) {
            System.out.println("Existem chamados aguardando atendimento");
        } else {
            System.out.println("Nenhum chamado pendente");
        }

        Computador computador1 = new Computador();
        computador1.setPatrimonio("CL01");
        computador1.setModelo ("Intel dell");
        computador1.setSistemaOperacional ("Windowns");

        Computador computador2 = new Computador();
        computador2.setPatrimonio("CL02");
        computador2.setModelo ("Intel Core");
        computador2.setSistemaOperacional ("Linux 001");


        computador1.ligar();
        computador1.exibirInformacoes();

        computador2.desligar();
        computador2.exibirInformacoes();


        TecnicoSoftware tecnico1 = new TecnicoSoftware();
        tecnico1.setNome("Claudio Magalhaes");
        tecnico1.setEspecialidade("Manutencao de Software");
        tecnico1.setSoftware("Sala 1");

        TecnicoHardware tecnico2 = new TecnicoHardware();
        tecnico2.setNome("Henrique Souza");
        tecnico2.setEspecialidade("Manutencao de Hardware");
        tecnico2.setHardware("Sala 2");

        Atendimento[] listaAtendimento = {tecnico1, tecnico2};

        for(Atendimento item : listaAtendimento){
            item.realizarAtendimento();
        }


        int numeroChamado = 0;
        try{
            System.out.println("Digite o numero do chamado");
            numeroChamado = scanner.nextInt();
            System.out.println("Numero registrado");
        } catch (InputMismatchException e) {
            System.out.println("Numero Invalido");
            numeroChamado = 0;
        } finally {
            scanner.nextLine();
        }

        Chamado chamado1 = new Chamado();
        chamado1.setNumero(1);
        chamado1.setDescricao("Computador com defeito");
        chamado1.setStatus("Em aberto");
        chamado1.setComputador(computador2);
        chamado1.setTecnico(tecnico2);

        Chamado chamado2 = new Chamado();
        chamado2.setNumero(2);
        chamado2.setDescricao("Sofware nao esta funcionando");
        chamado2.setStatus("Em Andamento");
        chamado2.setComputador(computador1);
        chamado2.setTecnico(tecnico1);

        Chamado chamado3 = new Chamado();
        chamado3.setNumero(3);
        chamado3.setDescricao("Computador nao liga apos queda de energia");
        chamado3.setStatus("Aguardando");
        chamado3.setComputador(computador2);
        chamado3.setTecnico(tecnico2);


        System.out.println("Informacoes do chamado.");
        System.out.println("Numero do chamado :" + chamado1.getNumero());
        System.out.println("Descricao do chamado :" + chamado1.getDescricao());
        System.out.println("Status do chamado : " + chamado1.getStatus());
        System.out.println("Maquina que abriu o chamado : " + chamado1.getComputador().getPatrimonio());
        System.out.println("Tecnico responsavel : " + chamado1.getTecnico().getNome());
        System.out.println("Esta realizando a manutencao na : " + ((TecnicoHardware) chamado1.getTecnico()).getHardware());

        System.out.println("Informacoes do chamado.");
        System.out.println("Numero do chamado :" + chamado2.getNumero());
        System.out.println("Descricao do chamado :" + chamado2.getDescricao());
        System.out.println("Status do chamado : " + chamado2.getStatus());
        System.out.println("Maquina que abriu o chamado : " + chamado2.getComputador().getPatrimonio());
        System.out.println("Tecnico responsavel : " + chamado2.getTecnico().getNome());
        System.out.println("Esta realizando a manutencao na : " + ((TecnicoSoftware) chamado2.getTecnico()).getSoftware());

        System.out.println("Informacoes do chamado.");
        System.out.println("Numero do chamado :" + chamado3.getNumero());
        System.out.println("Descricao do chamado :" + chamado3.getDescricao());
        System.out.println("Status do chamado : " + chamado3.getStatus());
        System.out.println("Maquina que abriu o chamado : " + chamado3.getComputador().getPatrimonio());
        System.out.println("Tecnico responsavel : " + chamado3.getTecnico().getNome());
        System.out.println("Esta realizando a manutencao na : " + ((TecnicoHardware) chamado3.getTecnico()).getHardware());

        System.out.println("TOTAL DE CHAMADO CADASTRADOS NO SISTEMA :" + Chamado.getTotalChamados());

        scanner.close();

    }
}