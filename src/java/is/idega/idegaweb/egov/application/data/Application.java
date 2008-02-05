package is.idega.idegaweb.egov.application.data;


import com.idega.block.process.data.CaseCode;
import com.idega.block.text.data.LocalizedText;
import com.idega.data.IDOAddRelationshipException;
import com.idega.data.IDOEntity;

public interface Application extends IDOEntity {
	
	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationCategoryBMPBean#setPriority
	 */
	public void setPriority(Integer priority);
	
	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationCategoryBMPBean#getPriority
	 */
	public Integer getPriority();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setAgeFrom
	 */
	public void setAgeFrom(int age);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getAgeFrom
	 */
	public int getAgeFrom();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setAgeTo
	 */
	public void setAgeTo(int age);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getAgeTo
	 */
	public int getAgeTo();
	
	public LocalizedText getLocalizedText(int icLocaleId);
	
	public void addLocalizedName(LocalizedText text) throws IDOAddRelationshipException;

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getTimesClicked
	 */
	public int getTimesClicked();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setTimesClicked
	 */
	public void setTimesClicked(int clicked);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setCategory
	 */
	public void setCategory(ApplicationCategory category);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getCategory
	 */
	public ApplicationCategory getCategory();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setCaseCode
	 */
	public void setCaseCode(CaseCode caseCode);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getCaseCode
	 */
	public CaseCode getCaseCode();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setElectronic
	 */
	public void setElectronic(boolean isElectronic);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getElectronic
	 */
	public boolean getElectronic();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setRequiresLogin
	 */
	public void setRequiresLogin(boolean requiresLogin);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getRequiresLogin
	 */
	public boolean getRequiresLogin();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setVisible
	 */
	public void setVisible(boolean visible);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getVisible
	 */
	public boolean getVisible();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setName
	 */
	public void setName(String name);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getName
	 */
	public String getName();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setUrl
	 */
	public void setUrl(String url);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getUrl
	 */
	public String getUrl();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setOpensInNewWindow
	 */
	public void setOpensInNewWindow(boolean opensInNew);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getOpensInNewWindow
	 */
	public boolean getOpensInNewWindow();

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#setHiddenFromGuests
	 */
	public void setHiddenFromGuests(boolean hiddenFromGuests);

	/**
	 * @see is.idega.idegaweb.egov.application.data.ApplicationBMPBean#getHiddenFromGuests
	 */
	public boolean getHiddenFromGuests();
	
	public void setAppType(String appType);
		
	public String getAppType();
}