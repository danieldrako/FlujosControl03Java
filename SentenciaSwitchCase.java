import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        byte num = 1;
        switch(num){
            case 0:
                System.out.println("El numero Cero");
                break;
            case 1:
                System.out.println("El numero uno");
                break;
            case 2:
                System.out.println("El numero dos");
                break;
            case 3:
                System.out.println("El numero tres");
                break;
            default:
                System.out.println(" Desconocuido");

        }
        String nombre = "Daniel";

        switch(nombre){
            case "admin":
                System.out.println("Hola admin");
                break;
            case "Daniel":
                System.out.println("Hola Daniel");
                break;
            default:
                System.out.println("Usuario Desconocido");
                System.out.println("Usuario Desconocido");

        }

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes de 1 a 12");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            default:
                nombreMes = "Indefinido";
                break;
        }

        System.out.println("nombre del mes: " + nombreMes);
    }
}
