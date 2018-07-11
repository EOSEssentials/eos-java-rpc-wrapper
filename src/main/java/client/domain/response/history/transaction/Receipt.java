
package client.domain.response.history.transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Receipt {

    private String receiver;

    private String actDigest;

    private Integer globalSequence;

    private Integer recvSequence;

    private List<List<String>> authSequence = null;

    private Integer codeSequence;

    private Integer abiSequence;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getReceiver() {
        return receiver;
    }

    @JsonProperty("receiver")
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getActDigest() {
        return actDigest;
    }

    @JsonProperty("act_digest")
    public void setActDigest(String actDigest) {
        this.actDigest = actDigest;
    }

    public Integer getGlobalSequence() {
        return globalSequence;
    }

    @JsonProperty("global_sequence")
    public void setGlobalSequence(Integer globalSequence) {
        this.globalSequence = globalSequence;
    }

    public Integer getRecvSequence() {
        return recvSequence;
    }

    @JsonProperty("recv_sequence")
    public void setRecvSequence(Integer recvSequence) {
        this.recvSequence = recvSequence;
    }

    public List<List<String>> getAuthSequence() {
        return authSequence;
    }

    @JsonProperty("auth_sequence")
    public void setAuthSequence(List<List<String>> authSequence) {
        this.authSequence = authSequence;
    }

    public Integer getCodeSequence() {
        return codeSequence;
    }

    @JsonProperty("code_sequence")
    public void setCodeSequence(Integer codeSequence) {
        this.codeSequence = codeSequence;
    }

    public Integer getAbiSequence() {
        return abiSequence;
    }

    @JsonProperty("abi_sequence")
    public void setAbiSequence(Integer abiSequence) {
        this.abiSequence = abiSequence;
    }

}
