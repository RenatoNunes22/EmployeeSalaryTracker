# Employee Income Calculator

Este software foi projetado para calcular o salário mensal de um trabalhador com base em seus contratos de hora de trabalho. O usuário pode fornecer os dados do trabalhador, o número de contratos, e o mês e ano para obter o salário calculado para aquele período.

## Diagrama UML

<img width="718" alt="Captura de Tela 2024-09-11 às 20 59 37" src="https://github.com/user-attachments/assets/dd160dd3-654b-40d6-ab8f-2646ddc1c835">


## Funcionalidades

- Cadastrar os dados de um trabalhador: nome, nível de trabalhador e salário base.
- Adicionar contratos de hora de trabalho: data, valor por hora e número de horas trabalhadas.
- Calcular o salário mensal de um trabalhador com base nos contratos fornecidos.
- Remover contratos, caso necessário.

## Modelagem de Dados

O sistema é baseado no diagrama UML acima, com as seguintes classes e associações:

### 1. **Worker**
   - **Atributos**:
     - `name`: Nome do trabalhador.
     - `level`: Nível do trabalhador (Junior, Mid_Level, Senior).
     - `baseSalary`: Salário base do trabalhador.
   - **Métodos**:
     - `addContract(HourContract contract)`: Adiciona um contrato ao trabalhador.
     - `removeContract(HourContract contract)`: Remove um contrato do trabalhador.
     - `income(year: Integer, month: Integer)`: Calcula o salário do trabalhador para o mês e ano fornecidos, somando o salário base e o total dos contratos daquele mês.

### 2. **HourContract**
   - **Atributos**:
     - `date`: Data do contrato.
     - `valuePerHour`: Valor pago por hora.
     - `hours`: Número de horas trabalhadas no contrato.
   - **Método**:
     - `totalValue()`: Calcula o valor total do contrato (horas * valor por hora).

### 3. **Department**
   - **Atributos**:
     - `name`: Nome do departamento ao qual o trabalhador pertence.

### 4. **WorkerLevel (Enum)**
   - Define três níveis de trabalhador:
     - `JUNIOR`
     - `MID_LEVEL`
     - `SENIOR`

## Exemplo de Execução

1. O usuário fornece o nome do trabalhador, o departamento, o nível (Junior, Mid_Level ou Senior) e o salário base.
2. O sistema pede o número de contratos que o trabalhador possui.
3. Para cada contrato, o usuário insere a data, o valor por hora e o número de horas trabalhadas.
4. O sistema solicita o mês e o ano para o qual o salário deve ser calculado.
5. O sistema então exibe o salário do trabalhador para o mês especificado, somando o salário base e os valores dos contratos do mês.

## Estrutura de Código

### Pacotes:
- `entities`: Contém as classes principais (`Worker`, `HourContract`, `Department`, `WorkerLevel`).
  
### Classes:
- `Worker`
- `HourContract`
- `Department`
- `WorkerLevel` (enum)

## Como Rodar o Projeto

1. Clone este repositório.
2. Abra o projeto em sua IDE de preferência (por exemplo, IntelliJ IDEA ou Eclipse).
3. Execute o código `Main.java` para interagir com o sistema.
4. Insira os dados conforme solicitado pelo console.

## Tecnologias Utilizadas

- Java SE 8 ou superior
- IDE: IntelliJ IDEA, Eclipse, ou similar
