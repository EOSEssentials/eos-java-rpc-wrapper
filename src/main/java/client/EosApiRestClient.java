package client;

import client.domain.chain.Block;
import client.domain.chain.ChainInfo;

public interface EosApiRestClient {

    ChainInfo getChainInfo();

    Block getBlock(String blockNumberOrId);
}
