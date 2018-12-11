
package client.domain.response.history.action;

import client.domain.common.ActionTrace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Action {

    private Long accountActionSeq;

    private ActionTrace actionTrace;

    private Long blockNum;

    private String blockTime;

    private Long globalActionSeq;

    public Long getAccountActionSeq() {
        return accountActionSeq;
    }

    @JsonProperty("account_action_seq")
    public void setAccountActionSeq(Long accountActionSeq) {
        this.accountActionSeq = accountActionSeq;
    }

    public ActionTrace getActionTrace() {
        return actionTrace;
    }

    @JsonProperty("action_trace")
    public void setActionTrace(ActionTrace actionTrace) {
        this.actionTrace = actionTrace;
    }

    public Long getBlockNum() {
        return blockNum;
    }

    @JsonProperty("block_num")
    public void setBlockNum(Long blockNum) {
        this.blockNum = blockNum;
    }

    public String getBlockTime() {
        return blockTime;
    }

    @JsonProperty("block_time")
    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public Long getGlobalActionSeq() {
        return globalActionSeq;
    }

    @JsonProperty("global_action_seq")
    public void setGlobalActionSeq(Long globalActionSeq) {
        this.globalActionSeq = globalActionSeq;
    }

}
