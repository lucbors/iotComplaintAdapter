package com.eproseed.ozs.iot.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.xml.datatype.DatatypeConfigurationException;

import nl.hrlmr.complaint.service._1.ComplaintServicePortClient;

@Path("complaint")
public class RestFullComplaint {
    public RestFullComplaint() {
    }

    @POST
    public void postData(String content) throws DatatypeConfigurationException {

        // Provide method implementation.
        // TODO

        ComplaintServicePortClient proxy = new ComplaintServicePortClient();
        proxy.createComplaint();

      //  throw new UnsupportedOperationException();
    }
}
