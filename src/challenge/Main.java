package challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 6, 23, 10, 1, 3};
        String sol = solution(arr);
        System.out.println(sol);

    }

    public static String solution(int[] arr){
        Arrays.sort(arr);
        int sum=0;
        //boolean answer;

        for (int i = 0; i < arr.length - 1 ; i++) {
            sum += arr[i];
        }

        if (sum == arr[arr.length - 1]){
            return "true";
        }
        else {
            return "false";
        }
        //answer = sum == arr[arr.length - 1];
        //System.out.println(answer);



    }
}
