import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Temperature Converter Programm");
        
        try(Scanner sc = new Scanner(System.in)){
            new TempConverter(sc).convert();
        }
        

    }
}