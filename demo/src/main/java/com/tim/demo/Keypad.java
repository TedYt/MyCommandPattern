package com.tim.demo;

/**
 * Created by Tim on 16/10/9.
 *
 * 充当是Invoker角色
 * 必须包含所有Command对应的方法
 */
public class Keypad {
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public void setPlayCommand(Command command){
        this.playCommand = command;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play(){
        this.playCommand.execute();
    }

    public void rewind(){
        this.rewindCommand.execute();
    }

    public void stop(){
        this.stopCommand.execute();
    }

}
