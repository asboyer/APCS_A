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
        int pixelSize = 2;
        g2.setFont(new Font("Roboto Monaco", Font.PLAIN, 4));
//        g2.setFont(new Font("Monospace", Font.PLAIN, 6));
        String ascii = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'.";
//        ascii = new StringBuilder(ascii).reverse().toString();
        for (int r = 0; r < pixels.length; r+=pixelSize) {
            for (int c = 0; c < pixels[0].length; c+=pixelSize) {
                Pixel p = pixels[r][c];
                double a = (p.getBlue() + p.getRed() + p.getGreen())/(3);
                int color = (int)(ascii.length()*a/255.0) - 1;
                String string;
                if(color < 0){
                    string = ascii.substring(0, 1);
                }
                else {
//                    System.out.println(color + " | " + ascii.length());
                    string = ascii.substring(color, color + 1);
                }

                g2.drawString(string, c, r);
            }
        }
    }
}