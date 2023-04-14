package aplicacao;

import entidades.Cores;
import entidades.Forma;
import entidades.Quadrado;

import java.security.cert.PolicyQualifierInfo;

public class App {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(Cores.VERMELHO, 10, 10);
        System.out.println("A cor do quadrado é:"+ q1.getCor());
        double area =q1.calcularArea();
        System.out.println("A área do quadrado é: "+area);

        Forma f1 = new Quadrado(Cores.ROXO, 5,5);
        System.out.println("A cor do quadrado é: "+ f1.getCor());
    }
}
