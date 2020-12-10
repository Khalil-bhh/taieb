package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DisplayItemInventoryUI implements Initializable {

	private final DisplayItemInventoryControl displayItemInventoryControl = new DisplayItemInventoryControl();


	@FXML
	TableView<ItemInfoObject> itemTableView;
	@FXML
	TableColumn<ItemInfoObject,Integer> itemTableColumnId;
	@FXML
	TableColumn<ItemInfoObject,String> itemTableColumnName;
	@FXML
	TableColumn<ItemInfoObject,String> itemTableColumnDescription;

private ObservableList getDataFromItemAndAddToObservableList(ArrayList<ItemInfoObject> items){
	ObservableList<ItemInfoObject> itemTableData = FXCollections.observableArrayList();
	itemTableData.addAll(items);
	return itemTableData;
}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		itemTableColumnId.setCellValueFactory(new PropertyValueFactory<>("ItemTableColumnId"));
		itemTableColumnName.setCellValueFactory(new PropertyValueFactory<>("ItemTableColumnName"));
		itemTableColumnDescription.setCellValueFactory(new PropertyValueFactory<>("ItemTableColumnDescription"));
		ObservableList<ItemInfoObject> itemsList = getDataFromItemAndAddToObservableList(displayItemInventoryControl.getInventory());
		itemTableView.setItems(itemsList);
	}
}
