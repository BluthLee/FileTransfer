package com.bluthlee.filetransfer.library;

import java.io.InputStream;
import java.util.Map;

/**
 * Created by LC on 2017/11/9.
 */

public final class HttpResponse {

    private final int statusCode;
    private final Map<String, String> headers;
    private final long contentLength;
    private final InputStream inputStream;

    public HttpResponse(int statusCode, Map<String, String> headers, long contentLength, InputStream inputStream) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.contentLength = contentLength;
        this.inputStream = inputStream;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public long getContentLength() {
        return contentLength;
    }

    public InputStream getInputStream() {
        return inputStream;
    }
}
