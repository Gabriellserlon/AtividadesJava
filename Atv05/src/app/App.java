package app;

import Entidades.ContaCorrente;
import Entidades.Titular;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Instanciar um Scanner
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente(1);
        //Criação do objeto Titular da Conta
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        cc1.setTitular(new Titular(nome,cpf));
        //Verificar saldo e depositar valor
        System.out.println("Seu saldo é: "+cc1.verificarSaldo());
        cc1.depositar(50.5);
        //Sacar
        cc1.sacar(40.7);
    }
}
