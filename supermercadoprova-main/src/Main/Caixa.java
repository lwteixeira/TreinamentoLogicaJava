package Main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import Utils.Inputs;

public class Caixa {

    public static void chamaPagamento() {
        Pedido ped = new Pedido();
        System.out.printf("VALOR TOTAL DO PEDIDO R$%.2f\n", ped.getValorTotalDoPedido());
        System.out.println("INSIRA O VALOR A PAGAR: ");
        double totalDinheiro = Inputs.inputDouble();
        while (totalDinheiro < ped.getValorTotalDoPedido()) {
            System.out.println("VALOR INSERIDO INSUFICIENTE");
            System.out.printf("VALOR TOTAL DO PEDIDO R$%.2f\n", ped.getValorTotalDoPedido());
            System.out.println("0 - PARA VOLTAR AO MENU PRINCIPAL");
            System.out.println("1 - INSERIR NOVA QUANTIA");
            int num = Inputs.inputInt();
            if (num == 0) {
                return;
            }
            if (num == 1) {
                System.out.println("INSIRA NOVO VALOR A PAGAR: ");
                totalDinheiro = Inputs.inputDouble();
            } else
                System.out.println("OPÇÃO INVÁLIDA");
        }
        ;

        efetuarPagamento(ped, totalDinheiro);
    }

    private static void efetuarPagamento(Pedido pedido, double totPag) {

        double troco = totPag - pedido.getValorTotalDoPedido();
        System.out.printf("SEU TROCO É R$%.2f\n", troco);
        contaQuantidadeNotasDeTroco(troco);
        pedido.limparCarrinho();
        pedido.setValorTotalDoPedido(0);
    }

    private static void contaQuantidadeNotasDeTroco(double totalTroco) {
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        double[] notasDisponiveis = new double[] { 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.10, 0.05, 0.01 };
        System.out.println("TROCO INTELIGENTE");

        for (double number : notasDisponiveis) {
            if (totalTroco >= number) {
                int qtd = (int) (totalTroco / number);
                totalTroco %= number;
                totalTroco = new BigDecimal(totalTroco).setScale(2, RoundingMode.HALF_UP).doubleValue();
                if (number >= 2) {
                    System.out.println("Você está recebendo " + qtd + " nota(s) de R$" + ((int)number) + ",00");
                } else if (number >= 1){
                    System.out.println("Você está recebendo " + qtd + " moeda(s) de R$" + ((int)number) + ",00");
                }else
                    System.out.println("Você está recebendo " + qtd + " moeda(s) de R$" + fmt.format(number));
            }   
        }

    }

}
