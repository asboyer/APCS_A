public class SepiaImage extends CustomImage{

    public SepiaImage(String fileName, int x, int y) {
        super(fileName, x, y);
    }

    public SepiaImage(Pixel[][] pixels, int x, int y) {
        super(pixels, x, y);
    }


    @Override
    public void processImage(){
        Pixel[][] pixels = getPixels();
        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                Pixel p = pixels[r][c];

                int outRed = (int)(p.getRed() * .393 + p.getGreen() *.769 + p.getBlue() * .189);
                if(outRed > 255)
                    p.setRed(255);
                else
                    p.setRed(outRed);

                int outGreen = (int)(p.getRed() * .349 + p.getGreen() *.686 + p.getBlue() * .168);
                if(outGreen > 255)
                    p.setGreen(255);
                else
                    p.setGreen(outGreen);

                int outputBlue = (int)(p.getRed() * .272 + p.getGreen() *.534 + p.getBlue() * .131);
                if(outputBlue > 255)
                    p.setBlue(255);
                else
                    p.setBlue(outputBlue);
            }
        }
        setImage(pixels);
    }
}
