package client.domain.request.wallet.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UnsignedTransaction {

    private List<String> readScope;

    private List<String> scope;

    private String expiration;

    private Long refBlockPrefix;

    private Long refBlockNum;

    private List<String> signatures;

    private List<TransactionMessage> messages;

    public List<String> getReadScope() {
        return readScope;
    }

    @JsonProperty("read_scope")
    public void setReadScope(List<String> readScope) {
        this.readScope = readScope;
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public Long getRefBlockPrefix() {
        return refBlockPrefix;
    }

    public void setRefBlockPrefix(Long refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public Long getRefBlockNum() {
        return refBlockNum;
    }

    public void setRefBlockNum(Long refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public List<TransactionMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<TransactionMessage> messages) {
        this.messages = messages;
    }
}
