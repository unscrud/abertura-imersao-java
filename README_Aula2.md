## Aula 1 da Imesão Alura

Criação de um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!

## API do IMDB instável

Seguem aqui também APIs alternativas!

Como a API do IMDB está muito instável, vamos deixar algumas alternativas de API com um conteúdo semelhante para vocês:

- (https://api.mocki.io/v2/549a5d8b/Top250Movies)
- (https://api.mocki.io/v2/549a5d8b/MostPopularMovies)
- (https://api.mocki.io/v2/549a5d8b/MostPopularTVs)
- (https://api.mocki.io/v2/549a5d8b/Top250TVs)

Segue também uma solução inspirada na que foi criada ontem pelo instrutor Alex Felipe:

- (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json)
- (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/MostPopularMovies.json)
- (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/MostPopularTVs.json)
- (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopTVs.json)

Para utilizar os endereços alternativos, troque a URL da aula pelas novas URLs.
## Links citados

- Documentação do pacote javax.imageio, que trata de leitura e escrita de imagens.
https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html

- Documentação da classe BufferedImage, que representa uma imagem no Java
https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html

- Documentação da classe Graphics2D, a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.
https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html

- Documentação da abstração InputStream, que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html

## Desafios desta aula

- Ler a documentação da classe abstrata InputStream.
- Centralizar o texto na figurinha.
- Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
- Criar diretório de saída das imagens, se ainda não existir.
- Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
- Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
- Colocar contorno (outline) no texto da imagem.
- Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
- Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
- Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la. (https://github.com/opencv-java)

## Material complementar

- Primeira aula do curso “Java Polimorfismo: entenda herança e interfaces” da Alura.
https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo

- Apêndice da apostila “Java e Orientação a Objetos” da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream.
https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io