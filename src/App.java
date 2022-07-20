import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // acessar url da API
        // var url = "https://imdb-api.com/en/API/Top250Movies/chaveDaAPI";
        var url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI uri = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).build();

        // pegar o JSON
        String json = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        // extrair so os dados que interessam
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(json);

        // exibir e manipular os dados
        for (Map<String, String> filme : listaDeFilmes) {
            System.out.println(filme.get("title"));
        }
    }
}
