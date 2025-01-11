
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
/**
 *
 * @author Doubl
 * 
 * Rules for Sudoku
 * Use numbers 1-9
 * numbers cannot repeat in A row, column, or 3x3 grid
 */
public class Sudoku extends Application {
    public static void main(String[] args) {
        //Launch the application
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        //set stage title
        primaryStage.setTitle("Sudoku Builder");
        
ArrayList<Integer> gridListTaken = new ArrayList<>();
for(int i=0; i < 8; i++){
    gridListTaken.add(0);
}
        
ArrayList<ArrayList<ArrayList<String>>> masterArrayList = new ArrayList<>();
ArrayList<ArrayList<Integer>> gridArrayList = new ArrayList<>();
//initialize the gridarraylist
for(int i=0; i< 9; i++){
    gridArrayList.add(new ArrayList<Integer>(9));
    for (int j = 0; j < 9; j++){
        gridArrayList.get(i).add(0);
    }
}
//manually put in arrayvalues for grids 1-3
  gridArrayList.get(0).add(0,1);
  gridArrayList.get(0).add(1,1);
  gridArrayList.get(0).add(2,1);
  gridArrayList.get(0).add(3,2);
  gridArrayList.get(0).add(4,2);
  gridArrayList.get(0).add(5,2);
  gridArrayList.get(0).add(6,3);
  gridArrayList.get(0).add(7,3);
  gridArrayList.get(0).add(8,3);
  gridArrayList.get(1).add(0,1);
  gridArrayList.get(1).add(1,1);
  gridArrayList.get(1).add(2,1);
  gridArrayList.get(1).add(3,2);
  gridArrayList.get(1).add(4,2);
  gridArrayList.get(1).add(5,2);
  gridArrayList.get(1).add(6,3);
  gridArrayList.get(1).add(7,3);
  gridArrayList.get(1).add(8,3);
  gridArrayList.get(2).add(0,1);
  gridArrayList.get(2).add(1,1);
  gridArrayList.get(2).add(2,1);
  gridArrayList.get(2).add(3,2);
  gridArrayList.get(2).add(4,2);
  gridArrayList.get(2).add(5,2);
  gridArrayList.get(2).add(6,3);
  gridArrayList.get(2).add(7,3);
  gridArrayList.get(2).add(8,3);
  //manually put in arrayvalues for grids 4-6
  gridArrayList.get(3).add(0,4);
  gridArrayList.get(3).add(1,4);
  gridArrayList.get(3).add(2,4);
  gridArrayList.get(3).add(3,5);
  gridArrayList.get(3).add(4,5);
  gridArrayList.get(3).add(5,5);
  gridArrayList.get(3).add(6,6);
  gridArrayList.get(3).add(7,6);
  gridArrayList.get(3).add(8,6);
  gridArrayList.get(4).add(0,4);
  gridArrayList.get(4).add(1,4);
  gridArrayList.get(4).add(2,4);
  gridArrayList.get(4).add(3,5);
  gridArrayList.get(4).add(4,5);
  gridArrayList.get(4).add(5,5);
  gridArrayList.get(4).add(6,6);
  gridArrayList.get(4).add(7,6);
  gridArrayList.get(4).add(8,6);
  gridArrayList.get(5).add(0,4);
  gridArrayList.get(5).add(1,4);
  gridArrayList.get(5).add(2,4);
  gridArrayList.get(5).add(3,5);
  gridArrayList.get(5).add(4,5);
  gridArrayList.get(5).add(5,5);
  gridArrayList.get(5).add(6,6);
  gridArrayList.get(5).add(7,6);
  gridArrayList.get(5).add(8,6);  
  //manually put in arrayvalues for grids 7-9
  gridArrayList.get(6).add(0,7);
  gridArrayList.get(6).add(1,7);
  gridArrayList.get(6).add(2,7);
  gridArrayList.get(6).add(3,8);
  gridArrayList.get(6).add(4,8);
  gridArrayList.get(6).add(5,8);
  gridArrayList.get(6).add(6,9);
  gridArrayList.get(6).add(7,9);
  gridArrayList.get(6).add(8,9);
  gridArrayList.get(7).add(0,7);
  gridArrayList.get(7).add(1,7);
  gridArrayList.get(7).add(2,7);
  gridArrayList.get(7).add(3,8);
  gridArrayList.get(7).add(4,8);
  gridArrayList.get(7).add(5,8);
  gridArrayList.get(7).add(6,9);
  gridArrayList.get(7).add(7,9);
  gridArrayList.get(7).add(8,9);
  gridArrayList.get(8).add(0,7);
  gridArrayList.get(8).add(1,7);
  gridArrayList.get(8).add(2,7);
  gridArrayList.get(8).add(3,8);
  gridArrayList.get(8).add(4,8);
  gridArrayList.get(8).add(5,8);
  gridArrayList.get(8).add(6,9);
  gridArrayList.get(8).add(7,9);
  gridArrayList.get(8).add(8,9); 
  

//initialize the masterArrayList

for(int i=0; i< 9; i++){
    masterArrayList.add(new ArrayList<ArrayList<String>>(9));
    for (int j = 0; j < 9; j++){
        masterArrayList.get(i).add(new ArrayList<String>(10));
    }
}

//assign default values to the master array
//flag variable so this run once
boolean flag = false;
do{
for(int i = 0; i<9; i++){
    System.out.println();
    for(int j = 0; j<9 ; j++){
    masterArrayList.get(i).get(j).add("_");
    System.out.print(masterArrayList.get(i).get(j).get(0));
    for(int k = 1; k<10; k++){
        String str = Integer.toString(k);
        masterArrayList.get(i).get(j).add(k,str);
        System.out.print(masterArrayList.get(i).get(j).get(k));
        }
    }
 flag = true;   
}//end for
}while (flag 
        == false);//end do while
//create an arraylist for determining which cells go to which grid by passing 
//an arraylist object and the positon of the 3rd array
ArrayList<ArrayList<ArrayList<Integer>>> whichGridList = new ArrayList<>();
//initialize whichGridList
for(int i=0; i< 9; i++){
    whichGridList.add(new ArrayList<ArrayList<Integer>>(9));
    for (int j = 0; j < 9; j++){
        whichGridList.get(i).add(new ArrayList<Integer>(10));
    }
}

whichGridList.get(0).get(0).add(0,1);
whichGridList.get(0).get(1).add(0,1);
whichGridList.get(0).get(2).add(0,1);
whichGridList.get(0).get(3).add(0,2);
whichGridList.get(0).get(4).add(0,2);
whichGridList.get(0).get(5).add(0,2);
whichGridList.get(0).get(6).add(0,3);
whichGridList.get(0).get(7).add(0,3);
whichGridList.get(0).get(8).add(0,3);
whichGridList.get(1).get(0).add(0,1);
whichGridList.get(1).get(1).add(0,1);
whichGridList.get(1).get(2).add(0,1);
whichGridList.get(1).get(3).add(0,2);
whichGridList.get(1).get(4).add(0,2);
whichGridList.get(1).get(5).add(0,2);
whichGridList.get(1).get(6).add(0,3);
whichGridList.get(1).get(7).add(0,3);
whichGridList.get(1).get(8).add(0,3);
whichGridList.get(2).get(0).add(0,1);
whichGridList.get(2).get(1).add(0,1);
whichGridList.get(2).get(2).add(0,1);
whichGridList.get(2).get(3).add(0,2);
whichGridList.get(2).get(4).add(0,2);
whichGridList.get(2).get(5).add(0,2);
whichGridList.get(2).get(6).add(0,3);
whichGridList.get(2).get(7).add(0,3);
whichGridList.get(2).get(8).add(0,3);
whichGridList.get(3).get(0).add(0,4);
whichGridList.get(3).get(1).add(0,4);
whichGridList.get(3).get(2).add(0,4);
whichGridList.get(3).get(3).add(0,5);
whichGridList.get(3).get(4).add(0,5);
whichGridList.get(3).get(5).add(0,5);
whichGridList.get(3).get(6).add(0,6);
whichGridList.get(3).get(7).add(0,6);
whichGridList.get(3).get(8).add(0,6);
whichGridList.get(4).get(0).add(0,4);
whichGridList.get(4).get(1).add(0,4);
whichGridList.get(4).get(2).add(0,4);
whichGridList.get(4).get(3).add(0,5);
whichGridList.get(4).get(4).add(0,5);
whichGridList.get(4).get(5).add(0,5);
whichGridList.get(4).get(6).add(0,6);
whichGridList.get(4).get(7).add(0,6);
whichGridList.get(4).get(8).add(0,6);
whichGridList.get(5).get(0).add(0,4);
whichGridList.get(5).get(1).add(0,4);
whichGridList.get(5).get(2).add(0,4);
whichGridList.get(5).get(3).add(0,5);
whichGridList.get(5).get(4).add(0,5);
whichGridList.get(5).get(5).add(0,5);
whichGridList.get(5).get(6).add(0,6);
whichGridList.get(5).get(7).add(0,6);
whichGridList.get(5).get(8).add(0,6);
whichGridList.get(6).get(0).add(0,7);
whichGridList.get(6).get(1).add(0,7);
whichGridList.get(6).get(2).add(0,7);
whichGridList.get(6).get(3).add(0,8);
whichGridList.get(6).get(4).add(0,8);
whichGridList.get(6).get(5).add(0,8);
whichGridList.get(6).get(6).add(0,9);
whichGridList.get(6).get(7).add(0,9);
whichGridList.get(6).get(8).add(0,9);
whichGridList.get(7).get(0).add(0,7);
whichGridList.get(7).get(1).add(0,7);
whichGridList.get(7).get(2).add(0,7);
whichGridList.get(7).get(3).add(0,8);
whichGridList.get(7).get(4).add(0,8);
whichGridList.get(7).get(5).add(0,8);
whichGridList.get(7).get(6).add(0,9);
whichGridList.get(7).get(7).add(0,9);
whichGridList.get(7).get(8).add(0,9);
whichGridList.get(8).get(0).add(0,7);
whichGridList.get(8).get(1).add(0,7);
whichGridList.get(8).get(2).add(0,7);
whichGridList.get(8).get(3).add(0,8);
whichGridList.get(8).get(4).add(0,8);
whichGridList.get(8).get(5).add(0,8);
whichGridList.get(8).get(6).add(0,9);
whichGridList.get(8).get(7).add(0,9);
whichGridList.get(8).get(8).add(0,9);

//String test = masterArrayList.get(0).get(0).get(0);



        //build the sudokuCell grid_01 input comboox
        ComboBox<String> sudokuGrid_01_Cell_01 = new ComboBox<>();
        sudokuGrid_01_Cell_01.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_02 = new ComboBox<>();
        sudokuGrid_01_Cell_02.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_03 = new ComboBox<>();
        sudokuGrid_01_Cell_03.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_04 = new ComboBox<>();
        sudokuGrid_01_Cell_04.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_05 = new ComboBox<>();
        sudokuGrid_01_Cell_05.getItems().addAll("8","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_06 = new ComboBox<>();
        sudokuGrid_01_Cell_06.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_07 = new ComboBox<>();
        sudokuGrid_01_Cell_07.getItems().addAll("4","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_08 = new ComboBox<>();
        sudokuGrid_01_Cell_08.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_01_Cell_09 = new ComboBox<>();
        sudokuGrid_01_Cell_09.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_02 input comboBox
        ComboBox<String> sudokuGrid_02_Cell_01 = new ComboBox<>();
        sudokuGrid_02_Cell_01.getItems().addAll("7","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_02 = new ComboBox<>();
        sudokuGrid_02_Cell_02.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_03 = new ComboBox<>();
        sudokuGrid_02_Cell_03.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_04 = new ComboBox<>();
        sudokuGrid_02_Cell_04.getItems().addAll("2","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_05 = new ComboBox<>();
        sudokuGrid_02_Cell_05.getItems().addAll("4","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_06 = new ComboBox<>();
        sudokuGrid_02_Cell_06.getItems().addAll("9","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_07 = new ComboBox<>();
        sudokuGrid_02_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_08 = new ComboBox<>();
        sudokuGrid_02_Cell_08.getItems().addAll("5","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_02_Cell_09 = new ComboBox<>();
        sudokuGrid_02_Cell_09.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_03 input comboBox
        ComboBox<String> sudokuGrid_03_Cell_01 = new ComboBox<>();
        sudokuGrid_03_Cell_01.getItems().addAll("5","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_02 = new ComboBox<>();
        sudokuGrid_03_Cell_02.getItems().addAll("1","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_03 = new ComboBox<>();
        sudokuGrid_03_Cell_03.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_04 = new ComboBox<>();
        sudokuGrid_03_Cell_04.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_05 = new ComboBox<>();
        sudokuGrid_03_Cell_05.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_06 = new ComboBox<>();
        sudokuGrid_03_Cell_06.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_07 = new ComboBox<>();
        sudokuGrid_03_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_08 = new ComboBox<>();
        sudokuGrid_03_Cell_08.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_03_Cell_09 = new ComboBox<>();
        sudokuGrid_03_Cell_09.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_04 input comboBox
        ComboBox<String> sudokuGrid_04_Cell_01 = new ComboBox<>();
        sudokuGrid_04_Cell_01.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_02 = new ComboBox<>();
        sudokuGrid_04_Cell_02.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_03 = new ComboBox<>();
        sudokuGrid_04_Cell_03.getItems().addAll("8","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_04 = new ComboBox<>();
        sudokuGrid_04_Cell_04.getItems().addAll("9","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_05 = new ComboBox<>();
        sudokuGrid_04_Cell_05.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_06 = new ComboBox<>();
        sudokuGrid_04_Cell_06.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_07 = new ComboBox<>();
        sudokuGrid_04_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_08 = new ComboBox<>();
        sudokuGrid_04_Cell_08.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_04_Cell_09 = new ComboBox<>();
        sudokuGrid_04_Cell_09.getItems().addAll("5","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_05 input comboBox
        ComboBox<String> sudokuGrid_05_Cell_01 = new ComboBox<>();
        sudokuGrid_05_Cell_01.getItems().addAll("1","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_02 = new ComboBox<>();
        sudokuGrid_05_Cell_02.getItems().addAll("6","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_03 = new ComboBox<>();
        sudokuGrid_05_Cell_03.getItems().addAll("3","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_04 = new ComboBox<>();
        sudokuGrid_05_Cell_04.getItems().addAll("5","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_05 = new ComboBox<>();
        sudokuGrid_05_Cell_05.getItems().addAll("2","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_06 = new ComboBox<>();
        sudokuGrid_05_Cell_06.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_07 = new ComboBox<>();
        sudokuGrid_05_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_08 = new ComboBox<>();
        sudokuGrid_05_Cell_08.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_05_Cell_09 = new ComboBox<>();
        sudokuGrid_05_Cell_09.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_06 input comboBox
        ComboBox<String> sudokuGrid_06_Cell_01 = new ComboBox<>();
        sudokuGrid_06_Cell_01.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_02 = new ComboBox<>();
        sudokuGrid_06_Cell_02.getItems().addAll("4","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_03 = new ComboBox<>();
        sudokuGrid_06_Cell_03.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_04 = new ComboBox<>();
        sudokuGrid_06_Cell_04.getItems().addAll("1","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_05 = new ComboBox<>();
        sudokuGrid_06_Cell_05.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_06 = new ComboBox<>();
        sudokuGrid_06_Cell_06.getItems().addAll("8","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_07 = new ComboBox<>();
        sudokuGrid_06_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_08 = new ComboBox<>();
        sudokuGrid_06_Cell_08.getItems().addAll("7","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_06_Cell_09 = new ComboBox<>();
        sudokuGrid_06_Cell_09.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_07 input comboBox
        ComboBox<String> sudokuGrid_07_Cell_01 = new ComboBox<>();
        sudokuGrid_07_Cell_01.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_02 = new ComboBox<>();
        sudokuGrid_07_Cell_02.getItems().addAll("9","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_03 = new ComboBox<>();
        sudokuGrid_07_Cell_03.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_04 = new ComboBox<>();
        sudokuGrid_07_Cell_04.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_05 = new ComboBox<>();
        sudokuGrid_07_Cell_05.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_06 = new ComboBox<>();
        sudokuGrid_07_Cell_06.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_07 = new ComboBox<>();
        sudokuGrid_07_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_08 = new ComboBox<>();
        sudokuGrid_07_Cell_08.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_07_Cell_09 = new ComboBox<>();
        sudokuGrid_07_Cell_09.getItems().addAll("7","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_08 input comboBox
        ComboBox<String> sudokuGrid_08_Cell_01 = new ComboBox<>();
        sudokuGrid_08_Cell_01.getItems().addAll("3","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_02 = new ComboBox<>();
        sudokuGrid_08_Cell_02.getItems().addAll("8","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_03 = new ComboBox<>();
        sudokuGrid_08_Cell_03.getItems().addAll("2","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_04 = new ComboBox<>();
        sudokuGrid_08_Cell_04.getItems().addAll("4","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_05 = new ComboBox<>();
        sudokuGrid_08_Cell_05.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_06 = new ComboBox<>();
        sudokuGrid_08_Cell_06.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_07 = new ComboBox<>();
        sudokuGrid_08_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_08 = new ComboBox<>();
        sudokuGrid_08_Cell_08.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_08_Cell_09 = new ComboBox<>();
        sudokuGrid_08_Cell_09.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        //build the sudokuCell grid_09 input comboBox
        ComboBox<String> sudokuGrid_09_Cell_01 = new ComboBox<>();
        sudokuGrid_09_Cell_01.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_02 = new ComboBox<>();
        sudokuGrid_09_Cell_02.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_03 = new ComboBox<>();
        sudokuGrid_09_Cell_03.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_04 = new ComboBox<>();
        sudokuGrid_09_Cell_04.getItems().addAll("6","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_05 = new ComboBox<>();
        sudokuGrid_09_Cell_05.getItems().addAll("9","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_06 = new ComboBox<>();
        sudokuGrid_09_Cell_06.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_07 = new ComboBox<>();
        sudokuGrid_09_Cell_07.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_08 = new ComboBox<>();
        sudokuGrid_09_Cell_08.getItems().addAll("_","1","2","3","4","5","6","7","8","9");
        ComboBox<String> sudokuGrid_09_Cell_09 = new ComboBox<>();
        sudokuGrid_09_Cell_09.getItems().addAll("2","1","2","3","4","5","6","7","8","9");
        
        //Setfirst value of the combobox
        sudokuGrid_01_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_01_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_02_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_02_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_03_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_03_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_04_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_04_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_05_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_05_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_06_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_06_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_07_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_07_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_08_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_08_Cell_09.getSelectionModel().selectFirst();
        //
        sudokuGrid_09_Cell_01.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_02.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_03.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_04.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_05.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_06.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_07.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_08.getSelectionModel().selectFirst();
        sudokuGrid_09_Cell_09.getSelectionModel().selectFirst();
        //
        
        

        //build grid_01 hbox for display               
        HBox grid_01_row_01 = new HBox(0, sudokuGrid_01_Cell_01, sudokuGrid_01_Cell_02, sudokuGrid_01_Cell_03);
        HBox grid_01_row_02 = new HBox(0, sudokuGrid_01_Cell_04, sudokuGrid_01_Cell_05, sudokuGrid_01_Cell_06);
        HBox grid_01_row_03 = new HBox(0, sudokuGrid_01_Cell_07, sudokuGrid_01_Cell_08, sudokuGrid_01_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_01_Vbox = new VBox(0, grid_01_row_01, grid_01_row_02, grid_01_row_03);
        //build grid_02 hbox for display               
        HBox grid_02_row_01 = new HBox(0, sudokuGrid_02_Cell_01, sudokuGrid_02_Cell_02, sudokuGrid_02_Cell_03);
        HBox grid_02_row_02 = new HBox(0, sudokuGrid_02_Cell_04, sudokuGrid_02_Cell_05, sudokuGrid_02_Cell_06);
        HBox grid_02_row_03 = new HBox(0, sudokuGrid_02_Cell_07, sudokuGrid_02_Cell_08, sudokuGrid_02_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_02_Vbox = new VBox(0, grid_02_row_01, grid_02_row_02, grid_02_row_03);
        //build grid_03 hbox for display               
        HBox grid_03_row_01 = new HBox(0, sudokuGrid_03_Cell_01, sudokuGrid_03_Cell_02, sudokuGrid_03_Cell_03);
        HBox grid_03_row_02 = new HBox(0, sudokuGrid_03_Cell_04, sudokuGrid_03_Cell_05, sudokuGrid_03_Cell_06);
        HBox grid_03_row_03 = new HBox(0, sudokuGrid_03_Cell_07, sudokuGrid_03_Cell_08, sudokuGrid_03_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_03_Vbox = new VBox(0, grid_03_row_01, grid_03_row_02, grid_03_row_03);
        //build grid_04 hbox for display               
        HBox grid_04_row_01 = new HBox(0, sudokuGrid_04_Cell_01, sudokuGrid_04_Cell_02, sudokuGrid_04_Cell_03);
        HBox grid_04_row_02 = new HBox(0, sudokuGrid_04_Cell_04, sudokuGrid_04_Cell_05, sudokuGrid_04_Cell_06);
        HBox grid_04_row_03 = new HBox(0, sudokuGrid_04_Cell_07, sudokuGrid_04_Cell_08, sudokuGrid_04_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_04_Vbox = new VBox(0, grid_04_row_01, grid_04_row_02, grid_04_row_03);
        //build grid_05 hbox for display               
        HBox grid_05_row_01 = new HBox(0, sudokuGrid_05_Cell_01, sudokuGrid_05_Cell_02, sudokuGrid_05_Cell_03);
        HBox grid_05_row_02 = new HBox(0, sudokuGrid_05_Cell_04, sudokuGrid_05_Cell_05, sudokuGrid_05_Cell_06);
        HBox grid_05_row_03 = new HBox(0, sudokuGrid_05_Cell_07, sudokuGrid_05_Cell_08, sudokuGrid_05_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_05_Vbox = new VBox(0, grid_05_row_01, grid_05_row_02, grid_05_row_03);
        //build grid_06 hbox for display               
        HBox grid_06_row_01 = new HBox(0, sudokuGrid_06_Cell_01, sudokuGrid_06_Cell_02, sudokuGrid_06_Cell_03);
        HBox grid_06_row_02 = new HBox(0, sudokuGrid_06_Cell_04, sudokuGrid_06_Cell_05, sudokuGrid_06_Cell_06);
        HBox grid_06_row_03 = new HBox(0, sudokuGrid_06_Cell_07, sudokuGrid_06_Cell_08, sudokuGrid_06_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_06_Vbox = new VBox(0, grid_06_row_01, grid_06_row_02, grid_06_row_03);
        //build grid_07 hbox for display               
        HBox grid_07_row_01 = new HBox(0, sudokuGrid_07_Cell_01, sudokuGrid_07_Cell_02, sudokuGrid_07_Cell_03);
        HBox grid_07_row_02 = new HBox(0, sudokuGrid_07_Cell_04, sudokuGrid_07_Cell_05, sudokuGrid_07_Cell_06);
        HBox grid_07_row_03 = new HBox(0, sudokuGrid_07_Cell_07, sudokuGrid_07_Cell_08, sudokuGrid_07_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_07_Vbox = new VBox(0, grid_07_row_01, grid_07_row_02, grid_07_row_03);
        //build grid_08 hbox for display               
        HBox grid_08_row_01 = new HBox(0, sudokuGrid_08_Cell_01, sudokuGrid_08_Cell_02, sudokuGrid_08_Cell_03);
        HBox grid_08_row_02 = new HBox(0, sudokuGrid_08_Cell_04, sudokuGrid_08_Cell_05, sudokuGrid_08_Cell_06);
        HBox grid_08_row_03 = new HBox(0, sudokuGrid_08_Cell_07, sudokuGrid_08_Cell_08, sudokuGrid_08_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_08_Vbox = new VBox(0, grid_08_row_01, grid_08_row_02, grid_08_row_03);
        //build grid_09 hbox for display               
        HBox grid_09_row_01 = new HBox(0, sudokuGrid_09_Cell_01, sudokuGrid_09_Cell_02, sudokuGrid_09_Cell_03);
        HBox grid_09_row_02 = new HBox(0, sudokuGrid_09_Cell_04, sudokuGrid_09_Cell_05, sudokuGrid_09_Cell_06);
        HBox grid_09_row_03 = new HBox(0, sudokuGrid_09_Cell_07, sudokuGrid_09_Cell_08, sudokuGrid_09_Cell_09);   
        //buiild vbox assembling all hboxes
        VBox grid_09_Vbox = new VBox(0, grid_09_row_01, grid_09_row_02, grid_09_row_03);
        
        //put them all in a gridpane
        GridPane gridpane = new GridPane();
        //assemble gridpane
        gridpane.add(grid_01_Vbox, 0, 0);
        gridpane.add(grid_02_Vbox, 1, 0);
        gridpane.add(grid_03_Vbox, 2, 0);
        gridpane.add(grid_04_Vbox, 0, 1);
        gridpane.add(grid_05_Vbox, 1, 1);
        gridpane.add(grid_06_Vbox, 2, 1);
        gridpane.add(grid_07_Vbox, 0, 2);
        gridpane.add(grid_08_Vbox, 1, 2);
        gridpane.add(grid_09_Vbox, 2, 2);             
        
        //format spacing
        gridpane.setHgap(10);
        gridpane.setGridLinesVisible(true);
        gridpane.setVgap(10);
        
        //create output Labels    
        Label Label_01 = new Label("0");
        Label Label_02 = new Label("0");
        Label Label_03 = new Label("0");
        Label Label_04 = new Label("0");
        Label Label_05 = new Label("0");
        Label Label_06 = new Label("0");
        Label Label_07 = new Label("0");
        Label Label_08 = new Label("0");
        Label Label_09 = new Label("0");
        Label Label_10 = new Label("0");
        Label Label_11 = new Label("0");
        Label Label_12 = new Label("0");
        Label Label_13 = new Label("0");
        Label Label_14 = new Label("0");
        Label Label_15 = new Label("0");
        Label Label_16 = new Label("0");
        Label Label_17 = new Label("0");
        Label Label_18 = new Label("0");
        Label Label_19 = new Label("0");
        Label Label_20 = new Label("0");
        Label Label_21 = new Label("0");
        Label Label_22 = new Label("0");
        Label Label_23 = new Label("0");
        Label Label_24 = new Label("0");
        Label Label_25 = new Label("0");
        Label Label_26 = new Label("0");
        Label Label_27 = new Label("0");
        Label Label_28 = new Label("0");
        Label Label_29 = new Label("0");
        Label Label_30 = new Label("0");
        Label Label_31 = new Label("0");
        Label Label_32 = new Label("0");
        Label Label_33 = new Label("0");
        Label Label_34 = new Label("0");
        Label Label_35 = new Label("0");
        Label Label_36 = new Label("0");
        Label Label_37 = new Label("0");
        Label Label_38 = new Label("0");
        Label Label_39 = new Label("0");
        Label Label_40 = new Label("0");
        Label Label_41 = new Label("0");
        Label Label_42 = new Label("0");
        Label Label_43 = new Label("0");
        Label Label_44 = new Label("0");
        Label Label_45 = new Label("0");
        Label Label_46 = new Label("0");
        Label Label_47 = new Label("0");
        Label Label_48 = new Label("0");
        Label Label_49 = new Label("0");
        Label Label_50 = new Label("0");
        Label Label_51 = new Label("0");
        Label Label_52 = new Label("0");
        Label Label_53 = new Label("0");
        Label Label_54 = new Label("0");
        Label Label_55 = new Label("0");
        Label Label_56 = new Label("0");
        Label Label_57 = new Label("0");
        Label Label_58 = new Label("0");
        Label Label_59 = new Label("0");
        Label Label_60 = new Label("0");
        Label Label_61 = new Label("0");
        Label Label_62 = new Label("0");
        Label Label_63 = new Label("0");
        Label Label_64 = new Label("0");
        Label Label_65 = new Label("0");
        Label Label_66 = new Label("0");
        Label Label_67 = new Label("0");
        Label Label_68 = new Label("0");
        Label Label_69 = new Label("0");
        Label Label_70 = new Label("0");
        Label Label_71 = new Label("0");
        Label Label_72 = new Label("0");
        Label Label_73 = new Label("0");
        Label Label_74 = new Label("0");
        Label Label_75 = new Label("0");
        Label Label_76 = new Label("0");
        Label Label_77 = new Label("0");
        Label Label_78 = new Label("0");
        Label Label_79 = new Label("0");
        Label Label_80 = new Label("0");
        Label Label_81 = new Label("0"); 
        //lets try and put these into an array
        ArrayList<Label> labelArrayList = new ArrayList<>();
        labelArrayList.add(Label_01);
        labelArrayList.add(Label_02);
        labelArrayList.add(Label_03);
        labelArrayList.add(Label_04);
        labelArrayList.add(Label_05);
        labelArrayList.add(Label_06);
        labelArrayList.add(Label_07);
        labelArrayList.add(Label_08);
        labelArrayList.add(Label_09);
        labelArrayList.add(Label_10);
        labelArrayList.add(Label_11);
        labelArrayList.add(Label_12);
        labelArrayList.add(Label_13);
        labelArrayList.add(Label_14);
        labelArrayList.add(Label_15);
        labelArrayList.add(Label_16);
        labelArrayList.add(Label_17);
        labelArrayList.add(Label_18);
        labelArrayList.add(Label_19);
        labelArrayList.add(Label_20);
        labelArrayList.add(Label_21);
        labelArrayList.add(Label_22);
        labelArrayList.add(Label_23);
        labelArrayList.add(Label_24);
        labelArrayList.add(Label_25);
        labelArrayList.add(Label_26);
        labelArrayList.add(Label_27);
        labelArrayList.add(Label_28);
        labelArrayList.add(Label_29);
        labelArrayList.add(Label_30);
        labelArrayList.add(Label_31);
        labelArrayList.add(Label_32);
        labelArrayList.add(Label_33);
        labelArrayList.add(Label_34);
        labelArrayList.add(Label_35);
        labelArrayList.add(Label_36);
        labelArrayList.add(Label_37);
        labelArrayList.add(Label_38);
        labelArrayList.add(Label_39);
        labelArrayList.add(Label_40);
        labelArrayList.add(Label_41);
        labelArrayList.add(Label_42);
        labelArrayList.add(Label_43);
        labelArrayList.add(Label_44);
        labelArrayList.add(Label_45);
        labelArrayList.add(Label_46);
        labelArrayList.add(Label_47);
        labelArrayList.add(Label_48);
        labelArrayList.add(Label_49);
        labelArrayList.add(Label_50);
        labelArrayList.add(Label_51);
        labelArrayList.add(Label_52);
        labelArrayList.add(Label_53);
        labelArrayList.add(Label_54);
        labelArrayList.add(Label_55);
        labelArrayList.add(Label_56);
        labelArrayList.add(Label_57);
        labelArrayList.add(Label_58);
        labelArrayList.add(Label_59);
        labelArrayList.add(Label_60);
        labelArrayList.add(Label_61);
        labelArrayList.add(Label_62);
        labelArrayList.add(Label_63);
        labelArrayList.add(Label_64);
        labelArrayList.add(Label_65);
        labelArrayList.add(Label_66);
        labelArrayList.add(Label_67);
        labelArrayList.add(Label_68);
        labelArrayList.add(Label_69);
        labelArrayList.add(Label_70);
        labelArrayList.add(Label_71);
        labelArrayList.add(Label_72);
        labelArrayList.add(Label_73);
        labelArrayList.add(Label_74);
        labelArrayList.add(Label_75);
        labelArrayList.add(Label_76);
        labelArrayList.add(Label_77);
        labelArrayList.add(Label_78);
        labelArrayList.add(Label_79);
        labelArrayList.add(Label_80);
        labelArrayList.add(Label_81);

        //build grid_01 hbox for display               
        HBox outoutGrid_01_row_01 = new HBox(0, Label_01, Label_02, Label_03);
        HBox outoutGrid_01_row_02 = new HBox(0, Label_10, Label_11, Label_12);
        HBox outoutGrid_01_row_03 = new HBox(0, Label_19, Label_20, Label_21);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_01_Vbox = new VBox(0, outoutGrid_01_row_01, outoutGrid_01_row_02, outoutGrid_01_row_03);
        //build grid_02 hbox for display               
        HBox outoutGrid_02_row_01 = new HBox(0, Label_04, Label_05, Label_06);
        HBox outoutGrid_02_row_02 = new HBox(0, Label_13, Label_14, Label_15);
        HBox outoutGrid_02_row_03 = new HBox(0, Label_22, Label_23, Label_24);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_02_Vbox = new VBox(0, outoutGrid_02_row_01, outoutGrid_02_row_02, outoutGrid_02_row_03);
        //build grid_03 hbox for display               
        HBox outoutGrid_03_row_01 = new HBox(0, Label_07, Label_08, Label_09);
        HBox outoutGrid_03_row_02 = new HBox(0, Label_16, Label_17, Label_18);
        HBox outoutGrid_03_row_03 = new HBox(0, Label_25, Label_26, Label_27);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_03_Vbox = new VBox(0, outoutGrid_03_row_01, outoutGrid_03_row_02, outoutGrid_03_row_03);
        //build grid_04 hbox for display               
        HBox outoutGrid_04_row_01 = new HBox(0, Label_28, Label_29, Label_30);
        HBox outoutGrid_04_row_02 = new HBox(0, Label_37, Label_38, Label_39);
        HBox outoutGrid_04_row_03 = new HBox(0, Label_46, Label_47, Label_48);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_04_Vbox = new VBox(0, outoutGrid_04_row_01, outoutGrid_04_row_02, outoutGrid_04_row_03);
        //build grid_05 hbox for display               
        HBox outoutGrid_05_row_01 = new HBox(0, Label_31, Label_32, Label_33);
        HBox outoutGrid_05_row_02 = new HBox(0, Label_40, Label_41, Label_42);
        HBox outoutGrid_05_row_03 = new HBox(0, Label_49, Label_50, Label_51);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_05_Vbox = new VBox(0, outoutGrid_05_row_01, outoutGrid_05_row_02, outoutGrid_05_row_03);
        //build outoutGrid_06 hbox for display               
        HBox outoutGrid_06_row_01 = new HBox(0, Label_34, Label_35, Label_36);
        HBox outoutGrid_06_row_02 = new HBox(0, Label_43, Label_44, Label_45);
        HBox outoutGrid_06_row_03 = new HBox(0, Label_52, Label_53, Label_54);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_06_Vbox = new VBox(0, outoutGrid_06_row_01, outoutGrid_06_row_02, outoutGrid_06_row_03);
        //build outoutGrid_07 hbox for display               
        HBox outoutGrid_07_row_01 = new HBox(0, Label_55, Label_56, Label_57);
        HBox outoutGrid_07_row_02 = new HBox(0, Label_64, Label_65, Label_66);
        HBox outoutGrid_07_row_03 = new HBox(0, Label_73, Label_74, Label_75);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_07_Vbox = new VBox(0, outoutGrid_07_row_01, outoutGrid_07_row_02, outoutGrid_07_row_03);
        //build grid_08 hbox for display               
        HBox outoutGrid_08_row_01 = new HBox(0, Label_58, Label_59, Label_60);
        HBox outoutGrid_08_row_02 = new HBox(0, Label_67, Label_68, Label_69);
        HBox outoutGrid_08_row_03 = new HBox(0, Label_76, Label_77, Label_78);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_08_Vbox = new VBox(0, outoutGrid_08_row_01, outoutGrid_08_row_02, outoutGrid_08_row_03);
        //build grid_09 hbox for display               
        HBox outoutGrid_09_row_01 = new HBox(0, Label_61, Label_62, Label_63);
        HBox outoutGrid_09_row_02 = new HBox(0, Label_70, Label_71, Label_72);
        HBox outoutGrid_09_row_03 = new HBox(0, Label_79, Label_80, Label_81);   
        //buiild vbox assembling all hboxes
        VBox outoutGrid_09_Vbox = new VBox(0, outoutGrid_09_row_01, outoutGrid_09_row_02, outoutGrid_09_row_03);
        
        //create output gridpane 
        GridPane outputGridPane = new GridPane();
        //assemble gridpane
        outputGridPane.add(outoutGrid_01_Vbox, 0, 0);
        outputGridPane.add(outoutGrid_02_Vbox, 1, 0);
        outputGridPane.add(outoutGrid_03_Vbox, 2, 0);
        outputGridPane.add(outoutGrid_04_Vbox, 0, 1);
        outputGridPane.add(outoutGrid_05_Vbox, 1, 1);
        outputGridPane.add(outoutGrid_06_Vbox, 2, 1);
        outputGridPane.add(outoutGrid_07_Vbox, 0, 2);
        outputGridPane.add(outoutGrid_08_Vbox, 1, 2);
        outputGridPane.add(outoutGrid_09_Vbox, 2, 2);        
        
        //format spacing
        outputGridPane.setHgap(10);
        outputGridPane.setGridLinesVisible(true);
        outputGridPane.setVgap(10);

        //Create arrays
        // Master array with all values 9x9
        int[][] masterArray = new int[9][9];
        //create the build button. 
        Button buildSudokuButton = new Button("Build");
        //create clear button
        Button clearButton = new Button("Clear");
        //create solve button
        Button solveButton = new Button("Solve"); 
        //create troubleshoot button
        Button troubleShoot = new Button("Display");
//troubleshooting lable
Label testing = new Label("Testing");
        //Register event handler for the button; they use a lambda expression
buildSudokuButton.setOnAction(event ->
        {   
            String getValue;
            String inputValue;
            String outputValue;
            //masterArrayList.get(0).get(0).add(0, sudokuGrid_01_Cell_01.getValue());
            //masterArray[0][1] = sudokuGrid_01_Cell_02.getValue();
        //can we call methods inside a lambda
            
        masterArrayList.get(0).get(0).set(0, sudokuGrid_01_Cell_01.getValue());
        masterArrayList.get(0).get(1).set(0, sudokuGrid_01_Cell_02.getValue());
        masterArrayList.get(0).get(2).set(0, sudokuGrid_01_Cell_03.getValue());
        masterArrayList.get(1).get(0).set(0, sudokuGrid_01_Cell_04.getValue());
        masterArrayList.get(1).get(1).set(0, sudokuGrid_01_Cell_05.getValue());
        masterArrayList.get(1).get(2).set(0, sudokuGrid_01_Cell_06.getValue());
        masterArrayList.get(2).get(0).set(0, sudokuGrid_01_Cell_07.getValue());
        masterArrayList.get(2).get(1).set(0, sudokuGrid_01_Cell_08.getValue());
        masterArrayList.get(2).get(2).set(0, sudokuGrid_01_Cell_09.getValue());
        masterArrayList.get(0).get(3).set(0, sudokuGrid_02_Cell_01.getValue());
        masterArrayList.get(0).get(4).set(0, sudokuGrid_02_Cell_02.getValue());
        masterArrayList.get(0).get(5).set(0, sudokuGrid_02_Cell_03.getValue());
        masterArrayList.get(1).get(3).set(0, sudokuGrid_02_Cell_04.getValue());
        masterArrayList.get(1).get(4).set(0, sudokuGrid_02_Cell_05.getValue());
        masterArrayList.get(1).get(5).set(0, sudokuGrid_02_Cell_06.getValue());
        masterArrayList.get(2).get(3).set(0, sudokuGrid_02_Cell_07.getValue());
        masterArrayList.get(2).get(4).set(0, sudokuGrid_02_Cell_08.getValue());
        masterArrayList.get(2).get(5).set(0, sudokuGrid_02_Cell_09.getValue());
        masterArrayList.get(0).get(6).set(0, sudokuGrid_03_Cell_01.getValue());
        masterArrayList.get(0).get(7).set(0, sudokuGrid_03_Cell_02.getValue());
        masterArrayList.get(0).get(8).set(0, sudokuGrid_03_Cell_03.getValue());
        masterArrayList.get(1).get(6).set(0, sudokuGrid_03_Cell_04.getValue());
        masterArrayList.get(1).get(7).set(0, sudokuGrid_03_Cell_05.getValue());
        masterArrayList.get(1).get(8).set(0, sudokuGrid_03_Cell_06.getValue());
        masterArrayList.get(2).get(6).set(0, sudokuGrid_03_Cell_07.getValue());
        masterArrayList.get(2).get(7).set(0, sudokuGrid_03_Cell_08.getValue());
        masterArrayList.get(2).get(8).set(0, sudokuGrid_03_Cell_09.getValue());
        masterArrayList.get(3).get(0).set(0, sudokuGrid_04_Cell_01.getValue());
        masterArrayList.get(3).get(1).set(0, sudokuGrid_04_Cell_02.getValue());
        masterArrayList.get(3).get(2).set(0, sudokuGrid_04_Cell_03.getValue());
        masterArrayList.get(4).get(0).set(0, sudokuGrid_04_Cell_04.getValue());
        masterArrayList.get(4).get(1).set(0, sudokuGrid_04_Cell_05.getValue());
        masterArrayList.get(4).get(2).set(0, sudokuGrid_04_Cell_06.getValue());
        masterArrayList.get(5).get(0).set(0, sudokuGrid_04_Cell_07.getValue());
        masterArrayList.get(5).get(1).set(0, sudokuGrid_04_Cell_08.getValue());
        masterArrayList.get(5).get(2).set(0, sudokuGrid_04_Cell_09.getValue());
        masterArrayList.get(3).get(3).set(0, sudokuGrid_05_Cell_01.getValue());
        masterArrayList.get(3).get(4).set(0, sudokuGrid_05_Cell_02.getValue());
        masterArrayList.get(3).get(5).set(0, sudokuGrid_05_Cell_03.getValue());
        masterArrayList.get(4).get(3).set(0, sudokuGrid_05_Cell_04.getValue());
        masterArrayList.get(4).get(4).set(0, sudokuGrid_05_Cell_05.getValue());
        masterArrayList.get(4).get(5).set(0, sudokuGrid_05_Cell_06.getValue());
        masterArrayList.get(5).get(3).set(0, sudokuGrid_05_Cell_07.getValue());
        masterArrayList.get(5).get(4).set(0, sudokuGrid_05_Cell_08.getValue());
        masterArrayList.get(5).get(5).set(0, sudokuGrid_05_Cell_09.getValue());
        masterArrayList.get(3).get(6).set(0, sudokuGrid_06_Cell_01.getValue());
        masterArrayList.get(3).get(7).set(0, sudokuGrid_06_Cell_02.getValue());
        masterArrayList.get(3).get(8).set(0, sudokuGrid_06_Cell_03.getValue());
        masterArrayList.get(4).get(6).set(0, sudokuGrid_06_Cell_04.getValue());
        masterArrayList.get(4).get(7).set(0, sudokuGrid_06_Cell_05.getValue());
        masterArrayList.get(4).get(8).set(0, sudokuGrid_06_Cell_06.getValue());
        masterArrayList.get(5).get(6).set(0, sudokuGrid_06_Cell_07.getValue());
        masterArrayList.get(5).get(7).set(0, sudokuGrid_06_Cell_08.getValue());
        masterArrayList.get(5).get(8).set(0, sudokuGrid_06_Cell_09.getValue());
        masterArrayList.get(6).get(0).set(0, sudokuGrid_07_Cell_01.getValue());
        masterArrayList.get(6).get(1).set(0, sudokuGrid_07_Cell_02.getValue());
        masterArrayList.get(6).get(2).set(0, sudokuGrid_07_Cell_03.getValue());
        masterArrayList.get(7).get(0).set(0, sudokuGrid_07_Cell_04.getValue());
        masterArrayList.get(7).get(1).set(0, sudokuGrid_07_Cell_05.getValue());
        masterArrayList.get(7).get(2).set(0, sudokuGrid_07_Cell_06.getValue());
        masterArrayList.get(8).get(0).set(0, sudokuGrid_07_Cell_07.getValue());
        masterArrayList.get(8).get(1).set(0, sudokuGrid_07_Cell_08.getValue());
        masterArrayList.get(8).get(2).set(0, sudokuGrid_07_Cell_09.getValue());
        masterArrayList.get(6).get(3).set(0, sudokuGrid_08_Cell_01.getValue());
        masterArrayList.get(6).get(4).set(0, sudokuGrid_08_Cell_02.getValue());
        masterArrayList.get(6).get(5).set(0, sudokuGrid_08_Cell_03.getValue());
        masterArrayList.get(7).get(3).set(0, sudokuGrid_08_Cell_04.getValue());
        masterArrayList.get(7).get(4).set(0, sudokuGrid_08_Cell_05.getValue());
        masterArrayList.get(7).get(5).set(0, sudokuGrid_08_Cell_06.getValue());
        masterArrayList.get(8).get(3).set(0, sudokuGrid_08_Cell_07.getValue());
        masterArrayList.get(8).get(4).set(0, sudokuGrid_08_Cell_08.getValue());
        masterArrayList.get(8).get(5).set(0, sudokuGrid_08_Cell_09.getValue());
        masterArrayList.get(6).get(6).set(0, sudokuGrid_09_Cell_01.getValue());
        masterArrayList.get(6).get(7).set(0, sudokuGrid_09_Cell_02.getValue());
        masterArrayList.get(6).get(8).set(0, sudokuGrid_09_Cell_03.getValue());
        masterArrayList.get(7).get(6).set(0, sudokuGrid_09_Cell_04.getValue());
        masterArrayList.get(7).get(7).set(0, sudokuGrid_09_Cell_05.getValue());
        masterArrayList.get(7).get(8).set(0, sudokuGrid_09_Cell_06.getValue());
        masterArrayList.get(8).get(6).set(0, sudokuGrid_09_Cell_07.getValue());
        masterArrayList.get(8).get(7).set(0, sudokuGrid_09_Cell_08.getValue());
        masterArrayList.get(8).get(8).set(0, sudokuGrid_09_Cell_09.getValue());    
         //   getValue = masterArrayList.get(0).get(0).get(0);
            //Label_01.setText("test");
    //need to add a loop and check all values if index[0] is not "_" clear possible array
    for(int i = 0; i<9 ; i++){
        for(int f = 0; f<9; f++){
            if((masterArrayList.get(i).get(f).get(0)).equals("_")){
        //do nothing
            }else{
                while(masterArrayList.get(i).get(f).size()>1){
                int index = masterArrayList.get(i).get(f).size()-1;
                masterArrayList.get(i).get(f).remove(index);  

        }
       
        }
        }
    }
    
        
    printPossibleArray(masterArrayList);    

        //testing.setText(arrayEmpty(masterArrayList,1,1));
            
   //         for(int i=0; i< masterArray.length; i++){
     //           System.out.println(masterArray[i]);
       //         }
              
        });//end of lambda
clearButton.setOnAction(event ->{
        System.out.println("ClearButton pressed");
    //this prints array
    for(int j = 0; j< 9; j++){
        System.out.println();
        for(int k = 0; k<9; k++){
            System.out.print(masterArrayList.get(j).get(k).get(0));
        }
    }
    
    /*System.out.println("");
    System.out.println(masterArrayList.get(2).get(1).get(0));
    System.out.println(masterArrayList.get(2).get(1).get(1));
    System.out.println(masterArrayList.get(2).get(1).get(2));
    System.out.println(masterArrayList.get(2).get(1).get(3));
    System.out.println(masterArrayList.get(2).get(1).get(4));
    System.out.println(masterArrayList.get(2).get(1).get(5));
    System.out.println(masterArrayList.get(2).get(1).get(6));
    System.out.println(masterArrayList.get(2).get(1).get(7));
    System.out.println(masterArrayList.get(2).get(1).get(8));
    System.out.println(masterArrayList.get(2).get(1).get(9));
   */     

    //System.out.println("Space");
    /*
    for(int i = 0; i<masterArrayList.get(3).get(2).size(); i++){
        System.out.println(masterArrayList.get(3).get(2).get(i));
    }
    */
    //call set labels method
    setLabels(labelArrayList,masterArrayList);
    
        });//end of clearbutton lambda
        
//solve event handler
solveButton.setOnAction(event->
{   
    System.out.println("Solve pressed");
//Lets just run 15 times

    while(isDone(0,0,masterArrayList)){
    
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
        //checkCell(masterArrayList,i,j,gridArrayList);
        checkHiddenSinglesTest(masterArrayList,i,j,gridArrayList,"test",0,whichGridList);
        checkCell(masterArrayList,i,j,gridArrayList);
        }
    } 
    //checkCell(masterArrayList,3,2,4);
    }
//checkHiddenSinglesTest(masterArrayList,1,0,gridArrayList,"test",0,whichGridList);
//setLabels(labelArrayList,masterArrayList);
//checkHiddenSinglesTest(masterArrayList,0,8,gridArrayList,"test",0,whichGridList);
//setLabels(labelArrayList,masterArrayList);
//checkHiddenSinglesTest(masterArrayList,3,8,gridArrayList,"test",0,whichGridList);
//setLabels(labelArrayList,masterArrayList);
//checkHiddenSinglesTest(masterArrayList,6,2,gridArrayList,"test",0,whichGridList);
//setLabels(labelArrayList,masterArrayList);
//checkHiddenSinglesTest(masterArrayList,6,8,gridArrayList,"test",0,whichGridList);
//printPossibleArray(masterArrayList);
setLabels(labelArrayList,masterArrayList);
});
//display event ahndler

troubleShoot.setOnAction(event->
{   System.out.println("troubleshoot pressed");
    
    for(int fun=0; fun<15; fun++){
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
        checkCell(masterArrayList,i,j,gridArrayList);
        //checkHiddenSingles(masterArrayList,i,j,gridArrayList,"test",0,whichGridList);
        }
    }
    } 
    setLabels(labelArrayList,masterArrayList);
    printPossibleArray(masterArrayList);
});
        
//put everything into a Vbox
VBox mainVBox = new VBox(0, gridpane, buildSudokuButton, outputGridPane, clearButton,solveButton,testing,troubleShoot);
mainVBox.setAlignment(Pos.CENTER);
mainVBox.setPadding(new Insets(0));
//add the main vbox to a scene
Scene scene = new Scene(mainVBox);
//import css file
//scene.getStylesheets().add("style.css");
//set the scene to the stage and display it
primaryStage.setScene(scene);
primaryStage.show();

}//end start method

//for testing return string    
public static boolean arrayEmpty(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y, int z){
    boolean empty = false;
    if(list.get(x).get(y).get(z).isEmpty()){
       empty = true;
    }
    return empty;
}//end arrayempty    
    
//returns which grid it is by looking it another array    

public static ArrayList<String> createGrid(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,int grid){
    ArrayList<String> gridList = new ArrayList<>();
   //switch statement i know what grids we are looking for 
   switch(grid){
       case 1:
           if (checkValue(list,0,0).equals("_")){}else{gridList.add(checkValue(list,0,0));};
           if (checkValue(list,0,1).equals("_")){}else{gridList.add(checkValue(list,0,1));};
           if (checkValue(list,0,2).equals("_")){}else{gridList.add(checkValue(list,0,2));};
           if (checkValue(list,1,0).equals("_")){}else{gridList.add(checkValue(list,1,0));};
           if (checkValue(list,1,1).equals("_")){}else{gridList.add(checkValue(list,1,1));};
           if (checkValue(list,1,2).equals("_")){}else{gridList.add(checkValue(list,1,2));};
           if (checkValue(list,2,0).equals("_")){}else{gridList.add(checkValue(list,2,0));};
           if (checkValue(list,2,1).equals("_")){}else{gridList.add(checkValue(list,2,1));};
           if (checkValue(list,2,2).equals("_")){}else{gridList.add(checkValue(list,2,2));};
           break;
        case 2:
           if (checkValue(list,0,3).equals("_")){}else{gridList.add(checkValue(list,0,3));};
           if (checkValue(list,0,4).equals("_")){}else{gridList.add(checkValue(list,0,4));};
           if (checkValue(list,0,5).equals("_")){}else{gridList.add(checkValue(list,0,5));};
           if (checkValue(list,1,3).equals("_")){}else{gridList.add(checkValue(list,1,3));};
           if (checkValue(list,1,4).equals("_")){}else{gridList.add(checkValue(list,1,4));};
           if (checkValue(list,1,5).equals("_")){}else{gridList.add(checkValue(list,1,5));};
           if (checkValue(list,2,3).equals("_")){}else{gridList.add(checkValue(list,2,3));};
           if (checkValue(list,2,4).equals("_")){}else{gridList.add(checkValue(list,2,4));};
           if (checkValue(list,2,5).equals("_")){}else{gridList.add(checkValue(list,2,5));};
           break;
        case 3:
           if (checkValue(list,0,6).equals("_")){}else{gridList.add(checkValue(list,0,6));};
           if (checkValue(list,0,7).equals("_")){}else{gridList.add(checkValue(list,0,7));};
           if (checkValue(list,0,8).equals("_")){}else{gridList.add(checkValue(list,0,8));};
           if (checkValue(list,1,6).equals("_")){}else{gridList.add(checkValue(list,1,6));};
           if (checkValue(list,1,7).equals("_")){}else{gridList.add(checkValue(list,1,7));};
           if (checkValue(list,1,8).equals("_")){}else{gridList.add(checkValue(list,1,8));};
           if (checkValue(list,2,6).equals("_")){}else{gridList.add(checkValue(list,2,6));};
           if (checkValue(list,2,7).equals("_")){}else{gridList.add(checkValue(list,2,7));};
           if (checkValue(list,2,8).equals("_")){}else{gridList.add(checkValue(list,2,8));};
           break;
        case 4:
           if (checkValue(list,3,0).equals("_")){}else{gridList.add(checkValue(list,3,0));};
           if (checkValue(list,3,1).equals("_")){}else{gridList.add(checkValue(list,3,1));};
           if (checkValue(list,3,2).equals("_")){}else{gridList.add(checkValue(list,3,2));};
           if (checkValue(list,4,0).equals("_")){}else{gridList.add(checkValue(list,4,0));};
           if (checkValue(list,4,1).equals("_")){}else{gridList.add(checkValue(list,4,1));};
           if (checkValue(list,4,2).equals("_")){}else{gridList.add(checkValue(list,4,2));};
           if (checkValue(list,5,0).equals("_")){}else{gridList.add(checkValue(list,5,0));};
           if (checkValue(list,5,1).equals("_")){}else{gridList.add(checkValue(list,5,1));};
           if (checkValue(list,5,2).equals("_")){}else{gridList.add(checkValue(list,5,2));};
           break;
        case 5:
           if (checkValue(list,3,3).equals("_")){}else{gridList.add(checkValue(list,3,3));};
           if (checkValue(list,3,4).equals("_")){}else{gridList.add(checkValue(list,3,4));};
           if (checkValue(list,3,5).equals("_")){}else{gridList.add(checkValue(list,3,5));};
           if (checkValue(list,4,3).equals("_")){}else{gridList.add(checkValue(list,4,3));};
           if (checkValue(list,4,4).equals("_")){}else{gridList.add(checkValue(list,4,4));};
           if (checkValue(list,4,5).equals("_")){}else{gridList.add(checkValue(list,4,5));};
           if (checkValue(list,5,3).equals("_")){}else{gridList.add(checkValue(list,5,3));};
           if (checkValue(list,5,4).equals("_")){}else{gridList.add(checkValue(list,5,4));};
           if (checkValue(list,5,5).equals("_")){}else{gridList.add(checkValue(list,5,5));};
           break;
        case 6:
           if (checkValue(list,3,6).equals("_")){}else{gridList.add(checkValue(list,3,6));};
           if (checkValue(list,3,7).equals("_")){}else{gridList.add(checkValue(list,3,7));};
           if (checkValue(list,3,8).equals("_")){}else{gridList.add(checkValue(list,3,8));};
           if (checkValue(list,4,6).equals("_")){}else{gridList.add(checkValue(list,4,6));};
           if (checkValue(list,4,7).equals("_")){}else{gridList.add(checkValue(list,4,7));};
           if (checkValue(list,4,8).equals("_")){}else{gridList.add(checkValue(list,4,8));};
           if (checkValue(list,5,6).equals("_")){}else{gridList.add(checkValue(list,5,6));};
           if (checkValue(list,5,7).equals("_")){}else{gridList.add(checkValue(list,5,7));};
           if (checkValue(list,5,8).equals("_")){}else{gridList.add(checkValue(list,5,8));};
           break;
        case 7:
           if (checkValue(list,6,0).equals("_")){}else{gridList.add(checkValue(list,6,0));};
           if (checkValue(list,6,1).equals("_")){}else{gridList.add(checkValue(list,6,1));};
           if (checkValue(list,6,2).equals("_")){}else{gridList.add(checkValue(list,6,2));};
           if (checkValue(list,7,0).equals("_")){}else{gridList.add(checkValue(list,7,0));};
           if (checkValue(list,7,1).equals("_")){}else{gridList.add(checkValue(list,7,1));};
           if (checkValue(list,7,2).equals("_")){}else{gridList.add(checkValue(list,7,2));};
           if (checkValue(list,8,0).equals("_")){}else{gridList.add(checkValue(list,8,0));};
           if (checkValue(list,8,1).equals("_")){}else{gridList.add(checkValue(list,8,1));};
           if (checkValue(list,8,2).equals("_")){}else{gridList.add(checkValue(list,8,2));};
           break;
        case 8:
           if (checkValue(list,6,3).equals("_")){}else{gridList.add(checkValue(list,6,3));};
           if (checkValue(list,6,4).equals("_")){}else{gridList.add(checkValue(list,6,4));};
           if (checkValue(list,6,5).equals("_")){}else{gridList.add(checkValue(list,6,5));};
           if (checkValue(list,7,3).equals("_")){}else{gridList.add(checkValue(list,7,3));};
           if (checkValue(list,7,4).equals("_")){}else{gridList.add(checkValue(list,7,4));};
           if (checkValue(list,7,5).equals("_")){}else{gridList.add(checkValue(list,7,5));};
           if (checkValue(list,8,3).equals("_")){}else{gridList.add(checkValue(list,8,3));};
           if (checkValue(list,8,4).equals("_")){}else{gridList.add(checkValue(list,8,4));};
           if (checkValue(list,8,5).equals("_")){}else{gridList.add(checkValue(list,8,5));};
           break;
        case 9:
           if (checkValue(list,6,6).equals("_")){}else{gridList.add(checkValue(list,6,6));};
           if (checkValue(list,6,7).equals("_")){}else{gridList.add(checkValue(list,6,7));};
           if (checkValue(list,6,8).equals("_")){}else{gridList.add(checkValue(list,6,8));};
           if (checkValue(list,7,6).equals("_")){}else{gridList.add(checkValue(list,7,6));};
           if (checkValue(list,7,7).equals("_")){}else{gridList.add(checkValue(list,7,7));};
           if (checkValue(list,7,8).equals("_")){}else{gridList.add(checkValue(list,7,8));};
           if (checkValue(list,8,6).equals("_")){}else{gridList.add(checkValue(list,8,6));};
           if (checkValue(list,8,7).equals("_")){}else{gridList.add(checkValue(list,8,7));};
           if (checkValue(list,8,8).equals("_")){}else{gridList.add(checkValue(list,8,8));};
           break;   
   }//end swtich
    
    
    
   return gridList; 
}//end creategri

public ArrayList<ArrayList<String>> createGridHiddenSingles(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,int grid){
    ArrayList<ArrayList<String>> gridList = new ArrayList<>();
    String possibleValues="";
    for(int i=0; i< 9; i++){
    gridList.add(new ArrayList<String>(9));
        //gridList.get(i).add("_");//fix this later probably dont need to intialize this maybe
        }
    System.out.println("creategridhiddensingles");    
   //switch statement i know what grids we are looking for 
   switch(grid){
       case 1:// need to revist this and create the grid it neesd to be 3x3 not 9x9
           //all should be added to gridlist same as case 1
           //prolly dont have to use 3d array can ust 2d array
           //need ot update my gridlist so it takes and handles the index of zero and just search it accordinly                   
           if (checkValue(list,0,0).equals("_")){
               //trying to skip the underscore
               for(int i=1; i<list.get(0).get(0).size();i++){
               System.out.println("i"+i);
               gridList.get(0).add(getPossibleValue(list,0,0,i));
               System.out.println("index"+getPossibleValue(list,0,0,i));
               System.out.println("size"+gridList.get(0).size());
               //System.out.println(gridList.get(0).get(i));
               }//end for
           }else System.out.println("case100");
           if (checkValue(list,0,1).equals("_")){
               for(int i=1; i<list.get(0).get(1).size();i++){
               gridList.get(1).add(getPossibleValue(list,0,1,i));}//end for
               
           };
           if (checkValue(list,0,2).equals("_")){
               for(int i=1; i<list.get(0).get(2).size();i++){
               gridList.get(2).add(getPossibleValue(list,0,2,i));}//end for
           };
           if (checkValue(list,1,0).equals("_")){
               for(int i=1; i<list.get(1).get(0).size();i++){
               gridList.get(3).add(getPossibleValue(list,1,0,i));}//end for
           };
           if (checkValue(list,1,1).equals("_")){
               for(int i=1; i<list.get(1).get(1).size();i++){
               gridList.get(4).add(getPossibleValue(list,1,1,i));}//end for
           };
           if (checkValue(list,1,2).equals("_")){
               for(int i=1; i<list.get(1).get(2).size();i++){
               gridList.get(5).add(getPossibleValue(list,1,2,i));}//end for
           };           
           if (checkValue(list,2,0).equals("_")){
               for(int i=1; i<list.get(2).get(0).size();i++){
               gridList.get(6).add(getPossibleValue(list,2,0,i));}//end for
           };
           if (checkValue(list,2,1).equals("_")){
               for(int i=1; i<list.get(2).get(1).size();i++){
               gridList.get(7).add(getPossibleValue(list,2,1,i));}//end for
           };
           if (checkValue(list,2,2).equals("_")){
               for(int i=1; i<list.get(2).get(2).size();i++){
               gridList.get(8).add(getPossibleValue(list,2,2,i));}//end for
           };           
           break;
       case 2:
           if (checkValue(list,0,3).equals("_")){
               for(int i=1; i<list.get(0).get(3).size();i++){
               gridList.get(0).add(getPossibleValue(list,0,3,i));}//end for
           };
           if (checkValue(list,0,4).equals("_")){
               for(int i=1; i<list.get(0).get(4).size();i++){
               gridList.get(1).add(getPossibleValue(list,0,4,i));}//end for
           };
           if (checkValue(list,0,5).equals("_")){
               for(int i=1; i<list.get(0).get(5).size();i++){
               gridList.get(2).add(getPossibleValue(list,0,5,i));}//end for
           };
           if (checkValue(list,1,3).equals("_")){
               for(int i=1; i<list.get(1).get(3).size();i++){
               gridList.get(3).add(getPossibleValue(list,1,3,i));}//end for
           };
           if (checkValue(list,1,4).equals("_")){
               for(int i=1; i<list.get(1).get(4).size();i++){
               gridList.get(4).add(getPossibleValue(list,1,4,i));}//end for
           };
           if (checkValue(list,1,5).equals("_")){
               for(int i=1; i<list.get(1).get(5).size();i++){
               gridList.get(5).add(getPossibleValue(list,1,5,i));}//end for
           };           
           if (checkValue(list,2,3).equals("_")){
               for(int i=1; i<list.get(2).get(3).size();i++){
               gridList.get(6).add(getPossibleValue(list,2,3,i));}//end for
           };
           if (checkValue(list,2,4).equals("_")){
               for(int i=1; i<list.get(2).get(4).size();i++){
               gridList.get(7).add(getPossibleValue(list,2,4,i));}//end for
           };
           if (checkValue(list,2,5).equals("_")){
               for(int i=1; i<list.get(2).get(5).size();i++){
               gridList.get(8).add(getPossibleValue(list,2,5,i));}//end for
           };           
           break;          
       case 3:
           if (checkValue(list,0,6).equals("_")){
               for(int i=1; i<list.get(0).get(6).size();i++){
               gridList.get(0).add(getPossibleValue(list,0,6,i));}//end for
           };
           if (checkValue(list,0,7).equals("_")){
               for(int i=1; i<list.get(0).get(7).size();i++){
               gridList.get(1).add(getPossibleValue(list,0,7,i));}//end for
           };
           if (checkValue(list,0,8).equals("_")){
               for(int i=1; i<list.get(0).get(8).size();i++){
               gridList.get(2).add(getPossibleValue(list,0,8,i));}//end for
           };
           if (checkValue(list,1,6).equals("_")){
               for(int i=1; i<list.get(1).get(6).size();i++){
               gridList.get(3).add(getPossibleValue(list,1,6,i));}//end for
           };
           if (checkValue(list,1,7).equals("_")){
               for(int i=1; i<list.get(1).get(7).size();i++){
               gridList.get(4).add(getPossibleValue(list,1,7,i));}//end for
           };
           if (checkValue(list,1,8).equals("_")){
               for(int i=1; i<list.get(1).get(8).size();i++){
               gridList.get(5).add(getPossibleValue(list,1,8,i));}//end for
           };           
           if (checkValue(list,2,6).equals("_")){
               for(int i=1; i<list.get(2).get(6).size();i++){
               gridList.get(6).add(getPossibleValue(list,2,6,i));}//end for
           };
           if (checkValue(list,2,7).equals("_")){
               for(int i=1; i<list.get(2).get(7).size();i++){
               gridList.get(7).add(getPossibleValue(list,2,7,i));}//end for
           };
           if (checkValue(list,2,8).equals("_")){
               for(int i=1; i<list.get(2).get(8).size();i++){
               gridList.get(8).add(getPossibleValue(list,2,8,i));}//end for
           };           
           break;
       case 4:
           if (checkValue(list,3,0).equals("_")){
               for(int i=1; i<list.get(3).get(0).size();i++){
               gridList.get(0).add(getPossibleValue(list,3,0,i));}//end for
           };
           if (checkValue(list,3,1).equals("_")){
               for(int i=1; i<list.get(3).get(1).size();i++){
               gridList.get(1).add(getPossibleValue(list,3,1,i));}//end for
           };
           if (checkValue(list,3,2).equals("_")){
               for(int i=1; i<list.get(3).get(2).size();i++){
               gridList.get(2).add(getPossibleValue(list,3,2,i));}//end for
           };
           if (checkValue(list,4,0).equals("_")){
               for(int i=1; i<list.get(4).get(0).size();i++){
               gridList.get(3).add(getPossibleValue(list,4,0,i));}//end for
           };
           if (checkValue(list,4,1).equals("_")){
               for(int i=1; i<list.get(4).get(1).size();i++){
               gridList.get(4).add(getPossibleValue(list,4,1,i));}//end for
           };
           if (checkValue(list,4,2).equals("_")){
               for(int i=1; i<list.get(4).get(2).size();i++){
               gridList.get(5).add(getPossibleValue(list,4,2,i));}//end for
           };           
           if (checkValue(list,5,0).equals("_")){
               for(int i=1; i<list.get(5).get(0).size();i++){
               gridList.get(6).add(getPossibleValue(list,5,0,i));}//end for
           };
           if (checkValue(list,5,1).equals("_")){
               for(int i=1; i<list.get(5).get(1).size();i++){
               gridList.get(7).add(getPossibleValue(list,5,1,i));}//end for
           };
           if (checkValue(list,5,2).equals("_")){
               for(int i=1; i<list.get(5).get(2).size();i++){
               gridList.get(8).add(getPossibleValue(list,5,2,i));}//end for
           };           
           break;
       case 5:
           if (checkValue(list,3,3).equals("_")){
               for(int i=1; i<list.get(3).get(3).size();i++){
               gridList.get(0).add(getPossibleValue(list,3,3,i));}//end for
           };
           if (checkValue(list,3,4).equals("_")){
               for(int i=1; i<list.get(3).get(4).size();i++){
               gridList.get(1).add(getPossibleValue(list,3,4,i));}//end for
           };
           if (checkValue(list,3,5).equals("_")){
               for(int i=1; i<list.get(3).get(5).size();i++){
               gridList.get(2).add(getPossibleValue(list,3,5,i));}//end for
           };
           if (checkValue(list,4,3).equals("_")){
               for(int i=1; i<list.get(4).get(3).size();i++){
               gridList.get(3).add(getPossibleValue(list,4,3,i));}//end for
           };
           if (checkValue(list,4,4).equals("_")){
               for(int i=1; i<list.get(4).get(4).size();i++){
               gridList.get(4).add(getPossibleValue(list,4,4,i));}//end for
           };
           if (checkValue(list,4,5).equals("_")){
               for(int i=1; i<list.get(4).get(5).size();i++){
               gridList.get(5).add(getPossibleValue(list,4,5,i));}//end for
           };           
           if (checkValue(list,5,3).equals("_")){
               for(int i=1; i<list.get(5).get(3).size();i++){
               gridList.get(6).add(getPossibleValue(list,5,3,i));}//end for
           };
           if (checkValue(list,5,4).equals("_")){
               for(int i=1; i<list.get(5).get(4).size();i++){
               gridList.get(7).add(getPossibleValue(list,5,4,i));}//end for
           };
           if (checkValue(list,5,5).equals("_")){
               for(int i=1; i<list.get(5).get(5).size();i++){
               gridList.get(8).add(getPossibleValue(list,5,5,i));}//end for
           };           
           break;
       case 6:
           if (checkValue(list,3,6).equals("_")){
               for(int i=1; i<list.get(3).get(6).size();i++){
               gridList.get(0).add(getPossibleValue(list,3,6,i));}//end for
           };
           if (checkValue(list,3,7).equals("_")){
               for(int i=1; i<list.get(3).get(7).size();i++){
               gridList.get(1).add(getPossibleValue(list,3,7,i));}//end for
           };
           if (checkValue(list,3,8).equals("_")){
               for(int i=1; i<list.get(3).get(8).size();i++){
               gridList.get(2).add(getPossibleValue(list,3,8,i));}//end for
           };
           if (checkValue(list,4,6).equals("_")){
               for(int i=1; i<list.get(4).get(6).size();i++){
               gridList.get(3).add(getPossibleValue(list,4,6,i));}//end for
           };
           if (checkValue(list,4,7).equals("_")){
               for(int i=1; i<list.get(4).get(7).size();i++){
               gridList.get(4).add(getPossibleValue(list,4,7,i));}//end for
           };
           if (checkValue(list,4,8).equals("_")){
               for(int i=1; i<list.get(4).get(8).size();i++){
               gridList.get(5).add(getPossibleValue(list,4,8,i));}//end for
           };           
           if (checkValue(list,5,6).equals("_")){
               for(int i=1; i<list.get(5).get(6).size();i++){
               gridList.get(6).add(getPossibleValue(list,5,6,i));}//end for
           };
           if (checkValue(list,5,7).equals("_")){
               for(int i=1; i<list.get(5).get(7).size();i++){
               gridList.get(7).add(getPossibleValue(list,5,2,i));}//end for
           };
           if (checkValue(list,5,8).equals("_")){
               for(int i=1; i<list.get(5).get(8).size();i++){
               gridList.get(8).add(getPossibleValue(list,5,8,i));}//end for
           };           
           break;
       case 7:
           if (checkValue(list,6,0).equals("_")){
               for(int i=1; i<list.get(6).get(0).size();i++){
               gridList.get(0).add(getPossibleValue(list,6,0,i));}//end for
           };
           if (checkValue(list,6,1).equals("_")){
               for(int i=1; i<list.get(6).get(1).size();i++){
               gridList.get(1).add(getPossibleValue(list,6,1,i));}//end for
           };
           if (checkValue(list,6,2).equals("_")){
               for(int i=1; i<list.get(6).get(2).size();i++){
               gridList.get(2).add(getPossibleValue(list,6,2,i));}//end for
           };
           if (checkValue(list,7,0).equals("_")){
               for(int i=1; i<list.get(7).get(0).size();i++){
               gridList.get(3).add(getPossibleValue(list,7,0,i));}//end for
           };
           if (checkValue(list,7,1).equals("_")){
               for(int i=1; i<list.get(7).get(1).size();i++){
               gridList.get(4).add(getPossibleValue(list,7,1,i));}//end for
           };
           if (checkValue(list,7,2).equals("_")){
               for(int i=1; i<list.get(7).get(2).size();i++){
               gridList.get(5).add(getPossibleValue(list,7,2,i));}//end for
           };           
           if (checkValue(list,8,0).equals("_")){
               for(int i=1; i<list.get(8).get(0).size();i++){
               gridList.get(6).add(getPossibleValue(list,8,0,i));}//end for
           };
           if (checkValue(list,8,1).equals("_")){
               for(int i=1; i<list.get(8).get(1).size();i++){
               gridList.get(7).add(getPossibleValue(list,8,2,i));}//end for
           };
           if (checkValue(list,8,2).equals("_")){
               for(int i=1; i<list.get(8).get(2).size();i++){
               gridList.get(8).add(getPossibleValue(list,8,2,i));}//end for
           };           
           break;
       case 8:
           if (checkValue(list,6,3).equals("_")){
               for(int i=1; i<list.get(6).get(3).size();i++){
               gridList.get(0).add(getPossibleValue(list,6,3,i));}//end for
           };
           if (checkValue(list,6,4).equals("_")){
               for(int i=1; i<list.get(6).get(4).size();i++){
               gridList.get(1).add(getPossibleValue(list,6,4,i));}//end for
           };
           if (checkValue(list,6,5).equals("_")){
               for(int i=1; i<list.get(6).get(5).size();i++){
               gridList.get(2).add(getPossibleValue(list,6,5,i));}//end for
           };
           if (checkValue(list,7,3).equals("_")){
               for(int i=1; i<list.get(7).get(3).size();i++){
               gridList.get(3).add(getPossibleValue(list,7,3,i));}//end for
           };
           if (checkValue(list,7,4).equals("_")){
               for(int i=1; i<list.get(7).get(4).size();i++){
               gridList.get(4).add(getPossibleValue(list,7,4,i));}//end for
           };
           if (checkValue(list,7,5).equals("_")){
               for(int i=1; i<list.get(7).get(5).size();i++){
               gridList.get(5).add(getPossibleValue(list,7,5,i));}//end for
           };           
           if (checkValue(list,8,3).equals("_")){
               for(int i=1; i<list.get(8).get(3).size();i++){
               gridList.get(6).add(getPossibleValue(list,8,3,i));}//end for
           };
           if (checkValue(list,8,4).equals("_")){
               for(int i=1; i<list.get(8).get(4).size();i++){
               gridList.get(7).add(getPossibleValue(list,8,4,i));}//end for
           };
           if (checkValue(list,8,5).equals("_")){
               for(int i=1; i<list.get(8).get(5).size();i++){
               gridList.get(8).add(getPossibleValue(list,8,5,i));}//end for
           };           
           break;
       case 9://DONE WORK YOUR WAY UP
           if (checkValue(list,6,6).equals("_")){
               for(int i=1; i<list.get(6).get(6).size();i++){
               gridList.get(0).add(getPossibleValue(list,6,6,i));}//end for
           };
           if (checkValue(list,6,7).equals("_")){
               for(int i=1; i<list.get(6).get(7).size();i++){
               gridList.get(1).add(getPossibleValue(list,6,7,i));}//end for
           };
           if (checkValue(list,6,8).equals("_")){
               for(int i=1; i<list.get(6).get(8).size();i++){
               gridList.get(2).add(getPossibleValue(list,6,8,i));}//end for
           };
           if (checkValue(list,7,6).equals("_")){
               for(int i=1; i<list.get(7).get(6).size();i++){
               gridList.get(3).add(getPossibleValue(list,7,6,i));}//end for
           };
           if (checkValue(list,7,7).equals("_")){
               for(int i=1; i<list.get(7).get(7).size();i++){
               gridList.get(4).add(getPossibleValue(list,7,7,i));}//end for
           };
           if (checkValue(list,7,8).equals("_")){
               for(int i=1; i<list.get(7).get(8).size();i++){
               gridList.get(5).add(getPossibleValue(list,7,8,i));}//end for
           };           
           if (checkValue(list,8,6).equals("_")){
               for(int i=1; i<list.get(8).get(6).size();i++){
               gridList.get(6).add(getPossibleValue(list,8,6,i));}//end for
           };
           if (checkValue(list,8,7).equals("_")){
               for(int i=1; i<list.get(8).get(7).size();i++){
               gridList.get(7).add(getPossibleValue(list,8,7,i));}//end for
           };
           if (checkValue(list,8,8).equals("_")){
               for(int i=1; i<list.get(8).get(8).size();i++){
               gridList.get(8).add(getPossibleValue(list,8,8,i));}//end for
           };           
           break;
                  
           
   }//end swithc
    
   return gridList;
    }//end craat gridhiddne singles




ArrayList<String> ArrayListHiddenSingles = new ArrayList<>();

public ArrayList<String> createArrayListHiddenSingles(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,int grid){
    ArrayList<String> HiddenSinglesAL = new ArrayList<>();
    String possibleValues="";
    System.out.println("createhiddensinglesAL");    
    HiddenSinglesAL.clear();
   //switch statement i know what grids we are looking for 
   switch(grid){
       case 1:// need to revist this and create the grid it neesd to be 3x3 not 9x9
           //all should be added to gridlist same as case 1
           //prolly dont have to use 3d array can ust 2d array
           //need ot update my gridlist so it takes and handles the index of zero and just search it accordinly                   
           if (checkValue(list,0,0).equals("_") && x == 0 && y == 0){
                }else{
               //trying to skip the underscore
               //insert else statement so i can not add if above is true but add if it isnt 
               for(int i=1; i<list.get(0).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,0,i));
               System.out.println("index"+getPossibleValue(list,0,0,i));}//end for
           };
           if (checkValue(list,0,1).equals("_") && x == 0 && y == 1){
                }else{
               for(int i=1; i<list.get(0).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,1,i));}//end for               
           };
           if (checkValue(list,0,2).equals("_") && x == 0 && y == 2){
                }else{
               for(int i=1; i<list.get(0).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,2,i));}//end for
           };
           if (checkValue(list,1,0).equals("_") && x == 1 && y == 0){
                }else{
               for(int i=1; i<list.get(1).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,0,i));}//end for
           };
           if (checkValue(list,1,1).equals("_") && x == 1 && y == 1){
                }else{
               for(int i=1; i<list.get(1).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,1,i));}//end for
           };
           if (checkValue(list,1,2).equals("_") && x == 1 && y == 2){
                }else{
               for(int i=1; i<list.get(1).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,2,i));}//end for
           };           
           if (checkValue(list,2,0).equals("_") && x == 2 && y == 0){
                }else{
               for(int i=1; i<list.get(2).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,0,i));}//end for
           };
           if (checkValue(list,2,1).equals("_") && x == 2 && y == 1){
                }else{
               for(int i=1; i<list.get(2).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,1,i));}//end for
           };
           if (checkValue(list,2,2).equals("_") && x == 2 && y == 2){
                }else{
               for(int i=1; i<list.get(2).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,2,i));}//end for
           };           
           break;
        case 2:
           if (checkValue(list,0,3).equals("_")&& x == 0 && y == 3){
                }else{
               for(int i=1; i<list.get(0).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,3,i));}//end for
           };
           if (checkValue(list,0,4).equals("_")&& x == 0 && y == 4){
                }else{
               for(int i=1; i<list.get(0).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,4,i));}//end for
           };
           if (checkValue(list,0,5).equals("_")&& x == 0 && y == 5){
                }else{
               for(int i=1; i<list.get(0).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,5,i));}//end for
           };
           if (checkValue(list,1,3).equals("_")&& x == 1 && y == 3){
                }else{
               for(int i=1; i<list.get(1).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,3,i));}//end for
           };
           if (checkValue(list,1,4).equals("_")&& x == 1 && y == 4){
                }else{
               for(int i=1; i<list.get(1).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,4,i));}//end for
           };
           if (checkValue(list,1,5).equals("_")&& x == 1 && y == 5){
                }else{
               for(int i=1; i<list.get(1).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,5,i));}//end for
           };           
           if (checkValue(list,2,3).equals("_")&& x == 2 && y == 3){
                }else{
               for(int i=1; i<list.get(2).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,3,i));}//end for
           };
           if (checkValue(list,2,4).equals("_")&& x == 2 && y == 4){
                }else{
               for(int i=1; i<list.get(2).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,4,i));}//end for
           };
           if (checkValue(list,2,5).equals("_")&& x == 2 && y == 5){
                }else{
               for(int i=1; i<list.get(2).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,5,i));}//end for
           };           
           break;          
       case 3:
           if (checkValue(list,0,6).equals("_")&& x == 0 && y == 6){
                }else{
               for(int i=1; i<list.get(0).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,6,i));}//end for
           };
           if (checkValue(list,0,7).equals("_")&& x == 0 && y == 7){
                }else{
               for(int i=1; i<list.get(0).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,7,i));}//end for
           };
           if (checkValue(list,0,8).equals("_")&& x == 0 && y == 8){
                }else{
               for(int i=1; i<list.get(0).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,0,8,i));}//end for
           };
           if (checkValue(list,1,6).equals("_")&& x == 1 && y == 6){
                }else{
               for(int i=1; i<list.get(1).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,6,i));}//end for
           };
           if (checkValue(list,1,7).equals("_")&& x == 1 && y == 7){
                }else{
               for(int i=1; i<list.get(1).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,7,i));}//end for
           };
           if (checkValue(list,1,8).equals("_")&& x == 1 && y == 8){
                }else{
               for(int i=1; i<list.get(1).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,1,8,i));}//end for
           };           
           if (checkValue(list,2,6).equals("_")&& x == 2 && y == 6){
                }else{
               for(int i=1; i<list.get(2).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,6,i));}//end for
           };
           if (checkValue(list,2,7).equals("_")&& x == 2 && y == 7){
                }else{
               for(int i=1; i<list.get(2).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,7,i));}//end for
           };
           if (checkValue(list,2,8).equals("_")&& x == 2 && y == 8){
                }else{
               for(int i=1; i<list.get(2).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,2,8,i));}//end for
           };           
           break;
       case 4:
           if (checkValue(list,3,0).equals("_")&& x == 3 && y == 0){
                }else{
               for(int i=1; i<list.get(3).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,0,i));}//end for
           };
           if (checkValue(list,3,1).equals("_")&& x == 3 && y == 1){
                }else{
               for(int i=1; i<list.get(3).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,1,i));}//end for
           };
           if (checkValue(list,3,2).equals("_")&& x == 3 && y == 2){
                }else{
               for(int i=1; i<list.get(3).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,2,i));}//end for
           };
           if (checkValue(list,4,0).equals("_")&& x == 4 && y == 0){
                }else{
               for(int i=1; i<list.get(4).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,0,i));}//end for
           };
           if (checkValue(list,4,1).equals("_")&& x == 4 && y == 1){
                }else{
               for(int i=1; i<list.get(4).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,1,i));}//end for
           };
           if (checkValue(list,4,2).equals("_")&& x == 4 && y == 2){
                }else{
               for(int i=1; i<list.get(4).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,2,i));}//end for
           };           
           if (checkValue(list,5,0).equals("_")&& x == 5 && y == 0){
                }else{
               for(int i=1; i<list.get(5).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,0,i));}//end for
           };
           if (checkValue(list,5,1).equals("_")&& x == 5 && y == 1){
                }else{
               for(int i=1; i<list.get(5).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,1,i));}//end for
           };
           if (checkValue(list,5,2).equals("_")&& x == 5 && y == 2){
                }else{
               for(int i=1; i<list.get(5).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,2,i));}//end for
           };           
           break;
       case 5:
           if (checkValue(list,3,3).equals("_")&& x == 3 && y == 3){
                }else{
               for(int i=1; i<list.get(3).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,3,i));}//end for
           };
           if (checkValue(list,3,4).equals("_")&& x == 3 && y == 4){
                }else{
               for(int i=1; i<list.get(3).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,4,i));}//end for
           };
           if (checkValue(list,3,5).equals("_")&& x == 3 && y == 5){
                }else{
               for(int i=1; i<list.get(3).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,5,i));}//end for
           };
           if (checkValue(list,4,3).equals("_")&& x == 4 && y == 3){
                }else{
               for(int i=1; i<list.get(4).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,3,i));}//end for
           };
           if (checkValue(list,4,4).equals("_")&& x == 4 && y == 4){
                }else{
               for(int i=1; i<list.get(4).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,4,i));}//end for
           };
           if (checkValue(list,4,5).equals("_")&& x == 4 && y == 5){
                }else{
               for(int i=1; i<list.get(4).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,5,i));}//end for
           };           
           if (checkValue(list,5,3).equals("_")&& x == 5 && y == 3){
                }else{
               for(int i=1; i<list.get(5).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,3,i));}//end for
           };
           if (checkValue(list,5,4).equals("_")&& x == 5 && y == 4){
                }else{
               for(int i=1; i<list.get(5).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,4,i));}//end for
           };
           if (checkValue(list,5,5).equals("_")&& x == 5 && y == 5){
                }else{
               for(int i=1; i<list.get(5).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,5,i));}//end for
           };           
           break;
       case 6:
           if (checkValue(list,3,6).equals("_")&& x == 3 && y == 6){
                }else{
               for(int i=1; i<list.get(3).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,6,i));}//end for
           };
           if (checkValue(list,3,7).equals("_")&& x == 3 && y == 7){
                }else{
               for(int i=1; i<list.get(3).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,7,i));}//end for
           };
           if (checkValue(list,3,8).equals("_")&& x == 3 && y == 8){
                }else{
               for(int i=1; i<list.get(3).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,3,8,i));}//end for
           };
           if (checkValue(list,4,6).equals("_")&& x == 4 && y == 6){
                }else{
               for(int i=1; i<list.get(4).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,6,i));}//end for
           };
           if (checkValue(list,4,7).equals("_")&& x == 4 && y == 7){
                }else{
               for(int i=1; i<list.get(4).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,7,i));}//end for
           };
           if (checkValue(list,4,8).equals("_")&& x == 4 && y == 8){
                }else{
               for(int i=1; i<list.get(4).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,4,8,i));}//end for
           };           
           if (checkValue(list,5,6).equals("_")&& x == 5 && y == 6){
                }else{
               for(int i=1; i<list.get(5).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,6,i));}//end for
           };
           if (checkValue(list,5,7).equals("_")&& x == 5 && y == 7){
                }else{
               for(int i=1; i<list.get(5).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,2,i));}//end for
           };
           if (checkValue(list,5,8).equals("_")&& x == 5 && y == 8){
                }else{
               for(int i=1; i<list.get(5).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,5,8,i));}//end for
           };           
           break;
       case 7:
           if (checkValue(list,6,0).equals("_")&& x == 6 && y == 0){
                }else{
               for(int i=1; i<list.get(6).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,0,i));}//end for
           };
           if (checkValue(list,6,1).equals("_")&& x == 6 && y == 1){
                }else{
               for(int i=1; i<list.get(6).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,1,i));}//end for
           };
           if (checkValue(list,6,2).equals("_")&& x == 6 && y == 2){
                }else{
               for(int i=1; i<list.get(6).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,2,i));}//end for
           };
           if (checkValue(list,7,0).equals("_")&& x == 7 && y == 0){
                }else{
               for(int i=1; i<list.get(7).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,0,i));}//end for
           };
           if (checkValue(list,7,1).equals("_")&& x == 7 && y == 1){
                }else{
               for(int i=1; i<list.get(7).get(1).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,1,i));}//end for
           };
           if (checkValue(list,7,2).equals("_")&& x == 7 && y == 2){
                }else{
               for(int i=1; i<list.get(7).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,2,i));}//end for
           };           
           if (checkValue(list,8,0).equals("_")&& x == 8 && y == 0){
                }else{
               for(int i=1; i<list.get(8).get(0).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,0,i));}//end for
           };
           if (checkValue(list,8,1).equals("_")&& x == 8 && y == 1){
                }else{
               for(int i=1; i<list.get(8).get(1).size();i++){
                 HiddenSinglesAL.add(getPossibleValue(list,8,1,i));}//end for
           };
           if (checkValue(list,8,2).equals("_")&& x == 8 && y == 2){
                }else{
               for(int i=1; i<list.get(8).get(2).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,2,i));}//end for
           };           
           break;
       case 8:
           if (checkValue(list,6,3).equals("_")&& x == 6 && y == 3){
                }else{
               for(int i=1; i<list.get(6).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,3,i));}//end for
           };
           if (checkValue(list,6,4).equals("_")&& x == 6 && y == 4){
                }else{
               for(int i=1; i<list.get(6).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,4,i));}//end for
           };
           if (checkValue(list,6,5).equals("_")&& x == 6 && y == 5){
                }else{
               for(int i=1; i<list.get(6).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,5,i));}//end for
           };
           if (checkValue(list,7,3).equals("_")&& x == 7 && y == 3){
                }else{
               for(int i=1; i<list.get(7).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,3,i));}//end for
           };
           if (checkValue(list,7,4).equals("_")&& x == 7 && y == 4){
                }else{
               for(int i=1; i<list.get(7).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,4,i));}//end for
           };
           if (checkValue(list,7,5).equals("_")&& x == 7 && y == 5){
                }else{
               for(int i=1; i<list.get(7).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,5,i));}//end for
           };           
           if (checkValue(list,8,3).equals("_")&& x == 8 && y == 3){
                }else{
               for(int i=1; i<list.get(8).get(3).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,3,i));}//end for
           };
           if (checkValue(list,8,4).equals("_")&& x == 8 && y == 4){
                }else{
               for(int i=1; i<list.get(8).get(4).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,4,i));}//end for
           };
           if (checkValue(list,8,5).equals("_")&& x == 8 && y == 5){
                }else{
               for(int i=1; i<list.get(8).get(5).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,5,i));}//end for
           };           
           break;
       case 9://DONE WORK YOUR WAY UP
           if (checkValue(list,6,6).equals("_")&& x == 6 && y == 6){
                }else{
               for(int i=1; i<list.get(6).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,6,i));}//end for
           };
           if (checkValue(list,6,7).equals("_")&& x == 6 && y == 7){
                }else{
               for(int i=1; i<list.get(6).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,7,i));}//end for
           };
           if (checkValue(list,6,8).equals("_")&& x == 6 && y == 8){
                }else{
               for(int i=1; i<list.get(6).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,6,8,i));}//end for
           };
           if (checkValue(list,7,6).equals("_")&& x == 7 && y == 6){
                }else{
               for(int i=1; i<list.get(7).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,6,i));}//end for
           };
           if (checkValue(list,7,7).equals("_")&& x == 7 && y == 7){
                }else{
               for(int i=1; i<list.get(7).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,7,i));}//end for
           };
           if (checkValue(list,7,8).equals("_")&& x == 7 && y == 8){
                }else{
               for(int i=1; i<list.get(7).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,7,8,i));}//end for
           };           
           if (checkValue(list,8,6).equals("_")&& x == 8 && y == 6){
                }else{
               for(int i=1; i<list.get(8).get(6).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,6,i));}//end for
           };
           if (checkValue(list,8,7).equals("_")&& x == 8 && y == 7){
                }else{
               for(int i=1; i<list.get(8).get(7).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,7,i));}//end for
           };
           if (checkValue(list,8,8).equals("_")&& x == 8 && y == 8){
                }else{
               for(int i=1; i<list.get(8).get(8).size();i++){
               HiddenSinglesAL.add(getPossibleValue(list,8,8,i));}//end for
           };           
           break;
       
           
   }//end swithc
    
   return HiddenSinglesAL;
    }//end craat gridhiddne singles

