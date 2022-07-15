import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws Exception {
        // acessar url da API
        var url = "https://imdb-api.com/en/API/Top250Movies/chaveDaAPI";
        URI uri = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).build();

        // pegar o JSON
        String json = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        // imprimir o JSON
        System.out.println(json);
    }
}
