package FILES;

import java.util.Objects;

public class FileDellCarReport {
    private String DPS;
    private String CallType;
    private String Country;
    private String BTT;
    private String ServiceTag;
    private String ServiceTagReceived;
    private String Technology;
    private String DellStatus;
    private String OrderStatus;
    private String ModelNumber;
    private String Repeat;
    private String TATwithoutEXEcodeToDHIP;
    private String TATwithoutEXEcodeToPOD;
    private String PickUpTR;
    private String CallCreateDate;
    private String UnitCollectionDate;
    private String UnitArrivalToDepotDate;
    private String PartRequestDate;
    private String ShipAndClosedDate;
    private String UnitDeliveryToCustomerDate;
    private String DeliveryTR;
    private String OrderedParts;
    private String PartsUsed;
    private String TechnicanID;
    private String FirstExceptionCode;
    private String LastExceptionCode;
    private String CurrentExceptionCode;

    public FileDellCarReport() {
    }

    public FileDellCarReport(String DPS, String callType, String country, String BTT, String serviceTag, String serviceTagReceived, String technology, String dellStatus, String orderStatus, String modelNumber, String repeat, String TATwithoutEXEcodeToDHIP, String TATwithoutEXEcodeToPOD, String pickUpTR, String callCreateDate, String unitCollectionDate, String unitArrivalToDepotDate, String partRequestDate, String shipAndClosedDate, String unitDeliveryToCustomerDate, String deliveryTR, String orderedParts, String partsUsed, String technicanID, String firstExceptionCode, String lastExceptionCode, String currentExceptionCode) {
        this.DPS = DPS;
        CallType = callType;
        Country = country;
        this.BTT = BTT;
        ServiceTag = serviceTag;
        ServiceTagReceived = serviceTagReceived;
        Technology = technology;
        DellStatus = dellStatus;
        OrderStatus = orderStatus;
        ModelNumber = modelNumber;
        Repeat = repeat;
        this.TATwithoutEXEcodeToDHIP = TATwithoutEXEcodeToDHIP;
        this.TATwithoutEXEcodeToPOD = TATwithoutEXEcodeToPOD;
        PickUpTR = pickUpTR;
        CallCreateDate = callCreateDate;
        UnitCollectionDate = unitCollectionDate;
        UnitArrivalToDepotDate = unitArrivalToDepotDate;
        PartRequestDate = partRequestDate;
        ShipAndClosedDate = shipAndClosedDate;
        UnitDeliveryToCustomerDate = unitDeliveryToCustomerDate;
        DeliveryTR = deliveryTR;
        OrderedParts = orderedParts;
        PartsUsed = partsUsed;
        TechnicanID = technicanID;
        FirstExceptionCode = firstExceptionCode;
        LastExceptionCode = lastExceptionCode;
        CurrentExceptionCode = currentExceptionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileDellCarReport that = (FileDellCarReport) o;
        return Objects.equals(DPS, that.DPS) &&
                Objects.equals(CallType, that.CallType) &&
                Objects.equals(Country, that.Country) &&
                Objects.equals(BTT, that.BTT) &&
                Objects.equals(ServiceTag, that.ServiceTag) &&
                Objects.equals(ServiceTagReceived, that.ServiceTagReceived) &&
                Objects.equals(Technology, that.Technology) &&
                Objects.equals(DellStatus, that.DellStatus) &&
                Objects.equals(OrderStatus, that.OrderStatus) &&
                Objects.equals(ModelNumber, that.ModelNumber) &&
                Objects.equals(Repeat, that.Repeat) &&
                Objects.equals(TATwithoutEXEcodeToDHIP, that.TATwithoutEXEcodeToDHIP) &&
                Objects.equals(TATwithoutEXEcodeToPOD, that.TATwithoutEXEcodeToPOD) &&
                Objects.equals(PickUpTR, that.PickUpTR) &&
                Objects.equals(CallCreateDate, that.CallCreateDate) &&
                Objects.equals(UnitCollectionDate, that.UnitCollectionDate) &&
                Objects.equals(UnitArrivalToDepotDate, that.UnitArrivalToDepotDate) &&
                Objects.equals(PartRequestDate, that.PartRequestDate) &&
                Objects.equals(ShipAndClosedDate, that.ShipAndClosedDate) &&
                Objects.equals(UnitDeliveryToCustomerDate, that.UnitDeliveryToCustomerDate) &&
                Objects.equals(DeliveryTR, that.DeliveryTR) &&
                Objects.equals(OrderedParts, that.OrderedParts) &&
                Objects.equals(PartsUsed, that.PartsUsed) &&
                Objects.equals(TechnicanID, that.TechnicanID) &&
                Objects.equals(FirstExceptionCode, that.FirstExceptionCode) &&
                Objects.equals(LastExceptionCode, that.LastExceptionCode) &&
                Objects.equals(CurrentExceptionCode, that.CurrentExceptionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DPS, CallType, Country, BTT, ServiceTag, ServiceTagReceived, Technology, DellStatus, OrderStatus, ModelNumber, Repeat, TATwithoutEXEcodeToDHIP, TATwithoutEXEcodeToPOD, PickUpTR, CallCreateDate, UnitCollectionDate, UnitArrivalToDepotDate, PartRequestDate, ShipAndClosedDate, UnitDeliveryToCustomerDate, DeliveryTR, OrderedParts, PartsUsed, TechnicanID, FirstExceptionCode, LastExceptionCode, CurrentExceptionCode);
    }

