package trrne;

public class Vector2 {
    public static final Vector2 X = new Vector2(1, 0);
    public static final Vector2 Y = new Vector2(0, 1);
    public static final Vector2 Zero = new Vector2(0, 0);
    public static final Vector2 One = new Vector2(1, 1);

    public double x, y;

    public Vector2() {
        x = 0;
        y = 0;
    }

    public Vector2(double $x, double $y) {
        x = $x;
        y = $y;
    }

    public Vector2 Add(final Vector2 $a) {
        return new Vector2(x + $a.x, y + $a.y);
    }

    public Vector2 Sub(final Vector2 $a) {
        return new Vector2(x - $a.x, y - $a.y);
    }

    public Vector2 Div(double $a) {
        return new Vector2(x / $a, y / $a);
    }

    public static double Cross(final Vector2 $a, final Vector2 $b) {
        return $a.x * $b.y - $a.y * $b.x;
    }

    public static double Dot(final Vector2 $a, final Vector2 $b) {
        return $a.x * $b.x + $a.y * $b.y;
    }

    public double Magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public static double Magnitude(final Vector2 $a) {
        return $a.Magnitude();
    }

    public Vector2 Normalize() {
        return Div(Magnitude());
    }

    public static Vector2 Normalize(final Vector2 $a) {
        return $a.Normalize();
    }

    public static double Distance(final Vector2 $a, final Vector2 $b) {
        return Magnitude($a.Sub($b));
    }

    public static double Angle(final Vector2 $a, final Vector2 $b) {
        final double a = $a.Magnitude(), b = $b.Magnitude();
        if (Math.abs(a) <= 1e-45 || Math.abs(b) <= 1e-45) {
            return 0;
        }
        return Math.acos(Dot($a, $b) / a / b) * (180 / Math.PI);
    }

    public static boolean Twins(final Vector2 $v1, final Vector2 $v2, final double tolerance) {
        return Math.abs($v1.x - $v2.x) < tolerance && Math.abs($v1.y - $v2.y) < tolerance;
    }

    public static boolean Twins(final Vector2 $v1, final Vector2 $v2) {
        return Twins($v1, $v2, 1e-3);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
