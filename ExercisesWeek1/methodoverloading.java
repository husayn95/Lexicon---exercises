package LexiconJava.Exercises.ExercisesWeek1;

public class methodoverloading {
    public static void main(String[] args){

        System.out.println(getDurationString(123,12));
        System.out.println(getDurationString(12345));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes <= 0){
           return "Invalid Value";
        }
        if(seconds >=59){
            return "Invalid Value";
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hour + "h "+remainingMinutes+"m "+seconds+"s ";
    }

    public static String getDurationString(int seconds){
        if (seconds <=0){
            return "Invalid Value";
        }
        int minute = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minute, remainingSeconds);
    }
}
