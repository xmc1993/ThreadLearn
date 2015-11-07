package com.xmc.thread.learn.noBlocking;

import lombok.Data;

import java.util.PriorityQueue;

/**
 * Created by Administrator on 2015/8/28.
 */
public class StorageQueue {

    private static int queueSize = 10;
    private static PriorityQueue<Integer> queue = new PriorityQueue<Integer>();


}
