/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.opencsv.bean.CsvBindByPosition;




/**
 *
 * @author kyokuto
 */

public class ItemEntity {

    @CsvBindByPosition(position = 0, required = false)
    private String managementNumberId;
    @CsvBindByPosition(position = 1, required = false)
    private String controlNumber;
    @CsvBindByPosition(position = 2, required = false)
    private String referenceNumber;
    @CsvBindByPosition(position = 3, required = false)
    private String ledgerNumber;
    @CsvBindByPosition(position = 4, required = false)
    private String slipNumber;
    @CsvBindByPosition(position = 5, required = false)
    private String scawNumber;
    @CsvBindByPosition(position = 6, required = false)
    private String accountYearMonth;
    @CsvBindByPosition(position = 7, required = false)
    private String expensedYearMonth;
    @CsvBindByPosition(position = 8, required = false)
    private String dateOfIssue;
    @CsvBindByPosition(position = 9, required = false)
    private String teamCode;
    @CsvBindByPosition(position = 10, required = false)
    private String nameOfDepartment;
    @CsvBindByPosition(position = 11, required = false)
    private String shoppingAreaCode;
    @CsvBindByPosition(position = 12, required = false)
    private String contactPersonCode;
    @CsvBindByPosition(position = 13, required = false)
    private String contactName;
    @CsvBindByPosition(position = 14, required = false)
    private String vanpool;
    @CsvBindByPosition(position = 15, required = false)
    private String dateOfDelivery;
    @CsvBindByPosition(position = 16, required = false)
    private String paymentMethod;
    @CsvBindByPosition(position = 17, required = false)
    private String dueDateForPayment;
    @CsvBindByPosition(position = 18, required = false)
    private String paymentTerms;
    @CsvBindByPosition(position = 19, required = false)
    private String payeeCode;
    @CsvBindByPosition(position = 20, required = false)
    private String payerName;
    @CsvBindByPosition(position = 21, required = false)
    private String exportersOrImporters;
    @CsvBindByPosition(position = 22, required = false)
    private String applicationNumber;
    @CsvBindByPosition(position = 23, required = false)
    private String claimPaymentRelatedNumber;
    @CsvBindByPosition(position = 24, required = false)
    private String slipDescription;
    @CsvBindByPosition(position = 25, required = false)
    private String shipperForm;
    @CsvBindByPosition(position = 26, required = false)
    private String regionalForm;
    @CsvBindByPosition(position = 27, required = false)
    private String actualBillingPartyCode;
    @CsvBindByPosition(position = 28, required = false)
    private String actualBillingPartyName;
    @CsvBindByPosition(position = 29, required = false)
    private int itemSeq;
    @CsvBindByPosition(position = 30, required = false)
    private String accountNumber;
    @CsvBindByPosition(position = 31, required = false)
    private String accountName;
    @CsvBindByPosition(position = 32, required = false)
    private String subjectSummary;
    @CsvBindByPosition(position = 33, required = false)
    private String summary;
    @CsvBindByPosition(position = 34, required = false)
    private String subjectAssistance;
    @CsvBindByPosition(position = 35, required = false)
    private String internalAccount;
    @CsvBindByPosition(position = 36, required = false)
    private String dateOfOccurrence;
    @CsvBindByPosition(position = 37, required = false)
    private String clearingNumber;
    @CsvBindByPosition(position = 38, required = false)
    private String burdenTeam;
    @CsvBindByPosition(position = 39, required = false)
    private String businessPartnerCode;
    @CsvBindByPosition(position = 40, required = false)
    private String customerName;
    @CsvBindByPosition(position = 41, required = false)
    private String shipperStoragePlaceCode;
    @CsvBindByPosition(position = 42, required = false)
    private String shipperName;
    @CsvBindByPosition(position = 43, required = false)
    private String foreignCurrencyCode;
    @CsvBindByPosition(position = 44, required = false)
    private String convertRate;
    @CsvBindByPosition(position = 45, required = false)
    private String foreignCurrencyAmount;
    @CsvBindByPosition(position = 46, required = false)
    private String approvalClassification;
    @CsvBindByPosition(position = 47, required = false)
    private String checklistOutputIndicator;
    @CsvBindByPosition(position = 48, required = false)
    private String deliveryLedgerOutputClassification;
    @CsvBindByPosition(position = 49, required = false)
    private String actualClassification;
    @CsvBindByPosition(position = 50, required = false)
    private String otherCategory;
    @CsvBindByPosition(position = 51, required = false)
    private String slipClassificationIndicator;
    @CsvBindByPosition(position = 52, required = false)
    private String transferRequestClassification;
    @CsvBindByPosition(position = 53, required = false)
    private String importOrExportClassification;
    @CsvBindByPosition(position = 54, required = false)
    private int journalSegment;
    @CsvBindByPosition(position = 55, required = false)
    private int borrowingClassification;
    @CsvBindByPosition(position = 56, required = false)
    private int creationType;
    @CsvBindByPosition(position = 57, required = false)
    private String inclusionClassification;
    @CsvBindByPosition(position = 58, required = false)
    private String collaborationClassification;
    @CsvBindByPosition(position = 59, required = false)
    private String consumptionTaxClassification;
    @CsvBindByPosition(position = 60, required = false)
    private String processingDivision;
    @CsvBindByPosition(position = 61, required = false)
    private String paymentClassification;
    @CsvBindByPosition(position = 62, required = false)
    private String systemType;
    @CsvBindByPosition(position = 63, required = false)
    private String system;
    @CsvBindByPosition(position = 64, required = false)
    private String debitConsumptionTaxAmountTotal;
    @CsvBindByPosition(position = 65, required = false)
    private String creditConsumptionTaxTotal;
    @CsvBindByPosition(position = 66, required = false)
    private String tonnage;
    @CsvBindByPosition(position = 67, required = false)
    private String _20F ;
    @CsvBindByPosition(position = 68, required = false)
    private String _40F ;
    @CsvBindByPosition(position = 69, required = false)
    private String amountOfMoney;
    @CsvBindByPosition(position = 70, required = false)
    private String consumptionTax;
    @CsvBindByPosition(position = 71, required = false)
    private String amount1;
    @CsvBindByPosition(position = 72, required = false)
    private String consumptionTax1;
    @CsvBindByPosition(position = 73, required = false)
    private String amount2;
    @CsvBindByPosition(position = 74, required = false)
    private String consumptionTax2;

