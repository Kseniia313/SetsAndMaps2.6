import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 11, 47));
        System.out.println("Задание 1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Задание 2");
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(8, 10, 2, 3, 4, 4, 5, 5, 6, 7, 11, 47));
        Collections.sort(nums);
        List<Integer> nums1 = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        for (Integer num : nums1) {
            if (num % 2 == 0) {
                System.out.print(num + " ");

            }
        }
        System.out.println();
        System.out.println("Задание 3");
    }

    public static void task3() {
        List<String> repeatingList = new ArrayList<>(List.of(
                "Береза", "Дуб", "Липа",
                "Липа", "Кедр", "Береза",
                "Дуб", "Ясень", "Смородина",
                "Малина", "Дуб", "Ясень"));
        List<String> listWithoutRepetition = repeatingList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listWithoutRepetition);
        System.out.println();
        System.out.println("Задание 4");
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("четыре", "шесть","один", "два","шесть", "два", "три", "шесть","три","четыре", "три"));
        Map<Object, Long> map = strings
                .stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(map);


    }

}
