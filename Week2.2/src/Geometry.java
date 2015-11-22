/**
 * Created by Joep on 16-Nov-15.
 * Write static methods
 * • public static double sphereVolume(double r)
 * • public static double sphereSurface(double r)
 * • public static double cylinderVolume(double r, double h)
 * • public static double cylinderSurface(double r, double h)
 * • public static double coneVolume(double r, double h)
 * • public static double coneSurface(double r, double h)
 * that compute the volume and surface area of a sphere with a radius r, a cylinder with
 * a circular base with radius r and height h, and a cone with a circular base with radius r
 * and height h. Place them into a class Geometry.
 * Then write a program that prompts the
 * user for the values of r and h, calls the six methods, and prints the results.
 */
public class Geometry {

    public static double sphereVolume(double r) {
        return 4 / 3 / Math.PI * Math.pow(r, 3);
    }

    public static double sphereSurface(double r) {
        return 4 * Math.PI * (r * r);
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * (r*r) * h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2*(Math.PI * (r*r)) + (2*Math.PI * r) * h;
    }

    public static double coneVolume(double r, double h) {
        return h * Math.PI * (r*r) /3;
    }

    public static double coneSurface(double r, double h) {
        return (1/3 * Math.PI) * (r*r) * h;
    }


}


