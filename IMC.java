import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);  
        System.out.printf("Seu IMC é: \n", imc);

        if (imc < 18.5) {
            System.out.println("Voce esta abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Voce esta com peso normal");
        } else if (imc < 30) {
            System.out.println("Voce esta com sobrepeso");
        } else {
            System.out.println("Voce esta com obesidade");
        }

        sc.close();
    }
}