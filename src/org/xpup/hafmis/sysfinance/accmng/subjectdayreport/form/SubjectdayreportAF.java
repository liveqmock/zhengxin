/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.sysfinance.accmng.subjectdayreport.form;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 10-26-2007
 * Copy Right Information   : ��Ŀ�ձ���
 * Project                  : �ļ���
 * @Version                 : 1.0
 * @author                  : ����
 * ��������                   : 10-26-2007
 * XDoclet definition:
 * @struts.form name="subjectdayreportAF"
 */
public class SubjectdayreportAF extends ActionForm {
  
  private static final long serialVersionUID = 1L;

  /** subjectLevelEnd property */
	private String subjectLevelEnd = "";

	/** officeName property */
	private String officeName = "";

	/** credenceDate property */
	private String credenceDate = "";

	/** subjectCodeStart property */
	private String subjectCodeStart = "";

	/** subjectCodeEnd property */
	private String subjectCodeEnd = "";

	/** subjectLevelStart property */
	private String subjectLevelStart = "";
  
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
	 * Returns the subjectLevelEnd.
	 * @return String
	 */
	public String getSubjectLevelEnd() {
		return subjectLevelEnd;
	}

	/** 
	 * Set the subjectLevelEnd.
	 * @param subjectLevelEnd The subjectLevelEnd to set
	 */
	public void setSubjectLevelEnd(String subjectLevelEnd) {
		this.subjectLevelEnd = subjectLevelEnd;
	}

	/** 
	 * Returns the officeName.
	 * @return String
	 */
	public String getOfficeName() {
		return officeName;
	}

	/** 
	 * Set the officeName.
	 * @param officeName The officeName to set
	 */
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	/** 
	 * Returns the credenceDate.
	 * @return String
	 */
	public String getCredenceDate() {
		return credenceDate;
	}

	/** 
	 * Set the credenceDate.
	 * @param credenceDate The credenceDate to set
	 */
	public void setCredenceDate(String credenceDate) {
		this.credenceDate = credenceDate;
	}

	/** 
	 * Returns the subjectCodeStart.
	 * @return String
	 */
	public String getSubjectCodeStart() {
		return subjectCodeStart;
	}

	/** 
	 * Set the subjectCodeStart.
	 * @param subjectCodeStart The subjectCodeStart to set
	 */
	public void setSubjectCodeStart(String subjectCodeStart) {
		this.subjectCodeStart = subjectCodeStart;
	}

	/** 
	 * Returns the subjectCodeEnd.
	 * @return String
	 */
	public String getSubjectCodeEnd() {
		return subjectCodeEnd;
	}

	/** 
	 * Set the subjectCodeEnd.
	 * @param subjectCodeEnd The subjectCodeEnd to set
	 */
	public void setSubjectCodeEnd(String subjectCodeEnd) {
		this.subjectCodeEnd = subjectCodeEnd;
	}

	/** 
	 * Returns the subjectLevelStart.
	 * @return String
	 */
	public String getSubjectLevelStart() {
		return subjectLevelStart;
	}

	/** 
	 * Set the subjectLevelStart.
	 * @param subjectLevelStart The subjectLevelStart to set
	 */
	public void setSubjectLevelStart(String subjectLevelStart) {
		this.subjectLevelStart = subjectLevelStart;
	}

  public List getList() {
    return list;
  }

  public void setList(List list) {
    this.list = list;
  }
}