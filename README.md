# MyCommandPattern

1. 命令模式的5个角色
   Command 类：抽象类，类中对需要执行的命令进行声明
   ConcreteCommand类：Command类的实现类
   Cliendt类：客户端

   这三个比较理解，另外两个是Invoker类 和 Receive类：
   Invoker类：命令的调用者，不过不是直接调用命令的实现，而是调用Command类中的执行命令
   Receive类：命令的真正执行者，是在Command类中执行命令的实现调用的。

   由上可见，命令模式中一个动作的执行时序是这样的：
   Invoke -> Command(ConcreteCommand) -> Received

   这就是命令模式的核心：将命令的调用者和命令的实现者隔离，做到了完全解耦.
   做到了对命令的封装