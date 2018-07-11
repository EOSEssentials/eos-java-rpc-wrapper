package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StructField {

    private String ricardianContract;

    private String name;

    private String type;

    public StructField() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("ricardian_contract")
    public String getRicardianContract() {
        return ricardianContract;
    }

    public void setRicardianContract(String ricardianContract) {
        this.ricardianContract = ricardianContract;
    }
}
