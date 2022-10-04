import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.print("Menu de opcoes:\n");
        System.out.println("\t+ para somar\n\t- para subtrair\n\t* para multiplicar\n\t/ para dividir.\n");

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o primero numero: ");
        float a = numero.nextFloat();
        char o;
        do {
            Scanner opcao = new Scanner(System.in);
            System.out.print("Digite a opcao: ");
            o = opcao.next().charAt(0);
            if(o != '+' && o != '-' && o != '*' && o != '/')
                System.out.println("Opcao Invalida!");

        }while(o != '+' && o != '-' && o != '*' && o != '/');

        System.out.print("Digite o segundo numero: ");
        float b = numero.nextFloat();

        float c;

        if (o == '+') 
            c = a + b;
        
        else if(o == '-') 
            c = a - b;
        
        else if(o == '*') 
            c = a * b;
        
        else 
            c = a / b;
        
        System.out.printf("%.2f %c %.2f = %.2f", a, o, b, c);
    }
}
