package datastructure.array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2x3 2차원 배열, 초기화
        int[][] arr= {
                {1,2,3},
                {4,5,6}
        };

        //배열 길이 활용
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
    }
}
