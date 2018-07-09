package client.domain.response.chain.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class ActionTrace {

    private String console;

    private Integer cpuUsage;

    private Integer totalCpuUsage;

    private String receiver;

    private String profilingUs;

    private Act act;

    private String contextFree;

    private Receipt receipt;

    private Integer elapsed;

    private List<Map<String, Object>> inlineTraces;

    private String trxId;

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public Integer getCpuUsage() {
        return cpuUsage;
    }

    @JsonProperty("cpu_usage")
    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getProfilingUs() {
        return profilingUs;
    }

    @JsonProperty("_profiling_us")
    public void setProfilingUs(String profilingUs) {
        this.profilingUs = profilingUs;
    }

    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
    }

    public String getContextFree() {
        return contextFree;
    }

    @JsonProperty("context_free")
    public void setContextFree(String contextFree) {
        this.contextFree = contextFree;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Integer getElapsed() {
        return elapsed;
    }

    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    public List<Map<String, Object>> getInlineTraces() {
        return inlineTraces;
    }

    @JsonProperty("inline_traces")
    public void setInlineTraces(List<Map<String, Object>> inlineTraces) {
        this.inlineTraces = inlineTraces;
    }

    public Integer getTotalCpuUsage() {
        return totalCpuUsage;
    }

    @JsonProperty("total_cpu_usage")
    public void setTotalCpuUsage(Integer totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
    }

    public String getTrxId() {
        return trxId;
    }

    @JsonProperty("trx_id")
    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }
}