//create specific array list i might need
ArrayList<String> rowList = new ArrayList<>();
ArrayList<String> colList = new ArrayList<>(); //may not need these
//ArrayList<ArrayList<ArrayList<String>>> masterArrayList = new ArrayList<>();

public void checkAll(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,int z,int grid){
    //creat for loop to run check cell
}//end check all

public void checkCell(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,ArrayList<ArrayList<Integer>> gridList){
    //create arraylist declared outside
    //gridList = createGrid(list,x,y,grid);
    //pull cellvalue and assign to variable
    String cellValue = list.get(x).get(y).get(0);
    System.out.println("check cell ran");
    if(cellValue != "_"){
    //do nothing
    System.out.println("do nothing");
    }
    // if cell is empty and our array for possiblites is size two
    //then set index 0 = index 1 and then remove index 1
    else if(cellValue.equals("_") && list.get(x).get(y).size()==2){
        list.get(x).get(y).set(0,list.get(x).get(y).get(1));
        list.get(x).get(y).remove(1);
        System.out.println("first else if");        ;
    }//checkrow
    for(int i=1; i<list.get(x).get(y).size();i++){
        //get first possible value the compare that to each row column and gird
        //if match remove it 
        System.out.println("check row start loop");
        String possibleValue ="";
        possibleValue = getPossibleValue(list,x,y,i);
        System.out.println(possibleValue);
        //if i remove value make sure to decrement so it runs more
        System.out.println(Boolean.toString(checkRow(list,x,possibleValue)));
        if(checkRow(list,x,possibleValue)){
            System.out.println("check row remove if");
            removePossiblity(list,x,y,i);
            i--;
        }
    }//check column
    for(int k=1; k<list.get(x).get(y).size();k++){
        //get first possible value the compare that to each row column and gird
        //if match remove it 
        System.out.println("check row start loop");
        String possibleValue ="";
        possibleValue = getPossibleValue(list,x,y,k);
        //if i remove value make sure to decrement so it runs more
        if(checkColumn(list,y,possibleValue)){
            System.out.println("check column remove");
            removePossiblity(list,x,y,k);
            k--;
        }
    }//check grid
    for(int k=1; k<list.get(x).get(y).size();k++){
        //get first possible value the compare that to each row column and gird
        //if match remove it 
        System.out.println("check grid start loop");
        String possibleValue ="";
        possibleValue = getPossibleValue(list,x,y,k);
        //if i remove value make sure to decrement so it runs more
        
        if(checkGrid(list,x,y,gridList,possibleValue)){
            System.out.println("check grid remove");
            removePossiblity(list,x,y,k);
            k--;
        }
    }//hidden pairs check within a grid
    //run for loop to check for 1-9 each grid and do all the stuff in the array
    //hidden singles compare all availales in a grid if there is a unique possible 
    //it must be taht possible number
    
    
    
}//end checkcell method 
//get possiblevalue done
public String getPossibleValue(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,int z){
    String str="";
        str=list.get(x).get(y).get(z);
    return str;
}
public String getPossibleValueList(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,int z){
    String str="";
        str=list.get(x).get(y).get(z);
    return str;
}

