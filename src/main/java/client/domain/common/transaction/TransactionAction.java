package client.domain.common.transaction;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionAction {

    private String account;

    private String name;

    private List<TransactionAuthorization> authorization;

    /*TODO Dynamically Unpack JSON Data */

    private String hex_data;

    public TransactionAction() {

    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TransactionAuthorization> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(List<TransactionAuthorization> authorization) {
        this.authorization = authorization;
    }

    public String getHex_data() {
        return hex_data;
    }

    public void setHex_data(String hex_data) {
        this.hex_data = hex_data;
    }

}
