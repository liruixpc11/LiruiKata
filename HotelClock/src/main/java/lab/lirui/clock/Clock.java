package lab.lirui.clock;

/**
 * 创建于2014/12/28 0:29。
 *
 * @author 睿
 */
public abstract class Clock {
    int localTime;
    int utfOffset;
    
    protected Clock() {}

    protected Clock(int utfOffset) {
        this.utfOffset = utfOffset;
    }
    
    public void setTimeByUtc(int utcTime) {
        setLocalTime(utcTime + utfOffset);
    }
    
    public void setLocalTime(int localTime) {
        if (this.localTime != localTime) {
            this.localTime = (localTime + 24) % 24;
            onTimAdjusted();
        }
    }
    
    public int getLocalTime() {
        return localTime;
    }
    
    public int getUtfTime() {
        return localTime - utfOffset;
    }
    
    public int getUtfOffset() {
        return utfOffset;
    }
    
    protected abstract void onTimAdjusted();
}
