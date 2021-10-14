package com.acn.facilities.api;

import com.acn.facilities.api.model.FacilitiesResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link FacilitiesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-15T00:29:26.781988600+08:00[Asia/Singapore]")

public interface FacilitiesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /facilities/{hci} : get available facilities
     * Use this API to know about the facilities available
     *
     * @param hci facilityInfo search by HCI (required)
     * @param messageId Request Message ID header (required)
     * @param requestorId requestorId ID header (required)
     * @return successful operation (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Resource Not found (status code 404)
     *         or Server Error (status code 500)
     * @see FacilitiesApi#getFacilitiesByHCI
     */
    default ResponseEntity<FacilitiesResponse> getFacilitiesByHCI(String hci,
        String messageId,
        String requestorId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"responseHeader\" : { \"requestorId\" : \"requestorId\", \"Timestamp\" : \"Timestamp\", \"MessageId\" : \"MessageId\", \"status\" : 0 }, \"facility\" : { \"address\" : \"address\", \"name\" : \"name\", \"phoneNum\" : 6, \"hci\" : \"hci\", \"uen\" : \"uen\", \"status\" : \"status\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
