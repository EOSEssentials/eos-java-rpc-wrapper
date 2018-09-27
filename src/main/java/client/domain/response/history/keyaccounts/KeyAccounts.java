package client.domain.response.history.keyaccounts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyAccounts {

    private List<String> accountNames;

    public List<String> getAccountNames() {
        return accountNames;
    }

    @JsonProperty("account_names")
    public void setAccountNames(List<String> accountNames) {
        this.accountNames = accountNames;
    }

}
