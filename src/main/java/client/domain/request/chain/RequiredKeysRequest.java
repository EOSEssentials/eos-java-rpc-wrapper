package client.domain.request.chain;

import client.domain.common.transaction.PackedTransaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredKeysRequest {

    private PackedTransaction transaction;

    @JsonProperty("available_keys")
    private List<String> availableKeys;

}
