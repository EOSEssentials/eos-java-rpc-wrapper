package client.domain.response.history.controlledaccounts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ControlledAccounts {

    private List<String> controlledAccounts;

    public List<String> getControlledAccounts() {
        return controlledAccounts;
    }

    @JsonProperty("controlled_accounts")
    public void setControlledAccounts(List<String> controlledAccounts) {
        this.controlledAccounts = controlledAccounts;
    }

}
