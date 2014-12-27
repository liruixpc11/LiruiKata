package lab.lirui.clock;

/**
 * 创建于2014/12/28 0:51。
 *
 * @author 睿
 */
public class PhoneClock extends Clock {
    private UtcTime utcTime = new UtcTime();

    public PhoneClock(UtcTime utcTime) {
        this.utcTime = utcTime;
    }

    @Override
    protected void onTimAdjusted() {
        utcTime.adjust(getUtfTime());
    }
}
