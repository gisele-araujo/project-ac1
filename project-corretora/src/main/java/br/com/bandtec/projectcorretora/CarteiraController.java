package br.com.bandtec.projectcorretora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carteira")
public class CarteiraController {

    List<RendaFixa> investimentos;

    public CarteiraController(List<RendaFixa> investimentos) {
        this.investimentos = new ArrayList<>();
    }

    @GetMapping
    public List<RendaFixa> exibirInvestimentos() {
        return investimentos;
    }

    @GetMapping("tesouroprefixado/{valor}/{rentabilidade}/{prazo}/{aporteMensal}")
    public String investir(@PathVariable Double valor,
                           @PathVariable Double rentabilidade,
                           @PathVariable Integer prazo,
                           @PathVariable Double aporteMensal) {
        investimentos.add(new TesouroPrefixado(valor, rentabilidade, prazo, aporteMensal));

        return "Investimento realizado com sucesso!";

    }



    


    /* public void exibirInvestimentos() {

        for(RendaFixa investimento : investimentos) {
            System.out.println(investimento);
        }
    } */

    public void exibirTotal() {
        Double total = 0.00;

        for (RendaFixa investimento : investimentos) {
            total += investimento.calcJuros();
        }

        System.out.println(total);
    }
}
