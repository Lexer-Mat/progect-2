package Polymorfism;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 4:
                dayName = "Среда";
                break;
            case 5:
                dayName = "Четверг";
                break;
            case 6:
                dayName = "Пятница";
                break;
            case 7:
                dayName = "Суббота";
                break;
            case 3:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Некорректный день";
                break;
        }

        System.out.println("День недели: " + dayName);
    }
}
