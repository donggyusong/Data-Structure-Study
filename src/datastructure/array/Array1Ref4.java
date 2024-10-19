package datastructure.array;

public class Array1Ref4 {
    public static void main(String[] args) {

        //배열 생성 간략 버전, 배열 선언과 홤께 사용시 new int[] 생략 가능
        int[] students = {90, 32, 31, 44, 14};

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+" 점수 = " + students[i]);
        }
    }
}
