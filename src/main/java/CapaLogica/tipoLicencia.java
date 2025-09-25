package CapaLogica;

public class tipoLicencia {
    private String nombre;
    private String descripcion;

    public tipoLicencia(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return nombre + " - " + descripcion;
    }

    // Método para precargar algunos tipos
    public static tipoLicencia[] tiposPorDefecto() {
        return new tipoLicencia[] {
            new tipoLicencia("Médica", "Ausencia por enfermedad"),
            new tipoLicencia("Personal", "Ausencia por motivos personales"),
            new tipoLicencia("Maternidad/Paternidad", "Ausencia por nacimiento o cuidado de hijos")
        };
    }
}

