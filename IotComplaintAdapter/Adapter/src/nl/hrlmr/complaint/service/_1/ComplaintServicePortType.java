
package nl.hrlmr.complaint.service._1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import nl.hrlmr.complaint.messages._1.ConverseActivityRequestMessage;
import nl.hrlmr.complaint.messages._1.ConverseActivityResponseMessage;
import nl.hrlmr.complaint.messages._1.CreateComplaintRequestMessage;
import nl.hrlmr.complaint.messages._1.CreateComplaintResponseMessage;
import nl.hrlmr.complaint.messages._1.DecideActivityRequestMessage;
import nl.hrlmr.complaint.messages._1.DecideActivityResponseMessage;
import nl.hrlmr.complaint.messages._1.EmailActivityRequestMessage;
import nl.hrlmr.complaint.messages._1.EmailActivityResponseMessage;
import nl.hrlmr.complaint.messages._1.EndRepairRequestMessage;
import nl.hrlmr.complaint.messages._1.EndRepairResponseMessage;
import nl.hrlmr.complaint.messages._1.GetActivatableActivitiesRequestMessage;
import nl.hrlmr.complaint.messages._1.GetActivatableActivitiesResponseMessage;
import nl.hrlmr.complaint.messages._1.GetComplaintDetailsRequestMessage;
import nl.hrlmr.complaint.messages._1.GetComplaintDetailsResponseMessage;
import nl.hrlmr.complaint.messages._1.GetComplaintOverviewRequestMessage;
import nl.hrlmr.complaint.messages._1.GetComplaintOverviewResponseMessage;
import nl.hrlmr.complaint.messages._1.GetMilestoneOverviewRequestMessage;
import nl.hrlmr.complaint.messages._1.GetMilestoneOverviewResponseMessage;
import nl.hrlmr.complaint.messages._1.GetStageOverviewRequestMessage;
import nl.hrlmr.complaint.messages._1.GetStageOverviewResponseMessage;
import nl.hrlmr.complaint.messages._1.PlanActivityRequestMessage;
import nl.hrlmr.complaint.messages._1.PlanActivityResponseMessage;
import nl.hrlmr.complaint.messages._1.RegisterRepairRequestMessage;
import nl.hrlmr.complaint.messages._1.RegisterRepairResponseMessage;
import nl.hrlmr.complaint.messages._1.StartRepairRequestMessage;
import nl.hrlmr.complaint.messages._1.StartRepairResponseMessage;
import nl.hrlmr.order.messages._1.CreateOrderRequestMessage;
import nl.hrlmr.order.messages._1.CreateOrderResponsetMessage;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebService(name = "ComplaintServicePortType", targetNamespace = "http://hrlmr.nl/complaint/service/1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
            nl.hrlmr.complaint._1.ObjectFactory.class, nl.hrlmr.order._1.ObjectFactory.class,
            nl.hrlmr.complaint.messages._1.ObjectFactory.class, nl.hrlmr.order.messages._1.ObjectFactory.class
    })
public interface ComplaintServicePortType {


