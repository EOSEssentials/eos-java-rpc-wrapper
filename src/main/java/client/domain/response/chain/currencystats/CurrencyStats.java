package client.domain.response.chain.currencystats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyStats {

    private String supply;

    private String maxSupply;

    private String issuer;

    public String getSupply() {
        return supply;
    }

    @JsonProperty("supply")
    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    @JsonProperty("max_supply")
    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public String getIssuer() {
        return issuer;
    }

    @JsonProperty("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

}
