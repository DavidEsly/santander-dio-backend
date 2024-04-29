import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = sc.nextInt();
        sc.close();

        try {
            counter(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void counter(int parm1, int param2) throws ParametrosInvalidosException{
       if(parm1 > param2){
        throw new ParametrosInvalidosException("Número inicial maior que o final!");
       }else {
        int contador = param2 - parm1;
        for(int i = 1; i <= contador; i++){
            System.out.println(i);
        }
       }

    }
}
