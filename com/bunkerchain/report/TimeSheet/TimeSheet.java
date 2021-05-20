public class TimeSheet {

    private String refNo;
    private String date;
    private Boolean isVessel;
    private String vesselName;
    private String terminalName;
    private String bargeName;
    private String port;
    private String berthName;
    private String grade;
    private String quantity;
    private String comment;
    private String cargoOfficerName;
    private String representativeName;
    private String surveyorCompanyName;
    private Boolean cargoOfficerSigned;
    private Boolean chiefEngineerSigned;
    private Boolean surveyorSigned;
    private String surveyorSignature;
    private String chiefEngineerSignature;
    private String cargoOfficerSignature;

    public TimeSheet(String refNo, String date, Boolean isVessel, String vesselName, String terminalName, String bargeName, String port, String berthName, String grade, String quantity, String comment, String cargoOfficerName, String representativeName, String surveyorCompanyName, Boolean cargoOfficerSigned, Boolean chiefEngineerSigned, Boolean surveyorSigned, String surveyorSignature, String chiefEngineerSignature, String cargoOfficerSignature) {
        this.date = date;
        this.refNo = refNo;
        this.isVessel = isVessel;
        this.vesselName = vesselName;
        this.terminalName = terminalName;
        this.bargeName = bargeName;
        this.port = port;
        this.berthName = berthName;
        this.grade = grade;
        this.quantity = quantity;
        this.comment = comment;
        this.cargoOfficerName = cargoOfficerName;
        this.representativeName = representativeName;
        this.surveyorCompanyName = surveyorCompanyName;
        this.cargoOfficerSigned = cargoOfficerSigned;
        this.chiefEngineerSigned = chiefEngineerSigned;
        this.surveyorSigned = surveyorSigned;
        this.surveyorSignature = surveyorSignature;
        this.chiefEngineerSignature = chiefEngineerSignature;
        this.cargoOfficerSignature = cargoOfficerSignature;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getVessel() {
        return isVessel;
    }

    public void setVessel(Boolean vessel) {
        isVessel = vessel;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getBargeName() {
        return bargeName;
    }

    public void setBargeName(String bargeName) {
        this.bargeName = bargeName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getBerthName() {
        return berthName;
    }

    public void setBerthName(String berthName) {
        this.berthName = berthName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCargoOfficerName() {
        return cargoOfficerName;
    }

    public void setCargoOfficerName(String cargoOfficerName) {
        this.cargoOfficerName = cargoOfficerName;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getSurveyorCompanyName() {
        return surveyorCompanyName;
    }

    public void setSurveyorCompanyName(String surveyorCompanyName) {
        this.surveyorCompanyName = surveyorCompanyName;
    }

    public Boolean getCargoOfficerSigned() {
        return cargoOfficerSigned;
    }

    public void setCargoOfficerSigned(Boolean cargoOfficerSigned) {
        this.cargoOfficerSigned = cargoOfficerSigned;
    }

    public Boolean getChiefEngineerSigned() {
        return chiefEngineerSigned;
    }

    public void setChiefEngineerSigned(Boolean chiefEngineerSigned) {
        this.chiefEngineerSigned = chiefEngineerSigned;
    }

    public Boolean getSurveyorSigned() {
        return surveyorSigned;
    }

    public void setSurveyorSigned(Boolean surveyorSigned) {
        this.surveyorSigned = surveyorSigned;
    }

    public String getSurveyorSignature() {
        return surveyorSignature;
    }

    public void setSurveyorSignature(String surveyorSignature) {
        this.surveyorSignature = surveyorSignature;
    }

    public String getChiefEngineerSignature() {
        return chiefEngineerSignature;
    }

    public void setChiefEngineerSignature(String chiefEngineerSignature) {
        this.chiefEngineerSignature = chiefEngineerSignature;
    }

    public String getCargoOfficerSignature() {
        return cargoOfficerSignature;
    }

    public void setCargoOfficerSignature(String cargoOfficerSignature) {
        this.cargoOfficerSignature = cargoOfficerSignature;
    }
}
