package com.algaworks.algafood.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {

    private String hostServer;

    private Integer port;

    public String getHostServer() {
        return hostServer;
    }

    public void setHostServer(String hostServer) {
        this.hostServer = hostServer;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}


