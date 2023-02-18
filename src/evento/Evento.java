import java.util.Date;

public class Evento {
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private Endereco endereco;
    private String organizadores;
    private String detalhes;
    //Falta o folder


    //Contrutor

    public Evento(String nome, Date dataInicio, Date dataFim, Endereco endereco, String organizadores, String detalhes) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.endereco = endereco;
        this.organizadores = organizadores;
        this.detalhes = detalhes;
 
    }

    //Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getOrganizadores() {
        return organizadores;
    }

    public void setOrganizadores(String organizadores) {
        this.organizadores = organizadores;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

}