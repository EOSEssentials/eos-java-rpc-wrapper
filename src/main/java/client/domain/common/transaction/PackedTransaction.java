package client.domain.common.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

public class PackedTransaction {

    private String region;

    private String maxNetUsageWords;

    private String expiration;

    private String refBlockPrefix;

    private String refBlockNum;

    private String maxKcpuUsage;

    private List<String> contextFreeData;

    private List<String> signatures;

    private List<TransactionAction> contextFreeActions;

    private List<TransactionAction> actions;

    private String delaySec;



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

    public String getMaxKcpuUsage() {
        return maxKcpuUsage;
    }

    @JsonProperty("max_kcpu_usage")
    public void setMaxKcpuUsage(String maxKcpuUsage) {
        this.maxKcpuUsage = maxKcpuUsage;
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


    public List<String> getSignatures() {
        return signatures;
    }


    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
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

    public String getDelaySec() {
        return delaySec;
    }

    @JsonProperty("delay_sec")
    public void setDelaySec(String delaySec) {
        this.delaySec = delaySec;
    }

}
