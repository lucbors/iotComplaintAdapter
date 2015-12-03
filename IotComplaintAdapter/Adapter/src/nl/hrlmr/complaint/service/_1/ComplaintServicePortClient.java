package nl.hrlmr.complaint.service._1;


import java.util.Date;
import java.util.GregorianCalendar;


import java.util.Random;

import javax.xml.datatype.DatatypeFactory;

import javax.xml.datatype.DatatypeConfigurationException;

import javax.xml.datatype.XMLGregorianCalendar;

import nl.hrlmr.complaint._1.Address;
import nl.hrlmr.complaint._1.Complainer;
import nl.hrlmr.complaint._1.Complaint;
import nl.hrlmr.complaint._1.ComplaintDetail;
import nl.hrlmr.complaint.messages._1.CreateComplaintRequestMessage;


// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 12c 12.1.3.0.0.1008
public class ComplaintServicePortClient {
    private ComplaintService102 complaintService102;
    private ComplaintServicePortType complaintServicePortType;

    public static void main(String[] args) {
        // Add your code to call the desired methods.
    }

    public ComplaintServicePortClient() {
        complaintService102 = new ComplaintService102();
        complaintServicePortType = complaintService102.getComplaintServicePort();
    }

    public void createComplaint() throws DatatypeConfigurationException {
        CreateComplaintRequestMessage request = new CreateComplaintRequestMessage();
        ComplaintDetail detail = new ComplaintDetail();
        Complainer complnr = new Complainer();
        Complaint complt = new Complaint();
        complt.setType("1");
        complt.setStatus("0");
        complt.setLatitude(new Float(51.985350));
        complt.setLongitude(new Float(4.345477));
        complt.setLocation("kamer C6.30");


        Address adr = new Address();
        adr.setStreet(" Derde Werelddreef");
        adr.setCity("Delft");
        adr.setHousenumber("1");
        adr.setZipcode("2622HA");


       
        complnr.setAddress(adr);


        Random r = new Random();
        int Low = 2000;
        int High = 300000;
        int R = r.nextInt(High-Low) + Low;
    
    
        String id = Integer.toString(R);


        complt.setTitle("Het licht is uit ("+id+")");
        
        complnr.setComplainerIdentifier(id);
        complnr.setBsn("NA");
        complnr.setFirstName("NA");
        complnr.setLastName("NA");
        complnr.setPhoneNumber("NA");
        complnr.setGender("NA");
       
        GregorianCalendar gcal = new GregorianCalendar();
             XMLGregorianCalendar xgcal = DatatypeFactory.newInstance()
                   .newXMLGregorianCalendar(gcal);
       
        complnr.setDateOfBirth(xgcal);

        detail.setComplaint(complt);
        detail.setComplainer(complnr);

        request.setComplaintDetail(detail);
        complaintServicePortType.createComplaint(request);
    }
}
