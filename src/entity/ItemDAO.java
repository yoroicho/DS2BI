/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Comparator.comparing;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author kyokuto
 */
public class ItemDAO {

    static List<ItemEntity> list = new ArrayList<>();

    public static void registerList(File file) {
        try {
            FileReader fileReader = null;
            CSVReader csvReader = null;
            fileReader = new FileReader((file.getPath()));
            System.out.println(file.getPath());
            csvReader = new CSVReader(fileReader);
            csvReader.skip(3);

            list.clear(); // If same file read same item exsist error.
            csvReader.forEach(s -> list.add(ItemDAO.createitem(s)));
            System.out.println("All items " + list.size());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Iterator<ItemEntity> selectItemEntity(String slipNumber) {
        list.sort(comparing(ItemEntity::getItemSeq)
                .thenComparing(ItemEntity::getBorrowingClassification));
        Stream<ItemEntity> s
                = list.stream().filter(o -> o.getSlipNumber().trim().equals(slipNumber));
        Iterator<ItemEntity> iterator = s.iterator();
        return iterator;
    }

    public static ItemEntity createitem(String[] line) {

        ItemEntity itemEntity = new ItemEntity();

        itemEntity.setManagementNumberId(line[0]);
        itemEntity.setControlNumber(line[1]);
        itemEntity.setReferenceNumber(line[2]);
        itemEntity.setLedgerNumber(line[3]);
        itemEntity.setSlipNumber(line[4]);
        itemEntity.setScawNumber(line[5]);
        itemEntity.setAccountYearMonth(line[6]);
        itemEntity.setExpensedYearMonth(line[7]);
        itemEntity.setDateOfIssue(line[8]);
        itemEntity.setTeamCode(line[9]);
        itemEntity.setNameOfDepartment(line[10]);
        itemEntity.setShoppingAreaCode(line[11]);
        itemEntity.setContactPersonCode(line[12]);
        itemEntity.setContactName(line[13]);
        itemEntity.setVanpool(line[14]);
        itemEntity.setDateOfDelivery(line[15]);
        itemEntity.setPaymentMethod(line[16]);
        itemEntity.setDueDateForPayment(line[17]);
        itemEntity.setPaymentTerms(line[18]);
        itemEntity.setPayeeCode(line[19]);
        itemEntity.setPayerName(line[20]);
        itemEntity.setExportersOrImporters(line[21]);
        itemEntity.setApplicationNumber(line[22]);
        itemEntity.setClaimPaymentRelatedNumber(line[23]);
        itemEntity.setSlipDescription(line[24]);
        itemEntity.setShipperForm(line[25]);
        itemEntity.setRegionalForm(line[26]);
        itemEntity.setActualBillingPartyCode(line[27]);
        itemEntity.setActualBillingPartyName(line[28]);
        itemEntity.setItemSeq(line[29] != null ? Integer.parseInt(line[29]) : null);
        itemEntity.setAccountNumber(line[30]);
        itemEntity.setAccountName(line[31]);
        itemEntity.setSubjectSummary(line[32]);
        itemEntity.setSummary(line[33]);
        itemEntity.setSubjectAssistance(line[34]);
        itemEntity.setInternalAccount(line[35]);
        itemEntity.setDateOfOccurrence(line[36]);
        itemEntity.setClearingNumber(line[37]);
        itemEntity.setBurdenTeam(line[38]);
        itemEntity.setBusinessPartnerCode(line[39]);
        itemEntity.setCustomerName(line[40]);
        itemEntity.setShipperStoragePlaceCode(line[41]);
        itemEntity.setShipperName(line[42]);
        itemEntity.setForeignCurrencyCode(line[43]);
        itemEntity.setConvertRate(line[44]);
        itemEntity.setForeignCurrencyAmount(line[45]);
        itemEntity.setApprovalClassification(line[46]);
        itemEntity.setChecklistOutputIndicator(line[47]);
        itemEntity.setDeliveryLedgerOutputClassification(line[48]);
        itemEntity.setActualClassification(line[49]);
        itemEntity.setOtherCategory(line[50]);
        itemEntity.setSlipClassificationIndicator(line[51]);
        itemEntity.setTransferRequestClassification(line[52]);
        itemEntity.setImportOrExportClassification(line[53]);
        itemEntity.setJournalSegment(Integer.valueOf(line[54]));
        itemEntity.setBorrowingClassification(line[55] != null ? Integer.parseInt(line[55]) : null);
        itemEntity.setCreationType(line[56] != null ? Integer.parseInt(line[56]) : null);
        itemEntity.setInclusionClassification(line[57]);
        itemEntity.setCollaborationClassification(line[58]);
        itemEntity.setConsumptionTaxClassification(line[59]);
        itemEntity.setProcessingDivision(line[60]);
        itemEntity.setPaymentClassification(line[61]);
        itemEntity.setSystemType(line[62]);
        itemEntity.setSystem(line[63]);
        itemEntity.setDebitConsumptionTaxAmountTotal(line[64]);
        itemEntity.setCreditConsumptionTaxTotal(line[65]);
        itemEntity.setTonnage(line[66]);
        itemEntity.set20F(line[67]);
        itemEntity.set40F(line[68]);
        itemEntity.setAmountOfMoney(line[69]);
        itemEntity.setConsumptionTax(line[70]);
        itemEntity.setAmount1(line[71]);
        itemEntity.setConsumptionTax1(line[72]);
        itemEntity.setAmount2(line[73]);
        itemEntity.setConsumptionTax2(line[74]);

        return itemEntity;
    }
}
