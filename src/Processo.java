import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Processo {
    private int protocolo;
    private String solicitante;
    private String tipoServico;
    private int prioridade;
    private String dataHora;
    public static int contador;

    public Processo(String solicitante, String tipoServico, int prioridade) {
        // TODO, implementar o contador para a prioridade
        //TODO, lembrar sobre a data e hora
        
        this.solicitante = solicitante;
        this.tipoServico = tipoServico;
        this.prioridade = prioridade;
        LocalDateTime agora = LocalDateTime.now();
        this.dataHora = agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        contador++;
        this.protocolo = contador;
    }
    //TODO, implementar o tipo de prioridade
    @Override
    public String toString(){
       return ("[#" + protocolo +"] " + solicitante + " | " + tipoServico + " | " + prioridade + " | " + dataHora);
    }

    public int getProtocolo() {
        return protocolo;
    }

    public String solicitante() {
        return solicitante;
    }

    public String getTipoServico(){
        return tipoServico;
    }

    public int getPrioridade(){
        return prioridade;
    }

    public String getDataHora(){
        return dataHora;
    }

    public void setSolicitante(String solicitante){
        this.solicitante = solicitante;
    }

    public void setTipoServico(String tipoServico){
        this.tipoServico = tipoServico;
    }

    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }

    public void setDataHora(String dataHora){
        this.dataHora = dataHora;
    }


    
}
