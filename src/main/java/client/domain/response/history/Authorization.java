
package client.domain.response.history;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authorization {

    private String actor;

    private String permission;

    public String getActor() {
        return actor;
    }

    @JsonProperty("actor")
    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPermission() {
        return permission;
    }

    @JsonProperty("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

}
