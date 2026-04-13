public class TesteVetorDinamico {
    public static void main(String[] args) {
        VetorDinamico vetorDinamico = new VetorDinamico();
        vetorDinamico.adiciona(new Processo("Luis ", "Suporte", 2, "05/04/2026 09:30"));
        vetorDinamico.adiciona(new Processo("Cleide ", "Suporte", 3, "05/04/2026 09:40"));
        vetorDinamico.adiciona(new Processo("Maria ", "Suporte", 1, "05/04/2026 09:50"));
        vetorDinamico.adiciona(new Processo("James ", "Suporte", 3, "05/04/2026 11:00"));
        vetorDinamico.adiciona(new Processo("Teste ", "Suporte", 2, "05/04/2026 11:30"));

        vetorDinamico.listar();

        vetorDinamico.remove();
        vetorDinamico.remove();
        vetorDinamico.remove();
    }
}
