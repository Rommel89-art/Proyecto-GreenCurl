package CapaLogica;

import java.util.ArrayList;
import java.util.List;

public class docente extends usuario {
    private String nombre;
    private int id;
    private List<licencia> licencias;

    public docente(String username, String password, String nombre, int id) {
        super(username, password);
        this.nombre = nombre;
        this.id = id;
        this.licencias = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }

    public void agregarLicencia(licencia l) {
        licencias.add(l);
    }

    public List<licencia> getLicencias() {
        return licencias;
    }
}
