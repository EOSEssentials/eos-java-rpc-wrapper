package client.impl;

import client.domain.chain.ChainInfo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EosApiService {


    @GET("/v1/chain/get_info")
    Call<ChainInfo> getChainInfo();


}
