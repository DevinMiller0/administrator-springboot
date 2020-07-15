package cn.gleaners.administrator.model;

/**
 * @author ...
 * @date 2020/7/15 9:30
 * description：
 */
public class TestModel {

    /**
     * description : 横移极限开关告警
     * id : 2
     * truckSpaceNumber : 00A0
     * warningCode : EFC0
     */

    private String description;
    private String id;
    private String truckSpaceNumber;
    private String warningCode;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTruckSpaceNumber() {
        return truckSpaceNumber;
    }

    public void setTruckSpaceNumber(String truckSpaceNumber) {
        this.truckSpaceNumber = truckSpaceNumber;
    }

    public String getWarningCode() {
        return warningCode;
    }

    public void setWarningCode(String warningCode) {
        this.warningCode = warningCode;
    }
}
