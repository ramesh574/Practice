package com.ramesh;

import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) throws  Exception {
      RandomAccessFile raf=new RandomAccessFile("/home/ramesh/IdeaProjects/Exception/Data.text","rw");
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.write('d');
        System.out.println((char)raf.read());
        raf.skipBytes(2);
        System.out.println((char)raf.read());
        raf.seek(2);
        System.out.println((char)raf.read());
    }
}
