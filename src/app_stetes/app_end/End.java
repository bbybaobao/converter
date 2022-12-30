package app_stetes.app_end;

public class End {
    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.0");
        double miles = 15;
        double kms = 26;
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }

    private static double convertKmsToMiles(double kms) {
        return kms / 1.60934;
    }
}
