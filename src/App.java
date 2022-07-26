import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ExtratorDeConteudo extrator;

        // acessar url da API
        // var url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        // extrator = new ExtratorDeConteudoDoIMDB();
        var url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        extrator = new ExtratorDeConteudoDaNasa();
        
        // pegar o JSON
        String json = ClienteHttp.buscaDados(url);

        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extrair(json);
        var gerador = new GeradorDeFigurinhas();

        for (int i = 0; i < 3; i++) {
            var conteudo = conteudos.get(i);
            
            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String tituloSimples = conteudo.getTitulo()
                    .replaceAll("[^a-zZ-Z1-9]", "");

            if (tituloSimples.isEmpty()) {
                tituloSimples = String.valueOf(Calendar.getInstance().getTimeInMillis());
            }

            String nomeDoArquivo = tituloSimples + ".png";
            gerador.cria(inputStream, nomeDoArquivo);

            System.out.println(conteudo.getTitulo());
        }
    }
}
