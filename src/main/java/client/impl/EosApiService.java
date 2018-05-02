package client.impl;

import client.domain.Request.chain.RequiredKeysRequest;
import client.domain.Request.chain.TransactionRequest;
import client.domain.response.chain.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;
import java.util.Map;

public interface EosApiService {

    @GET("/v1/chain/get_info")
    Call<ChainInfo> getChainInfo();

    @POST("/v1/chain/get_block")
    Call<Block> getBlock(@Body Map<String, String> requestFields);

    @POST("/v1/chain/get_account")
    Call<Account> getAccount(@Body Map<String, String> requestFields);

    @POST("/v1/chain/get_code")
    Call<Code> getCode(@Body Map<String, String> requestFields);

    @POST("/v1/chain/get_table_rows")
    Call<TableRow> getTableRows(@Body Map<String, String> requestFields);

    @POST("/v1/chain/abi_bin_to_json")
    Call<AbiBinJson> apiBinToJson(@Body Map<String, String> requestFields);

    @POST("/v1/chain/push_transaction")
    Call<Void> pushTransaction(@Body List<TransactionRequest> transactionRequests);

    @POST("/v1/chain/get_required_keys")
    Call<RequiredKeys> getRequiredKeys(@Body RequiredKeysRequest requiredKeysRequest);

    @POST("/v1/wallet/create")
    Call<String> createWallet(@Body String walletName);

    @POST("/v1/wallet/open")
    Call<Void> openWallet(@Body String walletName);

    @POST("/v1/wallet/lock")
    Call<Void> lockWallet(@Body String walletName);

    @GET("/v1/wallet/lock_all")
    Call<Void> lockAll();

    @POST("/v1/wallet/unlock")
    Call<Void> unlockWallet(@Body String walletName, String walletPassword);

    @POST("/v1/wallet/import_key")
    Call<Void> importKey(@Body String walletName, String walletPassword);

    @GET("/v1/wallet/list_wallets")
    Call<Void> listWallets();

    @GET("/v1/wallet/list_keys")
    Call<Void> listKeys();

    @POST("/v1/wallet/set_timeout")
    Call<Void> getPublicKeys(@Body Map<String, String> requestFields);

    @POST("/v1/wallet/sign_transaction")
    Call<Void> getPublicKeys();
}
