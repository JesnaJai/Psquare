package com.example.PsquareTask;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Psquare {
    public static void main(String[] args) {

        try {
            List<PsquareStudent> list = new ArrayList<>();

//            String filePath = "C:\\Users\\asdeft\\JaspersoftWorkspace\\MyReports\\PsquareTask.jrxml";
            String filePath = "C:\\Users\\asdeft\\JaspersoftWorkspace\\MyReports\\PsquareStudentReport1.jrxml";
//            String filePath = "C:\\Users\\asdeft\\JaspersoftWorkspace\\MyReports\\PsquareStudentReport.jrxml";

            PsquareStudent student1 = new PsquareStudent();
            student1.setId(1);
            student1.setName("Name1");
            student1.setAddress("Address1");
            student1.setStandard("Class1");

            PsquareStudent student2 = new PsquareStudent();
            student2.setId(2);
            student2.setName("Name2");
            student2.setAddress("Address2");
            student2.setStandard("Class2");

            PsquareStudent student3 = new PsquareStudent();
            student3.setId(3);
            student3.setName("Name3");
            student3.setAddress("Address3");
            student3.setStandard("Class3");

            PsquareStudent student4 = new PsquareStudent();
            student4.setId(4);
            student4.setName("Name4");
            student4.setAddress("Address4");
            student4.setStandard("Class4");

            PsquareStudent student5 = new PsquareStudent();

            list.add(student5);
            list.add(student1);
            list.add(student2);
            list.add(student3);
            list.add(student4);

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
            JasperReport report = JasperCompileManager.compileReport(filePath);

            // Use a Map for parameters
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("PsquareDataSource", dataSource);

            JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
//            JasperExportManager.exportReportToPdfFile(print, "D:\\Jasper\\New folder\\PsquareTask.pdf");
            JasperExportManager.exportReportToPdfFile(print, "D:\\Jasper\\New folder\\PsquareStudentReport.pdf");
            System.out.println("Report created.............");
        } catch (Exception e) {
            System.out.println("Exception while creating report");
            e.printStackTrace(); // Print stack trace for debugging
        }

    }
}
