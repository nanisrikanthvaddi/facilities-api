package com.acn.facilities.api.controller;


import com.acn.facilities.api.model.ErrorResponse;
import com.acn.facilities.api.model.FacilitiesInnerJSON;
import com.acn.facilities.api.model.FacilitiesResponse;
import com.acn.facilities.api.model.ResponseHeaderInnerJSON;
import com.acn.facilities.api.repository.FacilitiesRepo;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.Optional;


@Singleton
@Component
@RestController
public class FacilitiesController implements FacilitiesApi{

    @Autowired
    FacilitiesRepo facilitiesRepo;

    private String logo;



    @PostConstruct
    public void init() throws IOException {

        try {

            File resource = new ClassPathResource("IHIS.png").getFile();
            String text = new String(Files.readAllBytes(resource.toPath()));


            byte[] encoded = Base64.getEncoder().encode(text.getBytes(StandardCharsets.UTF_8));
            logo = new String(encoded,StandardCharsets.US_ASCII);
            System.out.println(logo);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

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
            fp.setLogo(logo);
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
