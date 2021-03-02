package br.com.bandtec.projectcorretora;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentosController {

    List<RendaFixa> investimentos = new ArrayList<>();

    public InvestimentosController() {
        investimentos.add(new TesouroPrefixado(1000.00, 7.39, 39, 100.00));
        investimentos.add(new TesouroIpca(3000.00, 3.26, 65, 100.00));
        investimentos.add(new Cdb(1000.00, 120.00, 36));

    }

    @GetMapping
    public List<RendaFixa> getInvestimentos() {
        return investimentos;
    }

    @GetMapping("/{index}")
    public RendaFixa getInvestimento(@PathVariable int index) {

        if(index < investimentos.size()){
            return investimentos.get(index);
        } else {
            return null;
        }
    }

    /* métodos abstratos invocados */

    @GetMapping("/detalhes-investimento/{index}")
    public String detalhesInvestimento(@PathVariable int index) {

        if(index < investimentos.size()){
            return (String.format("Juros acumulados: %.2f \nDescontos: %.2f \nValor líquido: %.2f ",
                    investimentos.get(index).calcJuros(),
                    investimentos.get(index).calcDescontos(),
                    investimentos.get(index).simularInvestimento()));
        } else {
            return "Investimento não encontrado! Tente novamente";
        }
    }

    @DeleteMapping("/{index}")
    public String deleteInvestimento(@PathVariable int index) {

        if(index < investimentos.size()){
            investimentos.remove(index);
            return "Investimento cancelado com sucesso.";
        } else {
            return "Investimento não encontrado! Tente novamente.";
        }
    }

    @PostMapping("/tesouroipca")
    public String postInvestimento(@RequestBody TesouroIpca novoInvestimento) {

        investimentos.add(novoInvestimento);
        return "Investimento em Tesouro IPCA+ realizado com sucesso!";
    }

    @PostMapping("/tesouroprefixado")
    public String postInvestimento(@RequestBody TesouroPrefixado novoInvestimento) {

        investimentos.add(novoInvestimento);
        return "Investimento em Tesouro Prefixado realizado com sucesso!";
    }
}
