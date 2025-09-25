package CapaLogica;

public class administrador extends usuario {
    private String nombre;
    private int id;

    public administrador(String username, String password, String nombre, int id) {
        super(username, password);
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
}

