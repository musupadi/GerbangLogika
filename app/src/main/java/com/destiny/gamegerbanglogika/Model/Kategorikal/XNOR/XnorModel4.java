package com.destiny.gamegerbanglogika.Model.Kategorikal.XNOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class XnorModel4 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.normal_1_xnor_mati),
                    String.valueOf(R.drawable.normal_1_xnor_nyala),
                    "NOR",
                    "XNOR",
                    "XOR",
                    "XNOR"
            },
            {"2",
                    String.valueOf(R.drawable.hard_4_xnor_mati),
                    String.valueOf(R.drawable.hard_4_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "NAND"
            },
            {"3",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"4",
                    String.valueOf(R.drawable.hard_3_xnor_mati),
                    String.valueOf(R.drawable.hard_3_xnor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "NOR"
            },
            {"5",
                    String.valueOf(R.drawable.normal_2_3_xnor_mati),
                    String.valueOf(R.drawable.normal_2_3_xnor_nyala),
                    "OR",
                    "AND",
                    "XOR",
                    "XOR"
            },
            {"6",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "OR",
                    "XOR",
                    "XNOR",
                    "XNOR"
            },
            {"7",
                    String.valueOf(R.drawable.normal_4_xnor_mati),
                    String.valueOf(R.drawable.normal_4_xnor_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR"
            },
            {"8",
                    String.valueOf(R.drawable.easy_off_off_mati),
                    String.valueOf(R.drawable.easy_off_off_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "XNOR"
            },
            {"9",
                    String.valueOf(R.drawable.normal_5_xnor_mati),
                    String.valueOf(R.drawable.normal_5_xnor_nyala),
                    "OR",
                    "XNOR",
                    "NAND",
                    "NAND"
            },
            {"10",
                    String.valueOf(R.drawable.hard_1_xnor_mati),
                    String.valueOf(R.drawable.hard_1_xnor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "AND"
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
