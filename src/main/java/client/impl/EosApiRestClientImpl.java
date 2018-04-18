package client.impl;

import client.EosApiRestClient;

import java.net.Proxy;

public class EosApiRestClientImpl implements EosApiRestClient{

    private final EosApiService eosApiService;

    public EosApiRestClientImpl(String apiKey, String secret, Proxy proxy){
        eosApiService = EosApiServiceGenerator.createService(EosApiService.class, apiKey, secret, proxy);
    }

    @Override
    public void ping() {

    }
}
