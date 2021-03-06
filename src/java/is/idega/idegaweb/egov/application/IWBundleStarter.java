package is.idega.idegaweb.egov.application;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWBundleStartable;
import com.idega.idegaweb.include.GlobalIncludeManager;
import com.idega.idegaweb.include.PageResourceConstants;

/**
 * 
 * @author <a href="mailto:civilis@idega.com">Vytautas Čivilis</a>
 * @version 1.0
 *
 */
public class IWBundleStarter implements IWBundleStartable {
	
	public static final String IW_BUNDLE_IDENTIFIER = "is.idega.idegaweb.egov.application";

	public void start(IWBundle starterBundle) {
		
		/*
		ApplicationViewManager cViewManager = ApplicationViewManager.getInstance(starterBundle.getApplication());
		cViewManager.getContentNode();
		*/
		
		GlobalIncludeManager.getInstance().addBundleStyleSheet(IW_BUNDLE_IDENTIFIER, "/style/application-print.css", PageResourceConstants.MEDIA_PRINT);
	}

	public void stop(IWBundle starterBundle) {
	}
}