package client.impl;


import client.EosApiRestClient;
import client.domain.request.chain.RequiredKeysRequest;
import client.domain.request.chain.TransactionRequest;
import client.domain.request.wallet.transaction.UnsignedTransaction;
import client.domain.response.chain.*;

import java.net.Proxy;
import java.util.*;

public class EosApiRestClientImpl implements EosApiRestClient{

    private final EosApiService eosApiService;

    public EosApiRestClientImpl(String baseUrl, Proxy proxy){
        eosApiService = EosApiServiceGenerator.createService(EosApiService.class, baseUrl, proxy);
    }

    @Override
    public ChainInfo getChainInfo(){
        return EosApiServiceGenerator.executeSync(eosApiService.getChainInfo());
    }

    @Override
    public Block getBlock(String blockNumberOrId){
        return EosApiServiceGenerator.executeSync(eosApiService.getBlock(Collections.singletonMap("block_num_or_id", blockNumberOrId)));
    }

    @Override
    public Account getAccount(String accountName){
        return EosApiServiceGenerator.executeSync(eosApiService.getAccount(Collections.singletonMap("account_name", accountName)));
    }

    @Override
    public Code getCode(String accountName){
        return EosApiServiceGenerator.executeSync(eosApiService.getCode(Collections.singletonMap("account_name", accountName)));
    }

    @Override
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

    @Override
    public AbiBinJson apiBinToJson(String code, String action, String binargs){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(3);

        requestParameters.put("code", code);
        requestParameters.put("action", action);
        requestParameters.put("binargs", binargs);

        return EosApiServiceGenerator.executeSync(eosApiService.apiBinToJson(requestParameters));
    }

    @Override
    public void pushTransactions(List<TransactionRequest> transactionRequests){
        EosApiServiceGenerator.executeSync(eosApiService.pushTransaction(transactionRequests));
    }

    @Override
    public RequiredKeys getRequiredKeys(RequiredKeysRequest requiredKeysRequests){
        return EosApiServiceGenerator.executeSync(eosApiService.getRequiredKeys(requiredKeysRequests));
    }

    @Override
    public String createWallet(String walletName){
        return EosApiServiceGenerator.executeSync(eosApiService.createWallet(walletName));
    }

    @Override
    public void openWallet(String walletName){
        EosApiServiceGenerator.executeSync(eosApiService.openWallet(walletName));
    }

    @Override
    public void lockWallet(String walletName){
        EosApiServiceGenerator.executeSync(eosApiService.lockWallet(walletName));
    }

    @Override
    public void lockAllWallets(){
        EosApiServiceGenerator.executeSync(eosApiService.lockAll());
    }

    @Override
    public void unlockWallet(String walletName, String walletPassword){
        List<String> requestFields = new ArrayList<>(2);

        requestFields.add(walletName);
        requestFields.add(walletPassword);
        EosApiServiceGenerator.executeSync(eosApiService.unlockWallet(requestFields));
    }

    @Override
    public void importKeyIntoWallet(String walletName, String key){
        List<String> requestFields = new ArrayList<>(2);

        requestFields.add(walletName);
        requestFields.add(key);
        EosApiServiceGenerator.executeSync(eosApiService.importKey(requestFields));
    }

    @Override
    public List<String> listWallets(){
        return EosApiServiceGenerator.executeSync(eosApiService.listWallets());
    }

    @Override
    public List<List<String>> listKeys(){
       return EosApiServiceGenerator.executeSync(eosApiService.listKeys());
    }

    @Override
    public List<String> getPublicKeys(){
        return EosApiServiceGenerator.executeSync(eosApiService.getPublicKeys());
    }

    @Override
    public client.domain.response.wallet.SignTransaction signTransaction(UnsignedTransaction unsignedTransaction) {
        return EosApiServiceGenerator.executeSync(eosApiService.signTransaction(unsignedTransaction));
    }

    @Override
    public void setWalletTimeout(Integer timeout){
        EosApiServiceGenerator.executeSync(eosApiService.setTimeout(timeout));
    }


}
