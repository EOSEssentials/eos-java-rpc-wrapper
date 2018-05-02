package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {

    private String previous;

    private String timeStamp;

    private String transaction_mroot;

    private String action_mroot;

    private String block_mroot;

    private String producer;

    private String scheduleVersion;

    private String newProducers;

    private String producerSignature;

    private String id;

    private String blockNum;

    private String refBlockPrefix;

    public Block(){
    }

    public String getActionMerkleRoot(){
        return action_mroot;
    }

    @JsonProperty("action_mroot")
    public void setActionMerkleRoot(String actionMerkleRoot){
        this.action_mroot = actionMerkleRoot;
    }

    public String getBlockMerkleRoot(){
        return block_mroot;
    }

    @JsonProperty("block_mroot")
    public void setBlockMerkleRoot(String blockMerkleRoot){
        this.block_mroot = blockMerkleRoot;
    }

    public String getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timestamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTransactionMerkleRoot() {
        return transaction_mroot;
    }

    @JsonProperty("transaction_mroot")
    public void setTransactionMerkleRoot(String transactionMerkleRoot) {
        this.transaction_mroot = transactionMerkleRoot;
    }

    public String getProducer() {
        return producer;
    }

    @JsonProperty("producer")
    public void setProducer(String producer) {
        this.producer = producer;
    }


    public String getProducerSignature() {
        return producerSignature;
    }

    @JsonProperty("producer_signature")
    public void setProducerSignature(String producerSignature) {
        this.producerSignature = producerSignature;
    }

    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public String getBlockNum() {
        return blockNum;
    }

    @JsonProperty("block_num")
    public void setBlockNum(String blockNum) {
        this.blockNum = blockNum;
    }

    public String getRefBlockPrefix() {
        return refBlockPrefix;
    }

    @JsonProperty("ref_block_prefix")
    public void setRefBlockPrefix(String refBlockPrefix) {
        this.refBlockPrefix = refBlockPrefix;
    }

    public String getNewProducers() {
        return newProducers;
    }

    public void setNewProducers(String newProducers) {
        this.newProducers = newProducers;
    }

    public String getScheduleVersion() {
        return scheduleVersion;
    }

    @JsonProperty("schedule_version")
    public void setScheduleVersion(String scheduleVersion) {
        this.scheduleVersion = scheduleVersion;
    }
}