public static void removePossiblity(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y,int z){
    list.get(x).get(y).remove(z);
    System.out.println("removeposibility processing");
}

public static void setValue(){
}//end setvalue
//check row done
public boolean checkRow(ArrayList<ArrayList<ArrayList<String>>> list, int row, String test){
    boolean bool = false;
    String str ="";
    for(int i=0; i<9 ; i++){
        if((list.get(row).get(i).get(0))== null){
        continue;
        }
        str = list.get(row).get(i).get(0);
        System.out.println("checkrow str pv");
        System.out.println(str);
        System.out.println("test printout");
        System.out.println(test);
        if((list.get(row).get(i).get(0)).equals("_")){
        //if blank do nothing
        System.out.println("check row do nothing");
       
        }else if(test.equals(str)){    
        bool = true;
         System.out.println("checkrowTrue");
        }    }
    return bool;
}//end checkrow method
//check column done
public boolean checkColumn(ArrayList<ArrayList<ArrayList<String>>> list, int col, String test){
    boolean bool = false;
    String str ="";
    for(int i=0; i<9 ; i++){
        if((list.get(i).get(col).get(0))== null){
        continue;
        }
        str = list.get(i).get(col).get(0);
        if((list.get(i).get(col).get(0)).equals("_")){
        //if blank do nothing
        }else if(test.equals(str)){    
        bool = true;
        }    }
    return bool;
}//end checkrow method

