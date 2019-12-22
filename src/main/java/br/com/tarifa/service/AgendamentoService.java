package br.com.tarifa.service;

import br.com.tarifa.controller.request.CriarAgendamentosRequest;
import br.com.tarifa.controller.response.CriarAgendamentosResponse;

public interface AgendamentoService {

    CriarAgendamentosResponse agendarTransferencia(CriarAgendamentosRequest agendamentosRequest);
}
