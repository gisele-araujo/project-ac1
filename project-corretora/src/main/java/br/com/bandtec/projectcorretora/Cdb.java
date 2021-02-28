package br.com.bandtec.projectcorretora;

public class Cdb extends RendaFixa{

    /*
     *
     * Diferente do Tesouro Direto, o CDB não possui taxa b3 e aportes mensais, apenas desconto de IR e aplicação única.
     * A rentabilidade do CDB tem como referência a taxa CDI, que atualmente está de 1.90% por ano.
     *
     * */

    private Double taxaCdi;

    public Cdb(Double valorInvestido, Double rentabilidade, Integer prazoDias) {
        super(valorInvestido, rentabilidade, prazoDias);
        this.taxaCdi = 1.90;
    }

    public Double convertRentabilidadeCdiMes() {
        return (((this.taxaCdi / 100) * getRentabilidade()) / 100) / 12;
    }

    @Override
    public Double calcJuros() {
        Integer mes = 1;
        Double jurosCompostos = 00.00;

        while( mes <= getPrazoMes()) {
            jurosCompostos += convertRentabilidadeCdiMes() * getValorInvestido();

            mes++;
        }

        return jurosCompostos;
    }

    @Override
    public Double calcDescontos() {

        return calcJuros() * (calcImpostoRenda(getPrazoMes()) /100);
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
