package client.domain.common;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Receipt {

    private Integer abiSequence;

    private String actDigest;

    private List<List<String>> authSequence = null;

    private Integer codeSequence;

    private Integer globalSequence;

    private String receiver;

    private Integer recvSequence;

    public Integer getAbiSequence() {
        return abiSequence;
    }

    @JsonProperty("abi_sequence")
    public void setAbiSequence(Integer abiSequence) {
        this.abiSequence = abiSequence;
    }

    public String getActDigest() {
        return actDigest;
    }

    @JsonProperty("act_digest")
    public void setActDigest(String actDigest) {
        this.actDigest = actDigest;
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

    public Integer getGlobalSequence() {
        return globalSequence;
    }

    @JsonProperty("global_sequence")
    public void setGlobalSequence(Integer globalSequence) {
        this.globalSequence = globalSequence;
    }

    public String getReceiver() {
        return receiver;
    }

    @JsonProperty("receiver")
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Integer getRecvSequence() {
        return recvSequence;
    }

    @JsonProperty("recv_sequence")
    public void setRecvSequence(Integer recvSequence) {
        this.recvSequence = recvSequence;
    }

}
