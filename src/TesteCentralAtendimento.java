public class TesteCentralAtendimento {
    public static void main(String[] args) {
        CentralAtendimento centralAtendimento = new CentralAtendimento();

        centralAtendimento.abrirProcesso(new Processo("Luis ", "Suporte", 2));
        centralAtendimento.abrirProcesso(new Processo("Cleide ", "Suporte", 3));
        centralAtendimento.abrirProcesso(new Processo("Maria ", "Suporte", 1));
        centralAtendimento.abrirProcesso(new Processo("James ", "Suporte", 3));
        centralAtendimento.abrirProcesso(new Processo("Teste ", "Suporte", 2));

        centralAtendimento.atenderProximo();

        centralAtendimento.listarPendentes();
        centralAtendimento.listarHistorico();

        centralAtendimento.desfazerUltimoAtendimento();

        centralAtendimento.listarPendentes();
    }
}
