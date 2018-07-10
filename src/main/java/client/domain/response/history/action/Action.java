
package client.domain.response.history.action;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Action {

    private Integer accountActionSeq;

    private ActionTrace actionTrace;

    private Integer blockNum;

    private String blockTime;

    private Integer globalActionSeq;

    public Integer getAccountActionSeq() {
        return accountActionSeq;
    }

    @JsonProperty("account_action_seq")
    public void setAccountActionSeq(Integer accountActionSeq) {
        this.accountActionSeq = accountActionSeq;
    }

    public ActionTrace getActionTrace() {
        return actionTrace;
    }

    @JsonProperty("action_trace")
    public void setActionTrace(ActionTrace actionTrace) {
        this.actionTrace = actionTrace;
    }

    public Integer getBlockNum() {
        return blockNum;
    }

    @JsonProperty("block_num")
    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public String getBlockTime() {
        return blockTime;
    }

    @JsonProperty("block_time")
    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public Integer getGlobalActionSeq() {
        return globalActionSeq;
    }

    @JsonProperty("global_action_seq")
    public void setGlobalActionSeq(Integer globalActionSeq) {
        this.globalActionSeq = globalActionSeq;
    }

}
