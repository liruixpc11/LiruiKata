package lab.lirui.clock;

/**
 * 创建于2014/12/28 1:20。
 *
 * @author 睿
 */
public class HotelWorldClocksRunner {
    public static void main(String[] args) {
        UtcTime utcTime = new UtcTime();
        utcTime.attach("beijing", new CityClock(8));
        utcTime.attach("london", new CityClock(0));
        utcTime.attach("moscow", new CityClock(4));
        utcTime.attach("newYork", new CityClock(-5));
        utcTime.printTimeOfAllClocks();
        
        Clock phoneClock = new PhoneClock(utcTime);
        phoneClock.setLocalTime(10);
        utcTime.printTimeOfAllClocks();
        
        phoneClock.setLocalTime(12);
        utcTime.printTimeOfAllClocks();
        
        phoneClock.setLocalTime(0);
        utcTime.printTimeOfAllClocks();
        
        phoneClock.setLocalTime(23);
        utcTime.printTimeOfAllClocks();
    }
}
