import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um numero para saber seu fatorial: ");
        int n = numero.nextInt();
        int i = 2;
        int fat = 1;
        int j = n;
        while( i <=n ){
            fat = fat * i;
            i++;
        }
        if(n == 0 || n == 1){
            System.out.printf("Fatorial de %d = %d", n, fat);
        }
        else{
            while (j != 1) {
                System.out.printf("%d x ", j);
                j--;
            }
            System.out.printf("1 = %d", fat);
        }
    }
}
