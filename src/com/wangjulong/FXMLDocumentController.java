/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wangjulong;

import com.wangjulong.db.DatabaseAccess;
import com.wangjulong.db.InitDataOkhttp;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Administrator
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView listData;

    public void showList() throws SQLException, IOException {
        ObservableList<String> list = FXCollections.observableArrayList();

        DatabaseAccess da = new DatabaseAccess();
        int[][] temp = da.getAllNumber();
        String tempString,tempString1;
        for (int[] is : temp) {
            tempString = "";
            for (int i = 1; i < is.length; i++) {
//                tempString1 = is[i] + "";
                tempString1 = String.format("%02d", is[i]);
                tempString = tempString + tempString1 + " ";
            }
            list.add(tempString);
        }

        listData.setItems(list);

    }

    /**
     * 从网络获取开奖号码 是的
     *
     * @param actionEvent 按钮事件
     * @throws java.io.IOException
     * @throws java.sql.SQLException
     */
    public void getLotteryFromWeb(ActionEvent actionEvent) throws IOException, SQLException {
        InitDataOkhttp initDataOkhttp = new InitDataOkhttp();

        int[][] temp = initDataOkhttp.initData();
        for (int[] aTemp : temp) {
            System.out.print(aTemp[0] + " ");
            System.out.print(aTemp[1] + " ");
            System.out.print(aTemp[2] + " ");
            System.out.print(aTemp[3] + " ");
            System.out.print(aTemp[4] + " ");
            System.out.print(aTemp[5] + " ");
            System.out.print(aTemp[6] + " ");
            System.out.print(aTemp[7] + " ");
            System.out.println(aTemp[8]);
        }
    }

    public void dataOnly(ActionEvent actionEvent) {
        DatabaseAccess dataOnly = new DatabaseAccess();
        
            int[][] temp = null;
        try {
            temp = dataOnly.getAllNumber();
        } catch (SQLException | IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
            for (int[] aTemp : temp) {
                System.out.print(aTemp[0] + " ");
                System.out.print(aTemp[1] + " ");
                System.out.print(aTemp[2] + " ");
                System.out.print(aTemp[3] + " ");
                System.out.print(aTemp[4] + " ");
                System.out.print(aTemp[5] + " ");
                System.out.print(aTemp[6] + " ");
                System.out.print(aTemp[7] + " ");
                System.out.println(aTemp[8]);
            }
        

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            showList();
        } catch (SQLException | IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
