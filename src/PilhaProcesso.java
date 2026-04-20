public class PilhaProcesso {
    private VetorDinamico vetorDinamico;

    public PilhaProcesso(){
        vetorDinamico = new VetorDinamico();
    }

    public void push(Processo processo){
        vetorDinamico.adiciona(processo);
    }

    public Processo pop(){
        if(estaVazio()){
            throw new PilhaVaziaException("A pilha está vazia");
        }
        return vetorDinamico.remove();
    }

    public Processo peek(){
        if(estaVazio()){
            throw new PilhaVaziaException("A pilha está vazia");
        }
        return vetorDinamico.peek();
    }

    public void imprimir(){
        vetorDinamico.listarReverso();
    }

    public void listar(){
        vetorDinamico.listar();
    }

    public boolean estaVazio(){
        return vetorDinamico.estaVazio();
    }

    public int tamanho(){
        return vetorDinamico.getOcupacao();
    }
}
