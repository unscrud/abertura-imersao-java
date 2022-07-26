import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDaNasa implements ExtratorDeConteudo {

  @Override
  public List<Conteudo> extrair(String json) {
    List<Map<String, String>> listaDeAtributos = JsonParser.parse(json);
    List<Conteudo> conteudos = new ArrayList<>();

    // popular a lista de atributos
    for (Map<String, String> atributos : listaDeAtributos) {
      String titulo = atributos.get("title");
      String urlImagem = atributos.get("url");
      conteudos.add(new Conteudo(titulo, urlImagem));
    }
    return conteudos;
  }

}