    @Override
    public String toString() {
        return "FileDellCarReport{" +
                "DPS='" + DPS + '\'' +
                ", CallType='" + CallType + '\'' +
                ", Country='" + Country + '\'' +
                ", BTT='" + BTT + '\'' +
                ", ServiceTag='" + ServiceTag + '\'' +
                ", ServiceTagReceived='" + ServiceTagReceived + '\'' +
                ", Technology='" + Technology + '\'' +
                ", DellStatus='" + DellStatus + '\'' +
                ", OrderStatus='" + OrderStatus + '\'' +
                ", ModelNumber='" + ModelNumber + '\'' +
                ", Repeat='" + Repeat + '\'' +
                ", TATwithoutEXEcodeToDHIP='" + TATwithoutEXEcodeToDHIP + '\'' +
                ", TATwithoutEXEcodeToPOD='" + TATwithoutEXEcodeToPOD + '\'' +
                ", PickUpTR='" + PickUpTR + '\'' +
                ", CallCreateDate='" + CallCreateDate + '\'' +
                ", UnitCollectionDate='" + UnitCollectionDate + '\'' +
                ", UnitArrivalToDepotDate='" + UnitArrivalToDepotDate + '\'' +
                ", PartRequestDate='" + PartRequestDate + '\'' +
                ", ShipAndClosedDate='" + ShipAndClosedDate + '\'' +
                ", UnitDeliveryToCustomerDate='" + UnitDeliveryToCustomerDate + '\'' +
                ", DeliveryTR='" + DeliveryTR + '\'' +
                ", OrderedParts='" + OrderedParts + '\'' +
                ", PartsUsed='" + PartsUsed + '\'' +
                ", TechnicanID='" + TechnicanID + '\'' +
                ", FirstExceptionCode='" + FirstExceptionCode + '\'' +
                ", LastExceptionCode='" + LastExceptionCode + '\'' +
                ", CurrentExceptionCode='" + CurrentExceptionCode + '\'' +
                '}';
    }

