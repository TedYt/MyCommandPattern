package com.tim.pattern;

/**
 * Created by Tim on 16/10/9.
 */
public class ConcreteCommand implements Command {

    //必须包含一个Receiver的对象,用于调用真正处理动作的方法
    private Receiver mReceiver;

    public ConcreteCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public void execute() {
        mReceiver.realActionHandler();
    }
}
