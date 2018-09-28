package client.domain.response.history.transaction;

import client.domain.common.ActionTrace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Transaction {

    private String id;

    private Object trx;

    @JsonProperty("block_time")
    private String blockTime;

    @JsonProperty("block_num")
    private Integer blockNum;

    @JsonProperty("last_irreversible_block")
    private Integer lastIrreversibleBlock;

    private List<ActionTrace> traces = null;

    private String status;

    @JsonProperty("cpu_usage_us")
    private String cpuUsageUs;

    @JsonProperty("net_usage_words")
    private String netUsageWords;

}
