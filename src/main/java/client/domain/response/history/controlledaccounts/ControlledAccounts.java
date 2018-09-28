package client.domain.response.history.controlledaccounts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ControlledAccounts {

    @JsonProperty("controlled_accounts")
    private List<String> controlledAccounts;

}
