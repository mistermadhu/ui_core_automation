/**
 * TtsoapcgiPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sempra.hr.cucumber.frwk.testtrack.util;

public interface TtsoapcgiPortType extends java.rmi.Remote {

    /**
     * Returns a list of database names the SOAP client can connect
     * to. Deprecated; use getProjectList.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDatabase[] getDatabaseList() throws java.rmi.RemoteException;

    /**
     * Returns a list of project names the SOAP client can connect
     * to.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CProject[] getProjectList(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Returns what type of access SOAP user has. For example, logging
     * in with access to TestTrack Pro.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CProjectDataOption[] getProjectDataOptionList() throws java.rmi.RemoteException;

    /**
     * Logs SOAP user into TestTrack. Deprecated; use ProjectLogon.
     */
    public long databaseLogon(java.lang.String dbname, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Logs SOAP user into TestTrack. Uses a project name, which the
     * getProjectList request returns, with a username and password. This
     * request returns a cookie that is used in subsequent calls. NOTE: In
     * the TestTrack Client, users can be required to change their passwords
     * at the next login. This option is not enforced in the SOAP client
     * because we do not want to prevent SOAP scripts from running because
     * of the change password option.
     */
    public long projectLogon(com.sempra.hr.cucumber.frwk.testtrack.util.CProject pProj, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Logs SOAP user out of TestTrack. This operation is used for
     * session management and should be the final call made to the SOAP server.
     * It performs session clean up, logs off all users, and closes all connections
     * to the TestTrack project.
     */
    public int databaseLogoff(long cookie) throws java.rmi.RemoteException;

    /**
     * Turns formattedTextSupport on or off. Defaults to plain text.
     * Pass in 'true' to turn rich text on.
     */
    public boolean formattedTextSupport(long cookie, boolean enableFormattedText) throws java.rmi.RemoteException;

    /**
     * Returns a list of tables the user can access. Many TestTrack
     * SOAP requests and types use a table name as a parameter. This request
     * filters out tables the SOAP user does not have security access to.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDatabaseTable[] getTableList(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns table drop-down field. Fields only access specific
     * values and are included as a subset of columns returned from getColumnsForTable.
     * Use getDropdownFieldValuesForTable to get field values.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTableField[] getDropdownFieldForTable(long cookie, java.lang.String tablename) throws java.rmi.RemoteException;

    /**
     * Returns table drop-down field values. Use getDropdownFieldForTable
     * to get fields.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] getDropdownFieldValuesForTable(long cookie, java.lang.String tablename, java.lang.String fieldname) throws java.rmi.RemoteException;

    /**
     * Adds drop-down values to a selected field. The list of values
     * is sent to the server with the new value added last.
     */
    public int addDropdownFieldValuesForTable(long cookie, java.lang.String tablename, java.lang.String fieldname, com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] pValueList) throws java.rmi.RemoteException;

    /**
     * Returns a list of defined links.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFieldValue[] getLinkDefinitionValues(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns column fields that are displayed for a specific table.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] getColumnsForTable(long cookie, java.lang.String tablename) throws java.rmi.RemoteException;

    /**
     * Returns a list of filters.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFilter[] getFilterList(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns list of filters that a specified table can use.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFilter[] getFilterListForTable(long cookie, java.lang.String tablename) throws java.rmi.RemoteException;

    /**
     * Returns table data. The filtername parameter applies a filter
     * to the results. The columnlist parameter limits the returned data
     * to specific columns. NOTE: Only the first 128 characters are returned.
     * Following are the table names: Customer, Defect, Folder, Links, Report,
     * Requirement, Requirement Document, Task, Test Case, Test Config, Test
     * Run, Test Variant, User.  The returned DateTime data format is based
     * on the server locale setting.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRecordListSoap getRecordListForTable(long cookie, java.lang.String tablename, java.lang.String filtername, com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] columnlist) throws java.rmi.RemoteException;

    /**
     * Returns table data. The filtername parameter applies a filter
     * to the results. The query allows a JSON query to be added to futher
     * filter the results. The columnlist parameter limits the returned data
     * to specific columns. NOTE: Only the first 128 characters are returned.
     * Following are the table names: Customer, Defect, Folder, Links, Report,
     * Requirement, Requirement Document, Task, Test Case, Test Config, Test
     * Run, Test Variant, User.  The returned DateTime data format is based
     * on the server locale setting.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRecordListSoap getRecordListForTableWithQuery(long cookie, java.lang.String tablename, java.lang.String filtername, java.lang.String query, com.sempra.hr.cucumber.frwk.testtrack.util.CTableColumn[] columnlist) throws java.rmi.RemoteException;

    /**
     * Returns a list of test configs.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem getTestConfig(long cookie, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Returns a test config based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem getTestConfigByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Creates a test config.
     */
    public long addTestConfig(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CSystem pTestConfig) throws java.rmi.RemoteException;

    /**
     * Retrieves a test config for editing. The saveTestConfig request
     * must be called and passed the changed object.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem editTestConfig(long cookie, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Retrieves a test config for editing based on record ID. The
     * saveTestConfig request must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CSystem editTestConfigByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Saves a modified test config.
     */
    public int saveTestConfig(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CSystem pTestConfig) throws java.rmi.RemoteException;

    /**
     * Deletes a test config.
     */
    public int deleteTestConfig(long cookie, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Deletes a test config based on record ID.
     */
    public int deleteTestConfigByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Discards changes to a test config.
     */
    public int cancelSaveTestConfig(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns the values (Standard, Script, Run Result) that are
     * used in the m-strType var of an attachment in an attachmentList for
     * core items.
     */
    public java.lang.String[] getAttachmentTypes(long cookie) throws java.rmi.RemoteException;

    /**
     * Runs a report and returns results based on report names. NOTE:
     * Live charts and interactively filtered reports are not supported.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CReportRunResults getReportRunResultsByName(long cookie, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Runs a report and returns results based on report ID. NOTE:
     * Live charts and interactively filtered reports are not supported.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CReportRunResults getReportRunResultsByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns a list of event definitions that describe what fields
     * are included with each event.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CEventDefinition[] getEventDefinitionList(long cookie, java.lang.String tablename) throws java.rmi.RemoteException;

    /**
     * Returns a list of defect event definitions that describe the
     * fields included with each event.  Deprecated; use getEventDefinitionList.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDefectEventDefinition[] getDefectEventDefinitionList(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns a list of custom field definitions.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getCustomFieldsDefinitionList(long cookie, java.lang.String tablename) throws java.rmi.RemoteException;

    /**
     * Returns a list of defect custom field definitions.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CField[] getDefectCustomFieldsDefinitionList(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns a defect based on defect number or summary.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect getDefect(long cookie, long defectNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Returns a defect based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect getDefectByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Creates a defect.
     */
    public long addDefect(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CDefect pDefect) throws java.rmi.RemoteException;

    /**
     * Creates a linked defect.
     */
    public long addDefectWithLink(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CDefect pDefect, long testRunRecordID) throws java.rmi.RemoteException;

    /**
     * Deletes a defect based on defect number or summary.
     */
    public int deleteDefect(long cookie, long defectNumber, java.lang.String summary) throws java.rmi.RemoteException;

    /**
     * Deletes a defect based on record ID.
     */
    public int deleteDefectByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Retrieves a defect for editing. The saveDefect request must
     * be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect editDefect(long cookie, long defectNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Retrieves a defect for editing based on record ID. The saveDefect
     * request must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect editDefectByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a defect.
     */
    public int saveDefect(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CDefect pDefect) throws java.rmi.RemoteException;

    /**
     * Discards any changes made to a defect.
     */
    public int cancelSaveDefect(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Retrieves file attachments.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment getAttachment(long cookie, java.lang.String tablename, long recordID, long eventID, java.lang.String pszArchiveName) throws java.rmi.RemoteException;

    /**
     * Retrieves defect file attachments. Deprecated; use getAttachmentRequest.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFileAttachment getDefectAttachment(long cookie, java.lang.String pszArchiveName) throws java.rmi.RemoteException;

    /**
     * Retrieves a task.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTask getTask(long cookie, java.lang.String summary) throws java.rmi.RemoteException;

    /**
     * Retrieves a task based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTask getTaskByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Creates a task.
     */
    public long addTask(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTask pTask) throws java.rmi.RemoteException;

    /**
     * Deletes a task.
     */
    public int deleteTask(long cookie, java.lang.String summary) throws java.rmi.RemoteException;

    /**
     * Deletes a task based on record ID.
     */
    public int deleteTaskByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Retrieves a task for editing. The saveTask request must be
     * called and passed the changed object.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTask editTask(long cookie, java.lang.String summary) throws java.rmi.RemoteException;

    /**
     * Retrieves a task for editing based on record ID. The saveTask
     * request must be called and passed the changed object.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTask editTaskByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a task.
     */
    public int saveTask(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTask pTask) throws java.rmi.RemoteException;

    /**
     * Discards any changes made to a task.
     */
    public int cancelSaveTask(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns a list of global users from the Seapine License Server.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser[] getGlobalUserList(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns a list of global customers from the Seapine License
     * Server.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser[] getGlobalCustomerList(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns the version information for the TestTrack Server and
     * CGI.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTTVersionInfo getTTVersionInfo(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns the document from exporting the given template.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFile getDocForExportTemplate(long cookie, long templateID, java.lang.String templateName, java.lang.String tablename, java.lang.String filtername, java.lang.String query, long[] recordIDs, java.lang.String timezoneID, java.lang.String locale, double hoursOffGMT) throws java.rmi.RemoteException;

    /**
     * Returns the document from exporting the given template for
     * a specific Requirement Document.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFile getDocForExportTemplateReqDoc(long cookie, long templateID, java.lang.String templateName, long documentID, int snapshotVersion, java.lang.String timezoneID, java.lang.String locale, double hoursOffGMT) throws java.rmi.RemoteException;

    /**
     * Returns the document from exporting the given template for
     * a specific Folder.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFile getDocForExportTemplateFolder(long cookie, long templateID, java.lang.String templateName, java.lang.String folderPath, boolean bRecursive, java.lang.String tablename, java.lang.String filtername, java.lang.String sortOrder, java.lang.String timezoneID, java.lang.String locale, double hoursOffGMT) throws java.rmi.RemoteException;

    /**
     * Returns a list of user licenses.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUserLicense[] getUserLicenseList(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns a user.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException;

    /**
     * Returns a user based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getUserByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns the user used to log in for this session.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getUserForCurrentSession(long cookie) throws java.rmi.RemoteException;

    /**
     * Creates a user.
     */
    public long addUser(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pUser) throws java.rmi.RemoteException;

    /**
     * Retrieves a user for editing. The saveUser request must be
     * called and passed the changed object.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException;

    /**
     * Retrieves a user for editing based on record ID. The saveUser
     * request must be called and passed the changed object.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editUserByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a user record.
     */
    public int saveUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pUser) throws java.rmi.RemoteException;

    /**
     * Deletes a user.
     */
    public int deleteUser(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException;

    /**
     * Deletes a user based on record ID.
     */
    public int deleteUserByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a user record.
     */
    public int cancelSaveUser(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Promotes a local user to a global user on the Seapine License
     * Server.
     */
    public int promoteUser(long cookie, java.lang.String localUser, java.lang.String globalUser, java.lang.String loginname, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Retrieves a global user from the Seapine License Server and
     * adds them to TestTrack.
     */
    public int addGlobalUser(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser pUser) throws java.rmi.RemoteException;

    /**
     * Returns a customer.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException;

    /**
     * Returns a customer based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser getCustomerByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Creates a customer.
     */
    public long addCustomer(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pCustomer) throws java.rmi.RemoteException;

    /**
     * Retrieves a customer for editing. The saveCustomer request
     * must be called and passed the changed object.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException;

    /**
     * Retrieves a customer for editing based on record ID. The saveCustomer
     * request must be called and passed the changed object.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CUser editCustomerByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a customer record.
     */
    public int saveCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName, com.sempra.hr.cucumber.frwk.testtrack.util.CUser pCustomer) throws java.rmi.RemoteException;

    /**
     * Deletes a customer.
     */
    public int deleteCustomer(long cookie, java.lang.String firstName, java.lang.String middleInitials, java.lang.String lastName) throws java.rmi.RemoteException;

    /**
     * Deletes a customer based on record ID.
     */
    public int deleteCustomerByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a customer record.
     */
    public int cancelSaveCustomer(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Promotes a local customer to a global customer on the Seapine
     * License Server.
     */
    public int promoteCustomer(long cookie, java.lang.String localCustomer, java.lang.String globalUser, java.lang.String loginname, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Retrieves a global customer from the Seapine License Server
     * and adds them to TestTrack.
     */
    public int addGlobalCustomer(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CGlobalUser pUser) throws java.rmi.RemoteException;

    /**
     * Returns links for a specified item.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CLink[] getLinksForItem(long cookie, java.lang.String tablename, long itemRecordID) throws java.rmi.RemoteException;

    /**
     * Returns links for a specified defect.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CLink[] getLinksForDefect(long cookie, long defectRecordID) throws java.rmi.RemoteException;

    /**
     * Returns a list of all links.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CLink getLink(long cookie, long linkID) throws java.rmi.RemoteException;

    /**
     * Creates a link.
     */
    public long addLink(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CLink pLink) throws java.rmi.RemoteException;

    /**
     * Deletes a link.
     */
    public int deleteLink(long cookie, long linkID) throws java.rmi.RemoteException;

    /**
     * Retrieves a link for editing. The saveLink request must be
     * called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CLink editLink(long cookie, long linkID) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a link.
     */
    public int saveLink(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CLink pLink) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a link.
     */
    public int cancelSaveLink(long cookie, long linkID) throws java.rmi.RemoteException;

    /**
     * Returns a list of test variant types.
     */
    public java.lang.String[] getTestVariantTypes(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns test runs steps mode. Either Grid View or Free Form
     * Text View.
     */
    public java.lang.String[] getTestRunStepsModes(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns a list of test cases.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase getTestCase(long cookie, long testCaseNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Returns a test case based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase getTestCaseByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Creates a test case.
     */
    public long addTestCase(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase pTestCase) throws java.rmi.RemoteException;

    /**
     * Deletes a test case.
     */
    public int deleteTestCase(long cookie, long testCaseNumber, java.lang.String summary, boolean bDeleteAssociatedTestRuns) throws java.rmi.RemoteException;

    /**
     * Deletes a test case based on a record ID.
     */
    public int deleteTestCaseByRecordID(long cookie, long recordID, boolean bDeleteAssociatedTestRun) throws java.rmi.RemoteException;

    /**
     * Retrieves a test case for editing. The saveTestCase request
     * must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase editTestCase(long cookie, long testCaseNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Retrieves a test case for editing based on record ID. The saveTestCase
     * request must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase editTestCaseByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a test case.
     */
    public int saveTestCase(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTestCase pTestCase) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a test case.
     */
    public int cancelSaveTestCase(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns a list of test runs.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun getTestRun(long cookie, long testRunNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Returns a test run based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun getTestRunByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Deletes a test run.
     */
    public int deleteTestRun(long cookie, long testRunNumber, java.lang.String summary) throws java.rmi.RemoteException;

    /**
     * Deletes a test run based on record ID.
     */
    public int deleteTestRunByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Retrieves a test run for editing. The saveTestRun request must
     * be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun editTestRun(long cookie, long testRunNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Retrieves a test run for editing based on record ID. The saveTestRun
     * request must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun editTestRunByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a test run.
     */
    public int saveTestRun(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CTestRun pTestRun) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a test run.
     */
    public int cancelSaveTestRun(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Creates a defect based on test run results.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CDefect createDefectForTestRun(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Generates test runs for a test case.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CItemToTrack[] generateTestRuns(long cookie, long recordID, com.sempra.hr.cucumber.frwk.testtrack.util.CTestRunVariantField[] testVariants, java.lang.String testRunSet) throws java.rmi.RemoteException;

    /**
     * Returns the properties of the folder type. Call the getFolderTypeList
     * request to get the names used in this request.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderType getFolderTypeByName(long cookie, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Returns a list of configured folder types.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderType[] getFolderTypeList(long cookie) throws java.rmi.RemoteException;

    /**
     * Creates a folder.
     */
    public long addFolder(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CFolder pFolder) throws java.rmi.RemoteException;

    /**
     * Retrieves a folder for editing. The saveFolder request must
     * be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder editFolder(long cookie, java.lang.String folderPath) throws java.rmi.RemoteException;

    /**
     * Retrieves a folder for editing based on record ID. The saveFolder
     * request must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder editFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a folder. NOTES: If you set the path,
     * parentid, and the ispublic flag, they must all be consistent. If you
     * set only the path, you can pass back the original parentid and ispublic
     * flag and they will be updated automatically. Similarly, if you set
     * the parentid and the ispublic flag you can pass back the original
     * path (or none at all) and it will be updated. If you set only the
     * parentid, the ispublic flag and the owner of the new parent folder
     * (if private) must be the same as the old parent folder. If the folder
     * name changes, the path must also change. The path must always end
     * with the folder name and no trailing path separator character. Changing
     * only ispublic or only name results in an error.
     */
    public int saveFolder(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CFolder pFolder) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a folder.
     */
    public int cancelSaveFolder(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns a list of folders.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder getFolder(long cookie, java.lang.String path) throws java.rmi.RemoteException;

    /**
     * Returns a folder based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder getFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException;

    /**
     * Deletes a folder.
     */
    public int deleteFolder(long cookie, java.lang.String folderPath) throws java.rmi.RemoteException;

    /**
     * Deletes a folder based on record ID.
     */
    public int deleteFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException;

    /**
     * Adds a TestTrack item to a folder based on record ID.
     */
    public int addEntityToFolderByRecordID(long cookie, long recordID, boolean publicFolder, long entityRecordID, java.lang.String entityTableName) throws java.rmi.RemoteException;

    /**
     * Removes a TestTrack item from a folder based on record ID.
     */
    public int removeEntityFromFolderByRecordID(long cookie, long recordID, boolean publicFolder, com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem entity) throws java.rmi.RemoteException;

    /**
     * Returns a list of TestTrack items in a folder based on record
     * ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem[] getEntityListForFolderByRecordID(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException;

    /**
     * Returns a list of folders a specified item is in.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolder[] getFolderListForEntityByRecordID(long cookie, java.lang.String tablename, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns the folder separator character, which is '/'.
     */
    public byte getFolderPathSeparator(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns a public folder path.
     */
    public java.lang.String getRootPublicFolderPath(long cookie) throws java.rmi.RemoteException;

    /**
     * Returns a private folder path.
     */
    public java.lang.String getRootPrivateFolderPath(long cookie) throws java.rmi.RemoteException;

    /**
     * Retrieves a folder for item ranking.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem[] editFolderItemRank(long cookie, long recordID, boolean publicFolder) throws java.rmi.RemoteException;

    /**
     * Save changes made to item rank in a folder.
     */
    public int saveFolderItemRank(long cookie, long recordID, boolean publicFolder, com.sempra.hr.cucumber.frwk.testtrack.util.CFolderItem[] folderItemList) throws java.rmi.RemoteException;

    /**
     * Discards changes made to item rank in a folder.
     */
    public int cancelSaveFolderItemRank(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Returns a list of requirements.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement getRequirement(long cookie, long requirementNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Returns a requirement based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement getRequirementByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Creates a requirement.
     */
    public long addRequirement(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement pRequirement) throws java.rmi.RemoteException;

    /**
     * Deletes a requirement.
     */
    public int deleteRequirement(long cookie, long requirementNumber, java.lang.String summary) throws java.rmi.RemoteException;

    /**
     * Deletes a requirement based on record ID.
     */
    public int deleteRequirementByRecordID(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Retrieves a requirement for editing. The saveRequirement request
     * must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement editRequirement(long cookie, long requirementNumber, java.lang.String summary, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Retrieves a requirement for editing based on record ID. The
     * saveRequirement request must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement editRequirementByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a requirement.
     */
    public int saveRequirement(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirement pRequirement) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a requirement.
     */
    public int cancelSaveRequirement(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Appends the requirement to the end of a requirement document.
     */
    public int appendToRequirementDocument(long cookie, long requirementID, long documentID, long parentRequirementID) throws java.rmi.RemoteException;

    /**
     * Returns a list of requirement document IDs for a specified
     * requirement.
     */
    public long[] getDocumentIDsForRequirement(long cookie, long requirementID) throws java.rmi.RemoteException;

    /**
     * Changes the requirement type.
     */
    public int changeRequirementType(long cookie, long requirementID, java.lang.String newTypeName) throws java.rmi.RemoteException;

    /**
     * Returns a list of requirement documents.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument getRequirementDocument(long cookie, long documentNumber, java.lang.String name, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Returns a list of requirement documents by record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument getRequirementDocumentByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Creates a requirement document.
     */
    public long addRequirementDocument(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument pRequirementDocument) throws java.rmi.RemoteException;

    /**
     * Deletes a requirement document.
     */
    public int deleteRequirementDocument(long cookie, long documentNumber, java.lang.String name, boolean bDeleteAssociatedRequirements) throws java.rmi.RemoteException;

    /**
     * Service definition of function ttns__deleteRequirementDocumentByRecordID
     */
    public int deleteRequirementDocumentByRecordID(long cookie, long recordID, boolean bDeleteAssociatedRequirements) throws java.rmi.RemoteException;

    /**
     * Retrieves a requirement document for editing. The saveRequirementDocument
     * request must be called and passed the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument editRequirementDocument(long cookie, long documentNumber, java.lang.String name, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Retrieves a requirement document for editing based on record
     * ID. The saveRequirementDocument request must be called and passed
     * the changed objects.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument editRequirementDocumentByRecordID(long cookie, long recordID, boolean bDownloadAttachments) throws java.rmi.RemoteException;

    /**
     * Saves changes made to a requirement document.
     */
    public int saveRequirementDocument(long cookie, com.sempra.hr.cucumber.frwk.testtrack.util.CRequirementDocument pRequirementDocument) throws java.rmi.RemoteException;

    /**
     * Discards changes made to a requirement document.
     */
    public int cancelSaveRequirementDocument(long cookie, long recordID) throws java.rmi.RemoteException;

    /**
     * Creates a requirement document snapshot.
     */
    public int createSnapshot(long cookie, long documentID, com.sempra.hr.cucumber.frwk.testtrack.util.CSnapshotInfo snapshot) throws java.rmi.RemoteException;

    /**
     * Returns a list of requirement IDs for the requirement document.
     */
    public long[] getRequirementIDsForDocument(long cookie, long documentID) throws java.rmi.RemoteException;

    /**
     * Returns the requirement hierarchy from a requirement document.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap getDocumentTree(long cookie, long documentID) throws java.rmi.RemoteException;

    /**
     * Returns the public or private folder hierarchy starting at
     * a specified folder based on record ID.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap getFolderTreeByRecordID(long cookie, long treeRootFolderID) throws java.rmi.RemoteException;

    /**
     * Returns the public or private folder hierarchy starting at
     * a specified folder.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CTreeNodeSoap getFolderTree(long cookie, java.lang.String treeRootFolderPath) throws java.rmi.RemoteException;

    /**
     * Returns ttstudio and http hyperlinks for a specified item.
     */
    public com.sempra.hr.cucumber.frwk.testtrack.util.CItemHyperlinkContainer getItemHyperlinks(long cookie, java.lang.String itemType, long itemID) throws java.rmi.RemoteException;
}
