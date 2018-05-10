package client.domain.response.chain.transaction;

import client.domain.common.transaction.TransactionAuthorization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Act {

    private String hexData;

    private String name;

    private String account;

    private List<TransactionAuthorization> authorization;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public List<TransactionAuthorization> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(List<TransactionAuthorization> authorization) {
        this.authorization = authorization;
    }

}
