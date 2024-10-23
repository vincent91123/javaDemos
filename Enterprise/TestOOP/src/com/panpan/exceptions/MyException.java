package com.panpan.exceptions;

/**
 * @author panpan
 * @create 2024-08-23-下午 02:30
 */
public class MyException  extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;


    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String[] args) {
        try {
            throw new MyException("test");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
