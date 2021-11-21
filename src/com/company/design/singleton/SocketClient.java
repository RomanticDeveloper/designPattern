package com.company.design.singleton;

public class SocketClient {

    //자기 자신을 가지고 있는다
    private static SocketClient socketClient = null;

    //생성자는 private로 막아줌
    private SocketClient(){
    }


    //static 으로 Instance 를 받아올수있는 기능을 제공
    public static SocketClient getInstance(){

        //null 인경우 생성
        if(socketClient == null){
           socketClient = new SocketClient();

        }
        // 아닌경우 생성되어있는 socketClient를 return
        return socketClient;
    }

    private void connect(){
        System.out.println("connect");
    }


}
