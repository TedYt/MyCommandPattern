package com.tim.pattern;

/**
 * Created by Tim on 16/10/9.
 */
public class Invoker {

    //必须包含一个Command的对象,用于调用执行命令的方法
    private Command mCommad;

    public Invoker(Command mCommad) {
        this.mCommad = mCommad;
    }

    public void action(){
        mCommad.execute();
    }
}
