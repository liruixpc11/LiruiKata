package lab.lirui.clock;

/**
 * 创建于2014/12/28 0:39。
 *
 * @author 睿
 */
public class UtcTime extends TimeSubject {
    private int utcTime;
    
    public void adjust(int newUtcTime) {
        this.utcTime = newUtcTime;
        notifyAllClocks();
    }
    
    @Override
    protected void adjustClock(Clock clock) {
        clock.setTimeByUtc(utcTime);
    }
}
