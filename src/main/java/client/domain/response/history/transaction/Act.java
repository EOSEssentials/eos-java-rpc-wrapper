
package client.domain.response.history.transaction;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Act {

    private String account;

    private String name;

    private List<Authorization> authorization = null;

    private Data data;

    private String hexData;

    public String getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public List<Authorization> getAuthorization() {
        return authorization;
    }

    @JsonProperty("authorization")
    public void setAuthorization(List<Authorization> authorization) {
        this.authorization = authorization;
    }

    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    public String getHexData() {
        return hexData;
    }

    @JsonProperty("hex_data")
    public void setHexData(String hexData) {
        this.hexData = hexData;
    }

}
