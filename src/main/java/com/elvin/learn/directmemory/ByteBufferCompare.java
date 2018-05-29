package com.elvin.learn.directmemory;

import java.nio.ByteBuffer;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : ByteBufferCompare v0.1 2018/5/24 13:55 By Haifeng Pang.
 * @description :
 */
public class ByteBufferCompare {

    public static void main(String[] args) {
        //allocateCompare();
        operateCompare();
    }

    /**
     * 在进行10000000次分配操作时，堆内存 分配耗时:69ms
     * 在进行10000000次分配操作时，直接内存 分配耗时:6217ms
     */
    public static void allocateCompare() {
        int time = 10000000;

        long st = System.currentTimeMillis();

        for (int i = 0; i < time; i++) {
            ByteBuffer buffer = ByteBuffer.allocate(2);
        }

        long et = System.currentTimeMillis();

        System.out.println("在进行" + time + "次分配操作时，堆内存 分配耗时:" + (et - st) + "ms");

        long stHeap = System.currentTimeMillis();

        for (int i = 0; i < time; i++) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(2);
        }

        long etDirect = System.currentTimeMillis();
        System.out.println("在进行" + time + "次分配操作时，直接内存 分配耗时:" + (etDirect - stHeap) + "ms");

    }

    public static void operateCompare() {
        int time = 1000000000;

        ByteBuffer buffer = ByteBuffer.allocate(2 * time);

        long st = System.currentTimeMillis();

        /**
         * 这里会报一个BufferUnderflowException异常 暂时未解决
         */
        for (int i = 0; i < time; i++) {
            buffer.putChar('a');
        }

        for (int i = 0; i < time-1; i++) {
            buffer.getChar();
        }

        long et = System.currentTimeMillis();

        System.out.println("在进行" + time + "次读写操作时，非直接内存读写耗时：" + (et - st) + "ms");

        ByteBuffer bufferD = ByteBuffer.allocateDirect(2 * time);

        long stDirect = System.currentTimeMillis();

        for (int i = 0; i < time; i++) {
            bufferD.putChar('a');
        }

        //回绕缓冲区
        bufferD.flip();

        for (int i = 0; i < time; i++) {
            bufferD.getChar();
        }

        long etDirect = System.currentTimeMillis();
        System.out.println("在进行" + time + "次读写操作时，直接内存读写耗时:" + (etDirect - stDirect) + "ms");
    }

}
