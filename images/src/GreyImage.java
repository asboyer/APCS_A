public class GreyImage extends CustomImage{

    public GreyImage(String fileName, int x, int y) {
        super(fileName, x, y);
    }

    public GreyImage(Pixel[][] pixels, int x, int y) {
        super(pixels, x, y);
    }


    @Override
    public void processImage(){
        Pixel[][] pixels = getPixels();
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                Pixel p = pixels[r][c];
                int a = (p.getBlue() + p.getRed() + p.getGreen())/3;
                p.setGreen(a);
                p.setRed(a);
                p.setBlue(a);
            }
        }
        setImage(pixels);
    }
}
