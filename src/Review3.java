import java.util.Scanner;
//first github!!
public class Review3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int size = 0;

        String cmd;
        int val;

        label:
        while(true){
            cmd = sc.next();

            switch (cmd) {
                case "ADD":
                    val = sc.nextInt();

                    boolean isIn = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == val) {
                            System.out.println("The Same Number");
                            isIn = true;
                            break;
                        }
                    }
                    if (!isIn) {
                        arr[size] = val;
                        size += 1;
                    }
                    break;
                case "LIST":
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case "SUM": {
                    int s = 0;
                    for (int i = 0; i < size; i++) {
                        s += arr[i];
                    }
                    System.out.println(s);
                    break;
                }
                case "MAX":
                    int max = 0;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println(max);
                    break;
                case "MIN":
                    int min = 99999999;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println(min);
                    break;
                case "AVG": {
                    int s = 0;
                    for (int i = 0; i < size; i++) {
                        s += arr[i];
                    }
                    System.out.println(((double) s) / size);

                    break;
                }
                case "QUIT":
                    break label;
                default:
                    System.out.println("Invalid Command");
                    break;
            }


        }

        System.out.println("Bye");

    }
}
