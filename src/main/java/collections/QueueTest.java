package collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class QueueTest {
    Queue<String> queue1 = new PriorityQueue<>();
    Queue<String> queue2 = new PriorityBlockingQueue<>();
    Queue<String> queue3 = new LinkedBlockingQueue<>();
    Queue<String> queue4 = new SynchronousQueue<>();
    //ArrayDeque arrayDeque = new ArrayDeque();

    public static void main(String[] args){

    }

}