public static boolean checkGrid(ArrayList<ArrayList<ArrayList<String>>> list, int row, int col,ArrayList<ArrayList<Integer>> gridList,String test){
   // ArrayList<ArrayList<ArrayList<String>>> masterArrayList = new ArrayList<>();
   ArrayList<String> gridArray = new ArrayList<>();
   boolean bool = false;
   String str ="";
   //which grid we working with
   int grid = gridList.get(row).get(col);
   //create arraylist for gridarray
   gridArray = createGrid(list,row,col,grid);
       for(int i=0; i<gridArray.size() ; i++){
    if((gridArray.get(i))== null){
        continue;
        }
    str = gridArray.get(i);
    if(gridArray.get(i).equals("_")){
        //if blank do nothing
        }else if(test.equals(str)){    
        bool = true;
        }    }
   return bool;
   //need to use the value of the cell and then see if its in an array of grid locations then pull that gridarray to check
}//end checkgrid method
//Hidden singles in a grid
public void checkHiddenSingles(ArrayList<ArrayList<ArrayList<String>>> list, int row, int col,ArrayList<ArrayList<Integer>> gridList,String test,int grid,ArrayList<ArrayList<ArrayList<Integer>>> whichGrid){
    System.out.println("CheckHiddenSingles");    
    //pick a grid
    int gridNum=  whichGrid.get(row).get(col).get(0);
    System.out.print("grid number");
    System.out.println(Integer.toString(gridNum));
    ArrayList<ArrayList<String>> singlesList = new ArrayList<>();
    singlesList = createGridHiddenSingles(list,row,col,gridNum);
    printHiddensingles(singlesList);
    System.out.println("after singles creation");
        //might input row from the for loop in the main method?
        //naa put this ina for loop to run through rows
        //need to rewrite this to run for each value check
        //we check each cell when we check the cell we will pass the location of cell
        //to method and the method will build the grid array and run the check.
        //if not found it will use the location to remove the items from the array
        // and update the index for the value not found 
        //we can build a holder variable to assign the value to index zero after
        //we clear the possiblevalues arraylist
        System.out.println("after singlesList");
        String possibleValue =""; 
        boolean valueIsSingle = true; //this needs to be thought out 
        for(int i=0; i<9;i++){//run this loop for each row in the array
    if(singlesList.get(i).size()>0){//if possiblelist is full do it else do nothing
        for(int k=0; k<singlesList.get(i).size();k++){//so skip first one skipt fits not necessary any more
        //get first possible value the compare that to each row column and gird
        //if match remove it 
        System.out.println("check single start loop");
        //get possible values manually
        possibleValue = singlesList.get(i).get(k);
        valueIsSingle = true;
        //this true setting statement eneds to be in the loop
        System.out.println("i "+i);    
        System.out.println("k "+k);    
        System.out.println("Possible value "+possibleValue);
        //if i remove value make sure to decrement so it runs more
        //if no match update thats index 
          for(int g=0; g<9;g++){
              System.out.println("row "+g);
              if(i==g){//something is wrong with this statement to skip first
                  //should just do a check for row and remove that row like
                  //if statement
                  System.out.println("Continue");
              continue;}//lets swap i and g 
             // if(possibleValue.equals(singlesList.get(i).get(g))){
             //     break;
          //end/
                if(singlesList.get(g).contains(possibleValue)){
                  valueIsSingle = false;
                  System.out.println("value is single "+ valueIsSingle);
              }
                if(g==8 && valueIsSingle == true){//should also prolly break the loop?   
                    System.out.println("ValueIsSingle WHOOHOOOO");
                    for(int m=1; m<list.get(row).get(col).size();m++){
                list.get(row).get(col).remove((list.get(row).get(col).size())-1);
                }//on final loop if valueissingle is true then set the value and clear possible
                break;      
                }
                //this isnt working
                //maybe take a value and compare against all other arrays in the array simulteously
                // take a value check next array if it contains
                //then check the next and next and next.
                //once we check all the arrays then we determine if its a single
                //if its a single then we will update its possible values.s
              //need for loop for the row im processesing
            /*  for(int p=0; p<singlesList.get(g).size(); p++){
                  //if(possibleValue.equals(singlesList.get(g).get(p))){
                  if(singlesList.get(g).contains(possibleValue)){
                  System.out.println(singlesList.get(g).get(p));
                  valueIsSingle = false;
                  System.out.println("value is single "+ valueIsSingle);
              }                
    }     */  
}

    }
    }       
}
    //then scan all possible values except itself if you find a unique value assign it to
    //index 0 and then remove all other possibles from that cell
    //create arrays for all possible values in a specific grid
    //pick the first value of first array
    //compare that value to all other values. if no match then set that 
    //cells possible list index[0] to that check value and drop all other values 
    //in that list so the size is 1.
}

