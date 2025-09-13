import java.util.HashMap;
import java.util.Map;

public class AccountManager {

    private static AccountManager instancia;
    private Map<String, Double> contas;

    private AccountManager () {
        contas = new HashMap<>();
    }

    public static AccountManager getInstance () {
        if (instancia == null) {
            instancia = new AccountManager();
        }
        return instancia;
    }

    public static void destruitInstancia () {
        if (instancia != null) {
            instancia = null;
        }
    }

    public void criarConta (String contaId, double saldoInicial) {
        if (!contas.containsKey(contaId)) {
            contas.put(contaId, saldoInicial);
            System.out.println("Conta criada: " + contaId + "\nSaldo inicial: R$" + saldoInicial);
        } else {
            System.out.println("Conta " + contaId + " já existe.");
        }
    }

    public void depositar (String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            contas.put(contaId, contas.get(contaId) + valor);
            System.out.println("Depósito de R$" + valor + " na conta " + contaId);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar (String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            double saldo = contas.get(contaId);
            if (saldo >= valor) {
                contas.put(contaId, saldo - valor);
                System.out.println("Saque de R$" + valor + " realizado na conta " + contaId);
            } else {
                System.out.println("Saldo insuficiente na conta " + contaId);
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void verSaldo (String contaId) {
        if (contas.containsKey(contaId)) {
            System.out.println("Saldo da conta " + contaId + ": R$" + contas.get(contaId));
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void listarConstasAtivas () {
        System.out.println("Conta Ativas:\n");
        for (Map.Entry<String, Double> conta : contas.entrySet()) {
            System.out.println("Conta: " + conta.getKey() + " | Saldo: R$" +conta.getValue());
        }
    }
    
}
