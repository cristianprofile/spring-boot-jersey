package com.cassiomolin.example.api.service;

import org.springframework.stereotype.Service;

/**
 * Created by cromero on 30/05/2017.
 */

@Service
public class UserImpl implements User {
    @Override
    public String method() {
        return "Hello, World!222";
    }
}
