import processing.core.PApplet;

public class FourBallsPOP extends PApplet {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 20;
    public static final float FRACTION = 0.2f;
    private int x;

    public static void main(String[] args) {
        PApplet.main("FourBallsPOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        x = 0;
    }

    @Override
    public void draw() {
        for (int ball = 1; ball <= 4; ball++) {
            drawCircle(ball);
        }
        x++;
    }

    private void drawCircle(int ball) {
        ellipse(ball * x, HEIGHT * ball * FRACTION, DIAMETER, DIAMETER);
    }

}
