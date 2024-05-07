package Application;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
         System.out.println("Digite o primeiro parametro");
        int paramentroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt();

        try {
            contar(paramentroUm,parametroDois);
        } catch (Exception e) {
           System.out.println("O segundo parametro de ser maior que o primeiro");
        }
    }
    static void contar(int paramentroUm,int parametroDois) throws ParametrosInvalidosException{
        if (paramentroUm > parametroDois){
            int contagem = parametroDois - paramentroUm;
            for(int i = paramentroUm; i <= paramentroUm;i++){
                System.out.println(i);
            }
        }
    }
}
