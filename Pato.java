class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato bate las alas y se eleva en el aire.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato mueve sus patas palmeadas y nada en el agua.");
    }
}
