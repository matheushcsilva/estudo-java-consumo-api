package exercicios.parte3.modelos;

public class Divisao {
    private int num1;
    private int num2;

    public Divisao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void divide() {
        double resultado = 0;
        try {
            resultado = num1 / num2;
            System.out.println(STR."O resultado é: \{resultado}");
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não permitida");
        }
    }
}