    /**
     * @return the managementNumberId
     */
    public String getManagementNumberId() {
        return managementNumberId;
    }

    /**
     * @return the controlNumber
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * @return the referenceNumber
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * @return the ledgerNumber
     */
    public String getLedgerNumber() {
        return ledgerNumber;
    }

    /**
     * @return the slipNumber
     */
    public String getSlipNumber() {
        return slipNumber;
    }

    /**
     * @return the scawNumber
     */
    public String getScawNumber() {
        return scawNumber;
    }

    /**
     * @return the accountYearMonth
     */
    public String getAccountYearMonth() {
        return accountYearMonth;
    }

    /**
     * @return the expensedYearMonth
     */
    public String getExpensedYearMonth() {
        return expensedYearMonth;
    }

    /**
     * @return the dateOfIssue
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * @return the teamCode
     */
    public String getTeamCode() {
        return teamCode;
    }

    /**
     * @return the nameOfDepartment
     */
    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    /**
     * @return the shoppingAreaCode
     */
    public String getShoppingAreaCode() {
        return shoppingAreaCode;
    }

    /**
     * @return the contactPersonCode
     */
    public String getContactPersonCode() {
        return contactPersonCode;
    }

    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * @return the vanpool
     */
    public String getVanpool() {
        return vanpool;
    }

