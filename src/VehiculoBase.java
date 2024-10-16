
abstract class VehiculoBase {

    private String marca;
    private String modelo;

    public VehiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    public void mostrarInfo() {

    }
}
