import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {
    void cria(InputStream inputStream, String nomeDoArquivo) throws Exception {
        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para nova imagem (em memória)
        Graphics2D graphics2d = (Graphics2D) novaImagem.getGraphics();
        graphics2d.drawImage(imagemOriginal, 0, 0, null);

        // configurar o texto
        Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics2d.setColor(Color.YELLOW);
        graphics2d.setFont(fonte);

        // escrever uma frase na imagem
        graphics2d.drawString("TOPZERA", 100, novaAltura - 100);

        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));
    }
}
