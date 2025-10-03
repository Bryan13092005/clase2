import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        String usuario="user123", clave="Poli123";
        System.out.print("Ingrese un el usuario: ");
        String user=datos.nextLine();
        System.out.print("Ingrese la clave: ");
        String pass=datos.nextLine();
        if(user.equals(usuario) && clave.equals(pass)){//solo en strings
            System.out.println("INGRESO EXITOSO. BIENVENIDO");
        } else{
            System.out.println("Acceso denegado");
        }

        System.out.print("Ingrese un numero: ");
        int num1=datos.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2=datos.nextInt();
        System.out.println(num1==num2);//solo en números


    }
}