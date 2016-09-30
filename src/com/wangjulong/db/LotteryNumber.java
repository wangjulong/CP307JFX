package com.wangjulong.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Arrays;

/**
 * 开奖号码数据库 Created by Administrator on 2016/9/20. * number object that is
 * persisted to disk by the DAO and other classes.
 */
@DatabaseTable(tableName = "lotteryNumbers")
public class LotteryNumber {

    @DatabaseField(id = true)
    private int serial;
    @DatabaseField
    private int title;
    @DatabaseField
    private int n1;
    @DatabaseField
    private int n2;
    @DatabaseField
    private int n3;
    @DatabaseField
    private int n4;
    @DatabaseField
    private int n5;
    @DatabaseField
    private int n6;
    @DatabaseField
    private int n7;

    /**
     * 构造函数 和 Getter Setter
     */
    public LotteryNumber() {

    }

    public LotteryNumber(int serial, int title, int l1, int l2, int l3, int l4, int l5, int l6, int l7) {

        this.serial = serial;
        this.title = title;
        this.n1 = l1;
        this.n2 = l2;
        this.n3 = l3;
        this.n4 = l4;
        this.n5 = l5;
        this.n6 = l6;
        this.n7 = l7;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }

    public int getN6() {
        return n6;
    }

    public void setN6(int n6) {
        this.n6 = n6;
    }

    public int getN7() {
        return n7;
    }

    public void setN7(int n7) {
        this.n7 = n7;
    }

}
