package com.tim.demo;

/**
 * Created by Tim on 16/10/9.
 */
public class Client {

    public static void test(){

        //顺序定义Receiver, Command, Invoker
        //意思就是:先告诉Receiver,需要接受那些命令,
        AudioPlayer audioPlayer = new AudioPlayer();
        Command play = new PlayCommand(audioPlayer);
        Command rewind = new RewindCommand(audioPlayer);
        Command stop = new StopCommand(audioPlayer);

        //然后再由调用者调用命令
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(play);
        keypad.setRewindCommand(rewind);
        keypad.setStopCommand(stop);

        keypad.play();
        keypad.rewind();
        keypad.stop();

    }
}
