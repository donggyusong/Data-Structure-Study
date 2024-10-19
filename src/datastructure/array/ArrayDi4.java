package datastructure.array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];

        int i = 1;
        //배열 길이 활용
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
