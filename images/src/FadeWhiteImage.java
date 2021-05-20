public class FadeWhiteImage extends CustomImage{

    public FadeWhiteImage(String fileName, int x, int y) {
        super(fileName, x, y);
    }

    public FadeWhiteImage(Pixel[][] pixels, int x, int y) {
        super(pixels, x, y);
    }


    @Override
    public void processImage(){
        Pixel[][] pixels = getPixels();
        int centerX = pixels.length/2;
        int centerY = pixels[0].length/2;

        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {

                    Pixel p = pixels[r][c];

                    double d = Math.sqrt((r - centerX)*(r-centerX) + (c - centerY)*(c - centerY));
                    int alpha = 255-(int)((d/pixels.length*255));

                    p.setAlpha(alpha);

            }
        }
        setImage(pixels);
    }
}
