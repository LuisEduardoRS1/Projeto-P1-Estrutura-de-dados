public class PilhaProcesso {
    private VetorDinamico vetorDinamico;

    public PilhaProcesso(){
        vetorDinamico = new VetorDinamico();
    }

    public void push(Processo processo){
        vetorDinamico.adiciona(processo);
    }

    public Processo pop(){
        return vetorDinamico.remove();
    }

    public Processo peek(){
        return vetorDinamico.peek();
    }

    public void imprimir(){
        vetorDinamico.listarReverso();
    }

    public void listar(){
        vetorDinamico.listar();
    }
}
