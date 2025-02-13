import java.util.Scanner;
public class calculator {
    
    public static void main(String[]args){
        System.out.println("Hello Guys this is a Calculator");        
        operations();
        interfACE();

    }
    public static void interfACE(){
        System.out.print("Let me know what Operation do you want to perform with my Calculator Software = ");
        Scanner scan = new Scanner(System.in);
        String Operator = scan.next();
        char symbol = Operator.charAt(0);
        System.out.println("Intersting!! You want to Perform "+Operator);
        if(symbol == '+'){
            System.out.println("This Program Will Perform Addition");
            addition();
            interfACE();
        }
        else if (symbol == '-'){
            System.out.println("This Program Will Perform Substraction");
            Substraction();
            interfACE();
        }
        else if (symbol == '*'){
            System.out.println("This Program Will Perform Multiplication");
            Multiplication();
            interfACE();
        }
        else if (symbol == '/'){
            System.out.println("This Program Will Perform Division");
            Division();
            interfACE();
        }
        else if (symbol == 'S'){
            System.out.println("This Program Will Perform Square of a Number ");
            Square();
            interfACE();


        }
        else{
            System.out.println("Sorry I am not built to perform this kind of Operation");
            System.out.println("Or You have chosen an Incorrect Operation");
            System.out.println("Please Choose the Operation from the following List");
            operations();
            interfACE();
        }
    }
    public static void operations(){
        System.out.println("Click '+'  for  Addition");
        System.out.println("Click '-'  for  Substraction");
        System.out.println("Click '*'  for  Multiplication");
        System.out.println("Click '/'  for  Division");
        System.out.println("Click 'S' for  Square of a number");

    }
    public static void addition(){
        Scanner damn = new Scanner(System.in);
        System.out.print("Enter the First Number = ");
        int num1 = damn.nextInt();
        Scanner made = new Scanner(System.in);
        System.out.print("Enter the Secound Number = ");
        int num2 = made.nextInt();
        int result = num1 + num2;
        System.out.println("The Sum of "+num1+" and "+num2+" is = "+result);
}
public static void Substraction(){
    Scanner damn = new Scanner(System.in);
    System.out.print("Enter the First Number = ");
    int num1 = damn.nextInt();
    Scanner made = new Scanner(System.in);
    System.out.print("Enter the Secound Number = ");
    int num2 = made.nextInt();
    int result = num1 - num2;
    System.out.println("The Substraction of "+num1+" and "+num2+" is = "+result);
}
public static void Multiplication(){
    Scanner damn = new Scanner(System.in);
    System.out.print("Enter the First Number = ");
    int num1 = damn.nextInt();
    Scanner made = new Scanner(System.in);
    System.out.print("Enter the Secound Number = ");
    int num2 = made.nextInt();
    int result = num1 * num2;
    System.out.println("The Multiplication of "+num1+" and "+num2+" is = "+result);
}

public static void Division(){
    Scanner damn = new Scanner(System.in);
    System.out.print("Enter the First Number = ");
    int num1 = damn.nextInt();
    Scanner made = new Scanner(System.in);
    System.out.print("Enter the Secound Number = ");
    int num2 = made.nextInt();
    int result = num1 / num2;
    System.out.println("The Division of "+num1+" and "+num2+" is = "+result);
}
public static void Square(){
    Scanner damn = new Scanner(System.in);
    System.out.print("Enter the Number = ");
    int num1 = damn.nextInt();
    int result = num1 * num1;
    System.out.println("The Square of "+num1+" is = "+result);
}

}
