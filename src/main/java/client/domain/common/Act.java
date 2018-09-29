
package client.domain.common;

import client.domain.response.history.Authorization;
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
public class Act {

    private String account;

    private List<Authorization> authorization = null;

    private Object data;

    @JsonProperty("hex_data")
    private String hexData;

    private String name;

}
