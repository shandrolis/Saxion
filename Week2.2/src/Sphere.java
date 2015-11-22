/**
 * Created by Joep on 18-Nov-15.
 */
public class Sphere {


    public static double calcSurface(double r) {
        return (4 * Math.PI * (r * r));
    }

    public static double  calcVolcume(double r) {
        return (4 / 3 / Math.PI * Math.pow(r, 3));
    }
}
