package br.com.bandtec.projectcorretora;

public abstract class TesouroDireto extends RendaFixa {

    private Double aporteMensal;
    private Double taxaB3;

    public TesouroDireto(Double valorInvestido, Double rentabilidade, Integer prazoMes, Double aporteMensal) {
        super(valorInvestido, rentabilidade, prazoMes);
        this.aporteMensal = aporteMensal;
        this.taxaB3 = 0.25;
    }


    public Double calcValorTotalInvestido() {
        return getValorInvestido() + (getAporteMensal() * getPrazoMes());
    }

    public Double convertRentabilidadeMes() {
        return (getRentabilidade() / 100) / 12;
    }

    @Override
    public Double calcDescontos() {
        Double ir = calcJuros() * (calcImpostoRenda(getPrazoMes()) /100);
        Double b3 = ((taxaB3 / 100) * (getPrazoMes() / 12)) * (calcValorTotalInvestido() + calcJuros());

        return (b3+ir);
    }

    @Override
    public Double simularInvestimento() {
        return (calcValorTotalInvestido() + calcJuros()) - calcDescontos();
    }

    public Double getAporteMensal() {
        return aporteMensal;
    }

    @Override
    public String toString() {
        return "TesouroDireto{" +
                "aporteMensal=" + aporteMensal +
                "} " + super.toString();
    }
}

