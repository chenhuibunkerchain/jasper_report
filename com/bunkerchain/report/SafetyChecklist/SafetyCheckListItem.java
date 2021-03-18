import java.util.ArrayList;

public class SafetyCheckListItem {
    private int index;
    private String itemDescription;
    private int bunkerTankerChecked;
    private int vesselChecked;
    private String remark;
    private String defaultRemark;
    private ArrayList<Product> products;

    public SafetyCheckListItem(){}

    public SafetyCheckListItem(int index, String itemDescription, int bunkerTankerChecked, int vesselChecked, String remark, String defaultRemark, ArrayList<Product> products) {
        this.index = index;
        this.itemDescription = itemDescription;
        this.bunkerTankerChecked = bunkerTankerChecked;
        this.vesselChecked = vesselChecked;
        this.remark = remark;
        this.defaultRemark = defaultRemark;
        this.products = products;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getBunkerTankerChecked() {
        return bunkerTankerChecked;
    }

    public void setBunkerTankerChecked(int bunkerTankerChecked) {
        this.bunkerTankerChecked = bunkerTankerChecked;
    }

    public int getVesselChecked() {
        return vesselChecked;
    }

    public void setVesselChecked(int vesselChecked) {
        this.vesselChecked = vesselChecked;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDefaultRemark() {
        return defaultRemark;
    }

    public void setDefaultRemark(String defaultRemark) {
        this.defaultRemark = defaultRemark;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
