public class CentralAtendimento {
    private PilhaPrioridade atendimentosPendentes;
    private PilhaPrioridade auxiliar;

    public CentralAtendimento(){
        atendimentosPendentes = new PilhaPrioridade();
        auxiliar = new PilhaPrioridade();
    }

    public void abrirProcesso(Processo p){
        atendimentosPendentes.push(p);
        auxiliar.limpar();
    }

    public void atenderProximo(){
        Processo processo = atendimentosPendentes.peek();
        System.out.println("Processo atendido:");
        System.out.println(processo + "\n");
        atendimentosPendentes.pop();
        auxiliar.push(processo);
    }

    public void desfazerUltimoAtendimento(){
        Processo processo = auxiliar.peek();
        System.out.println("Atendimento desfeito: ");
        System.out.println(processo + "\n");
        auxiliar.pop();
        atendimentosPendentes.push(processo);
    }

    public void listarPendentes(){
        System.out.println("Processos em aberto: \n" );
        atendimentosPendentes.listar();
    }

    public void listarHistorico(){
        System.out.println("Processos já fechados: \n");
        auxiliar.listar();
    }
}