    /**
     * @return the dateOfDelivery
     */
    public String getDateOfDelivery() {
        return dateOfDelivery;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @return the dueDateForPayment
     */
    public String getDueDateForPayment() {
        return dueDateForPayment;
    }

    /**
     * @return the paymentTerms
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * @return the payeeCode
     */
    public String getPayeeCode() {
        return payeeCode;
    }

    /**
     * @return the payerName
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * @return the exportersOrImporters
     */
    public String getExportersOrImporters() {
        return exportersOrImporters;
    }

    /**
     * @return the applicationNumber
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * @return the claimPaymentRelatedNumber
     */
    public String getClaimPaymentRelatedNumber() {
        return claimPaymentRelatedNumber;
    }

    /**
     * @return the slipDescription
     */
    public String getSlipDescription() {
        return slipDescription;
    }

    /**
     * @return the shipperForm
     */
    public String getShipperForm() {
        return shipperForm;
    }

    /**
     * @return the regionalForm
     */
    public String getRegionalForm() {
        return regionalForm;
    }

    /**
     * @return the actualBillingPartyCode
     */
    public String getActualBillingPartyCode() {
        return actualBillingPartyCode;
    }

    /**
     * @return the actualBillingPartyName
     */
    public String getActualBillingPartyName() {
        return actualBillingPartyName;
    }

    /**
     * @return the itemSeq
     */
    public int getItemSeq() {
        return itemSeq;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @return the subjectSummary
     */
    public String getSubjectSummary() {
        return subjectSummary;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @return the subjectAssistance
     */
    public String getSubjectAssistance() {
        return subjectAssistance;
    }

    /**
     * @return the internalAccount
     */
    public String getInternalAccount() {
        return internalAccount;
    }

    /**
     * @return the dateOfOccurrence
     */
    public String getDateOfOccurrence() {
        return dateOfOccurrence;
    }

    /**
     * @return the clearingNumber
     */
    public String getClearingNumber() {
        return clearingNumber;
    }

    /**
     * @return the burdenTeam
     */
    public String getBurdenTeam() {
        return burdenTeam;
    }

    /**
     * @return the businessPartnerCode
     */
    public String getBusinessPartnerCode() {
        return businessPartnerCode;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @return the shipperStoragePlaceCode
     */
    public String getShipperStoragePlaceCode() {
        return shipperStoragePlaceCode;
    }

    /**
     * @return the shipperName
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * @return the foreignCurrencyCode
     */
    public String getForeignCurrencyCode() {
        return foreignCurrencyCode;
    }

    /**
     * @return the convertRate
     */
    public String getConvertRate() {
        return convertRate;
    }

    /**
     * @return the foreignCurrencyAmount
     */
    public String getForeignCurrencyAmount() {
        return foreignCurrencyAmount;
    }

    /**
     * @return the approvalClassification
     */
    public String getApprovalClassification() {
        return approvalClassification;
    }

    /**
     * @return the checklistOutputIndicator
     */
    public String getChecklistOutputIndicator() {
        return checklistOutputIndicator;
    }

    /**
     * @return the deliveryLedgerOutputClassification
     */
    public String getDeliveryLedgerOutputClassification() {
        return deliveryLedgerOutputClassification;
    }

    /**
     * @return the actualClassification
     */
    public String getActualClassification() {
        return actualClassification;
    }

    /**
     * @return the otherCategory
     */
    public String getOtherCategory() {
        return otherCategory;
    }

    /**
     * @return the slipClassificationIndicator
     */
    public String getSlipClassificationIndicator() {
        return slipClassificationIndicator;
    }

    /**
     * @return the transferRequestClassification
     */
    public String getTransferRequestClassification() {
        return transferRequestClassification;
    }

    /**
     * @return the importOrExportClassification
     */
    public String getImportOrExportClassification() {
        return importOrExportClassification;
    }

    /**
     * @return the journalSegment
     */
    public int getJournalSegment() {
        return journalSegment;
    }

    /**
     * @return the borrowingClassification
     */
    public int getBorrowingClassification() {
        return borrowingClassification;
    }

    /**
     * @return the creationType
     */
    public int getCreationType() {
        return creationType;
    }

    /**
     * @return the inclusionClassification
     */
    public String getInclusionClassification() {
        return inclusionClassification;
    }

    /**
     * @return the collaborationClassification
     */
    public String getCollaborationClassification() {
        return collaborationClassification;
    }

    /**
     * @return the consumptionTaxClassification
     */
    public String getConsumptionTaxClassification() {
        return consumptionTaxClassification;
    }

    /**
     * @return the processingDivision
     */
    public String getProcessingDivision() {
        return processingDivision;
    }

    /**
     * @return the paymentClassification
     */
    public String getPaymentClassification() {
        return paymentClassification;
    }

    /**
     * @return the systemType
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * @return the system
     */
    public String getSystem() {
        return system;
    }

    /**
     * @return the debitConsumptionTaxAmountTotal
     */
    public String getDebitConsumptionTaxAmountTotal() {
        return debitConsumptionTaxAmountTotal;
    }

    /**
     * @return the creditConsumptionTaxTotal
     */
    public String getCreditConsumptionTaxTotal() {
        return creditConsumptionTaxTotal;
    }

    /**
     * @return the tonnage
     */
    public String getTonnage() {
        return tonnage;
    }

    /**
     * @return the _20F
     */
    public String get20F() {
        return _20F;
    }

    /**
     * @return the _40F
     */
    public String get40F() {
        return _40F;
    }

    /**
     * @return the amountOfMoney
     */
    public String getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * @return the consumptionTax
     */
    public String getConsumptionTax() {
        return consumptionTax;
    }

    /**
     * @return the amount1
     */
    public String getAmount1() {
        return amount1;
    }

    /**
     * @return the consumptionTax1
     */
    public String getConsumptionTax1() {
        return consumptionTax1;
    }

    /**
     * @return the amount2
     */
    public String getAmount2() {
        return amount2;
    }

    /**
     * @return the consumptionTax2
     */
    public String getConsumptionTax2() {
        return consumptionTax2;
    }

    /**
     * @param managementNumberId the managementNumberId to set
     */
    public void setManagementNumberId(String managementNumberId) {
        this.managementNumberId = managementNumberId;
    }

    /**
     * @param controlNumber the controlNumber to set
     */
    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    /**
     * @param referenceNumber the referenceNumber to set
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    /**
     * @param ledgerNumber the ledgerNumber to set
     */
    public void setLedgerNumber(String ledgerNumber) {
        this.ledgerNumber = ledgerNumber;
    }

    /**
     * @param slipNumber the slipNumber to set
     */
    public void setSlipNumber(String slipNumber) {
        this.slipNumber = slipNumber;
    }

    /**
     * @param scawNumber the scawNumber to set
     */
    public void setScawNumber(String scawNumber) {
        this.scawNumber = scawNumber;
    }

    /**
     * @param accountYearMonth the accountYearMonth to set
     */
    public void setAccountYearMonth(String accountYearMonth) {
        this.accountYearMonth = accountYearMonth;
    }

    /**
     * @param expensedYearMonth the expensedYearMonth to set
     */
    public void setExpensedYearMonth(String expensedYearMonth) {
        this.expensedYearMonth = expensedYearMonth;
    }

    /**
     * @param dateOfIssue the dateOfIssue to set
     */
    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    /**
     * @param teamCode the teamCode to set
     */
    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    /**
     * @param nameOfDepartment the nameOfDepartment to set
     */
    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    /**
     * @param shoppingAreaCode the shoppingAreaCode to set
     */
    public void setShoppingAreaCode(String shoppingAreaCode) {
        this.shoppingAreaCode = shoppingAreaCode;
    }

    /**
     * @param contactPersonCode the contactPersonCode to set
     */
    public void setContactPersonCode(String contactPersonCode) {
        this.contactPersonCode = contactPersonCode;
    }

    /**
     * @param contactName the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @param vanpool the vanpool to set
     */
    public void setVanpool(String vanpool) {
        this.vanpool = vanpool;
    }

    /**
     * @param dateOfDelivery the dateOfDelivery to set
     */
    public void setDateOfDelivery(String dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @param dueDateForPayment the dueDateForPayment to set
     */
    public void setDueDateForPayment(String dueDateForPayment) {
        this.dueDateForPayment = dueDateForPayment;
    }

    /**
     * @param paymentTerms the paymentTerms to set
     */
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * @param payeeCode the payeeCode to set
     */
    public void setPayeeCode(String payeeCode) {
        this.payeeCode = payeeCode;
    }

    /**
     * @param payerName the payerName to set
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    /**
     * @param exportersOrImporters the exportersOrImporters to set
     */
    public void setExportersOrImporters(String exportersOrImporters) {
        this.exportersOrImporters = exportersOrImporters;
    }

    /**
     * @param applicationNumber the applicationNumber to set
     */
    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    /**
     * @param claimPaymentRelatedNumber the claimPaymentRelatedNumber to set
     */
    public void setClaimPaymentRelatedNumber(String claimPaymentRelatedNumber) {
        this.claimPaymentRelatedNumber = claimPaymentRelatedNumber;
    }

    /**
     * @param slipDescription the slipDescription to set
     */
    public void setSlipDescription(String slipDescription) {
        this.slipDescription = slipDescription;
    }

    /**
     * @param shipperForm the shipperForm to set
     */
    public void setShipperForm(String shipperForm) {
        this.shipperForm = shipperForm;
    }

    /**
     * @param regionalForm the regionalForm to set
     */
    public void setRegionalForm(String regionalForm) {
        this.regionalForm = regionalForm;
    }

    /**
     * @param actualBillingPartyCode the actualBillingPartyCode to set
     */
    public void setActualBillingPartyCode(String actualBillingPartyCode) {
        this.actualBillingPartyCode = actualBillingPartyCode;
    }

    /**
     * @param actualBillingPartyName the actualBillingPartyName to set
     */
    public void setActualBillingPartyName(String actualBillingPartyName) {
        this.actualBillingPartyName = actualBillingPartyName;
    }

    /**
     * @param itemSeq the itemSeq to set
     */
    public void setItemSeq(int itemSeq) {
        this.itemSeq = itemSeq;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @param subjectSummary the subjectSummary to set
     */
    public void setSubjectSummary(String subjectSummary) {
        this.subjectSummary = subjectSummary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @param subjectAssistance the subjectAssistance to set
     */
    public void setSubjectAssistance(String subjectAssistance) {
        this.subjectAssistance = subjectAssistance;
    }

    /**
     * @param internalAccount the internalAccount to set
     */
    public void setInternalAccount(String internalAccount) {
        this.internalAccount = internalAccount;
    }

    /**
     * @param dateOfOccurrence the dateOfOccurrence to set
     */
    public void setDateOfOccurrence(String dateOfOccurrence) {
        this.dateOfOccurrence = dateOfOccurrence;
    }

    /**
     * @param clearingNumber the clearingNumber to set
     */
    public void setClearingNumber(String clearingNumber) {
        this.clearingNumber = clearingNumber;
    }

    /**
     * @param burdenTeam the burdenTeam to set
     */
    public void setBurdenTeam(String burdenTeam) {
        this.burdenTeam = burdenTeam;
    }

    /**
     * @param businessPartnerCode the businessPartnerCode to set
     */
    public void setBusinessPartnerCode(String businessPartnerCode) {
        this.businessPartnerCode = businessPartnerCode;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @param shipperStoragePlaceCode the shipperStoragePlaceCode to set
     */
    public void setShipperStoragePlaceCode(String shipperStoragePlaceCode) {
        this.shipperStoragePlaceCode = shipperStoragePlaceCode;
    }

    /**
     * @param shipperName the shipperName to set
     */
    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    /**
     * @param foreignCurrencyCode the foreignCurrencyCode to set
     */
    public void setForeignCurrencyCode(String foreignCurrencyCode) {
        this.foreignCurrencyCode = foreignCurrencyCode;
    }

    /**
     * @param convertRate the convertRate to set
     */
    public void setConvertRate(String convertRate) {
        this.convertRate = convertRate;
    }

    /**
     * @param foreignCurrencyAmount the foreignCurrencyAmount to set
     */
    public void setForeignCurrencyAmount(String foreignCurrencyAmount) {
        this.foreignCurrencyAmount = foreignCurrencyAmount;
    }

    /**
     * @param approvalClassification the approvalClassification to set
     */
    public void setApprovalClassification(String approvalClassification) {
        this.approvalClassification = approvalClassification;
    }

    /**
     * @param checklistOutputIndicator the checklistOutputIndicator to set
     */
    public void setChecklistOutputIndicator(String checklistOutputIndicator) {
        this.checklistOutputIndicator = checklistOutputIndicator;
    }

    /**
     * @param deliveryLedgerOutputClassification the deliveryLedgerOutputClassification to set
     */
    public void setDeliveryLedgerOutputClassification(String deliveryLedgerOutputClassification) {
        this.deliveryLedgerOutputClassification = deliveryLedgerOutputClassification;
    }

    /**
     * @param actualClassification the actualClassification to set
     */
    public void setActualClassification(String actualClassification) {
        this.actualClassification = actualClassification;
    }

    /**
     * @param otherCategory the otherCategory to set
     */
    public void setOtherCategory(String otherCategory) {
        this.otherCategory = otherCategory;
    }

    /**
     * @param slipClassificationIndicator the slipClassificationIndicator to set
     */
    public void setSlipClassificationIndicator(String slipClassificationIndicator) {
        this.slipClassificationIndicator = slipClassificationIndicator;
    }

    /**
     * @param transferRequestClassification the transferRequestClassification to set
     */
    public void setTransferRequestClassification(String transferRequestClassification) {
        this.transferRequestClassification = transferRequestClassification;
    }

    /**
     * @param importOrExportClassification the importOrExportClassification to set
     */
    public void setImportOrExportClassification(String importOrExportClassification) {
        this.importOrExportClassification = importOrExportClassification;
    }

    /**
     * @param journalSegment the journalSegment to set
     */
    public void setJournalSegment(int journalSegment) {
        this.journalSegment = journalSegment;
    }

    /**
     * @param borrowingClassification the borrowingClassification to set
     */
    public void setBorrowingClassification(int borrowingClassification) {
        this.borrowingClassification = borrowingClassification;
    }

    /**
     * @param creationType the creationType to set
     */
    public void setCreationType(int creationType) {
        this.creationType = creationType;
    }

    /**
     * @param inclusionClassification the inclusionClassification to set
     */
    public void setInclusionClassification(String inclusionClassification) {
        this.inclusionClassification = inclusionClassification;
    }

    /**
     * @param collaborationClassification the collaborationClassification to set
     */
    public void setCollaborationClassification(String collaborationClassification) {
        this.collaborationClassification = collaborationClassification;
    }

    /**
     * @param consumptionTaxClassification the consumptionTaxClassification to set
     */
    public void setConsumptionTaxClassification(String consumptionTaxClassification) {
        this.consumptionTaxClassification = consumptionTaxClassification;
    }

    /**
     * @param processingDivision the processingDivision to set
     */
    public void setProcessingDivision(String processingDivision) {
        this.processingDivision = processingDivision;
    }

    /**
     * @param paymentClassification the paymentClassification to set
     */
    public void setPaymentClassification(String paymentClassification) {
        this.paymentClassification = paymentClassification;
    }

    /**
     * @param systemType the systemType to set
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    /**
     * @param system the system to set
     */
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * @param debitConsumptionTaxAmountTotal the debitConsumptionTaxAmountTotal to set
     */
    public void setDebitConsumptionTaxAmountTotal(String debitConsumptionTaxAmountTotal) {
        this.debitConsumptionTaxAmountTotal = debitConsumptionTaxAmountTotal;
    }

    /**
     * @param creditConsumptionTaxTotal the creditConsumptionTaxTotal to set
     */
    public void setCreditConsumptionTaxTotal(String creditConsumptionTaxTotal) {
        this.creditConsumptionTaxTotal = creditConsumptionTaxTotal;
    }

    /**
     * @param tonnage the tonnage to set
     */
    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    /**
     * @param _20F the _20F to set
     */
    public void set20F(String _20F) {
        this._20F = _20F;
    }

    /**
     * @param _40F the _40F to set
     */
    public void set40F(String _40F) {
        this._40F = _40F;
    }

    /**
     * @param amountOfMoney the amountOfMoney to set
     */
    public void setAmountOfMoney(String amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    /**
     * @param consumptionTax the consumptionTax to set
     */
    public void setConsumptionTax(String consumptionTax) {
        this.consumptionTax = consumptionTax;
    }

    /**
     * @param amount1 the amount1 to set
     */
    public void setAmount1(String amount1) {
        this.amount1 = amount1;
    }

    /**
     * @param consumptionTax1 the consumptionTax1 to set
     */
    public void setConsumptionTax1(String consumptionTax1) {
        this.consumptionTax1 = consumptionTax1;
    }

    /**
     * @param amount2 the amount2 to set
     */
    public void setAmount2(String amount2) {
        this.amount2 = amount2;
    }

    /**
     * @param consumptionTax2 the consumptionTax2 to set
     */
    public void setConsumptionTax2(String consumptionTax2) {
        this.consumptionTax2 = consumptionTax2;
    }

}
