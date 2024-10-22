public class SimpleLocation {
    public double latitute;
    public double longtitute;
    public SimpleLocation(double lat, double lon){
        this.latitute = lat;
        this.longtitute = lon;
    }
    public static void main(String[] args){
        double d = -77.0;
        SimpleLocation lima = new SimpleLocation(-12.0, d);
        SimpleLocation washDC = new SimpleLocation(38.9, lima.longtitute);

        SimpleLocation loc1 = new SimpleLocation(39.9, 116.4);
        SimpleLocation loc2 = new SimpleLocation(55.5, 37.6);
        loc1 = loc2;
        loc1.latitute = -8.3;
        System.out.println(loc2.latitute + ", " + loc2.longtitute);
    }
}

