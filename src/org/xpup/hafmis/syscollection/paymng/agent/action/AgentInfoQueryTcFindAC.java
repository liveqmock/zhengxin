/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.syscollection.paymng.agent.action;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.xpup.common.util.Pagination;
import org.xpup.hafmis.syscollection.paymng.agent.form.AgentInfoQueryTcAF;

/** 
 * MyEclipse Struts
 * Creation date: 12-20-2007
 * 
 * XDoclet definition:
 * @struts.action path="/agentInfoQueryTcFindAC" name="agentInfoQueryTcAF" scope="request" validate="true"
 */
public class AgentInfoQueryTcFindAC extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		AgentInfoQueryTcAF agentInfoQueryTcAF = (AgentInfoQueryTcAF) form;// TODO Auto-generated method stub
    try {
      Pagination pagination = new Pagination(0, 10, 1, "a303.emp_id", "ASC", new HashMap(0));
      pagination.getQueryCriterions().put("empId",agentInfoQueryTcAF.getEmpId().trim());
      pagination.getQueryCriterions().put("empName",agentInfoQueryTcAF.getEmpName().trim());
      pagination.getQueryCriterions().put("empAgentNum",agentInfoQueryTcAF.getEmpAgentNum().trim());
      pagination.getQueryCriterions().put("cardNum",agentInfoQueryTcAF.getCardNum().trim());
      pagination.getQueryCriterions().put("payId",request.getSession().getAttribute("payId_num_session").toString().trim());
      pagination.getQueryCriterions().put("orgId",request.getSession().getAttribute("orgId_num_session").toString().trim());
      String paginationKey = getPaginationKey();
      request.getSession().setAttribute(paginationKey, pagination);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return mapping.findForward("agentInfoQueryTcShowAC");
	}
  
  protected String getPaginationKey() {
    return AgentInfoQueryTcShowAC.PAGINATION_KEY;
  }
}