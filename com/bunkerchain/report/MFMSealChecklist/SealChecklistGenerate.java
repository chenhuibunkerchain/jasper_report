
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JRDesignStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JasperGenerate
{
    public void start() throws JRException{
//        String xmlFile = "src/main/resources/MfmSystemSealCheckList3.jasper";
        String xmlFile = "src/main/resources/MfmSystemSealCheckList3.jrxml";
        JasperReport jreport = JasperCompileManager.compileReport(xmlFile);

        ArrayList<SealItem> sealItems1 = new ArrayList<>();
        ArrayList<SealItem> sealItems2 = new ArrayList<>();
        ArrayList<SealItem> sealItems3 = new ArrayList<>();

        // TYPE 1212
        sealItems1.add(new SealItem(1,
                "1212",
                "222",
                "1212",
                "1212",
                0,
                0,"234324qq")
        );


        // TYPE 2121
        sealItems2.add(new SealItem(2,
                "2121",
                "111",
                "2121",
                "2121",
                0,
                0,"2121")
        );
        sealItems2.add(new SealItem(3,
                "2121",
                "333",
                "2121",
                "3333",
                1,
                1,"3333")
        );


        // TYPE 3333
        sealItems3.add(new SealItem(4,
                "3333",
                "111",
                "33333333334444444444444",
                "2121",
                1,
                1,"2121")
        );

        sealItems3.add(new SealItem(5,
                "3333",
                "333",
                "33333333334444444444444",
                "3333",
                1,
                0,"3333")
        );



        ArrayList<MainSealItem> mainSealItems = new ArrayList<>();
        MainSealItem item1 = new MainSealItem("1212", sealItems1);
        MainSealItem item2 = new MainSealItem("2121", sealItems2);
        MainSealItem item3 = new MainSealItem("33333333334444444444444", sealItems3);

        mainSealItems.add(item1);
        mainSealItems.add(item2);
        mainSealItems.add(item3);


        JRBeanCollectionDataSource ds2 = new JRBeanCollectionDataSource(mainSealItems);
        Map params = new HashMap();
        params.put("bunkerTanker","1");
        params.put("location","1");
        params.put("sealVerificationReportNumber","1");
        params.put("bunkerSBno","1");
        params.put("Date","1");
//        JRDesignStyle jrDesignStyle = new JRDesignStyle();
//        jrDesignStyle.setName("mystyle");
//        jrDesignStyle.setDefault(true);
//        jrDesignStyle.setPdfFontName("C:\\Users\\Bunkerchain\\IdeaProjects\\ReportTesting\\src\\main\\resources\\segoeui.ttf");
//        jrDesignStyle.setPdfEncoding("UTF-8");
//        jrDesignStyle.setPdfEmbedded(true);

        JasperPrint jprint =  JasperFillManager.fillReport(jreport, params, ds2);
//        jprint.setDefaultStyle(jrDesignStyle);\


        JasperExportManager.exportReportToPdfFile(jprint, "src/main/resources/table.pdf");
//        JasperExportManager.exportReportToHtmlFile(jprint, "src/main/resources/table.html");


    }
}
