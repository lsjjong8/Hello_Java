package chapter09.lecture;

public class EnumWeekExample2 {
    public static void main(String[] args) {
        // 요일에 따른 일정 배열 예시
        String[] schedule = new String[7]; // 7개 요소를 가진 배열

        // 각 요일의 일정 추가
        schedule[Week.MONDAY.ordinal()] = "일하러 갑니다.";
        schedule[Week.WEDNESDAY.ordinal()] = "일 끝나고 운동하러 갑니다.";
        schedule[Week.FRIDAY.ordinal()] = "밤에 영화를 봅니다.";

        // 배열 순회하며 요일과 일정 출력
        for (Week day : Week.values()) {
            String dayName = day.name();
            String task = schedule[day.ordinal()];
            System.out.println(dayName + ": " + (task != null ? task : "일정이 없습니다."));
        }
    }
}