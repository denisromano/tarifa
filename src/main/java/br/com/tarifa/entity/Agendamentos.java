package br.com.tarifa.entity;

import br.com.tarifa.controller.request.CriarAgendamentosRequest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity(name = "Agendamentos")
public class Agendamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String contaOrigem;
    private String contaDestino;
    private double valor;
    private LocalDate dtTransferencia;
    private LocalDate dtAgendamento;

    public  Agendamentos(){}

    public Agendamentos(CriarAgendamentosRequest criarAgendamentosRequest) {
        this.usuario = criarAgendamentosRequest.getUsuario();
        this.contaOrigem = criarAgendamentosRequest.getContaOrigem();
        this.contaDestino = criarAgendamentosRequest.getContaDestino();
        this.valor = criarAgendamentosRequest.getValor();
        this.dtTransferencia = LocalDate.now();
        this.dtAgendamento = criarAgendamentosRequest.getDtAgendamento();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
