public class Tiempo {
     int horas;
     int minutos;
     int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Tiempo suma(Tiempo t2) {
        int segundosTotales = this.horas * 3600 + this.minutos * 60 + this.segundos +
                t2.horas * 3600 + t2.minutos * 60 + t2.segundos;
        return new Tiempo(segundosTotales / 3600, (segundosTotales % 3600) / 60, segundosTotales % 60);
    }

    public Tiempo resta(Tiempo t2) {
        int segundosTotales = (this.horas * 3600 + this.minutos * 60 + this.segundos) -
                (t2.horas * 3600 + t2.minutos * 60 + t2.segundos);
        return new Tiempo(segundosTotales / 3600, (segundosTotales % 3600) / 60, segundosTotales % 60);
    }

    public Tiempo minutosAhora(int minutos) {
        return new Tiempo(minutos / 60, minutos % 60, 0);
    }

    public String toString() {
        return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
    }
}
