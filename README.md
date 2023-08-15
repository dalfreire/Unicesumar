# Unicesumar
Atividades desenvolvidas nas disciplinas de programação da Unicesumar - ADS

Gerenciamento de locação de veículos.

Uma grande rede de aluguéis de veículos contratou a fábrica de software em que você trabalha para criar um software em Java orientado à objetos que faça a gestão de seus veículos para os clientes.

O processo de desenvolvimento já se iniciou e o analista de sistema já modelou parte do processo de locação,

Além do diagrama de classe, o analista ainda mandou o documento de requisitos contendo as seguinte regras
- O método de cadastrar usuário deve ler as informações através do JOptionPane
- O método mostrar dados do usuário deve preprar uma string e retornar como saída do método
- O mesmo comportamento dos métodos de usuário devem ser contemplados em Carro
- O método iniciar aluguel deve chamar o método cadastrarUsuario e cadastrarCarro do objeto relacionado a aluguel
- O método iniciar aluguel deve pedir também o kmInicial do veiculo 
- O método fechar locacao deve ler a informação de kmFinal.
    - Para calcular a locação deve-se calcular a quantidad de dias locados * valor por km. Além disso se o carro ficou alugado por mais de 10 dias, deve-se dar desconto de 10% e se ficou mais de 20 dias deve-se dar um desconto de 20%. O valor final deve ser armazenado no atributo valorTotalAluguel
- O método mostrarResumoLocacao deve mostrar as informacoes de cliente, carro, e do aluguel através do JOptionPane, no final ficará assim:

Resumo Aluguel
Cliente
Nome: Rogério
CPF: 123.123.123-11
Telefone: (11)1111-11111
Carro
Modelo: HB20
Marca: Hyundai
Valor por Km: 5.0
Aluguel
Quantidade de dias: 1
Km Inicial: 100
Km Final: 200
Valor Total: R$500,00

Implemente um projeto utilizando Java na IDE Netbeans contendo as classes, bem como seus atributos e métodos, aplicando as regras e os conceitos da Orientação a Objetos. A implementação não necessita de interface para entrega, poderá ser criado uma classe "Main" que instancie e execute os objetos e métodos para o teste das funcionalidades. Logo após a conclusão da atividade, faça a exportação do projeto e compacte o projeto e envie para correção.
