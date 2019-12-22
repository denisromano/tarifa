package br.com.tarifa.service;

import br.com.tarifa.controller.request.CriarAgendamentosRequest;
import br.com.tarifa.controller.response.CriarAgendamentosResponse;
import br.com.tarifa.entity.Agendamentos;
import br.com.tarifa.repository.AgendamentosRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class AgendamentosServiceImplTest {

    @Test
    void agendarTransferenciaTest() {
        AgendamentosRepository agendamentosRepositoryMock = mock(AgendamentosRepository.class) ;
        CriarAgendamentosRequest criarAgendamentosRequest = new CriarAgendamentosRequest();
        criarAgendamentosRequest.setUsuario("teste1");
        criarAgendamentosRequest.setContaOrigem("123");
        criarAgendamentosRequest.setContaDestino("456");
        criarAgendamentosRequest.setValor(10.00);
        criarAgendamentosRequest.setDtTransferencia(LocalDate.now());
        criarAgendamentosRequest.setDtAgendamento(LocalDate.parse("2019-12-21", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        Agendamentos agendamentos = new Agendamentos(criarAgendamentosRequest);
        agendamentos.setId(1L);
        when(agendamentosRepositoryMock.save(agendamentos)).thenReturn(agendamentos);
        AgendamentosServiceImpl agendamentosServiceImpl = new AgendamentosServiceImpl(agendamentosRepositoryMock);

        CriarAgendamentosResponse criarAgendamentosResponse = agendamentosServiceImpl.agendarTransferencia(criarAgendamentosRequest);

        assertNotNull(criarAgendamentosResponse);
    }


}