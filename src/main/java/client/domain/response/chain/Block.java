package client.domain.response.chain;

import client.domain.response.chain.block.NewProducers;
import client.domain.response.history.transaction.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {

    private String previous;

    @JsonProperty("timestamp")
    private String timeStamp;

    @JsonProperty("transaction_mroot")
    private String transactionMerkleRoot;

    @JsonProperty("action_mroot")
    private String actionMerkleRoot;

    @JsonProperty("block_mroot")
    private String blockMerkleRoot;

    private String producer;

    @JsonProperty("schedule_version")
    private String scheduleVersion;

    @JsonProperty("new_producers")
    private NewProducers newProducers;

    @JsonProperty("producer_signature")
    private String producerSignature;

    private String id;

    @JsonProperty("block_num")
    private Long blockNum;

    @JsonProperty("ref_block_prefix")
    private Long refBlockPrefix;

    private Boolean confirmed;

    private Transaction[] transactions;

    @JsonProperty("header_extensions")
    private String[] headerExtensions;

    @JsonProperty("block_extensions")
    private String[] blockExtensions;
}
