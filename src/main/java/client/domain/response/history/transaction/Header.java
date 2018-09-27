
package client.domain.response.history.transaction;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {

    private Integer timestamp;

    private String producer;

    private Integer confirmed;

    private String previous;

    private String transactionMroot;

    private String actionMroot;

    private Integer scheduleVersion;

    private Object newProducers;

    private List<Object> headerExtensions = null;

    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getProducer() {
        return producer;
    }

    @JsonProperty("producer")
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public String getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getTransactionMroot() {
        return transactionMroot;
    }

    @JsonProperty("transaction_mroot")
    public void setTransactionMroot(String transactionMroot) {
        this.transactionMroot = transactionMroot;
    }

    public String getActionMroot() {
        return actionMroot;
    }

    @JsonProperty("action_mroot")
    public void setActionMroot(String actionMroot) {
        this.actionMroot = actionMroot;
    }

    public Integer getScheduleVersion() {
        return scheduleVersion;
    }

    @JsonProperty("schedule_version")
    public void setScheduleVersion(Integer scheduleVersion) {
        this.scheduleVersion = scheduleVersion;
    }

    public Object getNewProducers() {
        return newProducers;
    }

    @JsonProperty("new_producers")
    public void setNewProducers(Object newProducers) {
        this.newProducers = newProducers;
    }

    public List<Object> getHeaderExtensions() {
        return headerExtensions;
    }

    @JsonProperty("header_extensions")
    public void setHeaderExtensions(List<Object> headerExtensions) {
        this.headerExtensions = headerExtensions;
    }

}
