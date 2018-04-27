package client.impl;


import client.EosApiRestClient;
import client.domain.chain.Block;
import client.domain.chain.ChainInfo;

import java.net.Proxy;

public class EosApiRestClientImpl implements EosApiRestClient{

    private final EosApiService eosApiService;

    public EosApiRestClientImpl(String apiKey, String secret, String baseUrl, Proxy proxy){
        eosApiService = EosApiServiceGenerator.createService(EosApiService.class, apiKey, secret, baseUrl, proxy);
    }

    public ChainInfo getChainInfo(){
        return EosApiServiceGenerator.executeSync(eosApiService.getChainInfo());
    }

    public Block getBlock(String blockNumberOrId){
        return EosApiServiceGenerator.executeSync(eosApiService.getBlock(blockNumberOrId));
    }
}
