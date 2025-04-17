import java.util.*;

public class Main {

    public static void main(String[] args) {
        //사용자1
        Map<String, Object> user1 = new HashMap<>();
        user1.put("name","david");
        user1.put("age",20);
        user1.put("email","david@naver.com");

        //사용자2
        Map<String, Object> user2 = new HashMap<>();
        user2.put("name","emily");
        user2.put("age",30);
        user2.put("email","emily@naver.com");

        //사용자 그룹
        List<Map<String, Object>> userGroup = new ArrayList<>();
        userGroup.add(user1);
        userGroup.add(user2);

        //List는 배열과 달리 List.size()로 전체 갯수 구함
        for (int i = 0; i < userGroup.size(); i++) {
            Map<String, Object> user = userGroup.get(i);
            System.out.println("user name: " + user.get("name"));
            System.out.println("user age: " + user.get("age"));
            System.out.println("user email: " + user.get("email"));
            System.out.println(); // 한 줄 공백
        }
    }
}