package client.domain.request.chain;

import client.domain.request.wallet.transaction.UnsignedTransaction;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RequiredKeysRequest {

    private UnsignedTransaction transaction;

    private List<String> availableKeys;

    public RequiredKeysRequest(){

    }

    public UnsignedTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(UnsignedTransaction transaction) {
        this.transaction = transaction;
    }

    @JsonProperty("available_keys")
    public List<String> getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(List<String> availableKeys) {
        this.availableKeys = availableKeys;
    }
}