    public String getDPS() {
        return DPS;
    }
    public void setDPS(String DPS) {
        this.DPS = DPS;
    }
    public String getCallType() {
        return CallType;
    }
    public void setCallType(String callType) {
        CallType = callType;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public String getBTT() {
        return BTT;
    }
    public void setBTT(String BTT) {
        this.BTT = BTT;
    }
    public String getServiceTag() {
        return ServiceTag;
    }
    public void setServiceTag(String serviceTag) {
        ServiceTag = serviceTag;
    }
    public String getServiceTagReceived() {
        return ServiceTagReceived;
    }
    public void setServiceTagReceived(String serviceTagReceived) {
        ServiceTagReceived = serviceTagReceived;
    }
    public String getTechnology() {
        return Technology;
    }
    public void setTechnology(String technology) {
        Technology = technology;
    }
    public String getDellStatus() {
        return DellStatus;
    }
    public void setDellStatus(String dellStatus) {
        DellStatus = dellStatus;
    }
    public String getOrderStatus() {
        return OrderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }
    public String getModelNumber() {
        return ModelNumber;
    }
    public void setModelNumber(String modelNumber) {
        ModelNumber = modelNumber;
    }
    public String getRepeat() {
        return Repeat;
    }
    public void setRepeat(String repeat) {
        Repeat = repeat;
    }
    public String getTATwithoutEXEcodeToDHIP() {
        return TATwithoutEXEcodeToDHIP;
    }
    public void setTATwithoutEXEcodeToDHIP(String TATwithoutEXEcodeToDHIP) {
        this.TATwithoutEXEcodeToDHIP = TATwithoutEXEcodeToDHIP;
    }
    public String getTATwithoutEXEcodeToPOD() {
        return TATwithoutEXEcodeToPOD;
    }
    public void setTATwithoutEXEcodeToPOD(String TATwithoutEXEcodeToPOD) {
        this.TATwithoutEXEcodeToPOD = TATwithoutEXEcodeToPOD;
    }
    public String getPickUpTR() {
        return PickUpTR;
    }
    public void setPickUpTR(String pickUpTR) {
        PickUpTR = pickUpTR;
    }
    public String getCallCreateDate() {
        return CallCreateDate;
    }
    public void setCallCreateDate(String callCreateDate) {
        CallCreateDate = callCreateDate;
    }
    public String getUnitCollectionDate() {
        return UnitCollectionDate;
    }
    public void setUnitCollectionDate(String unitCollectionDate) {
        UnitCollectionDate = unitCollectionDate;
    }
    public String getUnitArrivalToDepotDate() {
        return UnitArrivalToDepotDate;
    }
    public void setUnitArrivalToDepotDate(String unitArrivalToDepotDate) {
        UnitArrivalToDepotDate = unitArrivalToDepotDate;
    }
    public String getPartRequestDate() {
        return PartRequestDate;
    }
    public void setPartRequestDate(String partRequestDate) {
        PartRequestDate = partRequestDate;
    }
    public String getShipAndClosedDate() {
        return ShipAndClosedDate;
    }
    public void setShipAndClosedDate(String shipAndClosedDate) {
        ShipAndClosedDate = shipAndClosedDate;
    }
    public String getUnitDeliveryToCustomerDate() {
        return UnitDeliveryToCustomerDate;
    }
    public void setUnitDeliveryToCustomerDate(String unitDeliveryToCustomerDate) {
        UnitDeliveryToCustomerDate = unitDeliveryToCustomerDate;
    }
    public String getDeliveryTR() {
        return DeliveryTR;
    }
    public void setDeliveryTR(String deliveryTR) {
        DeliveryTR = deliveryTR;
    }
    public String getOrderedParts() {
        return OrderedParts;
    }
    public void setOrderedParts(String orderedParts) {
        OrderedParts = orderedParts;
    }
    public String getPartsUsed() {
        return PartsUsed;
    }
    public void setPartsUsed(String partsUsed) {
        PartsUsed = partsUsed;
    }
    public String getTechnicanID() {
        return TechnicanID;
    }
    public void setTechnicanID(String technicanID) {
        TechnicanID = technicanID;
    }
    public String getFirstExceptionCode() {
        return FirstExceptionCode;
    }
    public void setFirstExceptionCode(String firstExceptionCode) {
        FirstExceptionCode = firstExceptionCode;
    }
    public String getLastExceptionCode() {
        return LastExceptionCode;
    }
    public void setLastExceptionCode(String lastExceptionCode) {
        LastExceptionCode = lastExceptionCode;
    }
    public String getCurrentExceptionCode() {
        return CurrentExceptionCode;
    }
    public void setCurrentExceptionCode(String currentExceptionCode) {
        CurrentExceptionCode = currentExceptionCode;
    }
}
