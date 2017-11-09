package com.bluthlee.filetransfer.library;

import android.support.annotation.NonNull;

import java.util.UUID;

/**
 * Created by LC on 2017/11/7.
 */

public class Request implements Comparable<Request> {

    private String id;
    private String url;

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }


    private Priority priority = Priority.NORMAL;

    public Request(String url) {
        this.url = url;
        this.id = UUID.randomUUID().toString();
    }

    public String getUrl() {
        return url;
    }

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
