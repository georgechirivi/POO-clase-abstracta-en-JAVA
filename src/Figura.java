public abstract class Figura {

    // Este comportamiento sera obligatorio en las clases que eredan de figura
    abstract double calculararea();

    void imprimirInformacion() {
        System.out.println("Esta informacion viene desde la clase abstracta");
}
}
