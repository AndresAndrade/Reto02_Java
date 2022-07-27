public class ComputadoresMesa extends Computadores{

    private static final Integer ALMACENAMIENTO_BASE = 50;
    private Integer almacenamiento;

    public ComputadoresMesa() {
        super();
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    public Double calcularPrecio(){
        double adicion = super.calcularPrecio();
        if (almacenamiento > 100){
            adicion += 50;
        }
        return adicion;
    }

    public Integer getCarga() {
        return almacenamiento;
    }
}
