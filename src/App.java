public class App {
    public static void main(String[] args) throws Exception {
        
        Circulo circulo = new Circulo(15);
        Rectangulo rectangulo = new Rectangulo(10, 15);

        circulo.imprimirInformacion();
        System.out.println("El area del circulo es: " + circulo.calculararea());
        rectangulo.imprimirInformacion();
        System.out.println("El area del rectangulo es: " + rectangulo.calculararea());
    }
}
