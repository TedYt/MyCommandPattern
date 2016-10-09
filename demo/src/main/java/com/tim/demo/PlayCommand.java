package com.tim.demo;

/**
 * Created by Tim on 16/10/9.
 *
 *
 * 一个ConcreteCommand
 */
public class PlayCommand implements Command {

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        this.audioPlayer.play();
    }
}
