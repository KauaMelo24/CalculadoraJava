public class Calculadora {

    public double somar(double numero1, double numero2){

        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2){

        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2){

        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2){

        if (numero2 == 0){
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

    public double potencia(double numero1, double numero2){

        return Math.pow(numero1, numero2);
    }

    public double raizQuadrada(double numero1){

        return Math.sqrt(numero1);
    }

    public double restoDivisao(double numero1, double numero2){

        if (numero2 == 0){
            return 0;
        } else {
            return numero1 % numero2;
        }
    }
}
