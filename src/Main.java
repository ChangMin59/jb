import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList 클래스를 List생성시 반환 받는 자료형이 무조건 문자열 형식으로 지정
        List<String> names = new ArrayList<>();
        // 가변형이기 때문에 names인스턴스에서는 add, remove 같은 데이터를 변경가능한 메서드
        names.add("David");
        names.add("Emily");

        names.remove("Emily");

        System.out.println(names);
    }
}