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

}
