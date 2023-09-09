package com.saif.aop.app.soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Map;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> counter;

    @Pointcut("execution(** CompactDisc.play(int, String)) && args(track, playedBy)")
    public void trackPlayed(int track, String playedBy) {
    }

    @Before("trackPlayed(trackNo, playedBy)")
    public void countTrack(int trackNo, String playedBy) {
        int cnt = getTrackCount(trackNo);
        counter.put(trackNo, cnt + 1);

        System.out.println("Playing the " + trackNo + " th track for " + (cnt + 1) + " times. Played by : " + playedBy);
    }

    private int getTrackCount(int track) {
        return counter.getOrDefault(track, 0);
    }

    public Map<Integer, Integer> getCounter() {
        return counter;
    }

    public void setCounter(Map<Integer, Integer> counter) {
        this.counter = counter;
    }
}
