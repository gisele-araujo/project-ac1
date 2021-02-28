public class TesouroSelic extends TesouroDireto{

    private Double taxaSelic;

    public TesouroSelic(Double valorInvestido, Double rentabilidade, Integer prazoDias, Double aporteMensal, Double taxaSelic) {
        super(valorInvestido, rentabilidade, prazoDias, aporteMensal);
        this.taxaSelic = taxaSelic;
    }

    @Override
    public Double simularInvestimento() {
        return null;
    }

    @Override
    public Double calcDescontos() {
        return null;
    }

    public Double getTaxaSelic() {
        return taxaSelic;
    }

    public void setTaxaSelic(Double taxaSelic) {
        this.taxaSelic = taxaSelic;
    }

    @Override
    public String toString() {
        return "TesouroSelic{" +
                "taxaSelic=" + taxaSelic +
                "} " + super.toString();
    }
}
