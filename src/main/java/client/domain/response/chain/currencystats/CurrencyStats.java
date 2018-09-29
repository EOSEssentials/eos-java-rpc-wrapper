package client.domain.response.chain.currencystats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyStats {

    private String supply;

    @JsonProperty("max_supply")
    private String maxSupply;

    private String issuer;

}
