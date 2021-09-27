package edu.neu.coe.info6205.assignment2;

import edu.neu.coe.info6205.sort.elementary.InsertionSort;
import edu.neu.coe.info6205.util.Benchmark_Timer;

import java.util.Random;
import java.util.function.Supplier;

public class Test3 {
        public static void main(String[] args) {
            Integer[] len = new Integer[]{1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000};
//        for(int i = 0;i <len.length;i++){
//            int num = i;
//            Supplier<Integer[]> supplier = ()-> provideArrayReverse(len[num]);
//            Benchmark_Timer<Integer[]> insertionSortTimer = new Benchmark_Timer<>("InsertionSortTimer", (t) ->{new InsertionSort<Integer>().sort((Integer[])t,0,t.length - 1);});
//            double v = insertionSortTimer.runFromSupplier(supplier, 10);
//            System.out.println(v);
//        }

        for(int i = 0;i <len.length;i++){
            int num = i;
            Supplier<Integer[]> supplier = ()-> provideArraySorted(len[num]);
            Benchmark_Timer<Integer[]> insertionSortTimer = new Benchmark_Timer<>("InsertionSortTimer", (t) ->{new InsertionSort<Integer>().sort((Integer[])t,0,t.length - 1);});
            double v = insertionSortTimer.runFromSupplier(supplier, 10);
            System.out.println(v);
        }

//        for(int i = 0;i <len.length;i++){
//            int num = len[i];
//            Supplier<Integer[]> supplier = ()->provideArrayHalfSorted(len[num]);
//            Benchmark_Timer<Integer[]> insertionSortTimer = new Benchmark_Timer<>("InsertionSortTimer", (t) ->{new InsertionSort<Integer>().sort((Integer[])t,0,t.length - 1);});
//            double v = insertionSortTimer.runFromSupplier(supplier, 10);
//            System.out.println(v);
//        }

//            for (int i = 0; i < len.length; i++) {
//                int num = len[i];
//                Supplier<Integer[]> supplier = () -> provideArraySorted(len[num]);
//                Benchmark_Timer<Integer[]> insertionSortTimer = new Benchmark_Timer<>("InsertionSortTimer", (t) -> {
//                    new InsertionSort<Integer>().sort((Integer[]) t, 0, t.length - 1);
//                });
//                double v = insertionSortTimer.runFromSupplier(supplier, 10);
//                System.out.println(v);
//            }
        }
    public static Integer[] provideArrayReverse(int n){
         Integer[] arr = new Integer[n];
         for(int j = 0;j < arr.length;j++){
             arr[j] = arr.length - j;
         }
         return arr;
     }
    public static Integer[] provideArraySorted(int n){
        Integer[] arr = new Integer[n];
        for(int j = 0;j < arr.length;j++){
            arr[j] =  j;
        }
        return arr;
    }
    public static Integer[] provideArrayHalfSorted(int n){
        Random random = new Random();
        Integer[] arr = new Integer[n];
        for(int j = 0;j < arr.length;j++){
            if(j < arr.length / 2){
                    arr[j] = j;
             }else{
                    arr[j] = random.nextInt(arr.length);
               }
        }
        return arr;
    }
    public static Integer[] provideArrayRandom(int n){
        Random random = new Random();
        Integer[] arr = new Integer[n];
        for(int j = 0;j < arr.length;j++){
            arr[j] = random.nextInt(arr.length);
        }
        return arr;
    }
}
