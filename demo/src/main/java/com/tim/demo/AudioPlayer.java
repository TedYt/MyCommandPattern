package com.tim.demo;

/**
 * Created by Tim on 16/10/9.
 *
 *
 * 充当Receiver的角色
 * 动作的真正处理者
 */
public class AudioPlayer {

    public void play(){
        System.out.println("Real play action...");
    }

    public void rewind(){
        System.out.println("Real rewind action...");
    }

    public void stop(){
        System.out.println("Real stop action...");
    }
}
