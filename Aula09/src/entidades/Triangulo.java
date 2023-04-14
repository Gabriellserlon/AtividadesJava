package entidades;

public class Triangulo extends Forma {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(Cores cores, double ladoA, double ladoB, double ladoC){
        super(cores);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    @Override
    public double calcularArea(){
        double p = (this.ladoA+this.ladoB+this.ladoC);
        return Math.sqrt(p*(p-this.ladoA)*(p-this.ladoB)*(p-this.ladoC));
    }
}
