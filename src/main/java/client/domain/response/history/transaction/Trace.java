
package client.domain.response.history.transaction;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Trace {

    private Receipt receipt;

    private Act act;

    private Integer elapsed;

    private Integer cpuUsage;

    private String console;

    private Integer totalCpuUsage;

    private String trxId;

    private List<Object> inlineTraces = null;

    public Receipt getReceipt() {
        return receipt;
    }

    @JsonProperty("receipt")
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Act getAct() {
        return act;
    }

    @JsonProperty("act")
    public void setAct(Act act) {
        this.act = act;
    }

    public Integer getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    public Integer getCpuUsage() {
        return cpuUsage;
    }

    @JsonProperty("cpu_usage")
    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public String getConsole() {
        return console;
    }

    @JsonProperty("console")
    public void setConsole(String console) {
        this.console = console;
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

    public List<Object> getInlineTraces() {
        return inlineTraces;
    }

    @JsonProperty("inline_traces")
    public void setInlineTraces(List<Object> inlineTraces) {
        this.inlineTraces = inlineTraces;
    }

}
