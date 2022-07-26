## Aula 4 - Criando nossa própria API com Spring

Criação de uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.

## Links citados

- Documentação do Spring Framework.
https://spring.io/

- Link para iniciar um projeto utilizando Spring.
https://start.spring.io/

- Link para download do Maven.
https://maven.apache.org/download.cgi

- Link para download do Postman.
https://www.postman.com/

- Página para fazer o registro e começar a utilizar o MongoDb Atlas.
https://www.mongodb.com/cloud/atlas/register

- GitHub com os logos das linguagens de programação.
https://github.com/abrahamcalf/programming-languages-logos

- Artigo sobre o pack de stickers da Alura para Whatsapp e Telegram.
https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram


## Desafios desta aula

- Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
- Devolver a listagem ordenada pelo ranking;
- Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
- Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
- Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.

## Material complementar

- Primeira aula do curso “Maven: gerenciamento de dependências e build de aplicações Java” da Alura.
https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java

- Alura+ “O que é REST?”.
https://www.youtube.com/watch?v=weQ8ssA6iBU&ab_channel=AluraCursosOnline

- Artigo da Alura “Conceito e fundamentos sobre REST”.
https://www.alura.com.br/artigos/rest-conceito-e-fundamentos

- Podcast Hipsters.Tech sobre MongoDB.
https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/

- Hipters.Tube “O que é SQL e NoSQL?”.
https://www.youtube.com/watch?v=aure5d3B88g&ab_channel=AluraCursosOnline

- Artigo da Alura “Spring: Conheça esse framework Java”.
https://www.alura.com.br/artigos/spring-conheca-esse-framework-java

- Alura+ Introdução ao Postman”.
https://www.youtube.com/watch?v=op81bMbgZXs&ab_channel=AluraCursosOnline

## API da NASA 🌌

Caso a API da NASA fique instável, use as seguintes URLs, que terão os mesmos dados usados na aula:

- (https://api.mocki.io/v2/549a5d8b/NASA-APOD)
- (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json)

Além disso, deixamos uma URLs com imagens fantásticas do James Webb Space Telescope, como o primeiro deep field desse fantástico telescópio! TOPZERA! 🌠 ☄️ 🚀 🛰️ 🔭 🌌

- (https://api.mocki.io/v2/549a5d8b/NASA-APOD-JamesWebbSpaceTelescope)
- (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD-JamesWebbSpaceTelescope.json)