import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int even = 0;
        int odd = 0;
        int result = 1;
        for(int i = start; i <= end; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                while(result != 0) {
                    result = i % 10;
                    if(result % 2 != 0) {
                        odd++;
                    } else {
                        even++;
                    }
                    i /= 10;
                }
            }
        }

        System.out.println(odd);
        System.out.println(even);
 

        sc.close();        
    }
}
