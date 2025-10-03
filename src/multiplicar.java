import java.util.Scanner;
public class multiplicar {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.print("Ingrese el multiplicando: ");
        int multiplicando=datos.nextInt();
        datos.nextLine();
        System.out.println("TABLA DE MULTIPLICAR DEL "+multiplicando);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(multiplicando+" x "+i+" = "+(multiplicando*i));
        }
    }
}
