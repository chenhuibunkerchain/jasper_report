import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SafetyCheckListGenerate
{
    public void start() throws JRException{

        String xmlFile = "src/main/resources/BunkeringPredeliverySafetyChecklist_3.jrxml";
        //String xmlFile = "src/main/resources/BunkeringPredeliverySafetyChecklist_3.jasper";

        JasperReport jreport = JasperCompileManager.compileReport(xmlFile);


        ArrayList<SafetyCheckListItem>  safetyCheckListItems = InsertArray();


        JRBeanCollectionDataSource ds2 = new JRBeanCollectionDataSource(safetyCheckListItems);
        Map params = new HashMap();
        InsertParams(params);

        JasperPrint jprint =  JasperFillManager.fillReport(jreport, params, ds2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm");

        String fileName = String.format("src/main/resources/table_%s.pdf", LocalDateTime.now().format(formatter));
        JasperExportManager.exportReportToPdfFile(jprint, fileName);

//        String Outputfilename =  JasperFillManager.fillReportToFile(xmlFile, params, ds2);
//        JasperExportManager.exportReportToPdfFile(Outputfilename, "src/main/resources/table2.pdf");

    }

    public void InsertParams(Map params){

        // Vessel Information
        params.put("vesselsName", "KIRANA NAWA");
        params.put("vesselsIMOno", "9832377");
        params.put("vesselsLocation", "AESPA");
        params.put("data", "23.12.2020");
        params.put("bunkerTankers", "JUMA");
        params.put("agent", "-");
        params.put("port", "Singapore");

        // Signature
        // Bunker Tanker
        params.put("name_bunkertanker","TEE HA HA");
        params.put("signature_bunkertanker","");
        params.put("date_bunkertanker","23.12.2002");
        params.put("time_bunkertanker","0800HRS");

        // Vessel
        params.put("name_vessel","BUDAUI");
        params.put("signature_vessel","");
        params.put("date_vessel","23.12.2002");
        params.put("time_vessel","0800");

        // Bunker Surveyor
        params.put("name_surveyor","");
        params.put("signature_surveyor","");
        params.put("date_surveyor","");
        params.put("time_surveyor","");

    }

    public ArrayList<SafetyCheckListItem> InsertArray(){
        ArrayList<SafetyCheckListItem> safetyCheckListItems = new ArrayList<>();
        ArrayList<Product> sameProduct = new ArrayList<>();

        sameProduct.add(new Product(11.0,11.0,11.0,"vlsfo"));

        safetyCheckListItems.add(new SafetyCheckListItem(
                1, "Is the vessel securely moored?",1,0,"1 line Remark","", sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                2, "Is the vessel ready to move under its own power?",1,0,"2 line Remark testing, is for testing purpose only","",sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                3, "Has the maximum line pressure been agreed upon ?",1,2,"3.0 Bar","State max. pressure:", sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                4, "Has the vessel pre-loading plan, transfer sequence, rate and volumes to be delivered been agreed upon?",1,1,"","", sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                5, "Has the notice period required for completion of transfer been agreed upon?",1,1,"15 (minutes)","State notice period:", sameProduct));


        safetyCheckListItems.add(new SafetyCheckListItem(
                6, "Has the procedure for draining delivery hoses on completion of transfer been agreed upon ?",1,1,"LINE CLEARING","State procedure:", sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                7, "Are transfer hoses in good condition, and properly rigged with all flange holes fully bolted?",1,1,"","", sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                8, "Is a person in constant attendance at both the delivery and receiving hose connections?",1,1,"","", sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                9, "Are all bunker tank lids closed ?",1,1,"","", sameProduct));

        safetyCheckListItems.add(new SafetyCheckListItem(
                10, "Are unused delivery connection blanked ?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                11, "Are required delivery warning notices in position?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                12, "Are all crew /staff members involved in the bunkering operation wearing the appropriate personal protective equipment including H²S and O² monitors?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                13, "Are hand torches of an approved type?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                14, "Are portable electronic devices of an approved type (for marine usage)?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                15, "Are restrictions on smoking and the use of naked lights being observed",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                16, "Is firefighting equipment positioned and ready for immediate use?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                17, "Is emergency oil spill response equipment positioned adjacent to both hose connections?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                18, "Are all external doors and portholdes in the accomadation closed?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                19, "Are window type air conditioning units (where fitted) disconnected?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                20, "Are air conditiong intake which may permit the entry of cargo vapours closed?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                21, "Is effective communication established between the bunker tanker and the vessel?",1,1,"VERBAL","State method:", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                22, "Has the emergency signals and shut down procedure have been agreed upon?",1,1,"HANDSIGNAL","State procedure:", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                23, "Are there sufficient persons on-board and at the delivery point to deal with emergencies?",1,1,"3","State no. of persons:", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                24, "Is there safe access between the bunker tanker and vessel?",1,1,"Accommodation ladder","Access method:", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                25, "Are the scuppers and drains on board properly plugged?",1,1,"","", sameProduct));
        safetyCheckListItems.add(new SafetyCheckListItem(
                26, "Is adequate lighting available to perform operations during hours of darkness?",1,1,"","", sameProduct));

        return safetyCheckListItems;

    }
}
