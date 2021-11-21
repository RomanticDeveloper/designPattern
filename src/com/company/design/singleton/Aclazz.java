package com.company.design.singleton;

public class Aclazz {
    private SocketClient socketClient;

    public Aclazz(){
        //새로 생성하는 것이 아니라, 생성되어있는 것을 가져오는 개념
        this.socketClient = SocketClient.getInstance();

        //새로운 객체를 만들어 주는 형태
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
