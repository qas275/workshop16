
package vttp2022.workshop16.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "decoding_board",
    "pegs",
    "rulebook"
})
@Generated("jsonschema2pojo")
public class Pieces {

    @JsonProperty("decoding_board")
    private DecodingBoard decodingBoard;
    @JsonProperty("pegs")
    private Pegs pegs;
    @JsonProperty("rulebook")
    private Rulebook rulebook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("decoding_board")
    public DecodingBoard getDecodingBoard() {
        return decodingBoard;
    }

    @JsonProperty("decoding_board")
    public void setDecodingBoard(DecodingBoard decodingBoard) {
        this.decodingBoard = decodingBoard;
    }

    @JsonProperty("pegs")
    public Pegs getPegs() {
        return pegs;
    }

    @JsonProperty("pegs")
    public void setPegs(Pegs pegs) {
        this.pegs = pegs;
    }

    @JsonProperty("rulebook")
    public Rulebook getRulebook() {
        return rulebook;
    }

    @JsonProperty("rulebook")
    public void setRulebook(Rulebook rulebook) {
        this.rulebook = rulebook;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
