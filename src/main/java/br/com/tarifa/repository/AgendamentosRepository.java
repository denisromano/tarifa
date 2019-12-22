package br.com.tarifa.repository;

import br.com.tarifa.entity.Agendamentos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentosRepository extends CrudRepository<Agendamentos, Long> {
    List<Agendamentos> findByUsuario(String usuario);
}
