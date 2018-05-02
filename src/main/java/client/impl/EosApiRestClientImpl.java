package client.impl;


import client.EosApiRestClient;
import client.domain.Request.chain.RequiredKeysRequest;
import client.domain.Request.chain.TransactionRequest;
import client.domain.response.chain.*;

import java.net.Proxy;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class EosApiRestClientImpl implements EosApiRestClient{

    private final EosApiService eosApiService;

    public EosApiRestClientImpl(String baseUrl, Proxy proxy){
        eosApiService = EosApiServiceGenerator.createService(EosApiService.class, baseUrl, proxy);
    }

    public ChainInfo getChainInfo(){
        return EosApiServiceGenerator.executeSync(eosApiService.getChainInfo());
    }

    public Block getBlock(String blockNumberOrId){
        return EosApiServiceGenerator.executeSync(eosApiService.getBlock(Collections.singletonMap("block_num_or_id", blockNumberOrId)));
    }

    public Account getAccount(String accountName){
        return EosApiServiceGenerator.executeSync(eosApiService.getAccount(Collections.singletonMap("account_name", accountName)));
    }

    public Code getCode(String accountName){
        return EosApiServiceGenerator.executeSync(eosApiService.getCode(Collections.singletonMap("account_name", accountName)));
    }

    public TableRow getTableRows(String scope, String code, String table, Boolean json, int lowerBound, int upperBound, int limit){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(7);

        requestParameters.put("Scope", scope);
        requestParameters.put("code", code);
        requestParameters.put("table", table);
        requestParameters.put("json", Boolean.toString(json));
        requestParameters.put("lower_bound", Integer.toString(lowerBound));
        requestParameters.put("upper_bound", Integer.toString(upperBound));
        requestParameters.put("limit", Integer.toString(limit));

        return EosApiServiceGenerator.executeSync(eosApiService.getTableRows(requestParameters));
    }

    public AbiBinJson apiBinToJson(String code, String action, String binargs){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(3);

        requestParameters.put("code", code);
        requestParameters.put("action", action);
        requestParameters.put("binargs", binargs);

        return EosApiServiceGenerator.executeSync(eosApiService.apiBinToJson(requestParameters));
    }

    public void pushTransactions(List<TransactionRequest> transactionRequests){
        EosApiServiceGenerator.executeSync(eosApiService.pushTransaction(transactionRequests));
    }

    public RequiredKeys getRequiredKeys(RequiredKeysRequest requiredKeysRequests){
        return EosApiServiceGenerator.executeSync(eosApiService.getRequiredKeys(requiredKeysRequests));
    }

    public String createWallet(String walletName){
        return EosApiServiceGenerator.executeSync(eosApiService.createWallet(walletName));
    }

    public void openWallet(String walletName){
        EosApiServiceGenerator.executeSync(eosApiService.openWallet(walletName));
    }

    public void lockWallet(String walletName){
        EosApiServiceGenerator.executeSync(eosApiService.lockWallet(walletName));
    }

    public void lockAllWallets(){
        EosApiServiceGenerator.executeSync(eosApiService.lockAll());
    }

    public void unlockWallet(String walletName, String walletPassword){
        EosApiServiceGenerator.executeSync(eosApiService.unlockWallet(walletName, walletPassword));
    }

    public void importKeyIntoWallet(String walletName, String walletPassword){
        EosApiServiceGenerator.executeSync(eosApiService.unlockWallet(walletName, walletPassword));
    }

    public void listWallets(){
        EosApiServiceGenerator.executeSync(eosApiService.listWallets());
    }

    public void listKeys(){
        EosApiServiceGenerator.executeSync(eosApiService.listKeys());
    }


}
