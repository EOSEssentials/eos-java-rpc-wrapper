package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Permission {

    private String name;

    private String parent;

    private String permName;

    private RequiredAuth requiredAuth;

    public Permission() {

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

    @JsonProperty("required_auth")
    public RequiredAuth getRequiredAuth() {
        return requiredAuth;
    }

    public void setRequiredAuth(RequiredAuth requiredAuth) {
        this.requiredAuth = requiredAuth;
    }

    public String getPermName() {
        return permName;
    }

    @JsonProperty("perm_name")
    public void setPermName(String permName) {
        this.permName = permName;
    }
}
