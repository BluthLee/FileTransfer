package com.bluthlee.filetransfer.library;

/**
 * Created by LC on 2017/11/9.
 */

public class Response<T> {

    public final T result;

    public Response(T result) {
        this.result = result;
    }

}
