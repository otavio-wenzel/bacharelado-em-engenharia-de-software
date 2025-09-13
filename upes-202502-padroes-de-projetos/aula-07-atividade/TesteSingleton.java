public class TesteSingleton {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente ("001", "Alice");

        Cliente cliente2 = new Cliente ("002", "Bruno");

        cliente1.depositar(500);
        cliente2.depositar(100);
        cliente1.sacar(300);

        cliente1.verSaldo();
        cliente2.verSaldo();

        AccountManager.getInstance().listarConstasAtivas();

        AccountManager.destruitInstancia();

        AccountManager novoGerente = AccountManager.getInstance();
        novoGerente.verSaldo("001");

    }
    
}
