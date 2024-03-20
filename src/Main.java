import java.time.LocalDate;
import java.time.Period;


public class Main {
    static int findAreaOfRectangle(int width, int length){
        return width * length;
    }

    static int findDiameter(int radius){
        return radius * 2;
    }

    static float findCircumference(float radius){
        double pi = Math.PI;
        return (float) (2 * pi * radius);
    }

    static float findAreaOfCircle(float radius){
        double pi = Math.PI;
        return (float) (pi * Math.pow(radius, 2));
    }

    static int findAngles(int angle1, int angle2){
        int totalAngle = 180;
        int result = totalAngle - (angle1 + angle2);
        if(result < 0) {
            result = 0;
        }
        return result;
    }
    static int getDifferenceDays(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);
        return period.getDays();
    }

    static String getInitial(String name) {
        StringBuilder result = new StringBuilder("");
        String[] split = name.split(" ");
        for(String value : split){
            result.append(value.substring(0, 1).toUpperCase());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2024, 3, 19);
        LocalDate date2 = LocalDate.of(2024, 3, 21);

        int RectangleResult = findAreaOfRectangle(3,5);
        int diameterResult = findDiameter(5);
        float circumferenceResult = findCircumference(5);
        float circleResult = findAreaOfCircle(5);
        int angleResult = findAngles(80, 65);
        int differenceDaysResult = getDifferenceDays(date1,date2);
        String getInitialResult = getInitial("Kurniawan Rizki");

        System.out.println("Result of rectangle area = " + RectangleResult);
        System.out.println("Result of circle diameter = " + diameterResult);
        System.out.println("Result of circle circumference = " + circumferenceResult);
        System.out.println("Result of circle area = " + circleResult);
        System.out.println("Result of angle = " + angleResult);
        System.out.println("Result of difference days = " + differenceDaysResult + " day");
        System.out.println("Result of initial = " + getInitialResult);
    }
}