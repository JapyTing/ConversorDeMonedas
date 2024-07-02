import java.util.Scanner;

public class CambiarMoneda {
    public static void convertir(String monedaBase, String monedaAConvertir, ConsultaMoneda consulta, Scanner lectura){
        double cantidadAConvertir;
        double cantidadConvertida;

        RecordMoneda monedaRecord = consulta.buscarMoneda(monedaBase, monedaAConvertir);
        System.out.println("El cambio de moneda para hoy \n1 "+monedaBase+" = "+monedaRecord.conversion_rate()+" "+monedaAConvertir);
        System.out.println("Ingrese la cantidad de " +  monedaBase);
        cantidadAConvertir = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidadAConvertir * monedaRecord.conversion_rate();
        System.out.println(cantidadAConvertir + " " + monedaBase + " = " + cantidadConvertida + " " + monedaRecord.target_code());
    }

    public static void conertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el codgio de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetiva: ");
        String monedaObjetiva = lectura.nextLine().toUpperCase();
        convertir(monedaBase,monedaObjetiva,consulta,lectura);
    }
}
