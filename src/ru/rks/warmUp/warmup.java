package ru.rks.warmUp;

public class warmup {
    public static void main(String[] args) {
        int[] mas = {2, 4,6,3,7,1};
        sort(mas);
        System.out.println("Вывод:"+ selection(mas,2));
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
}