    /**
     * This operation creates a new complaint. A fault is
     *                            returned in case mandatory attributes, that are
     *                            needed to create the complaint, are missing.
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.CreateComplaintResponseMessage
     */
    @WebMethod(action = "createComplaint")
    @WebResult(name = "CreateComplaintResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public CreateComplaintResponseMessage createComplaint(@WebParam(name = "CreateComplaintRequestMessage",
                                                                    targetNamespace =
                                                                    "http://hrlmr.nl/complaint/messages/1.0",
                                                                    partName = "request")
                                                          CreateComplaintRequestMessage request);

    /**
     * This operation retrieves all complaints. Note that
     *                            this operation does return the main attributes of the
     *                            complaints that match the request criteria. It does
     *                            NOT return all attributes of the complaint.
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.GetComplaintOverviewResponseMessage
     */
    @WebMethod(action = "getComplaintsOverview")
    @WebResult(name = "GetComplaintOverviewResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public GetComplaintOverviewResponseMessage getComplaintOverview(@WebParam(name =
                                                                              "GetComplaintOverviewRequestMessage",
                                                                              targetNamespace =
                                                                              "http://hrlmr.nl/complaint/messages/1.0",
                                                                              partName = "request")
                                                                    GetComplaintOverviewRequestMessage request);

    /**
     * This operation returns all attributes of the
     *                            requested complaint; including its details. When the
     *                            specified complaint cannot be found, a fault message
     *                            is returned.
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.GetComplaintDetailsResponseMessage
     * @throws UnknownComplaintFault
     */
    @WebMethod(action = "getComplaintDetails")
    @WebResult(name = "GetComplaintDetailsResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public GetComplaintDetailsResponseMessage getComplaintDetails(@WebParam(name = "GetComplaintDetailsRequestMessage",
                                                                            targetNamespace =
                                                                            "http://hrlmr.nl/complaint/messages/1.0",
                                                                            partName = "request")
                                                                  GetComplaintDetailsRequestMessage request) throws UnknownComplaintFault;

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.GetActivatableActivitiesResponseMessage
     */
    @WebMethod(action = "getActivatableActivities")
    @WebResult(name = "GetActivatableActivitiesResponseMessage",
               targetNamespace = "http://hrlmr.nl/complaint/messages/1.0", partName = "response")
    public GetActivatableActivitiesResponseMessage getActivatableActivities(@WebParam(name =
                                                                                      "GetActivatableActivitiesRequestMessage",
                                                                                      targetNamespace =
                                                                                      "http://hrlmr.nl/complaint/messages/1.0",
                                                                                      partName = "request")
                                                                            GetActivatableActivitiesRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.GetStageOverviewResponseMessage
     */
    @WebMethod(action = "getStageOverview")
    @WebResult(name = "GetStageOverviewResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public GetStageOverviewResponseMessage getStageOverview(@WebParam(name = "GetStageOverviewRequestMessage",
                                                                      targetNamespace =
                                                                      "http://hrlmr.nl/complaint/messages/1.0",
                                                                      partName = "request")
                                                            GetStageOverviewRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.GetMilestoneOverviewResponseMessage
     */
    @WebMethod(action = "getMilestoneOverview")
    @WebResult(name = "GetMilestoneOverviewResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public GetMilestoneOverviewResponseMessage getMilestoneOverview(@WebParam(name =
                                                                              "GetMilestoneOverviewRequestMessage",
                                                                              targetNamespace =
                                                                              "http://hrlmr.nl/complaint/messages/1.0",
                                                                              partName = "request")
                                                                    GetMilestoneOverviewRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.ConverseActivityResponseMessage
     */
    @WebMethod(action = "converseActivity")
    @WebResult(name = "ConverseActivityResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public ConverseActivityResponseMessage converseActivity(@WebParam(name = "ConverseActivityRequestMessage",
                                                                      targetNamespace =
                                                                      "http://hrlmr.nl/complaint/messages/1.0",
                                                                      partName = "request")
                                                            ConverseActivityRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.PlanActivityResponseMessage
     */
    @WebMethod(action = "planActivity")
    @WebResult(name = "PlanActivityResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public PlanActivityResponseMessage planActivity(@WebParam(name = "PlanActivityRequestMessage",
                                                              targetNamespace =
                                                              "http://hrlmr.nl/complaint/messages/1.0",
                                                              partName = "request") PlanActivityRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.DecideActivityResponseMessage
     */
    @WebMethod(action = "decideActivity")
    @WebResult(name = "DecideActivityResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public DecideActivityResponseMessage decideActivity(@WebParam(name = "DecideActivityRequestMessage",
                                                                  targetNamespace =
                                                                  "http://hrlmr.nl/complaint/messages/1.0",
                                                                  partName = "request")
                                                        DecideActivityRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.EmailActivityResponseMessage
     */
    @WebMethod(action = "emailActivity")
    @WebResult(name = "EmailActivityResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public EmailActivityResponseMessage emailActivity(@WebParam(name = "EmailActivityRequestMessage",
                                                                targetNamespace =
                                                                "http://hrlmr.nl/complaint/messages/1.0",
                                                                partName = "request")
                                                      EmailActivityRequestMessage request);

    /**
     * documents the repair
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.RegisterRepairResponseMessage
     */
    @WebMethod(action = "registerRepairActivity")
    @WebResult(name = "RegisterRepairResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public RegisterRepairResponseMessage registerRepairActivity(@WebParam(name = "RegisterRepairRequestMessage",
                                                                          targetNamespace =
                                                                          "http://hrlmr.nl/complaint/messages/1.0",
                                                                          partName = "request")
                                                                RegisterRepairRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.StartRepairResponseMessage
     */
    @WebMethod(action = "startRepair")
    @WebResult(name = "StartRepairResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public StartRepairResponseMessage startRepair(@WebParam(name = "StartRepairRequestMessage",
                                                            targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
                                                            partName = "request") StartRepairRequestMessage request);

    /**
     *
     * @param request
     * @return
     *     returns nl.hrlmr.complaint.messages._1.EndRepairResponseMessage
     */
    @WebMethod(action = "endRepair")
    @WebResult(name = "EndRepairResponseMessage", targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
               partName = "response")
    public EndRepairResponseMessage endRepair(@WebParam(name = "EndRepairRequestMessage",
                                                        targetNamespace = "http://hrlmr.nl/complaint/messages/1.0",
                                                        partName = "request") EndRepairRequestMessage request);

    /**
     * This operation creates a new order for a case
     *
     * @param request
     * @return
     *     returns nl.hrlmr.order.messages._1.CreateOrderResponsetMessage
     */
    @WebMethod(action = "createOrder")
    @WebResult(name = "CreateOrder_ResponsetMessage", targetNamespace = "http://hrlmr.nl/order/messages/1.0",
               partName = "response")
    public CreateOrderResponsetMessage createOrder(@WebParam(name = "CreateOrder_RequestMessage",
                                                             targetNamespace = "http://hrlmr.nl/order/messages/1.0",
                                                             partName = "request") CreateOrderRequestMessage request);

}
