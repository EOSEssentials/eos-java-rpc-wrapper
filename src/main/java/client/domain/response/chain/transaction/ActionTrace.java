package client.domain.response.chain.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ActionTrace {

    private List<DataAccess> dataAccess;

    private String console;

    private String cpuUsage;

    private String receiver;

    private String profilingUs;

    private Act act;

    private String contextFree;

    public List<DataAccess> getDataAccess() {
        return dataAccess;
    }

    @JsonProperty("data_access")
    public void setDataAccess(List<DataAccess> dataAccess) {
        this.dataAccess = dataAccess;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getCpuUsage() {
        return cpuUsage;
    }

    @JsonProperty("cpu_usage")
    public void setCpuUsage(String cpuUsage) {
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
}
