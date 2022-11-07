package enemigo;

public class Tanque {
    private String tipo;
    private String nombre;
    private int cantidadMovimiento;
    
    /**
     * 
     * @param tipo
     * @param nombre
     * @param cantidadMovimiento 
     */
    public Tanque(String tipo, String nombre, int cantidadMovimiento) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidadMovimiento = cantidadMovimiento;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getCantidadMovimiento() {
        return cantidadMovimiento;
    }
}
