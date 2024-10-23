package com.panpan.internet;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author panpan
 * @create 2024-09-09-上午 11:10
 */
public class User implements Serializable {
    private static final long serialVersionUID = -3344233772289810648L;
    String name;
    String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
