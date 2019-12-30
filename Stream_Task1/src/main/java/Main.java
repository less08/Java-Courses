import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        //    Сделать массив int. Из него получить IntStream. Для него
        int array[] = {2, 0, 432, -42, 4, 37, -102,0};
        //List<Integer> list = ;

        //1. Найти среднее значение элементов массива (с использованием average
        aver(array);
        // и без).
        customAver(array);
        //2. Найти минимальный элемент и вернуть значение и индекс (одновременно)
        foundMin(array);
        //3. Посчитать количество элементов равных нулю
        countNull(array);
        //4. Посчитать количество элементов больше нуля
        countPositive(array);
        // 5.Помножить элементы массива на число
        mult(array);

    }


    private static void aver(int array[]) {
        IntStream intStream = Arrays.stream(array);
        System.out.println("Stream average: "+intStream.average());

    }

    private static void customAver(int[] array){
        IntStream intStream = Arrays.stream(array);
        double averageValue=(double)intStream.sum()/array.length;
        System.out.println("Custom average: "+averageValue);

//       IntSummaryStatistics stats = intStream.summaryStatistics();
//        System.out.println("Custom average: "+(double)stats.getSum()/stats.getCount());

    }

    private static HashMap foundMin(int array[]){
        IntStream intStream = Arrays.stream(array);
        HashMap<Integer,Integer> result = new HashMap<>();

        return result;
    }

    private static void countNull(int[] array){
        IntStream intStream = Arrays.stream(array);
        System.out.println("Number of 0 elements: "+
                (int)intStream.filter(x->x== 0).count());
    }

    private static void countPositive(int[] array){
        IntStream intStream = Arrays.stream(array);

        System.out.println("Number of + elements: "+
                (int)intStream.filter(x->x>0).count());
    }

    private static void mult(int array[]) {
        System.out.println("Multiplying: ");
        IntStream intStream = Arrays.stream(array);
        intStream.map(x -> x * 5)
                .forEach(x->System.out.print(x+" "));
    }


    private static void move(int x, int y) {
        System.out.println(x + y);
    }
}
