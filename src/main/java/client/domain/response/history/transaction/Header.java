
package client.domain.response.history.transaction;

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
public class Header {

    private Integer timestamp;

    private String producer;

    private Integer confirmed;

    private String previous;

    @JsonProperty("transaction_mroot")
    private String transactionMroot;

    @JsonProperty("action_mroot")
    private String actionMroot;

    @JsonProperty("schedule_version")
    private Integer scheduleVersion;

    @JsonProperty("new_producers")
    private Object newProducers;

    @JsonProperty("header_extensions")
    private List<Object> headerExtensions = null;

}
