import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //자바에서의 map: 자바스크립트에서의 객체와 비슷
        //value값에 해당하는 자료형이 다양하게 들어올떄는 Object로 타입 지정
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name","David");
        student1.put("age",20);
        student1.put("isFemal", false);

        System.out.println(student1);
    }
}