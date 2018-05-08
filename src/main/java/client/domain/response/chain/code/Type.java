package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Type {

    private String newTypeName;

    private String type;

    public Type(){

    }

    @JsonProperty("new_type_name")
    public String getNewTypeName() {
        return newTypeName;
    }

    public void setNewTypeName(String newTypeName) {
        this.newTypeName = newTypeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
