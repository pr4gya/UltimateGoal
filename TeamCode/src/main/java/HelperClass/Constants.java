package HelperClass;

public class Constants {

    /**
     * List all constants here.
     */

    public static final String TEAM = "Vortex-14969";
    public static final double Y_FIELD_SIZE_INCH = 144;
    public static final double X_FIELD_SIZE_INCH = 96;
    public static final double TILE_SIZE_INCH = 24;
    public static final double ODOMETRY_TICKS_PER_REV = 8192;
    public static final double ODOMETRY_WHEELBASE = 15.2; // In Inch
    public static final double ODOMETRY_WHEEL_RADIUS = 1.0; // In Inch
    public static final double ODOMETRY_COUNTS_PER_INCH = 8192 / (2.0 * Math.PI * ODOMETRY_WHEEL_RADIUS);
    public static final double ODOMETRY_WHEEL_DISTANCE_INCH  = 15.2; // distance between left and right - in INCH
    public static final double HORIZONTAL_TICKS_PER_RAD = 650;

}

