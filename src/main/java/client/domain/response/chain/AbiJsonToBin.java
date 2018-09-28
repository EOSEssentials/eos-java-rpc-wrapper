package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbiJsonToBin {

    private String binargs;

    @JsonProperty("required_scope")
    private List<String> requiredScope;

    @JsonProperty("required_auth")
    private List<String> requiredAuth;

}
