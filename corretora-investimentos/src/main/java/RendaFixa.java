public abstract class RendaFixa {
    private Double valorInvestido;
    private Double rentabilidade;
    private Integer prazoMes;
    private Double impostoRenda;

    public RendaFixa(Double valorInvestido, Double rentabilidade, Integer prazoMes) {
        this.valorInvestido = valorInvestido;
        this.rentabilidade = rentabilidade;
        this.prazoMes = prazoMes;
        this.impostoRenda = calcImpostoRenda();
    }

    public abstract Double simularInvestimento();

    public abstract Double calcDescontos();

    public Double calcImpostoRenda() {

        if(prazoMes < 180) {
            return 22.5;
        }
        if(prazoMes < 364) {
            return 20.0;
        }

        if(prazoMes <= 720) {
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

    public Integer getPrazoMes() {
        return prazoMes;
    }

    public void setPrazoMes(Integer prazoDias) {
        this.prazoMes = prazoDias;
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
                ", prazoMes=" + prazoMes +
                '}';
    }
}
