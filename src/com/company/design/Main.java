package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.Bclazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*

        // 1.singleTon 패턴
        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));


        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);


        // 2.dapater 패턴
        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);



        //no cache
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        //3. proxy 패턴
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        //aop 패턴 -> proxy 패턴을 활용하여 앞뒤로 내가 원하는 기능을
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
            ()->{
                System.out.println("before");
                start.set(System.currentTimeMillis());

            },
            ()->{
                long now = System.currentTimeMillis();
                end.set(now - start.get());
            });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());


        //4. Decorator 패턴
        ICar audi = new Audi(1000);
        audi.showPrice();

        //a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        //a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        //a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();



        //5. Observer 패턴 -> event 를 전달하는 패턴
        Button button = new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지전달 : click1");
        button.click("메시지전달 : click2");
        button.click("메시지전달 : click3");
        button.click("메시지전달 : click4");



        //6. Facade 패턴
//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");

        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();

         */




    }

    //콘센트
//    public static void connect(Electronic110V electronic110V){
//        electronic110V.powerOn();
//    }

    //
}
