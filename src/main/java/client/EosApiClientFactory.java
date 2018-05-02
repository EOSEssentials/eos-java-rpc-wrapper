package client;

import client.impl.EosApiRestClientImpl;

import java.net.Proxy;

public class EosApiClientFactory {

    private String baseUrl;

    private Proxy proxy;

    private EosApiClientFactory(String baseUrl, Proxy proxy) {
        this.proxy = proxy;
        this.baseUrl = baseUrl;
    }


    public static EosApiClientFactory newInstance(String baseUrl, Proxy proxy) {
        return new EosApiClientFactory(baseUrl, proxy);
    }


    public EosApiRestClient newRestClient() {
        return new EosApiRestClientImpl(baseUrl, proxy);
    }

}
