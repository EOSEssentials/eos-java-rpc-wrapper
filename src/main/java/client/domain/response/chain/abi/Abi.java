package client.domain.response.chain.abi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Abi {

    @JsonProperty("account_name")
    private String accountName;

    private client.domain.response.chain.code.Abi abi;

}
