package client.domain.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountRamDelta {

    private String account;
    private long delta;

    public String getAccount() {
        return account;
    }
    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    public long getDelta() {
        return delta;
    }
    @JsonProperty("delta")
    public void setDelta(long delta) {
        this.delta = delta;
    }
}
