package client.domain.request.chain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class AccountRequest {

    @JsonProperty("account_name")
    private String accountName;
}
