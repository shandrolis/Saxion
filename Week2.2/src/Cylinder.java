/**
 * Created by Joep on 18-Nov-15.
 */
public class Cylinder {

    public static double calcSurface(double r, double h) {
        return 2*(Math.PI * (r*r)) + (2*Math.PI * r) * h;
    }

    public static double calcVolume(double r, double h) {
        return (Math.PI * (r * r) * h);
    }
}
