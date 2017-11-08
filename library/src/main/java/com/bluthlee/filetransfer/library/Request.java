package com.bluthlee.filetransfer.library;

import android.support.annotation.NonNull;

/**
 * Created by LC on 2017/11/7.
 */

public abstract class Request implements Comparable<Request> {

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    private Priority priority = Priority.NORMAL;

    /**
     * 设置优先级
     */
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public int compareTo(@NonNull Request request) {
        return this.priority.ordinal() - request.priority.ordinal();
    }
}
