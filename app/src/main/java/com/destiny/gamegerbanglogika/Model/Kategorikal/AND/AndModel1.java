package com.destiny.gamegerbanglogika.Model.Kategorikal.AND;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class AndModel1 {
    public static String[][] data = new String[][]{
            //Easy

            {"1",
                    String.valueOf(R.drawable.normal_5_and_mati),
                    String.valueOf(R.drawable.normal_5_and_nyala),
                    "NOR",
                    "XOR",
                    "OR",
                    "NOR"
            },
            {"2",
                    String.valueOf(R.drawable.normal_6_or_mati),
                    String.valueOf(R.drawable.normal_6_or_nyala),
                    "XOR",
                    "NAND",
                    "OR",
                    "NAND"
            },
            {"3",
                    String.valueOf(R.drawable.easy_on_on_mati),
                    String.valueOf(R.drawable.easy_on_on_nyala),
                    "NAND",
                    "AND",
                    "NOR",
                    "AND"
            },
            //Normal
            {"4",
                    String.valueOf(R.drawable.normal_2_and_mati),
                    String.valueOf(R.drawable.normal_2_and_nyala),
                    "NAND",
                    "XNOR",
                    "AND",
                    "NAND"
            },
            {"5",
                    String.valueOf(R.drawable.easy_on_on_mati),
                    String.valueOf(R.drawable.easy_on_on_nyala),
                    "AND",
                    "XOR",
                    "NOR",
                    "AND"
            },
            {"6",
                    String.valueOf(R.drawable.hard_6_and_mati),
                    String.valueOf(R.drawable.hard_6_and_nyala),
                    "NOR",
                    "OR",
                    "XNOR",
                    "OR"
            },
            //Hard
            {"7",
                    String.valueOf(R.drawable.hard_1_and_mati),
                    String.valueOf(R.drawable.hard_1_and_nyala),
                    "NOR",
                    "AND",
                    "OR",
                    "NOR"
            },
            {"8",
                    String.valueOf(R.drawable.hard_3_and_mati),
                    String.valueOf(R.drawable.hard_3_and_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "AND"
            },
            {"9",
                    String.valueOf(R.drawable.hard_4_and_mati),
                    String.valueOf(R.drawable.hard_4_and_nyala),
                    "OR",
                    "AND",
                    "XNOR",
                    "XNOR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_5_and_mati),
                    String.valueOf(R.drawable.hard_5_and_nyala),
                    "AND",
                    "XOR",
                    "XNOR",
                    "XNOR"
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
