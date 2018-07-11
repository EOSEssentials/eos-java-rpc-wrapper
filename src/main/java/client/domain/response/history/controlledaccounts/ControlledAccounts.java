package client.domain.response.history.controlledaccounts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
