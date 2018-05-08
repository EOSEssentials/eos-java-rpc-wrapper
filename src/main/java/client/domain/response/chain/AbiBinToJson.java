package client.domain.response.chain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class AbiBinToJson {

    private Map<String, String> args;

    private List<String> requiredScope;

    private List<String> requiredAuth;

    public AbiBinToJson(){

    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
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
