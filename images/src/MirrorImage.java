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
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                Pixel cp = pixels[r][c];
                Pixel op = pixels[r][c + pixels.length/2];
                op.setColorARGB(cp.getAlpha(), cp.getRed(), cp.getGreen(), cp.getBlue());
            }
        }
        setImage(pixels);
    }
}
