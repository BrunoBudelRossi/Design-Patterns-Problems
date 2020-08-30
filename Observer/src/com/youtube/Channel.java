package com.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subs = new ArrayList<>();
    String video;

    @Override
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }

    @Override
    public void notifySubs(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }

    @Override
    public void upload(String video){
        this.video = video;
        notifySubs();
    }
}
