package com.destiny.gamegerbanglogika.Model.Kategorikal.OR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class OrModel5 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.normal_1_2_or_mati),
                    String.valueOf(R.drawable.normal_1_2_or_nyala),
                    "AND",
                    "XOR",
                    "NAND",
                    "AND"
            },
            {"2",
                    String.valueOf(R.drawable.hard_6_or_mati),
                    String.valueOf(R.drawable.hard_6_or_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"3",
                    String.valueOf(R.drawable.normal_1_2_or_mati),
                    String.valueOf(R.drawable.normal_1_2_or_nyala),
                    "XOR",
                    "XNOR",
                    "NAND",
                    "XNOR"
            },
            {"4",
                    String.valueOf(R.drawable.normal_3_or_mati),
                    String.valueOf(R.drawable.normal_3_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "AND"
            },
            {"5",
                    String.valueOf(R.drawable.normal_4_or_mati),
                    String.valueOf(R.drawable.normal_4_or_nyala),
                    "NAND",
                    "NOR",
                    "AND",
                    "AND"
            },
            {"6",
                    String.valueOf(R.drawable.normal_5_or_mati),
                    String.valueOf(R.drawable.normal_5_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR"
            },
            {"7",
                    String.valueOf(R.drawable.hard_4_5_or_mati),
                    String.valueOf(R.drawable.hard_4_5_or_nyala),
                    "XOR",
                    "AND",
                    "XNOR",
                    "XOR"
            },
            {"8",
                    String.valueOf(R.drawable.normal_6_or_mati),
                    String.valueOf(R.drawable.normal_6_or_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR"
            },
            {"9",
                    String.valueOf(R.drawable.easy_on_off_mati),
                    String.valueOf(R.drawable.easy_on_off_nyala),
                    "AND",
                    "XNOR",
                    "OR",
                    "OR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_1_or_mati),
                    String.valueOf(R.drawable.hard_1_or_nyala),
                    "NAND",
                    "AND",
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
