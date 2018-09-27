package client.domain.response.history.action;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Actions {

    private List<Action> actions;

    private Integer lastIrreversibleBlock;

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Integer getLastIrreversibleBlock() {
        return lastIrreversibleBlock;
    }

    @JsonProperty("last_irreversible_block")
    public void setLastIrreversibleBlock(Integer lastIrreversibleBlock) {
        this.lastIrreversibleBlock = lastIrreversibleBlock;
    }
}
