package CapaLogica;

public class alumno extends usuario {
    private String nombre;
    private int id;

    public alumno(String username, String password, String nombre, int id) {
        super(username, password);
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
}

