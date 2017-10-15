package com.sempra.hr.cucumber.frwk.testtrack.util;

public class TtsoapcgiPortTypeProxy implements com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiPortType {
  private String _endpoint = null;
  private com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiPortType ttsoapcgiPortType = null;
  
  public TtsoapcgiPortTypeProxy() {
    _initTtsoapcgiPortTypeProxy();
  }
  
  public TtsoapcgiPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTtsoapcgiPortTypeProxy();
  }
  
  private void _initTtsoapcgiPortTypeProxy() {
    try {
      ttsoapcgiPortType = (new com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiLocator()).getttsoapcgi();
      if (ttsoapcgiPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ttsoapcgiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ttsoapcgiPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ttsoapcgiPortType != null)
      ((javax.xml.rpc.Stub)ttsoapcgiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.TtsoapcgiPortType getTtsoapcgiPortType() {
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType;
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDatabase[] getDatabaseList() throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDatabaseList();
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CProject[] getProjectList(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getProjectList(username, password);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CProjectDataOption[] getProjectDataOptionList() throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getProjectDataOptionList();
  }
  
  public long databaseLogon(java.lang.String dbname, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.databaseLogon(dbname, username, password);
  }
  
  public long projectLogon(com.sempra.hr.cucumber.frwk.testtrack.util.CProject pProj, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.projectLogon(pProj, username, password);
  }
  
  public int databaseLogoff(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.databaseLogoff(cookie);
  }
  
  public boolean formattedTextSupport(long cookie, boolean enableFormattedText) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.formattedTextSupport(cookie, enableFormattedText);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDatabaseTable[] getTableList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTableList(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTableField[] getDropdownFieldForTable(long cookie, java.lang.String tablename) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDropdownFieldForTable(cookie, tablename);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] getDropdownFieldValuesForTable(long cookie, java.lang.String tablename, java.lang.String fieldname) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDropdownFieldValuesForTable(cookie, tablename, fieldname);
  }
  
  public int addDropdownFieldValuesForTable(long cookie, java.lang.String tablename, java.lang.String fieldname, com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] pValueList) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addDropdownFieldValuesForTable(cookie, tablename, fieldname, pValueList);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] getLinkDefinitionValues(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getLinkDefinitionValues(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] getColumnsForTable(long cookie, java.lang.String tablename) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getColumnsForTable(cookie, tablename);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFilter[] getFilterList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFilterList(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFilter[] getFilterListForTable(long cookie, java.lang.String tablename) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFilterListForTable(cookie, tablename);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRecordListSoap getRecordListForTable(long cookie, java.lang.String tablename, java.lang.String filtername, com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] columnlist) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRecordListForTable(cookie, tablename, filtername, columnlist);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRecordListSoap getRecordListForTableWithQuery(long cookie, java.lang.String tablename, java.lang.String filtername, java.lang.String query, com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] columnlist) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRecordListForTableWithQuery(cookie, tablename, filtername, query, columnlist);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem getTestConfig(long cookie, java.lang.String name) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestConfig(cookie, name);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem getTestConfigByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestConfigByRecordID(cookie, recordID);
  }
  
  public long addTestConfig(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CSystem pTestConfig) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addTestConfig(cookie, pTestConfig);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem editTestConfig(long cookie, java.lang.String name) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTestConfig(cookie, name);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem editTestConfigByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTestConfigByRecordID(cookie, recordID);
  }
  
  public int saveTestConfig(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CSystem pTestConfig) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveTestConfig(cookie, pTestConfig);
  }
  
  public int deleteTestConfig(long cookie, java.lang.String name) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTestConfig(cookie, name);
  }
  
  public int deleteTestConfigByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTestConfigByRecordID(cookie, recordID);
  }
  
  public int cancelSaveTestConfig(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveTestConfig(cookie, recordID);
  }
  
  public java.lang.String[] getAttachmentTypes(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getAttachmentTypes(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CReportRunResults getReportRunResultsByName(long cookie, java.lang.String name) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getReportRunResultsByName(cookie, name);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CReportRunResults getReportRunResultsByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getReportRunResultsByRecordID(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CEventDefinition[] getEventDefinitionList(long cookie, java.lang.String tablename) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getEventDefinitionList(cookie, tablename);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDefectEventDefinition[] getDefectEventDefinitionList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDefectEventDefinitionList(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getCustomFieldsDefinitionList(long cookie, java.lang.String tablename) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getCustomFieldsDefinitionList(cookie, tablename);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getDefectCustomFieldsDefinitionList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDefectCustomFieldsDefinitionList(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect getDefect(long cookie, long defectNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDefect(cookie, defectNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect getDefectByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDefectByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public long addDefect(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CDefect pDefect) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addDefect(cookie, pDefect);
  }
  
  public long addDefectWithLink(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CDefect pDefect, long testRunRecordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addDefectWithLink(cookie, pDefect, testRunRecordID);
  }
  
  public int deleteDefect(long cookie, long defectNumber, java.lang.String summary) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteDefect(cookie, defectNumber, summary);
  }
  
  public int deleteDefectByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteDefectByRecordID(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect editDefect(long cookie, long defectNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editDefect(cookie, defectNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect editDefectByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editDefectByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public int saveDefect(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CDefect pDefect) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveDefect(cookie, pDefect);
  }
  
  public int cancelSaveDefect(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveDefect(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment getAttachment(long cookie, java.lang.String tablename, long recordID, long eventID, java.lang.String pszArchiveName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getAttachment(cookie, tablename, recordID, eventID, pszArchiveName);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment getDefectAttachment(long cookie, java.lang.String pszArchiveName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDefectAttachment(cookie, pszArchiveName);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTask getTask(long cookie, java.lang.String summary) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTask(cookie, summary);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTask getTaskByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTaskByRecordID(cookie, recordID);
  }
  
  public long addTask(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTask pTask) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addTask(cookie, pTask);
  }
  
  public int deleteTask(long cookie, java.lang.String summary) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTask(cookie, summary);
  }
  
  public int deleteTaskByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTaskByRecordID(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTask editTask(long cookie, java.lang.String summary) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTask(cookie, summary);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTask editTaskByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTaskByRecordID(cookie, recordID);
  }
  
  public int saveTask(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTask pTask) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveTask(cookie, pTask);
  }
  
  public int cancelSaveTask(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveTask(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser[] getGlobalUserList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getGlobalUserList(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser[] getGlobalCustomerList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getGlobalCustomerList(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTTVersionInfo getTTVersionInfo(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTTVersionInfo(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFile getDocForExportTemplate(long cookie, long templateID, java.lang.String templateName, java.lang.String tablename, java.lang.String filtername, java.lang.String query, long[] recordIDs, java.lang.String timezoneID, java.lang.String locale, double hoursOffGMT) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDocForExportTemplate(cookie, templateID, templateName, tablename, filtername, query, recordIDs, timezoneID, locale, hoursOffGMT);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFile getDocForExportTemplateReqDoc(long cookie, long templateID, java.lang.String templateName, long documentID, int snapshotVersion, java.lang.String timezoneID, java.lang.String locale, double hoursOffGMT) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDocForExportTemplateReqDoc(cookie, templateID, templateName, documentID, snapshotVersion, timezoneID, locale, hoursOffGMT);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFile getDocForExportTemplateFolder(long cookie, long templateID, java.lang.String templateName, java.lang.String folderPath, boolean bRecursive, java.lang.String tablename, java.lang.String filtername, java.lang.String sortOrder, java.lang.String timezoneID, java.lang.String locale, double hoursOffGMT) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDocForExportTemplateFolder(cookie, templateID, templateName, folderPath, bRecursive, tablename, filtername, sortOrder, timezoneID, locale, hoursOffGMT);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUserLicense[] getUserLicenseList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getUserLicenseList(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getUser(cookie, firstName, middleInitials, lastName);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getUserByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getUserByRecordID(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getUserForCurrentSession(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getUserForCurrentSession(cookie);
  }
  
  public long addUser(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pUser) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addUser(cookie, pUser);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editUser(cookie, firstName, middleInitials, lastName);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editUserByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editUserByRecordID(cookie, recordID);
  }
  
  public int saveUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pUser) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveUser(cookie, firstName, middleInitials, lastName, pUser);
  }
  
  public int deleteUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteUser(cookie, firstName, middleInitials, lastName);
  }
  
  public int deleteUserByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteUserByRecordID(cookie, recordID);
  }
  
  public int cancelSaveUser(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveUser(cookie, recordID);
  }
  
  public int promoteUser(long cookie, java.lang.String localUser, java.lang.String globalUser, java.lang.String loginname, java.lang.String password) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.promoteUser(cookie, localUser, globalUser, loginname, password);
  }
  
  public int addGlobalUser(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser pUser) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addGlobalUser(cookie, pUser);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getCustomer(cookie, firstName, middleInitials, lastName);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getCustomerByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getCustomerByRecordID(cookie, recordID);
  }
  
  public long addCustomer(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pCustomer) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addCustomer(cookie, pCustomer);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editCustomer(cookie, firstName, middleInitials, lastName);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editCustomerByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editCustomerByRecordID(cookie, recordID);
  }
  
  public int saveCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pCustomer) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveCustomer(cookie, firstName, middleInitials, lastName, pCustomer);
  }
  
  public int deleteCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteCustomer(cookie, firstName, middleInitials, lastName);
  }
  
  public int deleteCustomerByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteCustomerByRecordID(cookie, recordID);
  }
  
  public int cancelSaveCustomer(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveCustomer(cookie, recordID);
  }
  
  public int promoteCustomer(long cookie, java.lang.String localCustomer, java.lang.String globalUser, java.lang.String loginname, java.lang.String password) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.promoteCustomer(cookie, localCustomer, globalUser, loginname, password);
  }
  
  public int addGlobalCustomer(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser pUser) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addGlobalCustomer(cookie, pUser);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CLink[] getLinksForItem(long cookie, java.lang.String tablename, long itemRecordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getLinksForItem(cookie, tablename, itemRecordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CLink[] getLinksForDefect(long cookie, long defectRecordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getLinksForDefect(cookie, defectRecordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CLink getLink(long cookie, long linkID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getLink(cookie, linkID);
  }
  
  public long addLink(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CLink pLink) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addLink(cookie, pLink);
  }
  
  public int deleteLink(long cookie, long linkID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteLink(cookie, linkID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CLink editLink(long cookie, long linkID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editLink(cookie, linkID);
  }
  
  public int saveLink(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CLink pLink) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveLink(cookie, pLink);
  }
  
  public int cancelSaveLink(long cookie, long linkID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveLink(cookie, linkID);
  }
  
  public java.lang.String[] getTestVariantTypes(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestVariantTypes(cookie);
  }
  
  public java.lang.String[] getTestRunStepsModes(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestRunStepsModes(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase getTestCase(long cookie, long testCaseNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestCase(cookie, testCaseNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase getTestCaseByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestCaseByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public long addTestCase(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase pTestCase) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addTestCase(cookie, pTestCase);
  }
  
  public int deleteTestCase(long cookie, long testCaseNumber, java.lang.String summary, boolean bDeleteAssociatedTestRuns) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTestCase(cookie, testCaseNumber, summary, bDeleteAssociatedTestRuns);
  }
  
  public int deleteTestCaseByRecordID(long cookie, long recordID, boolean bDeleteAssociatedTestRun) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTestCaseByRecordID(cookie, recordID, bDeleteAssociatedTestRun);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase editTestCase(long cookie, long testCaseNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTestCase(cookie, testCaseNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase editTestCaseByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTestCaseByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public int saveTestCase(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase pTestCase) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveTestCase(cookie, pTestCase);
  }
  
  public int cancelSaveTestCase(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveTestCase(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun getTestRun(long cookie, long testRunNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestRun(cookie, testRunNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun getTestRunByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getTestRunByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public int deleteTestRun(long cookie, long testRunNumber, java.lang.String summary) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTestRun(cookie, testRunNumber, summary);
  }
  
  public int deleteTestRunByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteTestRunByRecordID(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun editTestRun(long cookie, long testRunNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTestRun(cookie, testRunNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun editTestRunByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editTestRunByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public int saveTestRun(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun pTestRun) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveTestRun(cookie, pTestRun);
  }
  
  public int cancelSaveTestRun(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveTestRun(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect createDefectForTestRun(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.createDefectForTestRun(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack[] generateTestRuns(long cookie, long recordID, com.sempra.hr.cucumber.frwk.testtrack.util.CTestRunVariantField[] testVariants, java.lang.String testRunSet) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.generateTestRuns(cookie, recordID, testVariants, testRunSet);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderType getFolderTypeByName(long cookie, java.lang.String name) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolderTypeByName(cookie, name);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderType[] getFolderTypeList(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolderTypeList(cookie);
  }
  
  public long addFolder(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CFolder pFolder) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addFolder(cookie, pFolder);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder editFolder(long cookie, java.lang.String folderPath) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editFolder(cookie, folderPath);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder editFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editFolderByRecordID(cookie, recordID, publicFolder);
  }
  
  public int saveFolder(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CFolder pFolder) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveFolder(cookie, pFolder);
  }
  
  public int cancelSaveFolder(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveFolder(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder getFolder(long cookie, java.lang.String path) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolder(cookie, path);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder getFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolderByRecordID(cookie, recordID, publicFolder);
  }
  
  public int deleteFolder(long cookie, java.lang.String folderPath) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteFolder(cookie, folderPath);
  }
  
  public int deleteFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteFolderByRecordID(cookie, recordID, publicFolder);
  }
  
  public int addEntityToFolderByRecordID(long cookie, long recordID, boolean publicFolder, long entityRecordID, java.lang.String entityTableName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addEntityToFolderByRecordID(cookie, recordID, publicFolder, entityRecordID, entityTableName);
  }
  
  public int removeEntityFromFolderByRecordID(long cookie, long recordID, boolean publicFolder, com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem entity) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.removeEntityFromFolderByRecordID(cookie, recordID, publicFolder, entity);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem[] getEntityListForFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getEntityListForFolderByRecordID(cookie, recordID, publicFolder);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder[] getFolderListForEntityByRecordID(long cookie, java.lang.String tablename, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolderListForEntityByRecordID(cookie, tablename, recordID);
  }
  
  public byte getFolderPathSeparator(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolderPathSeparator(cookie);
  }
  
  public java.lang.String getRootPublicFolderPath(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRootPublicFolderPath(cookie);
  }
  
  public java.lang.String getRootPrivateFolderPath(long cookie) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRootPrivateFolderPath(cookie);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem[] editFolderItemRank(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editFolderItemRank(cookie, recordID, publicFolder);
  }
  
  public int saveFolderItemRank(long cookie, long recordID, boolean publicFolder, com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem[] folderItemList) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveFolderItemRank(cookie, recordID, publicFolder, folderItemList);
  }
  
  public int cancelSaveFolderItemRank(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveFolderItemRank(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement getRequirement(long cookie, long requirementNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRequirement(cookie, requirementNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement getRequirementByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRequirementByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public long addRequirement(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement pRequirement) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addRequirement(cookie, pRequirement);
  }
  
  public int deleteRequirement(long cookie, long requirementNumber, java.lang.String summary) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteRequirement(cookie, requirementNumber, summary);
  }
  
  public int deleteRequirementByRecordID(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteRequirementByRecordID(cookie, recordID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement editRequirement(long cookie, long requirementNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editRequirement(cookie, requirementNumber, summary, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement editRequirementByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editRequirementByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public int saveRequirement(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement pRequirement) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveRequirement(cookie, pRequirement);
  }
  
  public int cancelSaveRequirement(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveRequirement(cookie, recordID);
  }
  
  public int appendToRequirementDocument(long cookie, long requirementID, long documentID, long parentRequirementID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.appendToRequirementDocument(cookie, requirementID, documentID, parentRequirementID);
  }
  
  public long[] getDocumentIDsForRequirement(long cookie, long requirementID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDocumentIDsForRequirement(cookie, requirementID);
  }
  
  public int changeRequirementType(long cookie, long requirementID, java.lang.String newTypeName) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.changeRequirementType(cookie, requirementID, newTypeName);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument getRequirementDocument(long cookie, long documentNumber, java.lang.String name, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRequirementDocument(cookie, documentNumber, name, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument getRequirementDocumentByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRequirementDocumentByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public long addRequirementDocument(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument pRequirementDocument) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.addRequirementDocument(cookie, pRequirementDocument);
  }
  
  public int deleteRequirementDocument(long cookie, long documentNumber, java.lang.String name, boolean bDeleteAssociatedRequirements) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteRequirementDocument(cookie, documentNumber, name, bDeleteAssociatedRequirements);
  }
  
  public int deleteRequirementDocumentByRecordID(long cookie, long recordID, boolean bDeleteAssociatedRequirements) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.deleteRequirementDocumentByRecordID(cookie, recordID, bDeleteAssociatedRequirements);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument editRequirementDocument(long cookie, long documentNumber, java.lang.String name, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editRequirementDocument(cookie, documentNumber, name, bDownloadAttachments);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument editRequirementDocumentByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.editRequirementDocumentByRecordID(cookie, recordID, bDownloadAttachments);
  }
  
  public int saveRequirementDocument(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument pRequirementDocument) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.saveRequirementDocument(cookie, pRequirementDocument);
  }
  
  public int cancelSaveRequirementDocument(long cookie, long recordID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.cancelSaveRequirementDocument(cookie, recordID);
  }
  
  public int createSnapshot(long cookie, long documentID, com.sempra.hr.cucumber.frwk.testtrack.util.CSnapshotInfo snapshot) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.createSnapshot(cookie, documentID, snapshot);
  }
  
  public long[] getRequirementIDsForDocument(long cookie, long documentID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getRequirementIDsForDocument(cookie, documentID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap getDocumentTree(long cookie, long documentID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getDocumentTree(cookie, documentID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap getFolderTreeByRecordID(long cookie, long treeRootFolderID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolderTreeByRecordID(cookie, treeRootFolderID);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap getFolderTree(long cookie, java.lang.String treeRootFolderPath) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getFolderTree(cookie, treeRootFolderPath);
  }
  
  public com.sempra.hr.cucumber.frwk.testtrack.util.CItemHyperlinkContainer getItemHyperlinks(long cookie, java.lang.String itemType, long itemID) throws java.rmi.RemoteException{
    if (ttsoapcgiPortType == null)
      _initTtsoapcgiPortTypeProxy();
    return ttsoapcgiPortType.getItemHyperlinks(cookie, itemType, itemID);
  }
  
  
}