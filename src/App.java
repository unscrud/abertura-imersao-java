import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // acessar url da API
        // var url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        var url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";

        // pegar o JSON
        String json = ClienteHttp.buscaDados(url);

        // extrair so os dados que interessam
        List<Map<String, String>> listaDeConteudos = JsonParser.parse(json);

        // exibir e manipular os dados
        GeradorDeFigurinhas gerador = new GeradorDeFigurinhas();
        for (int i = 0; i < 10; i++) {
            Map<String, String> conteudo = listaDeConteudos.get(i);
            String urlImagem =
                    // filme.get("image")
                    conteudo.get("url")
                            .replaceAll("(@+)(.*).jpg$", "$1.jpg");
            String titulo = conteudo.get("title");
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
