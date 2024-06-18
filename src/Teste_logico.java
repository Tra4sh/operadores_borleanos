import java.util.Scanner;

public class Teste_logico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Informe seu salário atual:");
        double salario = leitor.nextDouble();
        double novoSalario = 0.0;
        if (salario >= 1000) {
            System.out.println("Seu salario é maior que 1000!");
            System.out.println("Seu aumento será de 10%");
            novoSalario = salario * 1.1;
        } else {
            System.out.println("Seu salario é menor que 1000!");
            System.out.println("Seu aumento será de 20%");
            novoSalario = salario * 1.2;
        }
        System.out.printf("Seu novo salario será %s", novoSalario);
    }
}
