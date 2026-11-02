import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        Scanner sc = new Scanner(System.in);
        try{

            System.out.print("First Number: ");
            double firstNum = sc.nextDouble();
            System.out.print("Operator: ");
            char operator = sc.next().charAt(0);
            System.out.print("Second Number: ");
            double secondNum = sc.nextDouble();

            switch (operator) {
            
                case '+':
                    System.out.println("Result: " + myCal.add(firstNum,secondNum));
                    break;
                case '-':
                    System.out.println("Result: " + myCal.substract(firstNum, secondNum));
                    break;
                case '*':
                    System.out.println("Result: "+ myCal.multiply(firstNum, secondNum));
                    break;
                case '/':
                    if(secondNum == 0){
                        System.out.println("Error: can not divide by zero");
                        break;
                    }
                    else{
                        System.out.println("Result: "+ myCal.divide(firstNum, secondNum));
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Error: Invalid numeric input.");
        }
        finally{
            sc.close();
        }

    }
}