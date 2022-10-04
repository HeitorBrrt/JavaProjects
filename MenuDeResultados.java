import java.util.Scanner;

public class MenuDeResultados {
    public static void main(String[] args) {
        System.out.println("Digite 0 para finalizar o programa.\n");
        int contador = 0;
        int pares = 0;
        int impares = 0;
        int acima = 0;
        float media;
        int soma = 0;
        int numero;
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            numero = s.nextInt();
            contador++;
            if(numero %2 == 0)
                pares ++;
            else
                impares ++;

            if(numero>100)
                acima++;
            if(numero > 0)
                soma += numero;
        }while (numero !=0);
        if(soma > 0) {
            media = soma / (contador - 1);
            System.out.println("\nResultado: \n_____________\n");
            System.out.printf("Quantidade de numeros digitados: %d\n", contador - 1);
            System.out.printf("Quantidade de numeros pares digitados: %d\n", pares - 1);
            System.out.printf("Quantidade de numeros impares digitados: %d\n", impares);
            System.out.printf("Quantidade de numero digitados acima de 100: %d\n", acima);
            System.out.printf("A media desses numeros eh de: %.2f", media);
        }
        else{
            System.out.println("Programa Finalizado");
        }
    }
}
