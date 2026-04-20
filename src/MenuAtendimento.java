import java.util.Scanner;

public class MenuAtendimento {
    public static void main(String[] args) {
        CentralAtendimento centralAtendimento = new CentralAtendimento();
        Scanner scanner = new Scanner(System.in);
        int opcao = 10;

        System.out.println("Bem vindo a central de atendimento");
        System.out.println("Digite o número da opção desejada: ");

        while (opcao != 0) {
            System.out.println("[1] Para abrir um Processo \n[2] Para atender o proximo processo na fila \n[3] Para desfazer o ultimo atendimento \n[4] Para listar os Processos pendentes \n[5] Para listar os Processos já atendidos \n[0] Para sair do sistema");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o seu nome");
                    String solicitante = scanner.nextLine();

                    System.out.println("Digite o tipo de serviço");
                    String tipoServico = scanner.nextLine();

                    System.out.println("Digite o número da prioridade (Entre 1 a 3)");
                    int prioridade = scanner.nextInt();

                    centralAtendimento.abrirProcesso(new Processo(solicitante, tipoServico, prioridade));

                    System.out.println("Processo Aberto!");

                    break;
                case 2:
                    centralAtendimento.atenderProximo();
                    break;
                case 3:
                    centralAtendimento.desfazerUltimoAtendimento();
                    break;
                case 4:
                    centralAtendimento.listarPendentes();
                    break;
                case 5:
                    centralAtendimento.listarHistorico();
                    break;
            }
        }
        
    }
}
