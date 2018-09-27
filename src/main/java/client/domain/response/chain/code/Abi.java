package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Abi {

    private String version;

    private List<Type> types;

    private List<Struct> structs;

    private List<Action> actions;

    private List<Table> tables;

    private List<String> ricardianClauses;

    private List<ErrorMessage> errorMessages;

    // TODO: this might be of some particular type, but I couldn't find any examples of how this would look like
    private Object abiExtensions;

    public Abi() {

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ErrorMessage> getErrorMessages() {
        return errorMessages;
    }

    @JsonProperty("error_messages")
    public void setErrorMessages(List<ErrorMessage> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public Object getAbiExtensions() {
        return abiExtensions;
    }

    @JsonProperty("abi_extensions")
    public void setAbiExtensions(List<String> abiExtensions) {
        this.abiExtensions = abiExtensions;
    }

}
