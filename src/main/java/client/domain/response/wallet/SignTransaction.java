package client.domain.response.wallet;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SignTransaction {

    private String region;

    private String maxNetUsageWords;

    private String expiration;

    private String refBlockPrefix;

    private String maxKcpuUsage;

    private String refBlockNum;

    private List<String> contextFreeData;

    private List<String> signatures;

    private List<String> contextFreeActions;

    private List<String> actions;

    private String delaySec;

    public String getRegion ()
    {
        return region;
    }

    public void setRegion (String region)
    {
        this.region = region;
    }

    public String getMaxNetUsageWords ()
    {
        return maxNetUsageWords;
    }

    @JsonProperty("max_net_usage_words")
    public void setMax_net_usage_words (String maxNetUsageWords)
    {
        this.maxNetUsageWords = maxNetUsageWords;
    }

    public String getExpiration ()
    {
        return expiration;
    }

    public void setExpiration (String expiration)
    {
        this.expiration = expiration;
    }

    public String getRefBlockPrefix ()
    {
        return refBlockPrefix;
    }

    @JsonProperty("ref_block_prefix")
    public void setRefBlockPrefix (String refBlockPrefix)
    {
        this.refBlockPrefix = refBlockPrefix;
    }

    public String getMaxKcpuUsage ()
    {
        return maxKcpuUsage;
    }

    @JsonProperty("max_kcpu_usage")
    public void setMaxKcpuUsage (String maxKcpuUsage)
    {
        this.maxKcpuUsage = maxKcpuUsage;
    }

    public String getRefBlockNum ()
    {
        return refBlockNum;
    }

    @JsonProperty("ref_block_num")
    public void setRefBlockNum (String refBlockNum)
    {
        this.refBlockNum = refBlockNum;
    }

    public List<String> getContextFreeData ()
    {
        return contextFreeData;
    }

    @JsonProperty("context_free_data")
    public void setContextFreeData (List<String> contextFreeData)
    {
        this.contextFreeData = contextFreeData;
    }

    public List<String> getSignatures ()
    {
        return signatures;
    }

    public void setSignatures (List<String> signatures)
    {
        this.signatures = signatures;
    }

    public List<String> getContext_free_actions ()
    {
        return contextFreeActions;
    }

    @JsonProperty("context_free_actions")
    public void setContextFreeActions (List<String> contextFreeActions)
    {
        this.contextFreeActions = contextFreeActions;
    }

    public List<String> getActions ()
    {
        return actions;
    }

    public void setActions (List<String> actions)
    {
        this.actions = actions;
    }

    public String getDelaySec ()
    {
        return delaySec;
    }

    @JsonProperty("delay_sec")
    public void setDelaySec (String delaySec)
    {
        this.delaySec = delaySec;
    }

}
