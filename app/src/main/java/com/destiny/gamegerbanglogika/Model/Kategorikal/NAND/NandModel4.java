package com.destiny.gamegerbanglogika.Model.Kategorikal.NAND;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NandModel4 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.normal_1_2_nand_mati),
                    String.valueOf(R.drawable.normal_1_2_nand_nyala),
                    "NAND",
                    "OR",
                    "XOR",
                    "XOR"
            },
            {"2",
                    String.valueOf(R.drawable.hard_3_nand_mati),
                    String.valueOf(R.drawable.hard_3_nand_nyala),
                    "XNOR",
                    "OR",
                    "NAND",
                    "XNOR"
            },
            {"3",
                    String.valueOf(R.drawable.normal_1_2_nand_mati),
                    String.valueOf(R.drawable.normal_1_2_nand_nyala),
                    "XOR",
                    "NOR",
                    "AND",
                    "AND"
            },
            {"4",
                    String.valueOf(R.drawable.normal_3_nand_mati),
                    String.valueOf(R.drawable.normal_3_nand_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_nand_mati),
                    String.valueOf(R.drawable.normal_4_nand_nyala),
                    "XOR",
                    "NOR",
                    "XNOR",
                    "XOR"
            },
            {"6",
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "NOR",
                    "NOR",
                    "NOR"
            },
            {"7",
                    String.valueOf(R.drawable.normal_5_6_nand_mati),
                    String.valueOf(R.drawable.normal_5_6_nand_nyala),
                    "XOR",
                    "AND",
                    "NAND",
                    "AND"
            },
            {"8",
                    String.valueOf(R.drawable.hard_6_nand_mati),
                    String.valueOf(R.drawable.hard_6_nand_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
                    "NAND"
            },
            //Hard
            {"9",
                    String.valueOf(R.drawable.hard_1_nand_mati),
                    String.valueOf(R.drawable.hard_1_nand_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XOR"
            },
            {"10",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "NAND",
                    "XOR",
                    "NAND"
            },
    };
    public static ArrayList<DataModel> getListData(){
        DataModel models = null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new DataModel();
            models.setNo(aData[0]);
            models.setGambar(aData[1]);
            models.setGambar2(aData[2]);
            models.setJawaban1(aData[3]);
            models.setJawaban2(aData[4]);
            models.setJawaban3(aData[5]);
            models.setJawaban(aData[6]);
            list.add(models);
        }
        return list;
    }
}
