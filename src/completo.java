import java.util.Scanner;
public class completo {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        while (true) {
            System.out.print("1. MULTIPLICAR\n2.Validación usuraio\n3.Validación de altura y edad\n4. Salir\nIngrese una opción:");
            int opcion = datos.nextInt();
            datos.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el multiplicando: ");
                    int multiplicando = datos.nextInt();
                    System.out.println("TABLA DE MULTIPLICAR DEL " + multiplicando);
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(multiplicando + " x " + i + " = " + (multiplicando * i));
                    }
                    datos.nextLine();
                    break;
                case 2:
                    String usuario = "user123", clave = "Poli123";
                    String user, pass;
                    do {
                        System.out.print("Ingrese un el usuario: ");
                        user = datos.nextLine();
                        System.out.print("Ingrese la clave: ");
                        pass = datos.nextLine();
                        if (user.equals(usuario) && clave.equals(pass)) {//solo en strings
                            System.out.println("INGRESO EXITOSO. BIENVENIDO");
                        }else{
                            System.out.println("INCORRECTO");
                        }
                    } while (user.equals(usuario) == false || clave.equals(pass) == false);
                    break;
                case 3:
                    System.out.print("Ingrese la altura: ");
                    int altura = datos.nextInt();
                    datos.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = datos.nextInt();
                    datos.nextLine();
                    if (altura < 1.6 || edad < 18) {
                        System.out.println("ACCESO DENEGADO, ALTURA MINIMA 1,60 Y EDAD 18 AÑOS");
                    }
                    System.out.print("BIENVENIDO");
                    break;
                case 4:
                    System.out.print("SALIENDO");
                    return;
            }
        }
    }
}
