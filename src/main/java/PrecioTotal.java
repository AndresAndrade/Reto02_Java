public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Computadores[] listaComputadores;

    public PrecioTotal(Computadores[] listaComputadores) {
        this.listaComputadores = listaComputadores;
    }

    public void mostrarTotales(){
        double precioTotal;
        for (Computadores computador : listaComputadores){
            precioTotal = computador.getPrecioBase() + computador.calcularPrecio();
            if (computador.getClass() == ComputadoresMesa.class) {
                totalComputadoresMesa += precioTotal;
            } else if (computador.getClass() == ComputadoresPortatiles.class) {
                totalComputadoresPortatiles += precioTotal;
            } else if (computador.getClass() == Computadores.class) {
                totalComputadores += precioTotal;
            }
        }

        totalComputadores = totalComputadores + totalComputadoresPortatiles + totalComputadoresMesa;

        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);

    }
}
