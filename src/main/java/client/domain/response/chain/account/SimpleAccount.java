package client.domain.response.chain.account;

import java.math.BigInteger;

public class SimpleAccount {

    private Permission permission;

    private BigInteger weight;

    public static class Permission {
        private String actor;
        private String permission;

        public String getActor() {
            return actor;
        }

        public void setActor(String actor) {
            this.actor = actor;
        }

        public String getPermission() {
            return permission;
        }

        public void setPermission(String permission) {
            this.permission = permission;
        }
    }

    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
