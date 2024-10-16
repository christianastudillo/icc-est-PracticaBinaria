public class Persona{
    String nombre;
    int edaad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdaad() {
        return edaad;
    }
    public void setEdaad(int edaad) {
        this.edaad = edaad;
    }
    public Persona(String nombre, int edaad) {
        this.nombre = nombre;
        this.edaad = edaad;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edaad=" + edaad + "]";
    }
    
}