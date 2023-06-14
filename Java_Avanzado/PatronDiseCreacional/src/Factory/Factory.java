package Factory;

public class Factory {
    private  Precio precio;

    private Factory() {};
    public Factory(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            this.precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("USA")) {
            this.precio = new PrecioUSD();
        } else if (pais.equalsIgnoreCase("UK")) {
            this.precio = new PrecioGBP();
        }
    }
    public double getPrecio() {
        return precio.getPrecio();
    }

}
