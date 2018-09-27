package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wait {

    private Integer waitSec;

    private Integer weight;

    public Integer getWaitSec() {
        return waitSec;
    }

    @JsonProperty("weight_sec")
    public void setWaitSec(Integer waitSec) {
        this.waitSec = waitSec;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
