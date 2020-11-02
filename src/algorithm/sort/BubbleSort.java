package algorithm.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 3, 7, 9, 2, 4, 5};

        int len = arr.length;

        int cnt = 0;
        for(int i = 0 ; i < len; i++){
            for(int j = i+1; j < len; j++){
                cnt += 1;
                if( arr[i] > arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("비교횟수 :: "+cnt);
        for(int val: arr){
            System.out.print(val+", ");
        }
    }
}
