package ARRAYS_COLLECTION;

public class win_marafon {

    public static void main(String[] args) {
        String[][] names = {
                {"Elena", "341"},
                {"Thomas", "273"},
                {"Hamilton", "294"},
                {"Suzie", "402"},
                {"Phil", "401"},
                {"Matt", "388"}
        };

        // Сперва укажем что минимальное значение записано в первом элементе
        int min_time = Integer.parseInt(names[0][1]);
        int player_index = 0;
        for (int i = 0; i < names.length; i++) {
            // Если будет найдено новое минмальное значение, то установим его
            if (Integer.parseInt(names[i][1]) < min_time) {
                min_time = Integer.parseInt(names[i][1]);
                player_index = i;
            }
        }

        System.out.println("Самый быстрый это игрок: " + names[player_index][0]);
        System.out.println("Счет игрока равен: " + names[player_index][1]);

    }

}