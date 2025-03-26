import java.util.Scanner;

public class Contador {
    public static void main(String []Args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro:");
        int paramentroDois = terminal.nextInt();

        try {
            contar(parametroUm, paramentroDois);
        }catch (ParamentrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int parametroUm,int paramentroDois) throws ParamentrosInvalidosException{
        if(paramentroDois<parametroUm){
            throw new ParamentrosInvalidosException("O segundo paramentro deve ser maior que o primeiro");
        }

        int contagem = paramentroDois-parametroUm;
        for(int i=1;i<contagem;i++){
            System.out.println("Imprimindo o numero: "+ i);
        }
    }
}
