package gvcunhadev.desafiotarget.desafio4;

import java.util.HashMap;
import java.util.Map;

public class PercentualFaturamento {

    public static void main(String[] args) {
        Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        double faturamentoTotal = faturamento.values().stream().mapToDouble(Double::doubleValue).sum();

        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            double percentual = (entry.getValue() / faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%%n", entry.getKey(), percentual);
        }
    }
}
