public class CentralAtendimento {
    private PilhaProcesso atendimentosPendentes;
    private PilhaProcesso auxiliar;

    public CentralAtendimento(){
        atendimentosPendentes = new PilhaProcesso();
        auxiliar = new PilhaProcesso();
    }

    public void abrirProcesso(Processo p){
        atendimentosPendentes.push(p);
    }

    public void atenderProximo(){
        auxiliar.push(atendimentosPendentes.pop());
    }

    public void desfazerUltimoAtendimento(){
        atendimentosPendentes.push(auxiliar.pop());
    }

    public void listarPendentes(){
        atendimentosPendentes.listar();
    }

    public void listarHistorico(){
        auxiliar.listar();
    }
}
