package com.youtube;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
