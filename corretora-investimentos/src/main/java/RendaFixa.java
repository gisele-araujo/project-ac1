public abstract class RendaFixa {
    private Double valorInvestido;
    private Double rentabilidade;
    private Integer prazoDias;
    private Double impostoRenda;

    public RendaFixa(Double valorInvestido, Double rentabilidade, Integer prazoDias) {
        this.valorInvestido = valorInvestido;
        this.rentabilidade = rentabilidade;
        this.prazoDias = prazoDias;
        this.impostoRenda = calcImpostoRenda();
    }

    public abstract Double simularInvestimento();

    public abstract Double calcDescontos();

    public Double calcImpostoRenda() {

        if(prazoDias < 180) {
            return 22.5;
        }
        if(prazoDias < 364) {
            return 20.0;
        }

        if(prazoDias <= 720) {
            return 17.5;
        }
         else {
             return 15.0;
        }
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(Double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public Integer getPrazoDias() {
        return prazoDias;
    }

    public void setPrazoDias(Integer prazoDias) {
        this.prazoDias = prazoDias;
    }

    public Double getImpostoRenda() {
        return impostoRenda;
    }

    public void setImpostoRenda(Double impostoRenda) {
        this.impostoRenda = impostoRenda;
    }

    @Override
    public String toString() {
        return "RendaFixa{" +
                "valorInvestido=" + valorInvestido +
                ", rentabilidade=" + rentabilidade +
                ", prazoDias=" + prazoDias +
                '}';
    }
}
