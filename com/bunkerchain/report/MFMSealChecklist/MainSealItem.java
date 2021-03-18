import java.util.List;

public class MainSealItem {

    private List<SealItem> sealItemList;
    private String itemCategory;

    public MainSealItem(){

    }

    public MainSealItem(String itemCategory,List<SealItem> sealItemList){
        this.sealItemList = sealItemList;
        this.itemCategory = itemCategory;
    }

    public List<SealItem> getSealItemList() {
        return sealItemList;
    }

    public void setSealItemList(List<SealItem> sealItemList){
        this.sealItemList = sealItemList;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }
}
