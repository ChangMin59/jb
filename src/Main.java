import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //set: List와 비슷하지만 중복 값을 허용하지 않음
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers); //[1,2]

        //자바에서의 map: 자바스크립트에서의 객체와 비슷
        //value값에 해당하는 자료형이 다양하게 들어올떄는 Object로 타입 지정
        //Generic: 파라미터에 어떤 자료형의 인자값이 전달되야 되는지 호출시점에 지정하는 것
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name","David");
        student1.put("age",20);
        student1.put("age", 30);
        student1.put("isFemale", false);
        student1.remove("isFemale");

        System.out.println(student1);
        System.out.println(student1.get("age"));
    }
}