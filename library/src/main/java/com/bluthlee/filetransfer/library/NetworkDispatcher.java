package com.bluthlee.filetransfer.library;

import java.util.concurrent.BlockingQueue;

/**
 * Created by LC on 2017/11/9.
 */

public class NetworkDispatcher extends Thread {

    private final BlockingQueue<Request> queue;

    public NetworkDispatcher(BlockingQueue<Request> queue) {
        this.queue = queue;
    }

}
