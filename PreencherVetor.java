  import java.util.Scanner;

public class PrencherVetor {
    public static void main(String[] args) {
        int[] vet = {0,0,0,0,0,0,0,0,0,0};
        int o, n, i, j, aux;
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("""
                    \nDigite 0 para Encerrar o programa.
                    Digite 1 para Adicionar um numero ao vetor.
                    Digite 2 para Remover um numero do vetor.
                    Digite 3 para Ordenar o vetor.
                    """);
            System.out.println("Vetor: ");
            for(i=0; i<10; i++)
                System.out.printf("[%d] -> %d\n", i, vet[i]);

            System.out.print("\nDigite sua opcao: ");
            o = s.nextInt();

            if (o == 0) {
                for(i=0; i<10; i++)
                    System.out.print("[" + vet[i] + "] ");
                System.out.println("\n");
            }

            else if(o == 1){
                System.out.print("Numero: ");
                n = s.nextInt();

                System.out.print("Posicao: ");
                i = s.nextInt();
                vet[i] = n;
            }

            else if(o == 2){
                System.out.print("Remover o numero da posicao: ");
                i = s.nextInt();
                vet[i] = 0;
            }
            else if(o ==3){
                for(i = 0; i<10; i++){
                    for(j =i+1; j<10; j++) {
                        aux = vet[i];
                        vet[i] = vet[j];
                        vet[j] = aux;
                    }
                }
                for(i=0; i<10; i++)
                    System.out.print("[" + vet[i] + "] ");
            }
            if(o != 0 && o!= 1 && o!= 2 && o!= 3)
            {
                System.out.println("Opcao invalida!");
            }
        }while(o != 0);
    }
}
