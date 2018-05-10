package client;

import client.domain.request.chain.transaction.PushTransactionRequest;
import client.domain.response.chain.*;
import client.domain.response.chain.account.Account;
import client.domain.response.chain.code.Code;
import client.domain.common.transaction.PackedTransaction;
import client.domain.response.chain.transaction.PushedTransaction;

import java.util.List;
import java.util.Map;

public interface EosApiRestClient {

    ChainInfo getChainInfo();

    Block getBlock(String blockNumberOrId);

    Account getAccount(String accountName);

    Code getCode(String accountName);

    TableRow getTableRows(String scope, String code, String table);

    AbiBinToJson abiBinToJson(String code, String action, String binargs);

    AbiJsonToBin abiJsonToBin(String code, String action, Map<String, String> args);

    PushedTransaction pushTransaction(String compression, PackedTransaction packedTransaction, List<String> signatures);

    List<PushedTransaction> pushTransactions(List<PushTransactionRequest> pushTransactionRequests);

    RequiredKeys getRequiredKeys(PackedTransaction transaction, List<String> keys);

    String createWallet(String walletName);

    void openWallet(String walletName);

    void lockWallet(String walletName);

    void lockAllWallets();

    void unlockWallet(String walletName, String walletPassword);

    void importKeyIntoWallet(String walletName, String walletKey);

    List<String> listWallets();

    List<List<String>> listKeys();

    List<String> getPublicKeys();

    PackedTransaction signTransaction(PackedTransaction unsignedTransaction, List<String> publicKeys, String chainId);

    void setWalletTimeout(Integer timeout);
}
