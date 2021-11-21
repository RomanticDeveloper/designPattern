package com.company.design.proxy;

public class BrowserProxy implements IBrowser {

    private String url;
    private Html html;



    public BrowserProxy(String url){
        this.url = url;
    }

    @Override
    public Html show() {
       if(this.html == null){
           this.html = new Html(url);
           System.out.println("BrowserProxy loading html form : " + url);
       }

       System.out.println("Browser use cache html : " + url);

       return html;
    }
}
