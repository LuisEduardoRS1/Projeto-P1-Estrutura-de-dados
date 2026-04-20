public class TesteVetorDinamico {
    public static void main(String[] args) {
        VetorDinamico vetorDinamico = new VetorDinamico();
        vetorDinamico.adiciona(new Processo("Luis ", "Suporte", 2));
        vetorDinamico.adiciona(new Processo("Cleide ", "Suporte", 3));
        vetorDinamico.adiciona(new Processo("Maria ", "Suporte", 1));
        vetorDinamico.adiciona(new Processo("James ", "Suporte", 3));
        vetorDinamico.adiciona(new Processo("Teste ", "Suporte", 2));

        System.out.println("Capacidade: " + vetorDinamico.getCapacidade());

        vetorDinamico.listar();

        vetorDinamico.remove();
        vetorDinamico.remove();
        vetorDinamico.remove();

        System.out.println("Capacidade: " + vetorDinamico.getCapacidade());

        int protocolo = vetorDinamico.buscarPorProtocolo(1);
        System.out.println("Índice localizado: " + protocolo);
    }
}
