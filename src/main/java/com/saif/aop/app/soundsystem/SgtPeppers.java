package com.saif.aop.app.soundsystem;

/**
 * @author saifuzzaman
 * @since 9/9/23
 */
public class SgtPeppers implements CompactDisc{

    @Override
    public void play(int trackNo, String playedBy) {
        System.out.println("Playing the track : " + trackNo + ". Played by : " + playedBy);
    }
}
