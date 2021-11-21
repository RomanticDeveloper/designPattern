package com.company.design.singleton;

public class Bclazz {

    private SocketClient socketClient;

    public Bclazz(){
        //새로 생성하는 것이 아니라, 생성되어있는 것을 가져오는 개념
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
