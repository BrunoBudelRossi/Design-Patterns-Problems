package com.youtube;
// https://www.youtube.com/watch?v=98DiwRp-KZk
public class Youtube {
    public static void main(String[] args) {
        Channel cursoEmVideo = new Channel();
        Subscriber s1 = new Subscriber("name1");
        Subscriber s2 = new Subscriber("name2");
        Subscriber s3 = new Subscriber("name3");

        cursoEmVideo.subscribe(s1);
        cursoEmVideo.subscribe(s2);
        cursoEmVideo.subscribe(s3);

        s1.subscribeChannel(cursoEmVideo);
        s2.subscribeChannel(cursoEmVideo);
        s3.subscribeChannel(cursoEmVideo);

        cursoEmVideo.upload("Aprendendo sobre Observer");

        cursoEmVideo.unSubscribe(s2);

        cursoEmVideo.upload("Aprendendo sobre Java");

    }
}
