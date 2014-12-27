package lab.lirui.clock;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lirui
 */
public abstract class TimeSubject {
    private Map<String, Clock> clocks = new HashMap<String, Clock>();
    
    public void attach(String cityName, Clock clock) {
        clocks.put(cityName, clock);
    }
    
    public void detach(String cityName) {
        clocks.remove(cityName);
    }
    
    protected void notifyAllClocks() {
        for (Clock clock : clocks.values()) {
            adjustClock(clock);
        }
    }
    
    protected abstract void adjustClock(Clock clock);

    public void printTimeOfAllClocks() {
        System.out.println("===");
        for (String city: clocks.keySet()) {
            System.out.println(String.format("%s: %s", city, clocks.get(city).getLocalTime()));
        }
    }
}
