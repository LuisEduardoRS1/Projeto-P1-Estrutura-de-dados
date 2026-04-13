public class VetorDinamico {
    private Processo listaProcessos[];
    private int capacidade;
    private int ocupacao;

    public VetorDinamico(){
        listaProcessos = new Processo[4];
        capacidade = 4;
        ocupacao = 0;
    }

    public boolean estaCheio(){
        return capacidade == ocupacao;
    }

    public boolean estaVazio(){
        return ocupacao == 0;
    }

    public void listar(){
        System.out.println("Todos os processos: ");
        for(int i = 0; i < ocupacao; i++){
            System.out.println(listaProcessos[i]);
        }
    }

    public void listarReverso(){
        System.out.println("Todos os processos: ");
        for(int i = ocupacao-1; i > 0; i--){
            System.out.println(listaProcessos[i]);
        }
    }

    public void adiciona(Processo processo){
        if(estaCheio()){
            redimenciona(capacidade * 2);
        }
        listaProcessos[ocupacao] = processo;
        ocupacao++;
    }

    public Processo remove(){
        if(estaVazio()){
            //TODO, alterar o remove
        }
        Processo aux = listaProcessos[--ocupacao];
        if((capacidade >= 4) && (ocupacao <= capacidade/4)){
            redimenciona(capacidade / 2);
        }
        System.out.println(capacidade);
        return aux;
    }
    
    private void redimenciona(int novaCapacidade){
        Processo[] temp = new Processo[novaCapacidade];
        for(int i = 0; i < ocupacao; i++){
            temp[i] = listaProcessos[i];
        }
        listaProcessos = temp;
        capacidade = novaCapacidade;
    }

    public int buscarPorProtocolo(int protocolo){
        for(int i = 0; i < ocupacao; i++){
            if (listaProcessos[i].getProtocolo() == protocolo) {
                return i;
            }
        }
        return -1;
    }

    //TODO, analisar esta implementação
    public Processo peek(){
        return listaProcessos[ocupacao-1];
    }
}
