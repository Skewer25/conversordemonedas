import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Conversion realizarConversion(String monedaBase, String monedaObjetivo,double cantidadAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/90be24d9d40b72793e204472/pair/" + monedaBase +
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
