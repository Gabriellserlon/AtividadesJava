package Entidades;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;
    private Titular titular;

    public ContaCorrente(int numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Novo saldo: "+this.saldo);
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Novo saldo: "+this.saldo);
        }else{
            System.out.println("Valor informado não é válido");
        }
    }
    public double verificarSaldo(){
        return this.saldo;
    }
}
