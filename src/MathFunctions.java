public class MathFunctions {

    static public int oneDimensionFunction(double x, double angle, int defaultx, int defaulty){
        x = x - defaultx;
        double result = angle * x;
        return defaulty - (int) Math.ceil(result);
    }
    static public int twoDimensionFunction(double x, double angle, int defaultx, int defaulty){
        x = x- defaultx;
        double result = angle*x*x;
        return defaulty - (int) Math.ceil(result);
    }
    static public int threeDimensionFunction(double x, double angle, int defaultx, int defaulty){
        x = x- defaultx;
        double result = angle*x*x*x;
        return defaulty - (int) Math.ceil(result);
    }
    static public int exponentFunction(double x, double under, int defaultx, int defaulty){
        x = x- defaultx;
        for(int i = 1; i < x; i++){
            under *= under;
        }
        return defaulty - (int) Math.ceil(under);
    }
    static public int sinFunction(double x, double hang, int defaultx, int defaulty){
        x = x- defaultx;
        double result = hang * Math.sin(x);
        return defaulty - (int) Math.ceil(result);
    }
    static public int cosFunction(double x, double hang, int defaultx, int defaulty){
        x = x- defaultx;
        double result = hang * Math.cos(x);
        return defaulty - (int) Math.ceil(result);
    }
    static public int tanFunction(double x, double hang, int defaultx, int defaulty){
        x = x- defaultx;
        double result = hang * Math.tan(x);
        return defaulty - (int) Math.ceil(result);
    }
}
