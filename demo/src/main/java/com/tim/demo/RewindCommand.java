package com.tim.demo;

/**
 * Created by Tim on 16/10/9.
 *
 *
 *
 * 一个ConcreteCommand
 */
public class RewindCommand implements Command {

    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
