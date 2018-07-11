package client.domain.request.wallet.transaction;


import client.domain.common.transaction.PackedTransaction;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class SignTransactionRequest {

    private PackedTransaction packedTransaction;

    private List<String> publicKeys;

    private String chainId;

    public SignTransactionRequest(PackedTransaction packedTransaction, List<String> publicKeys, String chainId) {
        this.packedTransaction = packedTransaction;
        this.publicKeys = publicKeys;
        this.chainId = chainId;
    }

    public PackedTransaction getPackedTransaction() {
        return packedTransaction;
    }

    public void setPackedTransaction(PackedTransaction packedTransaction) {
        this.packedTransaction = packedTransaction;
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
