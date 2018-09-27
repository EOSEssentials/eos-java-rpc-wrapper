package client.domain.response.chain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredKeys {

    private List<String> requiredKeys;

    public RequiredKeys() {

    }

    public List<String> getRequiredKeys() {
        return requiredKeys;
    }

    @JsonProperty("required_keys")
    public void setRequiredKeys(List<String> requiredKeys) {
        this.requiredKeys = requiredKeys;
    }
}
