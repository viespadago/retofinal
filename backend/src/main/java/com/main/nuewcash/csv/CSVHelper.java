///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.main.nuewcash.csv;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.main.nuewcash.entities.Data;
//
///**
// *
// * @author frank
// */
//public class CSVHelper {
//    public static String TYPE = "text/csv";
//  static String[] HEADERs = { "Id", "Title", "Description", "Published" };
//
//  public static boolean hasCSVFormat(MultipartFile file) {
//
//    if (!TYPE.equals(file.getContentType())) {
//      return false;
//    }
//
//    return true;
//  }
//
//  public static List<Data> csvToTutorials(InputStream is) {
//    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
//        CSVParser csvParser = new CSVParser(fileReader,
//            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
//
//      List<Data> tutorials = new ArrayList<>();
//
//      Iterable<CSVRecord> csvRecords = csvParser.getRecords();
//
//      for (CSVRecord csvRecord : csvRecords) {
//        Data data = new Data(
//              Long.parseLong(csvRecord.get("Id")),
//              csvRecord.get("Title"),
//              csvRecord.get("Description"),
//              Boolean.parseBoolean(csvRecord.get("Published"))
//            );
//
//        tutorials.add(data);
//      }
//
//      return data;
//    } catch (IOException e) {
//      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
//    }
//  }
//}
