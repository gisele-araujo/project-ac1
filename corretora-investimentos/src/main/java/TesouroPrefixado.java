public class TesouroPrefixado extends TesouroDireto{

    public TesouroPrefixado(Double valorInvestido, Double rentabilidade, Integer prazoMes, Double aporteMensal) {
        super(valorInvestido, rentabilidade, prazoMes, aporteMensal);
    }

    @Override
    public Double simularInvestimento() {

        Integer mes = 1;
        Double totalAcumulado = getValorInvestido();
        Double jurosCompostos = 00.00;

        while (mes <= getPrazoMes()) {
            totalAcumulado += getAporteMensal();
            jurosCompostos += ((totalAcumulado + jurosCompostos) * convertRentabilidadeMes());

            mes++;
        }

        return (totalAcumulado + jurosCompostos);
    }

    @Override
    public Double calcDescontos() {
        return null;
    }
}
