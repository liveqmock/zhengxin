/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.sysfinance.bookmng.credencechar.form;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 10-22-2007
 * Copy Right Information   : 凭证字
 * Project                  : 文件名
 * @Version                 : 1.0
 * @author                  : 张列
 * 生成日期                   : 10-22-2007
 * XDoclet definition:
 * @struts.form name="credencecharNewAF"
 */
public class CredencecharNewAF extends ActionForm {
	/*
	 * Generated fields
	 */

  private static final long serialVersionUID = 1L;

  /** paraId property */
	private String paraId = "";

	/** paramExplain property */
	private String paramExplain ="";

	/** paramExplainExplain property */
	private String paramExplainExplain= "";
  
  private List list = new ArrayList();

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the paraId.
	 * @return String
	 */
	public String getParaId() {
		return paraId;
	}

	/** 
	 * Set the paraId.
	 * @param paraId The paraId to set
	 */
	public void setParaId(String paraId) {
		this.paraId = paraId;
	}

	/** 
	 * Returns the paramExplain.
	 * @return String
	 */
	public String getParamExplain() {
		return paramExplain;
	}

	/** 
	 * Set the paramExplain.
	 * @param paramExplain The paramExplain to set
	 */
	public void setParamExplain(String paramExplain) {
		this.paramExplain = paramExplain;
	}

	/** 
	 * Returns the paramExplainExplain.
	 * @return String
	 */
	public String getParamExplainExplain() {
		return paramExplainExplain;
	}

	/** 
	 * Set the paramExplainExplain.
	 * @param paramExplainExplain The paramExplainExplain to set
	 */
	public void setParamExplainExplain(String paramExplainExplain) {
		this.paramExplainExplain = paramExplainExplain;
	}

  public List getList() {
    return list;
  }

  public void setList(List list) {
    this.list = list;
  }

}