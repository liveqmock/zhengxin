/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.sysfinance.bookmng.settleincanddec.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 09-20-2007 XDoclet definition:
 * 
 * @struts.action validate="true"
 */
public class SettleincanddecForwardURLAC extends Action {
  /*
   * Generated Methods
   */

  /**
   * Method execute
   * 
   * @param mapping
   * @param form
   * @param request
   * @param response
   * @return ActionForward
   */
  public static final String PAGINATION_KEY = "org.xpup.hafmis.sysfinance.bookmng.settleincanddec.action.SettleincanddecShowAC";

  public ActionForward execute(ActionMapping mapping, ActionForm form,
      HttpServletRequest request, HttpServletResponse response) {
    // TODO Auto-generated method stub
    resetToken(request);
    request.getSession().removeAttribute(SettleincanddecShowAC.PAGINATION_KEY);
    return mapping.findForward("to_show_settleincanddec");
  }
}