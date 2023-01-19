import java.util.Scanner;

class GetInput {
    int[][] arr = new int[2][5];

    Scanner sc = new Scanner(System.in);

    void go() {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("enter a number");
                arr[j][i] = sc.nextInt();
            }
        }
        System.out.println(arr.length);
    }
}

class ArrayIntroduction {
    public static void main(String[] args) {
        GetInput gi = new GetInput();
        gi.go();
    }
}