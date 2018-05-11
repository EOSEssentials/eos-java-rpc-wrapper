package client;

import client.impl.EosApiRestClientImpl;

public class EosApiClientFactory {

    private String baseUrl;

    private EosApiClientFactory(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    public static EosApiClientFactory newInstance(String baseUrl) {
        return new EosApiClientFactory(baseUrl);
    }


    public EosApiRestClient newRestClient() {
        return new EosApiRestClientImpl(baseUrl);
    }

}
