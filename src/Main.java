import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================");
        System.out.println("      CALCULADORA ");
        System.out.println("========================");

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("[1] - Somar");
            System.out.println("[2] - Subtrair");
            System.out.println("[3] - Multiplicar");
            System.out.println("[4] - Dividir");
            System.out.println("[5] - Potência");
            System.out.println("[6] - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            double primeiroNumero;
            double segundoNumero;
            double resultado;

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    segundoNumero = scanner.nextDouble();
                    resultado = primeiroNumero + segundoNumero;
                    System.out.printf("Resultado: %.2f%n", resultado);
                    break;


                case 2:
                    System.out.println("Digite o primeiro número:");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    segundoNumero = scanner.nextDouble();
                    resultado = primeiroNumero - segundoNumero;
                    System.out.printf("Resultado: %.2f%n", resultado);
                    break;

                case 3:
                    System.out.println("Digite o primeiro número:");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    segundoNumero = scanner.nextDouble();
                    resultado = primeiroNumero * segundoNumero;
                    System.out.printf("Resultado: %.2f%n", resultado);
                    break;

                case 4:
                    System.out.println("Digite o primeiro número:");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    segundoNumero = scanner.nextDouble();
                    if (segundoNumero == 0) {
                        System.out.println("Não é possível fazer divisão por 0!");
                    }else {
                        resultado = primeiroNumero / segundoNumero;
                        System.out.printf("Resultado: %.2f%n", resultado);
                    }
                    break;

                case 5:
                    System.out.println("Digite a base:");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite o expoente:");
                    segundoNumero = scanner.nextDouble();
                    resultado = Math.pow(primeiroNumero, segundoNumero);
                    System.out.printf("Resultado: %.2f%n", resultado);

                    break;


                case 6:
                    System.out.println("Obrigado por utilizar a Calculadora!");
                    break;

                default:
                    System.out.println("Opção inválida!!");


            }
        }
        scanner.close();
    }
}