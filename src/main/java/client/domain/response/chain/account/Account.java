package client.domain.response.chain.account;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    private String accountName;

    private String eosBalance;

    private String stakedBalance;

    private String unstakingBalance;

    private String lastUnstakingTime;

    private List<Permission> permissions;

    public Account(){

    }

    @JsonProperty("account_name")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @JsonProperty("eos_balance")
    public String getEosBalance() {
        return eosBalance;
    }

    public void setEosBalance(String eosBalance) {
        this.eosBalance = eosBalance;
    }

    @JsonProperty("staked_balance")
    public String getStakedBalance() {
        return stakedBalance;
    }

    public void setStakedBalance(String stakedBalance) {
        this.stakedBalance = stakedBalance;
    }

    @JsonProperty("unstaking_balance")
    public String getUnstakingBalance() {
        return unstakingBalance;
    }

    public void setUnstakingBalance(String unstakingBalance) {
        this.unstakingBalance = unstakingBalance;
    }

    @JsonProperty("last_unstaking_time")
    public String getLastUnstakingTime() {
        return lastUnstakingTime;
    }

    public void setLastUnstakingTime(String lastUnstakingTime) {
        this.lastUnstakingTime = lastUnstakingTime;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
