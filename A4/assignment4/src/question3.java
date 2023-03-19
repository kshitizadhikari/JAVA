public class question3 {

    public void fibonacciSeries(int r){
        int[] fibos = new int[r+1];
        fibos[0] = 0;
        fibos[1] = 1;
        System.out.print(fibos[0] + " " + fibos[1] + " ");
        for (int i = 1; i < r; i++) {
            int sum = fibos[i] + fibos[i-1];
            System.out.print(sum + " ");
            fibos[i+1] = sum;
        }
    }
}
