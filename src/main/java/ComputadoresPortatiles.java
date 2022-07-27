public class ComputadoresPortatiles extends Computadores{

    private static final Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;

    public ComputadoresPortatiles() {
        super();
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, Boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    public Double calcularPrecio(){
        double adicion = super.calcularPrecio();
        if (pulgadas > 40){
            adicion += (0.3 * getPrecioBase());
        }

        if (camaraITG){
            adicion += 50;
        }
        return adicion;
    }
}
