public class RendaFixaTeste {

    public static void main(String[] args) {
        TesouroPrefixado teste = new TesouroPrefixado(1000.00,7.28,39,100.0);
        TesouroIpca teste2 = new TesouroIpca(1000.00, 3.0, 65, 100.0);
        Cdb teste3 = new Cdb(1000.00, 120.00, 36);



        System.out.println(teste3.simularInvestimento());
    }
}
