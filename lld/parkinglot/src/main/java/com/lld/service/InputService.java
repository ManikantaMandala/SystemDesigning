package com.lld.service;

import java.util.Scanner;

public class InputService {
    static InputService instance;
    Scanner sc;

    private InputService() {
        sc = new Scanner(System.in);
    }

    public InputService getInstance() {
        if (instance == null) {
            return new InputService();
        }
        return instance;
    }

    public String next() {
        return sc.next();
    }

    public int nextInt() {
        return sc.nextInt();
    }

    public void close() {
        if (sc == null) {
            return;
        }
        sc.close();
    }
}
