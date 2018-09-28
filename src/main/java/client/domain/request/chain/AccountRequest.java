package client.domain.request.chain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRequest {

    @JsonProperty("account_name")
    private String accountName;
}
