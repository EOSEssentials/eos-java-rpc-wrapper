
package client.domain.response.history.action;

import client.domain.common.ActionTrace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Action {

    @JsonProperty("account_action_seq")
    private Integer accountActionSeq;

    @JsonProperty("action_trace")
    private ActionTrace actionTrace;

    @JsonProperty("block_num")
    private Integer blockNum;

    @JsonProperty("block_time")
    private String blockTime;

    @JsonProperty("global_action_seq")
    private Integer globalActionSeq;

}
