package ch2_객체지향.Ex39_컬렉션프레임워크;

/*
== Map 인터페이스 ==
    Map : 키, 값으로 구성된 데이터의 집합
         순서 없고, 키 중복 안됨 값은 중복 가능
         *(키가 중복되는 경우, 값만 최근꺼로 덮어씀)

         키와 값을 연결하는 걸 '맵칭'이라고 함
         큰사이즈의 데이터를 검색할때 주로 사용


== 생성방법 ==
    Map<키 타입, 값> 변수명 = new HashMap<>();
    HashMap<키 타입, 값 타입> 변수명 = new HashMap<>();

    ex) Map<String, Integer> 변수명 = new HashMap<>();
        HashMap<String, Integer> 변수명 = new HashMap<>();


== 사용 가능한 메서드 ==
    1) HashMap<>(): 해쉬맵 생성
    2) put(key, value): map에 value 객체를 key 객체에 연결(mapping) 해서 저장
                        *(키가 중복되는 경우, 값만 최근꺼로 덮어씀)
    3) containsKey(key): Map 에 해당 키랑 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false
    4) containsValue(value): Map 에 해당 값과 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false
    5) entrySet(): key-value 쌍으로 구성된 모든 Map.Entry타입의 객체를 Set에 담아서 리턴
    6) get(key): key 와 매칭되는 value 객체를 찾아서 반환
    7) isEmpty(): 컬렉션이 비어있는지 확인(결과: true, false)
    8) size(): 저장된 key-value 쌍의 총 개수 리턴
    9) keySet(): Map에 저장된 모든 key를 Set에 담아서 리턴
    10) values(): Map에 저장된 모든 value를 Set에 담아서 리턴
    11) remove(): 주어진 key 객체와 일치하는 key-value 객체 삭제
    12) clear(): 모든 Set 삭제


*/

import java.util.HashMap;
import java.util.Map;

public class Ex39_4_HashMap클래스 {
    public static void main(String[] args) {
        /* 1) HashMa<>(); : 헤쉬맵 생성 */
        Map<String, Integer> map = new HashMap<>();

        /* 2) put(key, value): map에 value 객체를 key 객체에 연결(mapping) 해서 저장 */
        map.put("빨", 1);
        map.put("주", 2);
        map.put("노", 3);
        map.put("초", 4);
        map.put("파", 5);
        map.put("남", 6);
        map.put("보", 7);

        /* 3) containsKey(key): Map 에 해당 키랑 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false */
        System.out.println(map.containsKey("초")); // true
        System.out.println(map.containsKey("검")); // false

        /* 4) containsValue(value): Map 에 해당 값과 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false */
        System.out.println(map.containsValue(3)); // true
        System.out.println(map.containsValue("3")); // false

        /* 5) enterySet() */
    }
}
