package client.domain.common.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

public class PackedTransaction {

    private String region;

    private String maxNetUsageWords;

    private String expiration;

    private String refBlockPrefix;

    private String refBlockNum;

    private Integer maxCpuUsageMs;

    private List<String> contextFreeData;

    private List<String> transactionExtensions;

    private List<TransactionAction> contextFreeActions;

    private List<TransactionAction> actions;

    private Integer delaySec;


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMaxNetUsageWords() {
        return maxNetUsageWords;
    }

    @JsonProperty("max_net_usage_words")
    public void setMax_net_usage_words(String maxNetUsageWords) {
        this.maxNetUsageWords = maxNetUsageWords;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getRefBlockPrefix() {
        return refBlockPrefix;
    }

    @JsonProperty("ref_block_prefix")
    public void setRefBlockPrefix(String refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public Integer getMaxCpuUsageMs() {
        return maxCpuUsageMs;
    }

    @JsonProperty("max_cpu_usage_ms")
    public void setMaxCpuUsageMs(Integer maxCpuUsageMs) {
        this.maxCpuUsageMs = maxCpuUsageMs;
    }

    public String getRefBlockNum() {
        return refBlockNum;
    }

    @JsonProperty("ref_block_num")
    public void setRefBlockNum(String refBlockNum) {
        this.refBlockNum = refBlockNum;
    }

    public List<String> getContextFreeData() {
        return contextFreeData;
    }

    @JsonProperty("context_free_data")
    public void setContextFreeData(List<String> contextFreeData) {
        this.contextFreeData = contextFreeData;
    }


    public List<TransactionAction> getContextFreeActions() {
        return contextFreeActions;
    }

    @JsonProperty("context_free_actions")
    public void setContextFreeActions(List<TransactionAction>contextFreeActions) {
        this.contextFreeActions = contextFreeActions;
    }

    public List<TransactionAction> getActions() {
        return actions;
    }

    public void setActions(List<TransactionAction> actions) {
        this.actions = actions;
    }

    public Integer getDelaySec() {
        return delaySec;
    }

    @JsonProperty("delay_sec")
    public void setDelaySec(Integer delaySec) {
        this.delaySec = delaySec;
    }

    public List<String> getTransactionExtensions() {
        return transactionExtensions;
    }

    @JsonProperty("transaction_extensions")
    public void setTransactionExtensions(List<String> transactionExtensions) {
        this.transactionExtensions = transactionExtensions;
    }
}
