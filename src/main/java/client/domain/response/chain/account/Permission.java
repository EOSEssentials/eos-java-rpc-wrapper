package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Permission {

    private String name;

    private String parent;

    @JsonProperty("perm_name")
    private String permName;

    @JsonProperty("required_auth")
    private RequiredAuth requiredAuth;

}
