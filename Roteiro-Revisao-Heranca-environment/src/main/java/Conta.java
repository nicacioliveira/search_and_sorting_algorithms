public class Conta extends ContaAbstrata{
  
  public Conta(String numero, double saldo, Cliente cliente) {
    super(numero, saldo, cliente);
  }

  public void debitar(double valor) {
    this.setSaldo(this.getSaldo());
  }
}