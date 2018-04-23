package client;

import client.domain.chain.ChainInfo;

public interface EosApiRestClient {

    ChainInfo getChainInfo();
}
