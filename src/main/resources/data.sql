DROP TABLE IF EXISTS Agendamentos;

CREATE TABLE Agendamentos (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  usuario VARCHAR(250) NOT NULL,
  conta_origem VARCHAR(250) NOT NULL,
  conta_destino VARCHAR(250) NOT NULL,
  valor INT,
  dt_transferencia DATE NOT NULL,
  dt_agendamento DATE
);