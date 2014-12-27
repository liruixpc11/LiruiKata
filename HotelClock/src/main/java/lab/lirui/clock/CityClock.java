package lab.lirui.clock;

/**
 * 创建于2014/12/28 1:15。
 *
 * @author 睿
 */
public class CityClock extends Clock {
    public CityClock(int utfOffset) {
        super(utfOffset);
    }

    @Override
    protected void onTimAdjusted() {
    }
}
