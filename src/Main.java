import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вводи задание:");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String op = "";

        do {
            String input = sc.next();
            String[] strings = input.split("\\W");
            String[] operator = input.split("\\w");
            try {
                a = Integer.parseInt(strings[0]);
                b = Integer.parseInt(strings[1]);
                op = operator[1];
                if(a>10 || a<1 || b<1 || b>10 || strings.length > 2 || operator.length > 2){
                    throw new Exception("Ошибка");
                }

                System.out.println("Равняется = " + operation(a, b, op));

            } catch (Exception e) {
                System.out.println(e);
            }


        } while (true);
    }

    private static int operation(int a, int b, String op) {
        switch (op) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}