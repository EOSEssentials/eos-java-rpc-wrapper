package client;

import client.domain.request.chain.RequiredKeysRequest;
import client.domain.request.chain.TransactionRequest;
import client.domain.request.wallet.transaction.UnsignedTransaction;
import client.domain.response.chain.*;
import client.domain.response.chain.account.Account;
import client.domain.response.chain.code.Code;
import client.domain.response.wallet.TransactionSignature;

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

    void pushTransactions(List<TransactionRequest> transactionRequests);

    RequiredKeys getRequiredKeys(RequiredKeysRequest requiredKeysRequests);

    String createWallet(String walletName);

    void openWallet(String walletName);

    void lockWallet(String walletName);

    void lockAllWallets();

    void unlockWallet(String walletName, String walletPassword);

    void importKeyIntoWallet(String walletName, String walletKey);

    List<String> listWallets();

    List<List<String>> listKeys();

    List<String> getPublicKeys();

    TransactionSignature signTransaction(UnsignedTransaction unsignedTransaction, List<String> publicKeys, String chainId);

    void setWalletTimeout(Integer timeout);
}
