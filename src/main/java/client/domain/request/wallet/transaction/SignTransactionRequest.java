package client.domain.request.wallet.transaction;

import java.util.List;

public class SignTransactionRequest {

    private UnsignedTransaction unsignedTransaction;

    private List<String> publicKeys;

    private String chainId;

    public SignTransactionRequest(UnsignedTransaction unsignedTransaction, List<String> publicKeys, String chainId){
        this.unsignedTransaction = unsignedTransaction;
        this.publicKeys = publicKeys;
        this.chainId = chainId;
    }
}
