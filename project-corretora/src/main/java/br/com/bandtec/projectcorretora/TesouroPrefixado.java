package br.com.bandtec.projectcorretora;

public class TesouroPrefixado extends TesouroDireto{

    public TesouroPrefixado(Double valorInvestido, Double rentabilidade, Integer prazoMes, Double aporteMensal) {
        super(valorInvestido, rentabilidade, prazoMes, aporteMensal);
    }


    @Override
    public Double calcJuros() {

        Integer mes = 1;
        Double totalAcumulado = getValorInvestido();
        Double jurosCompostos = 00.00;

        while (mes <= getPrazoMes()) {
            totalAcumulado += getAporteMensal();
            jurosCompostos += ((totalAcumulado + jurosCompostos) * convertRentabilidadeMes());

            mes++;

        }

        return jurosCompostos;
    }

    @Override
    public Double calcDescontos() {
        return super.calcDescontos();
    }
}
