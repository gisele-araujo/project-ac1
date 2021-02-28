package br.com.bandtec.projectcorretora;

public abstract class RendaFixa {
    private Double valorInvestido;
    private Double rentabilidade;
    private Integer prazoMes;
    private Double impostoRenda;

    public RendaFixa(Double valorInvestido, Double rentabilidade, Integer prazoMes) {
        this.valorInvestido = valorInvestido;
        this.rentabilidade = rentabilidade;
        this.prazoMes = prazoMes;
        this.impostoRenda = calcImpostoRenda(prazoMes);
    }

    public abstract Double calcJuros();

    public abstract Double calcDescontos();

    public Double calcImpostoRenda(Integer prazoMes) {

        if(prazoMes < 6) return 22.5;
        if(prazoMes < 12) return 20.0;
        if(prazoMes <= 24) return 17.5;
        else return 15.0;
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