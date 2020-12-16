package com.goodboy.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * @author GoodBoy
 * @date 2020-11-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
// XML文件中的根标识
@XmlRootElement(name = "User")
// 控制JAXB 绑定类中属性和字段的排序
@XmlType(propOrder = {
        "resultCode",
        "resultMessage",
        "ESN",
        "shopOrderNo",
        "workOrderNo",
        "DPN",
        "PLN",
        "powerPrintArea",
        "IDA",
        "dataPlateString"
})
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;
    private int resultCode;
    private String resultMessage;
    private String ESN;
    private String shopOrderNo;
    private String workOrderNo;
    private String DPN;
    private String PLN;
    private String powerPrintArea;
    private String IDA;
    private String dataPlateString;

    public Result() {
    }

    public Result(int resultCode, String resultMessage, String ESN, String shopOrderNo, String workOrderNo, String DPN, String PLN, String powerPrintArea, String IDA, String dataPlateString) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.ESN = ESN;
        this.shopOrderNo = shopOrderNo;
        this.workOrderNo = workOrderNo;
        this.DPN = DPN;
        this.PLN = PLN;
        this.powerPrintArea = powerPrintArea;
        this.IDA = IDA;
        this.dataPlateString = dataPlateString;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getESN() {
        return ESN;
    }

    public void setESN(String ESN) {
        this.ESN = ESN;
    }

    public String getShopOrderNo() {
        return shopOrderNo;
    }

    public void setShopOrderNo(String shopOrderNo) {
        this.shopOrderNo = shopOrderNo;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getDPN() {
        return DPN;
    }

    public void setDPN(String DPN) {
        this.DPN = DPN;
    }

    public String getPLN() {
        return PLN;
    }

    public void setPLN(String PLN) {
        this.PLN = PLN;
    }

    public String getPowerPrintArea() {
        return powerPrintArea;
    }

    public void setPowerPrintArea(String powerPrintArea) {
        this.powerPrintArea = powerPrintArea;
    }

    public String getIDA() {
        return IDA;
    }

    public void setIDA(String IDA) {
        this.IDA = IDA;
    }

    public String getDataPlateString() {
        return dataPlateString;
    }

    public void setDataPlateString(String dataPlateString) {
        this.dataPlateString = dataPlateString;
    }
}
