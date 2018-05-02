package client.domain.Request.chain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TransactionRequest {

    private String refBlockNum;

    private String refBlockPrefix;

    private String expiration;

    private List<String> scope;

    private List<ActionRequestElement> actionRequestElements;

    private List<String> signatures;

    public TransactionRequest(){

    }

    public String getRefBlockNum() {
        return refBlockNum;
    }

    @JsonProperty("ref_block_num")
    public void setRefBlockNum(String refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public String getRefBlockPrefix() {
        return refBlockPrefix;
    }

    @JsonProperty("ref_block_prefix")
    public void setRefBlockPrefix(String refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public List<ActionRequestElement> getActionRequestElements() {
        return actionRequestElements;
    }

    public void setActionRequestElements(List<ActionRequestElement> actionRequestElements) {
        this.actionRequestElements = actionRequestElements;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }
}
