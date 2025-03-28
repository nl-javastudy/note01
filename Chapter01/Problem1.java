public class Problem1 {
    public double solution(int[] arr) {
        double answer = 0;
        int arr_len = arr.length;
        for (int i = 0; i < arr_len; i++) {
            answer += arr[i];
        }
        return answer / arr_len;
    }
}