public void checkHiddenSinglesTest(ArrayList<ArrayList<ArrayList<String>>> list, int row, int col,ArrayList<ArrayList<Integer>> gridList,String test,int grid,ArrayList<ArrayList<ArrayList<Integer>>> whichGrid){    
    if((list.get(row).get(col).get(0)).equals("_")){
    //pick a grid
    int gridNum = whichGrid.get(row).get(col).get(0);
    //generate singles list for the grid specific to x,y
    ArrayList<String> singlesList = new ArrayList<>();
    singlesList = createArrayListHiddenSingles(list,row,col,gridNum);
        for(int p=0; p<singlesList.size();p++){
        System.out.println("Singles list");
        System.out.println(singlesList.get(p));}
        String possibleValue =""; 
        boolean valueIsSingle = true;
        for(int i=1; i<list.get(row).get(col).size(); i++){//pick each possible value for x,y
        possibleValue = getPossibleValue(list,row,col,i);
        System.out.println("Possible Value");
        System.out.println(possibleValue);         
                if(singlesList.contains(possibleValue)){              
                } else{
                    list.get(row).get(col).clear();
                    list.get(row).get(col).add(possibleValue);
                    System.out.println(list.get(row).get(col).get(0));
                    i = list.get(row).get(col).size();
                }
            
    }    
    }//endif
}

