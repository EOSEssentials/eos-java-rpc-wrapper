package client.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionTrace {

    private Act act;

    private String console;

    @JsonProperty("cpu_usage")
    private Integer cpuUsage;

    private Integer elapsed;

    @JsonProperty("inline_traces")
    private List<Object> inlineTraces = null;

    private Receipt receipt;

    @JsonProperty("total_cpu_usage")
    private Integer totalCpuUsage;

    @JsonProperty("trx_id")
    private String trxId;

    @JsonProperty("context_free")
    private boolean contextFree;

    @JsonProperty("block_num")
    private long blockNum;

    @JsonProperty("block_time")
    private String blockTime;

    @JsonProperty("producer_block_id")
    private String producerBlockId;

    @JsonProperty("account_ram_deltas")
    private List<AccountRamDelta> accountRamDeltas;

    @JsonProperty("trx_status")
    private String trxStatus;

    private String createdAt;

}
