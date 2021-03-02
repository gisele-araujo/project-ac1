package br.com.bandtec.projectcorretora;

/*
*
* Eu senti a necessidade de RendaFixa ser uma classe abstrata principalmente pelo motivo das classes filhas
* (TesouroDireto e Cdb) serem tipos de investimento em Renda fixa que possuem várias características em comum,
* como valor inicial, rentabilidade, prazo e desconto de imposto de renda.
*
* */

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

    public abstract Double simularInvestimento();

    public Double calcImpostoRenda(Integer prazoMes) {

        if(prazoMes < 6) return 22.5;
        if(prazoMes < 12) return 20.0;
        if(prazoMes <= 24) return 17.5;
        else return 15.0;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public Double getRentabilidade() {
        return rentabilidade;
    }

    public Integer getPrazoMes() {
        return prazoMes;
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
