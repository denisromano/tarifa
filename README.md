# Tarifa
Projeto de sistema de agendamento de transferências financeiras.

## Frameworks
SpringBoot, H2, Junit, lombok, maven, git, Java 13

## Design Pattern
MVC Pattern, Transfer Object Pattern

## Descricao
 Para este projeto foram utilizados os frameworks e patterns acima, devido ao facil entendimento e utilização.
  - A utilização do SpringBoot foi utilizadade por conta de suas bibliotecas com anotacoes que facilita o desenvolvimento.
  - Para o Design Pattern foi utilizado o MVC para a comunicação com os dados do front para o back e o DTO para a conversão de dados 
 que são gravados na base de dados.

## API
`http://localhost:9000/`  

Response formats: JSON

## Endpoints
### Agendamentos `/agendamentos/agendar`:
**Accepts:**  
    - `POST`  
```
{
    usuario: '',
    contaOrigem: '',
    contaDestino: '',
    valor: '',
    dtAgendamento: '' (MM/dd/YYYY)
}

```

### Consulta `/agendamento/:usuario`:

**Accepts:**  
    - `GET`

```
{
}
```
