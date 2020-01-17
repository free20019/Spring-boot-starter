package com.study.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: xianlehuang
 * @Description:
 * @date: ${date} ${time}
 */
@ConfigurationProperties(prefix="study.hello")
public class HelloProperties {

    private String prefix;

    private String Suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return Suffix;
    }

    public void setSuffix(String suffix) {
        Suffix = suffix;
    }
}
