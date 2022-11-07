package enemigo;

import java.util.LinkedList;

public class Armada {
    private LinkedList<Tanque> tanques;

    public Armada() {
        this.tanques = new LinkedList<Tanque>();
    }

    public void agregarTanque(Tanque t){
        this.tanques.add(t);
    }
    /**
     * 
     * @param nombre
     * @return 
     * Busca la cantidad de movimientos por taque.
     */
    public int buscarCantidadMovimiento(String nombre){
        for(Tanque t : this.tanques)
            if (t.getNombre().equals(nombre)){
                return t.getCantidadMovimiento();
            }
        return 0;
    }
    /**
     * 
     * @param tipo
     * @return 
     * Busca el nombre de los tanques 
     */
    public String buscarNombre(String tipo){
        for(Tanque t : this.tanques)
            if (t.getTipo().equals(tipo)){
                return t.getNombre();
            }
        return null;
    }
}
