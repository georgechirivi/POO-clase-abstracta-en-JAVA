public class Circulo extends Figura {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calculararea() {
        return Math.PI * radio * radio;
    }

}
