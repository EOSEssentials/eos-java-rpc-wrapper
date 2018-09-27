package client.domain.response.history.transaction;

import java.util.List;

import client.domain.common.ActionTrace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

    private String id;

    private Object trx;

    private String blockTime;

    private Integer blockNum;

    private Integer lastIrreversibleBlock;

    private List<ActionTrace> traces = null;

    private String status;

    private String cpuUsageUs;

    private String netUsageWords;

    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Object getTrx() {
        return trx;
    }

    @JsonProperty("trx")
    public void setTrx(Object trx) {
        this.trx = trx;
    }

    public String getBlockTime() {
        return blockTime;
    }

    @JsonProperty("block_time")
    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public Integer getBlockNum() {
        return blockNum;
    }

    @JsonProperty("block_num")
    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public Integer getLastIrreversibleBlock() {
        return lastIrreversibleBlock;
    }

    @JsonProperty("last_irreversible_block")
    public void setLastIrreversibleBlock(Integer lastIrreversibleBlock) {
        this.lastIrreversibleBlock = lastIrreversibleBlock;
    }

    public List<ActionTrace> getTraces() {
        return traces;
    }

    @JsonProperty("traces")
    public void setTraces(List<ActionTrace> traces) {
        this.traces = traces;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpuUsageUs() {
        return cpuUsageUs;
    }

    @JsonProperty("cpu_usage_us")
    public void setCpuUsageUs(String cpuUsageUs) {
        this.cpuUsageUs = cpuUsageUs;
    }

    public String getNetUsageWords() {
        return netUsageWords;
    }

    @JsonProperty("net_usage_words")
    public void setNetUsageWords(String netUsageWords) {
        this.netUsageWords = netUsageWords;
    }
}
