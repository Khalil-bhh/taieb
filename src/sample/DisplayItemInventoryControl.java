package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class DisplayItemInventoryControl {
	private  DataManager dataM = new DataManager();


	public ArrayList<ItemInfoObject> getInventory() {
		return dataM.getInventory();
	}

}
