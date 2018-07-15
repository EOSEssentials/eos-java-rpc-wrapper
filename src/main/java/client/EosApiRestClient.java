package client;

import client.domain.common.WalletKeyType;
import client.domain.common.transaction.SignedPackedTransaction;
import client.domain.request.chain.transaction.PushTransactionRequest;
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

import java.util.List;
import java.util.Map;

public interface EosApiRestClient {

    ChainInfo getChainInfo();

    Block getBlock(String blockNumberOrId);

    Account getAccount(String accountName);

    Abi getAbi(String accountName);

    Code getCode(String accountName);

    TableRow getTableRows(String scope, String code, String table);

    List<String> getCurrencyBalance(String code, String accountName, String symbol);

    AbiBinToJson abiBinToJson(String code, String action, String binargs);

    <T> AbiJsonToBin abiJsonToBin(String code, String action, T args);

    PushedTransaction pushTransaction(String compression, SignedPackedTransaction packedTransaction);

    List<PushedTransaction> pushTransactions(List<PushTransactionRequest> pushTransactionRequests);

    RequiredKeys getRequiredKeys(PackedTransaction transaction, List<String> keys);

    Map<String, CurrencyStats> getCurrencyStats(String code, String symbol);

    String createWallet(String walletName);

    void openWallet(String walletName);

    void lockWallet(String walletName);

    void lockAllWallets();

    void unlockWallet(String walletName, String walletPassword);

    void importKeyIntoWallet(String walletName, String walletKey);

    List<String> listWallets();

    List<List<String>> listKeys();

    List<String> getPublicKeys();

    SignedPackedTransaction signTransaction(PackedTransaction unsignedTransaction, List<String> publicKeys, String chainId);

    void setWalletTimeout(Integer timeout);

    String signDigest(String digest, String publicKey);

    String createKey(String walletName, WalletKeyType walletKeyType);

    Actions getActions(String accountName, Integer pos, Integer offset);

    Transaction getTransaction(String id);

    KeyAccounts getKeyAccounts(String publicKey);

    ControlledAccounts getControlledAccounts(String controllingAccountName);

}
