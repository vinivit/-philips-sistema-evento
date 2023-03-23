package evento;

import endereco.Endereco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.format.DateTimeFormatter;

public class Evento {
    private String nome;
    private Endereco endereco;
    private String organizadores;
    private String detalhes;
    //Falta o folder
    private Date dataInicio;
    private Date dataFim;
    private Date horario;


    private SimpleDateFormat horarioFormatado = new SimpleDateFormat("HH:mm");
    private SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");


    public Evento(String nome, String dataInicio , String horario, String dataFim, Endereco endereco, String organizadores, String detalhes) {
        this.nome = nome;
        try {
            this.dataInicio = dataFormatada.parse(java.lang.String.valueOf(dataInicio));
            this.dataFim = dataFormatada.parse(java.lang.String.valueOf(dataFim));
            this.horario = horarioFormatado.parse(java.lang.String.valueOf(horario));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        this.endereco = endereco;
        this.organizadores = organizadores;
        this.detalhes = detalhes;
        //this.folder = folder;
    };
/*
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
    } */

    @Override
    public String toString(){
            return "Evento "+this.nome+ " na data "+dataFormatada.format(this.dataInicio)+ " - começa "+ horarioFormatado.format(this.horario) + " no Endereço: "+this.endereco;
    };

}
