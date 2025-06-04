public class Imc {
    public static void main(String[] args) {
        double peso = 70;
        double altura = 1.75;
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }
}