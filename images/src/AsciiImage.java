import java.awt.*;

public class AsciiImage extends CustomImage{

    public AsciiImage(String fileName, int x, int y) {
        super(fileName, x, y);
    }

    public AsciiImage(Pixel[][] pixels, int x, int y) {
        super(pixels, x, y);
    }


    @Override
    public void draw(Graphics2D g2){
        Pixel[][] pixels = getPixels();
        int pixelSize = 5;
        g2.setFont(new Font("Roboto Monaco", Font.PLAIN, 8));
        String ascii = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'.";
        ascii = new StringBuilder(ascii).reverse().toString();
        for (int r = 0; r < pixels.length; r+=pixelSize) {
            for (int c = 0; c < pixels[0].length; c+=pixelSize) {
                Pixel p = pixels[r][c];
                double a = (p.getBlue() + p.getRed() + p.getGreen())/(3);
                int color = (int)(ascii.length()*a/255.0) -1;
                String string = ascii.substring(color, color + 1);
                System.out.println(string);
                g2.drawString(string, c, r);
            }
        }
    }
}