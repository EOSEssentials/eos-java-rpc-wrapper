package client;

import client.domain.response.chain.Block;
import client.domain.response.chain.ChainInfo;

public interface EosApiRestClient {

    ChainInfo getChainInfo();

    Block getBlock(String blockNumberOrId);
}
