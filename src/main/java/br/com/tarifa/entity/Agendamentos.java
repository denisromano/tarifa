package br.com.tarifa.entity;

import br.com.tarifa.controller.request.CriarAgendamentosRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Component
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

    public Agendamentos(CriarAgendamentosRequest criarAgendamentosRequest) {
        this.usuario = criarAgendamentosRequest.getUsuario();
        this.contaOrigem = criarAgendamentosRequest.getContaOrigem();
        this.contaDestino = criarAgendamentosRequest.getContaDestino();
        this.valor = criarAgendamentosRequest.getValor();
        this.dtTransferencia = LocalDate.now();
        this.dtAgendamento = criarAgendamentosRequest.getDtAgendamento();
    }
}
