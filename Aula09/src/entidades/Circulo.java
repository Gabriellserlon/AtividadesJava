package entidades;

public final class Circulo extends Forma {
    private double raio;

    public Circulo(Cores cores, double raio){
        super(cores);
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return Math.PI*(this.raio*this.raio);
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
