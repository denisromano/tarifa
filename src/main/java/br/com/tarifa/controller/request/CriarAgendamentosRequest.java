package br.com.tarifa.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class CriarAgendamentosRequest {

    private String usuario;
    private String contaOrigem;
    private String contaDestino;
    private double valor;
    private LocalDate dtTransferencia;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dtAgendamento;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDtTransferencia() {
        return dtTransferencia;
    }

    public void setDtTransferencia(LocalDate dtTransferencia) {
        this.dtTransferencia = dtTransferencia;
    }

    public LocalDate getDtAgendamento() {
        return dtAgendamento;
    }

    public void setDtAgendamento(LocalDate dtAgendamento) {
        this.dtAgendamento = dtAgendamento;
    }
}
