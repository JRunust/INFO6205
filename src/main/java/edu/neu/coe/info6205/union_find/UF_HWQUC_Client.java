package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class UF_HWQUC_Client {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(count(sc.nextInt()));
//        sc.close();
        int[] arr = {100,200,400,800,1600,3200,6400,12800,25600,51200,102400,204800,409600};
        for(int i = 0;i < arr.length;i++){
            System.out.println(i + " " + arr[i]+ " "+ count(arr[i])+" "+ count(arr[i]) / arr[i]);
        }
    }
    public static int count(int n){
        Random random = new Random();
        int numOfSites = n;
        int count = 0;
        UF_HWQUPC uf_hwqupc = new UF_HWQUPC(numOfSites);
        while(uf_hwqupc.components() != 1){
            count++;
            uf_hwqupc.connect(random.nextInt(numOfSites),random.nextInt(numOfSites));
        }
        return count;
    }
}