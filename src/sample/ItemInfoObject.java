package sample;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ItemInfoObject {
	private final SimpleIntegerProperty ItemInfoId;
	private final SimpleStringProperty ItemInfoName;
	private final SimpleStringProperty ItemInfoDescription;
	private final SimpleFloatProperty ItemInfoInitialPrice;
	private final SimpleFloatProperty ItemInfoCurrentPrice;
	private final SimpleStringProperty ItemInfoSupplier;
	private final SimpleIntegerProperty ItemInfoAmount;

	
	public ItemInfoObject(int itemInfoId,
						  String itemInfoName,
						  String itemInfoDescription,
						  float itemInfoInitialPrice,
						  float itemInfoCurrentPrice,
						  String itemInfoSupplier, int itemInfoAmount) {
		this.ItemInfoId = new SimpleIntegerProperty(itemInfoId);
		this.ItemInfoName = new SimpleStringProperty(itemInfoName);
		this.ItemInfoDescription = new SimpleStringProperty(itemInfoDescription);
		this.ItemInfoInitialPrice = new SimpleFloatProperty(itemInfoInitialPrice);
		this.ItemInfoCurrentPrice = new SimpleFloatProperty(itemInfoCurrentPrice);
		this.ItemInfoSupplier = new SimpleStringProperty(itemInfoSupplier);
		this.ItemInfoAmount = new SimpleIntegerProperty(itemInfoAmount);
	}

	public int getItemInfoId() {
		return ItemInfoId.get();
	}

	public SimpleIntegerProperty itemInfoIdProperty() {
		return ItemInfoId;
	}

	public void setItemInfoId(int ItemInfoId) {
		this.ItemInfoId.set(ItemInfoId);
	}

	public String getItemInfoName() {
		return ItemInfoName.get();
	}

	public SimpleStringProperty itemInfoNameProperty() {
		return ItemInfoName;
	}

	public void setItemInfoName(String ItemInfoName) {
		this.ItemInfoName.set(ItemInfoName);
	}

	public String getItemInfoDescription() {
		return ItemInfoDescription.get();
	}

	public SimpleStringProperty itemInfoDescriptionProperty() {
		return ItemInfoDescription;
	}

	public void setItemInfoDescription(String ItemInfoDescription) {
		this.ItemInfoDescription.set(ItemInfoDescription);
	}

	public float getItemInfoInitialPrice() {
		return ItemInfoInitialPrice.get();
	}

	public SimpleFloatProperty itemInfoInitialPriceProperty() {
		return ItemInfoInitialPrice;
	}

	public void setItemInfoInitialPrice(float ItemInfoInitialPrice) {
		this.ItemInfoInitialPrice.set(ItemInfoInitialPrice);
	}

	public float getItemInfoCurrentPrice() {
		return ItemInfoCurrentPrice.get();
	}

	public SimpleFloatProperty itemInfoCurrentPriceProperty() {
		return ItemInfoCurrentPrice;
	}

	public void setItemInfoCurrentPrice(float ItemInfoCurrentPrice) {
		this.ItemInfoCurrentPrice.set(ItemInfoCurrentPrice);
	}

	public String getItemInfoSupplier() {
		return ItemInfoSupplier.get();
	}

	public SimpleStringProperty itemInfoSupplierProperty() {
		return ItemInfoSupplier;
	}

	public void setItemInfoSupplier(String ItemInfoSupplier) {
		this.ItemInfoSupplier.set(ItemInfoSupplier);
	}

	public int getItemInfoAmount() {
		return ItemInfoAmount.get();
	}

	public SimpleIntegerProperty itemInfoAmountProperty() {
		return ItemInfoAmount;
	}

	public void setItemInfoAmount(int ItemInfoAmount) {
		this.ItemInfoAmount.set(ItemInfoAmount);
	}
}