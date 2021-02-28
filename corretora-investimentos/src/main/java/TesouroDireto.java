public abstract class TesouroDireto extends RendaFixa {

    private Double aporteMensal;
    private Double taxaB3;

    public TesouroDireto(Double valorInvestido, Double rentabilidade, Integer prazoMes, Double aporteMensal) {
        super(valorInvestido, rentabilidade, prazoMes);
        this.aporteMensal = aporteMensal;
        this.taxaB3 = 0.25;
    }

    public Double convertRentabilidadeMes() {
        return (getRentabilidade() / 100) / 12;
    }


    public Double getAporteMensal() {
        return aporteMensal;
    }

    public void setAporteMensal(Double aporteMensal) {

        this.aporteMensal = aporteMensal;
    }

    public Double getTaxaB3() {
        return taxaB3;
    }

    public void setTaxaB3(Double taxaB3) {
        this.taxaB3 = taxaB3;
    }

    @Override
    public String toString() {
        return "TesouroDireto{" +
                "aporteMensal=" + aporteMensal +
                "} " + super.toString();
    }
}