static String checkValue(ArrayList<ArrayList<ArrayList<String>>> list, int x, int y){
    //3rd index is always zero because thats were i store the value of the cell
    return list.get(x).get(y).get(0);
    
}//end checkValue
//put all labels into an arraylist
//set labels
//this setLablels is complete
static void setLabels(ArrayList<Label> labelList,ArrayList<ArrayList<ArrayList<String>>> list){
    String str ="";
    int index = 0;
    Label label = new Label();
    for(int j = 0; j< 9  ; j++){
        System.out.println();
        for(int k = 0; k<9; k++){
            str=list.get(j).get(k).get(0);
            label=labelList.get(index);
            label.setText(str);
            index++;
        }
    }      
}

public void printHiddensingles(ArrayList<ArrayList<String>> hiddenSinglesList){
    System.out.println("Printing hiddensingles array");
    for(int i = 0; i < 9 ; i++){
        System.out.println("index" + i);
        for(int f=0; f< hiddenSinglesList.get(i).size(); f++){
            System.out.println(hiddenSinglesList.get(i).get(f));
        }
    }

}

public void printPossibleArray(ArrayList<ArrayList<ArrayList<String>>> list){
    for(int j = 0; j< 9  ; j++){
        System.out.println();
        System.out.println("row"+j);
        System.out.println();

        for(int k = 0; k<9; k++){
                for(int q = 1; q < list.get(j).get(k).size(); q++){
                System.out.print(getPossibleValue(list,j,k,q));
                
                }  
        System.out.print("Next");      
        }
    }   
}

public boolean isDone(int row, int col,ArrayList<ArrayList<ArrayList<String>>> list){
    boolean bool = false;
    
    for(int i = 0; i<9; i++){
        for(int j=0; j<9; j++){
            if(list.get(i).get(j).get(0) == "_"){
                break;
            }else if(i==8 && j==8){
            bool = true;}
        }//inner for
    }//outer for
return bool;
}


}//end sudoku class
