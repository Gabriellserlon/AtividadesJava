package Entities;

import java.util.Scanner;

public class Profissionais {
    private static int id;
    private String nome;
    private String email;
    private double salario;

    public void gerarid(){
        id++;
        System.out.println("ID do Profisisonal: "+id);
    }
    public Profissionais(String nome, String email, double salario){
        this.nome=nome;
        this.email=email;
        this.salario=salario;
        gerarid();
        aumentarSalario(percentualAumento);
    }
    public void aumentarSalario(double percentualAumento){
        this.salario=this.salario*(1+(percentualAumento/100));
        System.out.println("O novo salário é: "+this.salario);
    }
    Scanner sc = new Scanner(System.in);
    double percentualAumento = sc.nextDouble();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
