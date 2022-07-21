import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // acessar url da API
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
        GeradorDeFigurinhas gerador = new GeradorDeFigurinhas();
        for (int i = 0; i < 10; i++) {
            Map<String, String> filme = listaDeFilmes.get(i);
            String urlImagem = filme.get("image");
            String titulo = filme.get("title");
            InputStream inputStream = new URL(urlImagem).openStream();
            String tituloSimples = titulo.replaceAll("[^a-zZ-Z1-9]", "");
            if (tituloSimples.isEmpty()) {
                tituloSimples = String.valueOf(Calendar.getInstance().getTimeInMillis());
            }
            String nomeDoArquivo = tituloSimples + ".png";
            gerador.cria(inputStream, nomeDoArquivo);

            System.out.println(tituloSimples);
        }
    }
}
