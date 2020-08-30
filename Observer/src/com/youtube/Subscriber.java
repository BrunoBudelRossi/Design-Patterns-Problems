package com.youtube;

public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hey " + name + " New video Uploaded: " + channel.video);
    }

    @Override
    public void subscribeChannel(Channel ch){
        this.channel = ch;
    }
}
