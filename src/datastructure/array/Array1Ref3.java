package datastructure.array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students;
        students = new int[]{90,32,43,32,13}; //배열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+" 점수 = " + students[i]);
        }
    }
}
