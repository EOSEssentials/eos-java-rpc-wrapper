package client.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EosErrorDetails {

    private String message;

    private String file;

    @JsonProperty("line_number")
    private Integer lineNumber;

    private String method;

    private EosErrorDetails() {

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("message", message)
                .append("file", file)
                .append("lineNumber", lineNumber.toString())
                .toString();
    }
}
