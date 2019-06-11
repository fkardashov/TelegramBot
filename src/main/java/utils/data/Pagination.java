
package utils.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "limit",
    "offset"
})
public class Pagination {

    @JsonProperty("total")
    public Integer total;
    @JsonProperty("limit")
    public Integer limit;
    @JsonProperty("offset")
    public Integer offset;

}
