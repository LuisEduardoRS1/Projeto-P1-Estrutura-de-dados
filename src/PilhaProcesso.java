public class PilhaProcesso {
    private VetorDinamico vetorDinamico;

    public PilhaProcesso(){
        vetorDinamico = new VetorDinamico();
    }

    public void push(Processo processo){
        vetorDinamico.adiciona(processo);
    }

    public void pop(){
        vetorDinamico.remove();
    }

    public Processo peek(){
        return vetorDinamico.peek();
    }

    public void imprimir(){
        vetorDinamico.listarReverso();
    }
}
