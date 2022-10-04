import java.util.Scanner;

public class ContadorComFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o numero de inicio do contador: ");
        int n1 = s.nextInt();

        System.out.print("Digite o numero de fim do contador: ");
        int n2 = s.nextInt();

        System.out.print("Digite o passo contador: ");
        int p = s.nextInt();

        for(int i = n1; n1<=n2; n1+=p){
            System.out.println(n1);
        }
    }
}
