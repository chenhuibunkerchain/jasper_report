public class SealItem {


    private int index;
    private String itemName;
    private String itemTag;
    private String itemCategory;
    private String sealNo;
    private int beforeDeliveryIntact;
    private int afterDeliveryIntact;
    private String remark;

    public SealItem(){

    }

    public SealItem(int index,
                    String itemName,
                    String itemTag,
                    String itemCategory,
                    String sealNo,
                    int beforeDeliveryIntact,
                    int afterDeliveryIntact,
                    String remark){

        this.index = index;
        this.itemName = itemName;
        this.itemTag = itemTag;
        this.itemCategory = itemCategory;
        this.sealNo = sealNo;
        this.beforeDeliveryIntact = beforeDeliveryIntact;
        this.afterDeliveryIntact = afterDeliveryIntact;
        this.remark = remark;
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemTag() {
        return itemTag;
    }

    public void setItemTag(String itemTag) {
        this.itemTag = itemTag;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getSealNo() {
        return sealNo;
    }

    public void setSealNo(String sealNo) {
        this.sealNo = sealNo;
    }

    public int getBeforeDeliveryIntact() {
        return beforeDeliveryIntact;
    }

    public void setBeforeDeliveryIntact(int beforeDeliveryIntact) {
        this.beforeDeliveryIntact = beforeDeliveryIntact;
    }

    public int getAfterDeliveryIntact() {
        return afterDeliveryIntact;
    }

    public void setAfterDeliveryIntact(int afterDeliveryIntact) {
        this.afterDeliveryIntact = afterDeliveryIntact;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
