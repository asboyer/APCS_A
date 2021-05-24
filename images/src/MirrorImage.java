public class MirrorImage extends CustomImage{

    public MirrorImage(String fileName, int x, int y) {
        super(fileName, x, y);
    }

    public MirrorImage(Pixel[][] pixels, int x, int y) {
        super(pixels, x, y);
    }


    @Override
    public void processImage(){
        Pixel[][] pixels = getPixels();
        int centerX = pixels.length/2;
        int counter = 0;
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length/2; c++) {
                pixels[r][c] = pixels[r][pixels[0].length - c - 1];
            }
        }
        setImage(pixels);
    }
}
