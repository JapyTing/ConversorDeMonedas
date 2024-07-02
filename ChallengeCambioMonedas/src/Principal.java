import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = -1; // Inicialización de la variable opcion
        while (opcion != 12) {
            System.out.println("******************\n" +
                    "Bienvenido a esta aplicacion que te permitira convertir monedas a precio actual\n\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    "1.- Dollar a peso Argentino\n" +
                    "2.- Peso Argentino a Dollar\n" +
                    "3.- Dollar a peso Boliviano\n" +
                    "4.- Peso Boliviano a Dollar\n" +
                    "5.- Dollar a real Brasileño\n" +
                    "6.- Real Brasileño a Dollar\n" +
                    "7.- Dollar a peso Chileno\n" +
                    "8.- Peso Chileno a Dollar\n" +
                    "9.- Dollar a peso Colombiano\n" +
                    "10.- Peso Colombiano a Dollar\n" +
                    "11.- Cualquier moneda que desee a Dollar\n" +
                    "12.- Salir\n");
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion) {
                case 1:
                    CambiarMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    CambiarMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    CambiarMoneda.convertir("USD", "BOB", consulta, lectura);
                    break;
                case 4:
                    CambiarMoneda.convertir("BOB", "USD", consulta, lectura);
                    break;
                case 5:
                    CambiarMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 6:
                    CambiarMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 7:
                    CambiarMoneda.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 8:
                    CambiarMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 9:
                    CambiarMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 10:
                    CambiarMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 11:
                    CambiarMoneda.conertirOtraMoneda(consulta,lectura);
                    break;
                case 12:
                    System.out.println("*********\n" +
                            "Saliendo.........");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }
}
