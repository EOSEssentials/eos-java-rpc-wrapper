package client.impl;


import client.EosApiRestClient;
import client.domain.common.WalletKeyType;
import client.domain.common.transaction.SignedPackedTransaction;
import client.domain.request.chain.AbiJsonToBinRequest;
import client.domain.request.chain.RequiredKeysRequest;
import client.domain.request.chain.transaction.PushTransactionRequest;
import client.domain.request.wallet.transaction.SignTransactionRequest;
import client.domain.response.chain.*;
import client.domain.response.chain.account.Account;
import client.domain.response.chain.abi.Abi;
import client.domain.response.chain.code.Code;
import client.domain.common.transaction.PackedTransaction;
import client.domain.response.chain.currencystats.CurrencyStats;
import client.domain.response.chain.transaction.PushedTransaction;
import client.domain.response.history.action.Actions;
import client.domain.response.history.controlledaccounts.ControlledAccounts;
import client.domain.response.history.keyaccounts.KeyAccounts;
import client.domain.response.history.transaction.Transaction;


import java.util.*;

public class EosApiRestClientImpl<T> implements EosApiRestClient<T> {

    private final EosApiService eosApiService;

    public EosApiRestClientImpl(String baseUrl){
        eosApiService = EosApiServiceGenerator.createService(EosApiService.class, baseUrl);
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
    public Abi getAbi(String accountName){
        return EosApiServiceGenerator.executeSync(eosApiService.getAbi(Collections.singletonMap("account_name", accountName)));
    }

    @Override
    public Code getCode(String accountName){
        return EosApiServiceGenerator.executeSync(eosApiService.getCode(Collections.singletonMap("account_name", accountName)));
    }

    @Override
    public TableRow getTableRows(String scope, String code, String table){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(7);

        requestParameters.put("scope", scope);
        requestParameters.put("code", code);
        requestParameters.put("table", table);
        requestParameters.put("json", "true");

        return EosApiServiceGenerator.executeSync(eosApiService.getTableRows(requestParameters));
    }

    @Override
    public List<String> getCurrencyBalance(String code, String accountName, String symbol){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(3);

        requestParameters.put("code", code);
        requestParameters.put("account", accountName);
        requestParameters.put("symbol", symbol);

        return EosApiServiceGenerator.executeSync(eosApiService.getCurrencyBalance(requestParameters));
    }

    @Override
    public AbiBinToJson abiBinToJson(String code, String action, String binargs){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(3);

        requestParameters.put("code", code);
        requestParameters.put("action", action);
        requestParameters.put("binargs", binargs);

        return EosApiServiceGenerator.executeSync(eosApiService.abiBinToJson(requestParameters));
    }

    @Override
    public AbiJsonToBin abiJsonToBin (String code, String action, T args){
        return EosApiServiceGenerator.executeSync(eosApiService.abiJsonToBin(new AbiJsonToBinRequest(code, action, args)));
    }

    @Override
    public PushedTransaction pushTransaction(String compression, SignedPackedTransaction packedTransaction){
        return EosApiServiceGenerator.executeSync(eosApiService.pushTransaction(new PushTransactionRequest(compression, packedTransaction, packedTransaction.getSignatures())));
    }

    @Override
    public List<PushedTransaction> pushTransactions(List<PushTransactionRequest> pushTransactionRequests){
        return EosApiServiceGenerator.executeSync(eosApiService.pushTransactions(pushTransactionRequests));
    }

    @Override
    public RequiredKeys getRequiredKeys(PackedTransaction transaction, List<String> keys){
        return EosApiServiceGenerator.executeSync(eosApiService.getRequiredKeys(new RequiredKeysRequest(transaction, keys)));
    }

    @Override
    public Map<String, CurrencyStats> getCurrencyStats(String code, String symbol){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(2);

        requestParameters.put("code", code);
        requestParameters.put("symbol", symbol);

        return EosApiServiceGenerator.executeSync(eosApiService.getCurrencyStats(requestParameters));
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
    public SignedPackedTransaction signTransaction(PackedTransaction packedTransaction, List<String> publicKeys, String chainId) {
        return EosApiServiceGenerator.executeSync(eosApiService.signTransaction(new SignTransactionRequest(packedTransaction, publicKeys, chainId)));
    }

    @Override
    public void setWalletTimeout(Integer timeout){
        EosApiServiceGenerator.executeSync(eosApiService.setTimeout(timeout));
    }

    @Override
    public String signDigest(String digest, String publicKey){
        return EosApiServiceGenerator.executeSync(eosApiService.signDigest(Arrays.asList(digest, publicKey)));
    }

    @Override
    public String createKey(String walletName, WalletKeyType keyType){
        return EosApiServiceGenerator.executeSync(eosApiService.createKey(Arrays.asList(walletName, keyType.name())));
    }

    @Override
    public Actions getActions(String accountName, Integer pos, Integer offset){
        LinkedHashMap<String, Object> requestParameters = new LinkedHashMap<>(3);

        requestParameters.put("account_name", accountName);
        requestParameters.put("pos", pos);
        requestParameters.put("offset", offset);

        return EosApiServiceGenerator.executeSync(eosApiService.getActions(requestParameters));
    }

    @Override
    public Transaction getTransaction(String id){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(1);

        requestParameters.put("id", id);

        return EosApiServiceGenerator.executeSync(eosApiService.getTransaction(requestParameters));
    }

    @Override
    public KeyAccounts getKeyAccounts(String publicKey){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(1);

        requestParameters.put("public_key", publicKey);

        return EosApiServiceGenerator.executeSync(eosApiService.getKeyAccounts(requestParameters));
    }

    @Override
    public ControlledAccounts getControlledAccounts(String controllingAccountName){
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>(1);

        requestParameters.put("controlling_account", controllingAccountName);

        return EosApiServiceGenerator.executeSync(eosApiService.getControlledAccounts(requestParameters));
    }

}
