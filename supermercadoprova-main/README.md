# SuperMercadoProva

### Resolução do BUG

Na classe Pedido foi inserido um IF-ELSE no metodo adicionaItem() para não permitir seja adicionado item na lista 
se não tiver quantidade suficiente em estoque

### Implementação Metodo Pagamento e Troco Inteligente

Criado nova classe Caixa.class para executar a regra de pagamento e retorna troco
Dentro da classe foi criado o metodo chamaPagamento() valida se o valor inserido é o suficiente
Também criado os metodos efetuarPagamento() e contaQuantidadeNotasDeTroco() e calcula o troco e retorna as todas.
No menu principa inserido mais um item para chamar o metodo de pagamento

### MELHORIAS CÓDIGO NÃO EXIGIDAS

Inserido um try-catch no metodo inputInt() e inputDouble() da classe Inputs
- Para quando inserir alguma letra nos menus ele não retornar erro





