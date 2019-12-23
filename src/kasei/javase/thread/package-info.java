package kasei.javase.se.thread;

/** todo 原子性操作
概念：
    一串动作要么全执行，要么全不执行，没有被打断的情况
计算机是如何实现原子性的?
    由于 CPU 在一次时钟周期内，只能做一次 01 变换，所以只要是能在一个时钟周期内完成的 CPU 指令，那就是具有原子性的指令，即是原子性操作
    
*/

/** todo Java 中的线程
基本概念：
    1. java 所有变量都保存在主存（即内存）中
    2. 每一个线程都有一个独立的内存，叫作线程的工作内存
    3. 线程之间不能相互访问对方的工作内存
线程对变量的操作步骤:    
    1. 先从主存复制一份到当前线程的工作内存中
    2. 修改当前线程中的变量值
    3. 不定时的写入主存
    读取内存 -> 线程缓存 -> CPU 计算 -> 线程缓存赋值 -> 同步到内存
volatile 关键字具有以下含义：
    1. 线程对自己工作内存中变量的写入操作立即更新到主存，并给其他线程的工作内存中的相同变量打失效 flag
    2. 每次从工作内存读取变量前先检查失效 flag 是否失效，如果失效，则从主存读取
    坑:
    由于只在读取前检查 flag，如果线程在读取后被阻塞，且变量值被其他线程修改，就会破坏原子性
同步：
    概念：
        多线程同时操作共享变量时，才会出现同步问题
    如何解决？
        同一时刻只能有一个线程操作共享变量，这是线程同步的唯一方法
    Java 代码怎么保证同一时刻只有一个线程访问共享变量？
        synchronized
        Lock
*/


/** 线程间通信：
 * 轮询：自己不断的去查看某个标志是否存在
 * 监听（等待/通知）：如果某个事件发生，由监听者通知自己
 * 回调：事件发生之后，调用自己
 * */


/** 创建线程的方法
 * 1，继承Thread类，重写run方法；
 * 2，实现Runnable接口，重写run方法，但是比继承Thread类好用，实现接口还可以继承类，避免了单继承带来的局限性；
 * 3，实现callable接口，重写call方法，有返回值。
 * 4，使用实现了Executor接口的ThreadPoolExecutor来创建线程池。
 * */


