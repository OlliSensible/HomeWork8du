package homeWork;

public class Colors {
    public Color whichColor(int area) {
        Color color;
        if (area < 20) {
            color = Color.RED;
        } else if (area >= 20 && area <= 50) {
            color = Color.YELLOW;
        } else {
            color = Color.BLUE;
        }
        return color;
    }

}
