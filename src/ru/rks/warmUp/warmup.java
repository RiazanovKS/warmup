package ru.rks.warmUp;


import java.util.Scanner;
import java.util.regex.Matcher;

public class warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во заказов");
        int countOfOrders = scanner.nextInt();
        System.out.println("Введите время");
        int time = scanner.nextInt();
        int[] mas =new int[countOfOrders];
        fillingArr(mas);
        sort(mas);
        System.out.println("Вывод:"+ selection(mas,time));
    }

    /**
     *Метод сортирует элементы массива по убыванию.
     * @param mas
     */
    public static void sort(int[] mas) {
        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j]< mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Выводит максимальную заработанную сумму денег, которую можно получить в пределах доступного времени.
     * @param mas Массив заказов
     * @param time Кол-во времеини
     * @return
     */
    public static int selection(int[]mas, int time){
        int countOfSteps=time;
        int sum=0;
        if(time>mas.length){
            countOfSteps=mas.length;
        }
        for(int i=0;i<countOfSteps;i++){
            sum+=mas[i];
        }
        return sum;
    }

    /**
     * Метод заполняет массив случайными числами от 1 до 50.
     * @param arr заполняемый массив.
     */
    public static void fillingArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]= (int)(Math.random()*50);
        }
    }
}
