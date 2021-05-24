public class PixelatedImage extends CustomImage{

    public PixelatedImage(String fileName, int x, int y) {
        super(fileName, x, y);
    }

    public PixelatedImage(Pixel[][] pixels, int x, int y) {
        super(pixels, x, y);
    }


    @Override
    public void processImage(){
        Pixel[][] pixels = getPixels();
        int pixelSize = 15;
        for (int r = 0; r < pixels.length; r+=pixelSize) {
            for (int c = 0; c < pixels[0].length; c+=pixelSize) {
                for(int pr = r; pr < r + pixelSize && pr < pixels.length; pr++){
                    for(int pc = c; pc < c + pixelSize && pc < pixels[0].length; pc++){
                        Pixel area = pixels[pr][pc];
                        Pixel mid = pixels[r][c];
                        area.setGreen(mid.getGreen());
                        area.setRed(mid.getRed());
                        area.setBlue(mid.getBlue());
                    }
                }
            }
        }
        setImage(pixels);
    }
}