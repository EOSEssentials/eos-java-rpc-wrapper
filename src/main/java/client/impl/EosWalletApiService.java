package client.impl;

import client.domain.common.transaction.SignedPackedTransaction;
import client.domain.request.wallet.transaction.SignTransactionRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface EosWalletApiService {

    @POST("/v1/wallet/create")
    Call<String> createWallet(@Body String walletName);

    @POST("/v1/wallet/open")
    Call<Void> openWallet(@Body String walletName);

    @POST("/v1/wallet/lock")
    Call<Void> lockWallet(@Body String walletName);

    @GET("/v1/wallet/lock_all")
    Call<Void> lockAll();

    @POST("/v1/wallet/unlock")
    Call<Void> unlockWallet(@Body List<String> requestFields);

    @POST("/v1/wallet/import_key")
    Call<Void> importKey(@Body List<String> requestFields);

    @GET("/v1/wallet/list_wallets")
    Call<List<String>> listWallets();

    @GET("/v1/wallet/list_keys")
    Call<List<List<String>>> listKeys();

    @GET("/v1/wallet/get_public_keys")
    Call<List<String>> getPublicKeys();

    @POST("/v1/wallet/set_timeout")
    Call<Void> setTimeout(@Body Integer timeOut);

    @POST("/v1/wallet/sign_digest")
    Call<String> signDigest(@Body List<String> parameters);

    @POST("/v1/wallet/create_key")
    Call<String> createKey(@Body List<String> parameters);

    @POST("/v1/wallet/sign_transaction")
    Call<SignedPackedTransaction> signTransaction(@Body SignTransactionRequest unsignedTransaction);

}
