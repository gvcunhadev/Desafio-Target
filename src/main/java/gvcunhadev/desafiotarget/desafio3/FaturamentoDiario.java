package gvcunhadev.desafiotarget.desafio3;

public class FaturamentoDiario {
    public static void main(String[] args) {
        double[] faturamento = {1500.0, 2000.0, 0.0, 2500.0, 3000.0, 0.0, 1000.0}; // Exemplo de valores

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menorFaturamento) menorFaturamento = valor;
                if (valor > maiorFaturamento) maiorFaturamento = valor;
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (double valor : faturamento) {
            if (valor > mediaMensal) diasAcimaDaMedia++;
        }

        System.out.println("Menor faturamento: R$" + menorFaturamento);
        System.out.println("Maior faturamento: R$" + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
