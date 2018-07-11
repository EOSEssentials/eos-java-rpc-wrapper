
package client.domain.response.history.transaction;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

    private String id;

    private Object trx;

    private String blockTime;

    private Integer blockNum;

    private Integer lastIrreversibleBlock;

    private List<Trace> traces = null;

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

    public List<Trace> getTraces() {
        return traces;
    }

    @JsonProperty("traces")
    public void setTraces(List<Trace> traces) {
        this.traces = traces;
    }

}
