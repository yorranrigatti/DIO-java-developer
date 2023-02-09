import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNome("cliente");

    Conta cc = new ContaCorrente(cliente);
    Conta cp = new ContaPoupanca(cliente);

    cc.depositar(100);
    cc.transferir(100, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
  }
}
