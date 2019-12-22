package br.com.tarifa.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class CriarAgendamentosRequest {

    private String usuario;
    private String contaOrigem;
    private String contaDestino;
    private double valor;
    private LocalDate dtTransferencia;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dtAgendamento;

}
