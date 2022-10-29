package enemigo;

import java.util.LinkedList;

public class Armada {
    private LinkedList<Tanque> contactos;

    public Armada() {
        this.contactos = new LinkedList<Tanque>();
    }

    public void agregarTanque(Tanque t){
        this.contactos.add(t);
    }
    
    public int buscarCantidadMovimiento(String nombre){
        for(Tanque t : this.contactos)
            if (t.getNombre().equals(nombre)){
                return t.getCantidadMovimiento();
            }
        return 0;
    }
    
    public String buscarNombre(String tipo){
        for(Tanque t : this.contactos)
            if (t.getTipo().equals(tipo)){
                return t.getNombre();
            }
        return null;
    }
}
