public class exa {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum, avg, min,max;

        sum = avg = 0;
        
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        min = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("min: %d\n", min);
        max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("max: %d\n", max);
    }
    
}