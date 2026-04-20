public class PilhaPrioridade {
    private PilhaProcesso pilhaBaixa;
    private PilhaProcesso pilhaMedia;
    private PilhaProcesso pilhaUrgente;

    public PilhaPrioridade() {
        pilhaBaixa = new PilhaProcesso();
        pilhaMedia = new PilhaProcesso();
        pilhaUrgente = new PilhaProcesso();
    }

    public void push(Processo p) {
        switch (p.getPrioridade()) {
            case 1:
                pilhaBaixa.push(p);
                break;
            case 2:
                pilhaMedia.push(p);
                break;
            case 3:
                pilhaUrgente.push(p);
                break;
        }
    }

    public void pop() {
        if (pilhaUrgente.estaVazio()) {
            if (pilhaMedia.estaVazio()) {
                if (pilhaBaixa.estaVazio()) {
                    throw new PilhaVaziaException("As pilhas estão vazias");
                } else {
                    pilhaBaixa.pop();
                }
            } else {
                pilhaMedia.pop();
            }
        } else {
            pilhaUrgente.pop();
        }
    }

    public Processo peek() {
        if (pilhaUrgente.estaVazio()) {
            if (pilhaMedia.estaVazio()) {
                if (pilhaBaixa.estaVazio()) {
                    throw new PilhaVaziaException("As pilhas estão vazias");
                } else {
                    return pilhaBaixa.peek();
                }
            } else {
                return pilhaMedia.peek();
            }
        } else {
            return pilhaUrgente.peek();
        }
    }

    public int tamanho() {
        return pilhaBaixa.tamanho() + pilhaMedia.tamanho() + pilhaUrgente.tamanho();
    }

    public void listar() {
        if (pilhaUrgente.estaVazio()) {
            System.out.println("A pilha de processos urgentes está vazia\n");
        } else {
            System.out.println("Processos Urgentes:");
            pilhaUrgente.imprimir();
        }

        System.out.println("");
        if (pilhaMedia.estaVazio()) {
            System.out.println("A pilha de processos médios está vazia\n");
        } else {
            System.out.println("Processos médios:");
            pilhaMedia.imprimir();
        }

        if (pilhaBaixa.estaVazio()) {
            System.out.println("A pilha de processos baixos está vazia\n");
        } else {
            System.out.println("Processos baixos:");
            pilhaBaixa.imprimir();
        }
    }

    public void limpar() {
        while (!pilhaBaixa.estaVazio()) {
            pilhaBaixa.pop();
        }
        while (!pilhaMedia.estaVazio()) {
            pilhaMedia.pop();
        }
        while (!pilhaUrgente.estaVazio()) {
            pilhaUrgente.pop();
        }
    }
}
