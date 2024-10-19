package datastructure.array;

public class Array1Ref2 {
    public static void main(String[] args) {

        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성

        //변수 값 대입
        students[0] = 23;
        students[1] = 54;
        students[2] = 44;
        students[3] = 65;
        students[4] = 76;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+" 점수 = " + students[i]);
        }
    }
}
