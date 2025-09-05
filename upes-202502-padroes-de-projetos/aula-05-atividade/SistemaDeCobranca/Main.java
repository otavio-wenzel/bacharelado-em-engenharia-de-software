public class Main {

    public static void main(String[] args) {
        
        PagamentoService service = new PagamentoService();

        service.processarPagamento(new FactoryCartaoCredito("1223334444555556"), 150.00);

        service.processarPagamento(new FactoryCartaoCredito("1234"), 200);

        service.processarPagamento(new FactoryPayPal("otavio@com"), 150);

        service.processarPagamento(new FactoryPayPal("otavio"), 200);

        service.processarPagamento(new FactoryCriptomoeda(200), 150);

        service.processarPagamento(new FactoryCriptomoeda(200), 250);

    }
    
}