public class Cdb extends RendaFixa{

private Double taxaCdi;

    public Cdb(Double valorInvestido, Double rentabilidade, Integer prazoDias) {
        super(valorInvestido, rentabilidade, prazoDias);
        this.taxaCdi = 1.90;
    }

    @Override
    public Double simularInvestimento() {

        return null;
    }

    @Override
    public Double calcDescontos() {

        return null;
    }

    public Double getTaxaCdi() {
        return taxaCdi;
    }

    public void setTaxaCdi(Double taxaCdi) {
        this.taxaCdi = taxaCdi;
    }

    @Override
    public String toString() {
        return "Cdb{" +
                "taxaCdi=" + taxaCdi +
                "} " + super.toString();
    }
}
