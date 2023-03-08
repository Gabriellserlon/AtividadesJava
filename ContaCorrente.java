public class ContaCorrente {
    private String titular;
    private int nConta;
    private double saldo;

    public ContaCorrente(String titular, int nConta) {
        this.titular = titular;
        this.nConta = nConta;
    }
        public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double verificarSaldo(){
        return this.saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Seu novo saldo é: "+saldo);
    }
    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Valor não disponível");
        }else{
            this.saldo -= valor;
            System.out.println("Saldo disponível: "+this.saldo);
        }
    }
}
