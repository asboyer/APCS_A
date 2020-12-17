package FRQ;

public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    //@return the total number of white pixels in image
//A)
    public int countWhitePixels(){
        int sum = 0;
        for(int r = 0; r < pixelValues.length; r ++){
            for(int c = 0; c < pixelValues[0].length; c++){
                if(pixelValues[r][c] == WHITE)
                    sum ++;
            }
        }
        return sum;
    }

    //B)
    public void processImage(){
        for(int r = 0; r < pixelValues.length; r ++){
            for(int c = 0; c < pixelValues[0].length; c++){
                try {
                    pixelValues[r][c] -= pixelValues[r + 2][c + 2];
                    if (pixelValues[r][c] < 0)
                        pixelValues[r][c] = BLACK;
                }
                catch(Exception e){
                    pixelValues[r][c] = pixelValues[r][c];
                }
            }
        }
    }
}

