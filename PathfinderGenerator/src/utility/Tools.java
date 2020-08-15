package utility;

public class Tools {

    public static double truncateTo( double unroundedNumber, int decimalPlaces ){
        int truncatedNumberInt = (int)( unroundedNumber * Math.pow( 10, decimalPlaces ) );
        double truncatedNumber = (double)( truncatedNumberInt / Math.pow( 10, decimalPlaces ) );
        return truncatedNumber;
    }
}
