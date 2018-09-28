package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Code {

    @JsonProperty("account_name")
    private String accountName;

    @JsonProperty("code_hash")
    private String codeHash;

    private String wast;

    private Abi abi;

}
