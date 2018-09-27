package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorMessage {

    private Integer errorCode;

    private String errorMsg;

    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("error_code")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @JsonProperty("error_msg")
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
