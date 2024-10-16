class Coche extends VehiculoBase implements Vehiculo {

    private int velocidad;

    public Coche(String marca, String modelo) {
        super(marca, modelo);
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        velocidad -= 10;
        if (velocidad < 0) velocidad = 0; // Evitar velocidad negativa
        System.out.println("El coche ha frenado. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche: " + getMarca() + " " + getModelo());
    }
}