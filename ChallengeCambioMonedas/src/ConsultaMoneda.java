import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Consulta moneda es donde ira la conexion a la api
public class ConsultaMoneda {
    public RecordMoneda buscarMoneda (String monedaBase, String monedaAConvertir){
        //Creando URI
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f5465f6ddc978e9a73c20e1e/pair/"+monedaBase+"/"+monedaAConvertir);

        //Instanciando el Cliente
        HttpClient cliente = HttpClient.newHttpClient();
        //Instanciando el Request y construyendolo con nuestra URI "direccion"
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        //Manejando excepciones del tipo response donnde nos debe mandar la informacion de la API para grabarse en RecordMoneda
        //Esto busca y graba la moneda que se desea cambiar
        try {
            HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), RecordMoneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontramos la Moneda");
        }



    }
}
