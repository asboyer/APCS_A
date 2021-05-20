public class NegativeImage extends CustomImage{

    public NegativeImage(String fileName, int x, int y) {
        super(fileName, x, y);
    }

    public NegativeImage(Pixel[][] pixels, int x, int y) {
        super(pixels, x, y);
    }


    @Override
    public void processImage(){
        Pixel[][] pixels = getPixels();
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                Pixel p = pixels[r][c];
                p.setGreen(255 - p.getGreen());
                p.setRed(255 - p.getRed());
                p.setBlue(255 - p.getBlue());
            }
        }
        setImage(pixels);
    }
}
