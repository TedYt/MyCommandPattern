package com.tim.demo;

/**
 * Created by Tim on 16/10/9.
 *
 *
 *
 * 一个ConcreteCommand
 */
public class StopCommand implements Command {

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
