import java.util.Scanner;

public class Main {

    public static void mostrarMenu() {
        System.out.println("[1] - Somar");
        System.out.println("[2] - Subtrair");
        System.out.println("[3] - Multiplicar");
        System.out.println("[4] - Dividir");
        System.out.println("[5] - Potência");
        System.out.println("[6] - Raiz Quadrada");
        System.out.println("[7] - Resto da Divisão");
        System.out.println("[8] - Sair");
    }

    public static double lerNumeros(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    public static void mostrarResultado(double resultado, String historico){
        System.out.printf("Resultado: %.2f%n", resultado);
        System.out.println("Última operação: " + historico);
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("========================");
        System.out.println("      CALCULADORA ");
        System.out.println("========================");

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        String historico = "Nenhuma operação realizada";

        while (opcao != 8) {

            System.out.println();
            System.out.println("Última operação: " + historico);
            System.out.println();

            mostrarMenu();

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            double primeiroNumero;
            double segundoNumero;
            double resultado;

            switch (opcao) {
                case 1:
                    primeiroNumero = lerNumeros(scanner, "Digite o primeiro número:");
                    segundoNumero = lerNumeros(scanner, "Digite o segundo número:");
                    resultado = primeiroNumero + segundoNumero ;
                    historico = primeiroNumero + " + " + segundoNumero + " = " + resultado;

                    mostrarResultado(resultado, historico);
                    break;


                case 2:
                    primeiroNumero = lerNumeros(scanner, "Digite o primeiro número:");
                    segundoNumero = lerNumeros(scanner,"Digite o segundo número:");
                    resultado = primeiroNumero - segundoNumero;
                    historico = primeiroNumero + " - " + segundoNumero + " = " + resultado;

                    mostrarResultado(resultado, historico);
                    break;

                case 3:
                    primeiroNumero = lerNumeros(scanner, "Digite o primeiro número:");
                    segundoNumero = lerNumeros(scanner, "Digite o segundo número:");
                    resultado = primeiroNumero * segundoNumero;
                    historico = primeiroNumero + " * " + segundoNumero + " = " + resultado;

                    mostrarResultado(resultado, historico);
                    break;

                case 4:
                    primeiroNumero = lerNumeros(scanner, "Digite o primeiro número:");
                    segundoNumero = lerNumeros(scanner, "Digite o segundo número:");
                    if (segundoNumero == 0) {
                        System.out.println("Não é possível fazer divisão por 0!");
                    } else {
                        resultado = primeiroNumero / segundoNumero;
                        historico = primeiroNumero + " / " + segundoNumero + " = " + resultado;

                        mostrarResultado(resultado, historico);
                    }
                    break;

                case 5:
                    primeiroNumero = lerNumeros(scanner, "Digite a base:");
                    segundoNumero = lerNumeros(scanner, "Digite o expoente:");
                    resultado = Math.pow(primeiroNumero, segundoNumero);
                    historico = primeiroNumero + " ^ " + segundoNumero + " = " + resultado;

                    mostrarResultado(resultado, historico);

                    break;

                case 6:
                    primeiroNumero = lerNumeros(scanner, "Digite um número:");
                    if (primeiroNumero < 0) {
                        System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
                    } else {
                        resultado = Math.sqrt(primeiroNumero);
                        historico = "√" + primeiroNumero + " = " + resultado;

                        mostrarResultado(resultado, historico);
                    }
                    break;

                case 7:
                    primeiroNumero = lerNumeros(scanner, "Digite o primeiro número:");
                    segundoNumero = lerNumeros(scanner, "Digite o segundo número:");
                    if (segundoNumero == 0) {
                        System.out.println("Não é possível calcular o resto da divisão por 0!");
                    } else {
                        resultado = primeiroNumero % segundoNumero;
                        historico = primeiroNumero + " % " + segundoNumero + " = " + resultado;

                        mostrarResultado(resultado, historico);
                    }
                    break;


                case 8:
                    System.out.println("Obrigado por utilizar a Calculadora!");
                    break;

                default:
                    System.out.println("Opção inválida!!");


            }
        }
        scanner.close();
    }
}