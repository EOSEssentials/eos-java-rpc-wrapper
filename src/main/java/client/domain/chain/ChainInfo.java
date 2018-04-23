package client.domain.chain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChainInfo {

    private String serverVersion;

    private String headBlockNum;

    private String lastIrreversibleBlockNum;

    private String headBlockId;

    private String headBlockTime;

    private String headBlockProducer;

    public ChainInfo(){

    }

    public String getServerVersion() {
        return serverVersion;
    }

    @JsonProperty("server_version")
    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getHeadBlockNum() {
        return headBlockNum;
    }

    @JsonProperty("head_block_num")
    public void setHeadBlockNum(String headBlockNum) {
        this.headBlockNum = headBlockNum;
    }

    public String getLastIrreversibleBlockNum() {
        return lastIrreversibleBlockNum;
    }

    @JsonProperty("last_irreversible_block_num")
    public void setLastIrreversibleBlockNum(String lastIrreversibleBlockNum) {
        this.lastIrreversibleBlockNum = lastIrreversibleBlockNum;
    }

    public String getHeadBlockId() {
        return headBlockId;
    }

    @JsonProperty("head_block_id")
    public void setHeadBlockId(String headBlockId) {
        this.headBlockId = headBlockId;
    }

    public String getHeadBlockTime() {
        return headBlockTime;
    }

    @JsonProperty("head_block_time")
    public void setHeadBlockTime(String headBlockTime) {
        this.headBlockTime = headBlockTime;
    }

    public String getHeadBlockProducer() {
        return headBlockProducer;
    }

    @JsonProperty("head_block_producer")
    public void setHeadBlockProducer(String headBlockProducer) {
        this.headBlockProducer = headBlockProducer;
    }

}
