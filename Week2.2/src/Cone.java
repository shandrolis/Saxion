/**
 * Created by Joep on 18-Nov-15.
 */
public class Cone {


    public static double calcSurface(double r, double h) {
        return (1 / 3 * Math.PI) * (r * r) * h;
    }

    public static double calcVolume(double r, double h) {

        return h * Math.PI * (r * r) / 3;

    }
}
