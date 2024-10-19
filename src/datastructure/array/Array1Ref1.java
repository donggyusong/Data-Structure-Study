package datastructure.array;

public class Array1Ref1 {
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
        System.out.println("학생1 점수 = " + students[0]);
        System.out.println("학생2 점수 = " + students[1]);
        System.out.println("학생3 점수 = " + students[2]);
        System.out.println("학생4 점수 = " + students[3]);
        System.out.println("학생5 점수 = " + students[4]);

    }
}
