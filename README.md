# Atividade-Testes-Unitarios

## Descrição do Projeto
Este projeto foi desenvolvido como parte de um trabalho da faculdade para a disciplina Domain Driven Design - Java. O objetivo é criar um sistema simples em Java que calcula o custo de aluguel de veículos com base no número de dias e no valor diário, utilizando conceitos de Programação Orientada a Objetos (POO) e testes unitários com JUnit.

## Estrutura do Projeto
O projeto é composto por:
- **Classe Principal**: `Veiculo` - responsável por armazenar informações do veículo e calcular custos.
- **Classe de Testes**: `VeiculoTest` - contém os testes unitários para validar o comportamento da classe `Veiculo`.

## Classes e Métodos

### Classe: `Veiculo`
Representa um veículo com modelo e valor diário.

- **Atributos**:
  - `modelo` (String): Nome do modelo do veículo.
  - `valorDiaria` (double): Valor do aluguel por dia.

- **Construtor**:
  - `Veiculo(String modelo, double valorDiaria)`: Inicializa um novo veículo.

- **Métodos**:
  - `public double calcularCusto(int dias) throws Exception`:
    - Calcula o custo total com base no número de dias e no valor diário.
    - Lança uma exceção se o número de dias for menor ou igual a zero.
    - Fórmula: `valorDiaria * dias`.
  - `public double desconto(int dias) throws Exception`:
    - Calcula o desconto de acordo com os dias que foi alugado.
    - Fórmula (exemplo): `if(dias >= 7 && dias < 14){
            return calcularCusto(dias) * 0.9;
        }`.

### Classe: `VeiculoTest`
Contém os testes unitários para a classe `Veiculo`.

- **Métodos de Teste**:
  - `testCalculosZero()`: Verifica se uma exceção é lançada ao passar 0 dias.
  - `testCalculosNegativos()`: Verifica se uma exceção é lançada ao passar dias negativos.
  - `testCalcularCusto()`: Testa o cálculo correto para um número válido de dias.
  - `testDesconto()`: Testa o cálculo correto com desconto aplicado.

## Testes Unitários
Os testes foram implementados usando JUnit e cobrem os seguintes cenários:
1. **Dias inválidos (≤ 0)**: Garante que o método `calcularCusto` lança uma exceção.
2. **Dias válidos (> 0)**: Confirma que o cálculo do custo é correto.
3. **Desconto aplicado**: Garante que o desconto aplicado está certo/

### Exemplo de Resultado Esperado
- Para `veiculo.calcularCusto(2)` com `valorDiaria = 20.0`:
  - Resultado esperado: `40.0`
- Para `veiculo.calcularCusto(0)`:
  - Resultado esperado: Lançamento de exceção com mensagem "Dias precisam ser positivos."

## Autor
- Nome: Vinícius Matareli
- RM: 555200
