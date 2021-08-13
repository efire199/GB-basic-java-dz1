//homework1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign(){
        int a = 10;
        int b = 5;
        if (a + b < 0){
            System.out.println("Сумма отрицательная");
        }else{
            System.out.println("Сумма положительная");
        }
    }

    public static void printColor(){
        int value = 100;
        if (value<=0){
            System.out.println("Красный");
        }else if (value > 0 && value <=100){
            System.out.println("Желтый");
        }else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 5;
        int b = 6;
        if (a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}
