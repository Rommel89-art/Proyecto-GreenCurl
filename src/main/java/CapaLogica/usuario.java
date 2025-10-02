package CapaLogica;

public abstract class usuario {
    protected String username;
    protected String password;

    public usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
  //Si utilizan los métodos getters y setters, no es necesario agregar constructores con la misma lógica, ya que sería redundancia de código.

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}


