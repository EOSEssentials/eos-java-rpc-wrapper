package client.domain.common.transaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PackedTransaction {

    private String region;

    @JsonProperty("max_net_usage_words")
    private String maxNetUsageWords;

    private String expiration;

    @JsonProperty("ref_block_prefix")
    private String refBlockPrefix;

    @JsonProperty("ref_block_num")
    private String refBlockNum;

    @JsonProperty("max_cpu_usage_ms")
    private Integer maxCpuUsageMs;

    @JsonProperty("context_free_data")
    private List<String> contextFreeData;

    @JsonProperty("transaction_extensions")
    private List<String> transactionExtensions;

    @JsonProperty("context_free_actions")
    private List<TransactionAction> contextFreeActions;

    private List<TransactionAction> actions;

    @JsonProperty("delay_sec")
    private Integer delaySec;

}
