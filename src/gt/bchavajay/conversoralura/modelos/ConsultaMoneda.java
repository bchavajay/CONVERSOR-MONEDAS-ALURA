package gt.bchavajay.conversoralura.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda consultaMoneda(String baseCode, String targetCode, Double monto ){
        String apiKey = "d34e545074639f7fb3cf0530";
        String direccion = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+baseCode+"/"+targetCode+"/"+monto;
        Gson gson= new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            CambioMoneda cambioDivisa = gson.fromJson(json, CambioMoneda.class);
            Moneda monedaConvertida = new Moneda(cambioDivisa);
            return monedaConvertida;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}


