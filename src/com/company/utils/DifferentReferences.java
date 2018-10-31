package com.company.utils;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class DifferentReferences {

    public static void main(String[] args) {
        // 1. 强引用 StrongReference
        // 1.1 当内存空间不足，Java虚拟机宁愿抛出OutOfMemoryError错误，使程序异常终止，也不会靠随意回收具有强引用的对象来
        // 解决内存不足的问题。
        Object o = new Object();

        // 1.2 显式地设置o为null，帮助垃圾收集器回收此对象
        o = null;

        // 1.3 超出对象的生命周期范围
        test();

        // 2. 软引用 SoftReference
        // 2.1 如果一个对象只具有软引用，则内存空间足够，垃圾回收器就不会回收它；如果内存空间不足了，就会回收这些对象的内存。
        // 只要垃圾回收器没有回收它，该对象就可以被程序使用。

        // 2.2 软引用可用来实现内存敏感的高速缓存。
        String str = new String("abc");                    // 强引用
        SoftReference<String> softRef = new SoftReference<>(str);  // 软引用
//        垃圾回收器进行扫描回收时等价于
//        If(JVM.内存不足()) {
//            str = null;  // 转换为软引用
//            System.gc(); // 垃圾回收器进行回收
//        }

        // 2.3  软引用可以和一个引用队列（ReferenceQueue）联合使用，如果软引用所引用的对象被垃圾回收器回收，Java虚拟机就会把
        // 这个软引用加入到与之关联的引用队列中。

        // 3. 弱引用 WeakReference
        // 3.1 弱引用与软引用的区别在于：只具有弱引用的对象拥有更短暂的生命周期。在垃圾回收器线程扫描它所管辖的内存区域的过程中，
        // 一旦发现了只具有弱引用的对象，不管当前内存空间足够与否，都会回收它的内存。不过，由于垃圾回收器是一个优先级很低的线程，
        // 因此不一定会很快发现那些只具有弱引用的对象。
        String str2 = new String("abc");
        WeakReference<String> weakRef = new WeakReference<>(str);
//        垃圾回收器进行扫描回收时等价于
//        str = null;
//        System.gc();

        // 3.2 如果这个对象是偶尔的使用，并且希望在使用时随时就能获取到，但又不想影响此对象的垃圾收集，那么你应该用 Weak Reference
        // 来记住此对象。当你想引用一个对象，但是这个对象有自己的生命周期，你不想介入这个对象的生命周期，这时候你就是用弱引用。
        // 下面的代码会让str再次变为一个强引用：
        String abc = weakRef.get();

        // 3.3 弱引用可以和一个引用队列（ReferenceQueue）联合使用，如果弱引用所引用的对象被垃圾回收，Java虚拟机就会把这个弱引用加
        // 入到与之关联的引用队列中。

        // 4. 虚引用 PhantomReference
        //  “虚引用”顾名思义，就是形同虚设，与其他几种引用都不同，虚引用并不会决定对象的生命周期。如果一个对象仅持有虚引用，那么它就
        // 和没有任何引用一样，在任何时候都可能被垃圾回收器回收。虚引用主要用来跟踪对象被垃圾回收器回收的活动。虚引用与软引用和弱引用
        // 的一个区别在于：虚引用必须和引用队列 （ReferenceQueue）联合使用。当垃圾回收器准备回收一个对象时，如果发现它还有虚引用，
        // 就会在回收对象的内存之前，把这个虚引用加入到与之关联的引用队列中。
    }

    public static void test() {
        Object o = new Object();
    }

}
