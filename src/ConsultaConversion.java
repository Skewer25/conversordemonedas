import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    private final String API_KEY = System.getenv("ER_APIKEY");

    public Conversion realizarConversion(String monedaBase, String monedaObjetivo,double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+API_KEY+"/pair/" + monedaBase +
                "/" + monedaObjetivo + "/" + cantidadAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversion. Por favor, " +
                    "verifica los datos");
        }
    }
}
