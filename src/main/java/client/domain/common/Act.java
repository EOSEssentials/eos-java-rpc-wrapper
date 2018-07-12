
package client.domain.common;

import client.domain.response.history.Authorization;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Act {

    private String account;

    private List<Authorization> authorization = null;

    private Object data;

    private String hexData;

    private String name;

    public String getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    public List<Authorization> getAuthorization() {
        return authorization;
    }

    @JsonProperty("authorization")
    public void setAuthorization(List<Authorization> authorization) {
        this.authorization = authorization;
    }

    public Object getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    public String getHexData() {
        return hexData;
    }

    @JsonProperty("hex_data")
    public void setHexData(String hexData) {
        this.hexData = hexData;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
