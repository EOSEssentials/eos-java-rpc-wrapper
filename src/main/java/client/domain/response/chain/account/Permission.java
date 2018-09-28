package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Permission {

    private String name;

    private String parent;

    @JsonProperty("perm_name")
    private String permName;

    @JsonProperty("required_auth")
    private RequiredAuth requiredAuth;

}
