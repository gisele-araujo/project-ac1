public class TesouroIpca extends TesouroDireto{
    /* a rentabilidade deste título é taxa IPCA + rentabilidade pré fixada */

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
    public Double simularInvestimento() {
        Integer mes = 1;
        Double totalAcumulado = getValorInvestido();
        Double jurosCompostos = 00.00;

        while (mes <= getPrazoMes()) {
            totalAcumulado += getAporteMensal();
            jurosCompostos += ((totalAcumulado + jurosCompostos ) * (convertRentabilidadeMes() + convertTaxaIpca()));

            mes++;
        }

        return (totalAcumulado + jurosCompostos);
    }

    @Override
    public Double calcDescontos() {
        return null;
    }

    public Double getTaxaIpca() {
        return taxaIpca;
    }

    public void setTaxaIpca(Double taxaIpca) {
        this.taxaIpca = taxaIpca;
    }

    @Override
    public String toString() {
        return "TesouroIpca{" +
                "taxaIpca=" + taxaIpca +
                "} " + super.toString();
    }
}
