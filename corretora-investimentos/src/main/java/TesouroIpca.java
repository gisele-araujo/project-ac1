public class TesouroIpca extends TesouroDireto{

    private Double taxaIpca;

    public TesouroIpca(Double valorInvestido, Double rentabilidade, Integer prazoDias, Double aporteMensal, Double taxaIpca) {
        super(valorInvestido, rentabilidade, prazoDias, aporteMensal);
        this.taxaIpca = taxaIpca;
    }

    @Override
    public Double simularInvestimento() {
        return null;
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
