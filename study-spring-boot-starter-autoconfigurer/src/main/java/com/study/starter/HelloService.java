package com.study.starter;

/**
 * @author: xianlehuang
 * @Description:
 * @date: ${date} ${time}
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name){
       return helloProperties.getPrefix()+"_"+name+"....."+helloProperties.getSuffix();
    }
}
