package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Permission {

    private String name;

    private String parent;

    private List<RequiredAuth> requiredAuth;

    public Permission(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @JsonProperty("required_ath")
    public List<RequiredAuth> getRequiredAuth() {
        return requiredAuth;
    }

    public void setRequiredAuth(List<RequiredAuth> requiredAuth) {
        this.requiredAuth = requiredAuth;
    }
}
