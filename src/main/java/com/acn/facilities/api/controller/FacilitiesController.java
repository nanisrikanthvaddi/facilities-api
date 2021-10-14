package com.acn.facilities.api.controller;


import com.acn.facilities.api.model.ErrorResponse;
import com.acn.facilities.api.model.FacilitiesInnerJSON;
import com.acn.facilities.api.model.FacilitiesResponse;
import com.acn.facilities.api.model.ResponseHeaderInnerJSON;
import com.acn.facilities.api.repository.FacilitiesRepo;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.inject.Singleton;
import java.sql.Timestamp;
import java.util.Optional;


@Singleton
@Component
@RestController
public class FacilitiesController implements FacilitiesApi{

    @Autowired
    FacilitiesRepo facilitiesRepo;

    @Override
    @RequestMapping(value = "/getFacilities/{hci}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public  ResponseEntity<FacilitiesResponse> getFacilitiesByHCI(@ApiParam(value = "facilityInfo search by HCI",required=true) @PathVariable("hci") String hci,@ApiParam(value = "Request Message ID header" ,required=true) @RequestHeader(value="MessageId", required=true) String messageId,@ApiParam(value = "requestorId ID header" ,required=true) @RequestHeader(value="requestorId", required=true) String requestorId) {
       // return getDelegate().getFacilitiesByHCI(hci, messageId, requestorId);
    try {


        Optional<FacilitiesInnerJSON> facility = facilitiesRepo.findById(hci);
        if (facility.isPresent()) {
            FacilitiesResponse fp = new FacilitiesResponse();
            ResponseHeaderInnerJSON rps = new ResponseHeaderInnerJSON();
            rps.setMessageId(messageId);
            rps.setTimestamp((new Timestamp(System.currentTimeMillis())).toString());
            rps.setRequestorId(requestorId);
            fp.setResponseHeader(rps);
            fp.setFacility(facility.get());
            return new ResponseEntity(fp, HttpStatus.OK);
        } else {
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setCode(404);
            errorResponse.setMessage("Resource Not found");
            return new ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
        }

    }catch (Exception e ){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(500);
        errorResponse.setMessage("Internal Server Error");
        return new ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    }


}
