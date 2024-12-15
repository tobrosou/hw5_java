package chatgpt3;

import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        // 獲取當前時間
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date and Time: " + calendar.getTime());

        // 日期加減操作：加 5 天
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        System.out.println("Date after 5 days: " + futureDate);

        // 日期加減操作：減 2 個月
        calendar.add(Calendar.MONTH, -2);
        Date pastDate = calendar.getTime();
        System.out.println("Date 2 months ago: " + pastDate);

        // 自訂日期
        calendar.set(2024, Calendar.DECEMBER, 25, 15, 30);
        Date customDate = calendar.getTime();
        System.out.println("Custom Date: " + customDate);
    }
}
