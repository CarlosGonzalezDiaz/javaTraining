package domain;

public class Persona {
    int id;
    String usuario;
    String pass;

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public String getUsuario()
    {
        return this.usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getPass()
    {
        return this.pass;
    }

    public void setPass(String pass)
    {
        this.pass = pass;
    }

    public Persona(){}

    public Persona(int id, String usuario, String pass)
    {
        this.id = id;
        this.usuario = usuario;
        this.pass = pass;
    }

    public Persona(String usuario, String pass)
    {
        this.usuario = usuario;
        this.pass = pass;
    }

    public Persona(int id)
    {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("id=").append(id);
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", password='").append(pass).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
