package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbiJsonToBin {

    private String binargs;

    private List<String> requiredScope;

    private List<String> requiredAuth;

    public String getBinargs() {
        return binargs;
    }

    public void setBinargs(String binargs) {
        this.binargs = binargs;
    }

    @JsonProperty("required_scope")
    public List<String> getRequiredScope() {
        return requiredScope;
    }

    public void setRequiredScope(List<String> requiredScope) {
        this.requiredScope = requiredScope;
    }

    @JsonProperty("required_auth")
    public List<String> getRequiredAuth() {
        return requiredAuth;
    }

    public void setRequiredAuth(List<String> requiredAuth) {
        this.requiredAuth = requiredAuth;
    }
}
