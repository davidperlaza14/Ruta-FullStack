package Java_Basico;

public class ifElse {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if (number1 > number2 && number2 < number3){
            System.out.println("Verdadero");
        }else if(number3 < number4){
            System.out.println("Else if");
        }
        System.out.println("fin");
    }
}
