package com.destiny.gamegerbanglogika.Model.Kategorikal.XOR;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class XorModel4 {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "XOR",
                    "XNOR",
                    "NOR",
                    "XNOR"
            },
            {"2",
                    String.valueOf(R.drawable.normal_1_2_xor_mati),
                    String.valueOf(R.drawable.normal_1_2_xor_nyala),
                    "NOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"3",
                    String.valueOf(R.drawable.normal_3_xor_mati),
                    String.valueOf(R.drawable.normal_3_xor_nyala),
                    "NOR",
                    "NAND",
                    "OR",
                    "OR"
            },
            {"4",
                    String.valueOf(R.drawable.hard_2_xor_mati),
                    String.valueOf(R.drawable.hard_2_xor_nyala),
                    "XOR",
                    "AND",
                    "NOR",
                    "AND"
            },
            {"5",
                    String.valueOf(R.drawable.normal_5_xor_mati),
                    String.valueOf(R.drawable.normal_5_xor_nyala),
                    "XNOR",
                    "AND",
                    "OR",
                    "OR"
            },
            {"6",
                    String.valueOf(R.drawable.hard_6_xor_mati),
                    String.valueOf(R.drawable.hard_6_xor_nyala),
                    "AND",
                    "NAND",
                    "NOR",
                    "NAND"
            },
            {"7",
                    String.valueOf(R.drawable.normal_6_xor_mati),
                    String.valueOf(R.drawable.normal_6_xor_nyala),
                    "AND",
                    "NOR",
                    "XOR",
                    "AND"
            },
            {"8",
                    String.valueOf(R.drawable.normal_4_xor_mati),
                    String.valueOf(R.drawable.normal_4_xor_nyala),
                    "NAND",
                    "XNOR",
                    "NOR",
                    "NAND"
            },
            {"9",
                    String.valueOf(R.drawable.easy_on_off_mati),
                    String.valueOf(R.drawable.easy_on_off_nyala),
                    "NOR",
                    "AND",
                    "XOR",
                    "XOR"
            },
            {"10",
                    String.valueOf(R.drawable.hard_1_xor_mati),
                    String.valueOf(R.drawable.hard_1_xor_nyala),
                    "NAND",
                    "AND",
                    "XNOR",
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
