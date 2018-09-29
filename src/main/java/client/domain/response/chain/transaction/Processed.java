package client.domain.response.chain.transaction;

import client.domain.common.ActionTrace;
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
public class Processed {

    @JsonProperty("kcpu_usage")
    private String kcpuUsage;

    @JsonProperty("action_traces")
    private List<ActionTrace> actionTraces;

    @JsonProperty("deferred_transaction_requests")
    private List<String> deferredTransactionRequests;

    @JsonProperty("cpu_usage")
    private String cpuUsage;

    private String status;

    @JsonProperty("write_locks")
    private List<Lock> writeLocks;

    @JsonProperty("region_id")
    private String regionId;

    @JsonProperty("net_usage_words")
    private String netUsageWords;

    @JsonProperty("shared_index")
    private String sharedIndex;

    private String id;

    @JsonProperty("cycle_index")
    private String cycleIndex;

    @JsonProperty("_setup_profiling_us")
    private String setupProfilingUs;

    @JsonProperty("_profiling_us")
    private String profilingUs;

    @JsonProperty("net_usage")
    private String netUsage;

    @JsonProperty("packed_trx_digest")
    private String packedTrxDigest;

    private List<Lock> readLocks;

}
