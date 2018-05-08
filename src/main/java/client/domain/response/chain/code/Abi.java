package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Abi {

    private List<Type> types;

    private List<Struct> structs;

    private List<Action> actions;

    private List<Table> tables;

    private List<String> ricardianClauses;

    public Abi(){

    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }


    public List<Struct> getStructs() {
        return structs;
    }

    public void setStructs(List<Struct> structs) {
        this.structs = structs;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @JsonProperty("ricardian_clauses")
    public List<String> getRicardianClauses() {
        return ricardianClauses;
    }

    public void setRicardianClauses(List<String> ricardianClauses) {
        this.ricardianClauses = ricardianClauses;
    }
}
