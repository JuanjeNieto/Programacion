public class Disco {
    String codigo = " ";
    String titulo = " ";
    String autor = " ";
    String genero = " ";
    int tiempo = 0;


    public Disco(String codigo, String titulo, String autor, String genero, int tiempo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.tiempo = tiempo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "codigo= '" + codigo + '\'' +
                ", titulo= '" + titulo + '\'' +
                ", autor= '" + autor + '\'' +
                ", genero= '" + genero + '\'' +
                ", tiempo= " + tiempo + " min" +
                '}';
    }
}
