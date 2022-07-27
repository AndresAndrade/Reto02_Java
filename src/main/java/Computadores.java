public class Computadores {

    private static final Double PRECIO_BASE = 100.0;
    private static final Integer PESO_BASE = 5;
    private static final char CONSUMO_W_BASE = 'F';
    private Double precioBase;
    private Integer peso;
    private char consumoW;

    public Computadores() {
        //this(PRECIO_BASE, PESO_BASE, CONSUMO_W_BASE);

        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W_BASE;
    }

    public Computadores(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = CONSUMO_W_BASE;
    }

    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    public Double calcularPrecio(){
        double adicion = 0;

        switch (consumoW){
            case 'A':
                adicion += 100;
                break;
            case 'B':
                adicion += 80;
                break;
            case 'C':
                adicion += 60;
                break;
            case 'D':
                adicion += 50;
                break;
            case 'E':
                adicion += 30;
                break;
            case 'F':
                adicion += 10;
                break;
        }

        if (peso >= 0 && peso < 19){
            adicion += 10;
        } else if (peso >= 20 && peso < 49) {
            adicion += 50;
        } else if (peso >= 50 && peso < 79) {
            adicion += 80;
        } else if (peso >= 80) {
            adicion += 100;
        }

        return adicion;
    }

    public Integer getPeso() {
        return peso;
    }

    public char getConsumoW() {
        return consumoW;
    }

    public Double getPrecioBase() {
        return precioBase;
    }
}
