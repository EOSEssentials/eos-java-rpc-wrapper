package client.domain.response.chain.account;


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
public class Account {

    @JsonProperty("account_name")
    private String accountName;

    @JsonProperty("eos_balance")
    private String eosBalance;

    @JsonProperty("staked_balance")
    private String stakedBalance;

    @JsonProperty("unstaking_balance")
    private String unstakingBalance;

    @JsonProperty("last_unstaking_time")
    private String lastUnstakingTime;

    private List<Permission> permissions;

}
