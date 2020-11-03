package Animation;

import java.awt.*;

public class Ball {
        int x,y,r, vx, vy;
        public Ball(int x, int y, int r, int vx,int vy) {
            this.x = x;
            this.y = y;
            this.r = r;
            this.vx = vx;
            this.vy = vy;
        }
        public int centerX(int x, int r){
            int centerX = x + r;
            return centerX;
        }

        public int centerY(int y, int r){
            int centerY = y + r;
            return centerY;
        }


        public boolean contains(int px, int py){
            double d = Math.sqrt(Math.pow(px - centerX(x,r),2) + Math.pow(py - centerY(y,r),2));
            boolean t = d < r;
            return t;
        }

        public void move(){
            x += vx;
            y += vy;

            if(x + 2*r >= 800 || x <= 0){
                vx *= -1;
            }
            if(y + 2*r >= 800 || y <=0 ){
                vy *= -1;
            }
        }
        public void draw(Graphics2D g2){
            g2.fillOval(x, y, r*2,r*2);
        }

        public int getR() {
            return r;
        }
    }


