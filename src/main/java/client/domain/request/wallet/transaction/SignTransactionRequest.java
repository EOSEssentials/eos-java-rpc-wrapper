package client.domain.request.wallet.transaction;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class SignTransactionRequest {

    private UnsignedTransaction unsignedTransaction;

    private List<String> publicKeys;

    private String chainId;

    public SignTransactionRequest(UnsignedTransaction unsignedTransaction, List<String> publicKeys, String chainId){
        this.unsignedTransaction = unsignedTransaction;
        this.publicKeys = publicKeys;
        this.chainId = chainId;
    }

    public UnsignedTransaction getUnsignedTransaction() {
        return unsignedTransaction;
    }

    public void setUnsignedTransaction(UnsignedTransaction unsignedTransaction) {
        this.unsignedTransaction = unsignedTransaction;
    }

    public List<String> getPublicKeys() {
        return publicKeys;
    }

    public void setPublicKeys(List<String> publicKeys) {
        this.publicKeys = publicKeys;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }
}
