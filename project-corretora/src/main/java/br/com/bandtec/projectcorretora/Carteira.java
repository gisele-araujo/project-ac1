package br.com.bandtec.projectcorretora;

import java.util.ArrayList;
import java.util.List;

public class Carteira {

    List<RendaFixa> investimentos;

    public Carteira(List<RendaFixa> investimentos) {
        this.investimentos = new ArrayList<>();
    }

    public void investir(RendaFixa investimento) {
        investimentos.add(investimento);
    }

    public void exibirInvestimentos() {

        for(RendaFixa investimento : investimentos) {
            System.out.println(investimento);
        }
    }

    public void exibirTotal() {
        Double total = 0.00;

        for (RendaFixa investimento : investimentos) {
            total += investimento.calcJuros();
        }

        System.out.println(total);
    }
}
