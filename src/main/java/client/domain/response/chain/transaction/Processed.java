package client.domain.response.chain.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Processed {
    private String kcpuUsage;

    private List<ActionTrace> actionTraces;

    private List<String> deferredTransactionRequests;

    private String cpuUsage;

    private String status;

    private List<Lock> writeLocks;

    private String regionId;

    private String netUsageWords;

    private String sharedIndex;

    private String id;

    private String cycleIndex;

    private String setupProfilingUs;

    private String profilingUs;

    private String netUsage;

    private String packedTrxDigest;

    private List<Lock> readLocks;

    public String getKcpuUsage() {
        return kcpuUsage;
    }

    @JsonProperty("kcpu_usage")
    public void setKcpuUsage(String kcpuUsage) {
        this.kcpuUsage = kcpuUsage;
    }


    public List<ActionTrace> getActionTraces() {
        return actionTraces;
    }

    @JsonProperty("action_traces")
    public void setActionTraces(List<ActionTrace> actionTraces) {
        this.actionTraces = actionTraces;
    }


    public String getCpuUsage() {
        return cpuUsage;
    }

    @JsonProperty("cpu_usage")
    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Lock> getWriteLocks() {
        return writeLocks;
    }

    @JsonProperty("write_locks")
    public void setWriteLocks(List<Lock> writeLocks) {
        this.writeLocks = writeLocks;
    }

    public String getRegionId() {
        return regionId;
    }

    @JsonProperty("region_id")
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    public String getNetUsageWords() {
        return netUsageWords;
    }

    @JsonProperty("net_usage_words")
    public void setNetUsageWords(String netUsageWords) {
        this.netUsageWords = netUsageWords;
    }

    public String getSharedIndex() {
        return sharedIndex;
    }

    @JsonProperty("shared_index")
    public void setSharedIndex(String sharedIndex) {
        this.sharedIndex = sharedIndex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCycleIndex() {
        return cycleIndex;
    }

    @JsonProperty("cycle_index")
    public void setCycleIndex(String cycleIndex) {
        this.cycleIndex = cycleIndex;
    }


    public String getSetupProfilingUs() {
        return setupProfilingUs;
    }

    @JsonProperty("_setup_profiling_us")
    public void setSetupProfilingUs(String setupProfilingUs) {
        this.setupProfilingUs = setupProfilingUs;
    }

    public String getProfilingUs() {
        return profilingUs;
    }

    @JsonProperty("_profiling_us")
    public void setProfilingUs(String profilingUs) {
        this.profilingUs = profilingUs;
    }

    public String getNetUsage() {
        return netUsage;
    }

    @JsonProperty("net_usage")
    public void setNetUsage(String netUsage) {
        this.netUsage = netUsage;
    }


    public String getPackedTrxDigest() {
        return packedTrxDigest;
    }

    @JsonProperty("packed_trx_digest")
    public void setPackedTrxDigest(String packedTrxDigest) {
        this.packedTrxDigest = packedTrxDigest;
    }

    public List<Lock> getReadLocks() {
        return readLocks;
    }

    public void setReadLocks(List<Lock> readLocks) {
        this.readLocks = readLocks;
    }

    public List<String> getDeferredTransactionRequests() {
        return deferredTransactionRequests;
    }

    @JsonProperty("deferred_transaction_requests")
    public void setDeferredTransactionRequests(List<String> deferredTransactionRequests) {
        this.deferredTransactionRequests = deferredTransactionRequests;
    }
}
