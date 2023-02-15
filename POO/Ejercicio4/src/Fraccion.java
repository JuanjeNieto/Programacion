public class Fraccion {

    int numerador;
    int denominador;


    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion multiplicar(Fraccion fraccion){
        int numMulti = this.numerador * fraccion.numerador;
        int denoMulti = this.denominador * fraccion.denominador;

        return new Fraccion(numMulti, denoMulti);
    }

    public Fraccion invertir(){
        int numInvert = this.denominador;
        int denoInvert = this.numerador;
        return new Fraccion(numInvert, denoInvert);
    }

    public Fraccion simplificar(){
        int numSimp = this.numerador;
        int denoSimp = this.denominador;

        if ((numSimp % 2 == 0) && (denoSimp%2 == 0)) {
            while((numSimp % 2 == 0) && (denoSimp%2 == 0)){
                numSimp /= 2;
                denoSimp /= 2;
            }
        } else if ((numSimp % 3 == 0) && (denoSimp%3 == 0)) {
            while((numSimp % 3 == 0) && (denoSimp%3 == 0)){
                numSimp /= 3;
                denoSimp /= 3;
            }
        }else if ((numSimp % 5 == 0) && (denoSimp%5 == 0)) {
            while((numSimp % 5 == 0) && (denoSimp%5 == 0)){
                numSimp /= 5;
                denoSimp /= 5;
            }
        }

        return new Fraccion(numSimp, denoSimp);
    }

    public Fraccion dividir(Fraccion fraccion){
        int numDiv = this.numerador * fraccion.denominador;
        int denoDiv = this.denominador * fraccion.numerador;

        return new Fraccion(numDiv, denoDiv);
    }

    @Override
    public String toString() {
        return  "{" + numerador +
                "/" + denominador +
                '}';
    }
}
