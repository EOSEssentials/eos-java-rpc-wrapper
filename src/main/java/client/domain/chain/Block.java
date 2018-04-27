package client.domain.chain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Block {

    private String serverVersion;

    private String timeStamp;

    private String transactionMerkleRoot;

    private String producer;

    private String[] producerChanges;

    private String producerSignature;

    private String[] cycles;

    private String id;

    private String blockNum;

    private String refBlockPrefix;

    public Block(){

    }

    public String getServerVersion() {
        return serverVersion;
    }

    @JsonProperty("server_version")
    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timestamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTransactionMerkleRoot() {
        return transactionMerkleRoot;
    }

    @JsonProperty("transaction_merkle_root")
    public void setTransactionMerkleRoot(String transactionMerkleRoot) {
        this.transactionMerkleRoot = transactionMerkleRoot;
    }

    public String getProducer() {
        return producer;
    }

    @JsonProperty("producer")
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String[] getProducerChanges() {
        return producerChanges;
    }

    @JsonProperty("producer_changes")
    public void setProducerChanges(String[] producerChanges) {
        this.producerChanges = producerChanges;
    }

    public String getProducerSignature() {
        return producerSignature;
    }

    @JsonProperty("producer_signature")
    public void setProducerSignature(String producerSignature) {
        this.producerSignature = producerSignature;
    }

    public String[] getCycles() {
        return cycles;
    }

    @JsonProperty("cycles")
    public void setCycles(String[] cycles) {
        this.cycles = cycles;
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
}
