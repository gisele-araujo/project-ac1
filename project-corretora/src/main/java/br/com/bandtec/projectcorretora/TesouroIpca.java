package br.com.bandtec.projectcorretora;
/*
 *
 * a rentabilidade deste título é taxa IPCA (índice da inflação) + rentabilidade pré fixada.
 * */

public class TesouroIpca extends TesouroDireto{


    private Double taxaIpca;

    public TesouroIpca(Double valorInvestido, Double rentabilidade, Integer prazoMes, Double aporteMensal) {
        super(valorInvestido, rentabilidade, prazoMes, aporteMensal);
        this.taxaIpca = 0.25;
        /* considerei a taxaIPCA (índice de inflação) referente ao mês de janeiro de 2021 */
    }

    public Double convertTaxaIpca() {
        return (this.taxaIpca / 100);
    }


    @Override
    public Double calcJuros() {
        Integer mes = 1;
        Double totalAcumulado = getValorInvestido();
        Double jurosCompostos = 00.00;

        while (mes <= getPrazoMes()) {
            totalAcumulado += getAporteMensal();
            jurosCompostos += ((totalAcumulado + jurosCompostos ) * (convertRentabilidadeMes() + convertTaxaIpca()));

            mes++;
        }

        return jurosCompostos;
    }


    @Override
    public Double calcDescontos() {
        return super.calcDescontos();
    }

    public String getSimulacaoInvestimento() {
        return (String.format("%.2f", simularInvestimento()));
    }

    public String getTitulo() {
        return "Tesouro IPCA+";
    }

    @Override
    public String toString() {
        return "TesouroIpca{" +
                "taxaIpca=" + taxaIpca +
                "} " + super.toString();
    }
}

