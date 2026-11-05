import java.util.InputMismatchException;
import java.util.Scanner;

class TempConverter {
    private final int ABSOLUTE_ZERO = 0;
    private final Scanner sc;

    public TempConverter(Scanner sc) {
        this.sc = sc;
    }

    double celciousToKelvin(double celcious) {
        return celcious + 273.15;
    }

    double farenheitToKelvin(double farenheit) {
        return (((farenheit - 32) * 5 / 9) + 273.15);
    }

    double kelvinToCelcious(double kelvin) {
        return kelvin - 273.15;
    }

    double kelvingToFarenhight(double kelvin) {
        return (((kelvin - 273.15) * 9 / 5) + 32);
    }

    void convert(){
        try{
            System.out.print("Enter Temperature Value: ");
            double temp = sc.nextDouble();
            System.out.print("Enter Temperature Unit (ex C,F,K): ");
            char unit = sc.next().toUpperCase().charAt(0);
        
            double kelvin;
            double celcious;
            double farenheight;

            switch (unit) {
                case 'C':
                    kelvin = celciousToKelvin(temp);
                    if(kelvin < 0){
                        System.out.println("Temperature cannot be below absolute zero");
                        break;
                    }
                    farenheight = kelvingToFarenhight(kelvin);
                    System.out.println("Kelvin: " + kelvin);
                    System.out.println("Farenheight: " + farenheight);
                    break;
                case 'F':
                    kelvin = farenheitToKelvin(temp);
                    if(kelvin < 0){
                        System.out.println("Temperature cannot be below absolute zero");
                        break;
                    }
                    celcious = kelvinToCelcious(kelvin);
                    System.out.println("Kelvin: " + kelvin);
                    System.out.println("Celcious: " + celcious);
                    break;
                case 'K':
                    kelvin = temp;
                    if(kelvin < 0){
                        System.out.println("Temperature cannot be below absolute zero");
                        break;
                    }
                    celcious = kelvinToCelcious(kelvin);
                    farenheight = kelvingToFarenhight(kelvin);
                    System.out.println("Farenheight: " + farenheight);
                    System.out.println("Celcious: " + celcious);
                    break;
                default:
                    System.out.println("Invalid temperature unit");
                    break;
            }

        }
        catch(InputMismatchException e){
            System.out.println("Please Enter Correct Values!!");
        }
        
    }
}