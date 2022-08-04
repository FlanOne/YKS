public class Ataque {

    private int id;
    private String nombre;
    private int damage;
    private int curacion;

    Ataque(int id, String nombre, int damage, int curacion) {
        this.id = id;
        this.nombre = nombre;
        this.damage = damage;
        this.curacion = curacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDamage() {
        return damage;

    }
    
    public int getCuracion() {
        return curacion;
    }
    
}
