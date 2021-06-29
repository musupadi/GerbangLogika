package com.destiny.gamegerbanglogika.Model.Dificulty.Medium;

import com.destiny.gamegerbanglogika.Model.DataModel;
import com.destiny.gamegerbanglogika.R;

import java.util.ArrayList;

public class NormalModel1 {
        public static String[][] data = new String[][]{
                //OR
                {"1",
                        String.valueOf(R.drawable.normal_3_or_mati),
                        String.valueOf(R.drawable.normal_3_or_nyala),
                        "NAND",
                        "NOR",
                        "AND",
                        "AND"
                },
                {"2",
                        String.valueOf(R.drawable.normal_4_or_mati),
                        String.valueOf(R.drawable.normal_4_or_nyala),
                        "NAND",
                        "NOR",
                        "AND",
                        "AND"
                },
                {"3",
                        String.valueOf(R.drawable.normal_6_or_mati),
                        String.valueOf(R.drawable.normal_6_or_nyala),
                        "XNOR",
                        "AND",
                        "OR",
                        "OR"
                },
                //AND
                {"4",
                        String.valueOf(R.drawable.normal_6_xnor_mati),
                        String.valueOf(R.drawable.normal_6_xnor_nyala),
                        "NAND",
                        "XNOR",
                        "OR",
                        "OR"
                },
                {"5",
                        String.valueOf(R.drawable.normal_3_and_mati),
                        String.valueOf(R.drawable.normal_3_and_nyala),
                        "XNOR",
                        "NOR",
                        "OR",
                        "OR"
                },
                {"6",
                        String.valueOf(R.drawable.normal_5_and_mati),
                        String.valueOf(R.drawable.normal_5_and_nyala),
                        "NOR",
                        "XOR",
                        "OR",
                        "NOR"
                },
                {"7",
                        String.valueOf(R.drawable.normal_6_or_mati),
                        String.valueOf(R.drawable.normal_6_or_nyala),
                        "XOR",
                        "NAND",
                        "OR",
                        "NAND"
                },
                {"8",
                        String.valueOf(R.drawable.normal_1_2_nand_mati),
                        String.valueOf(R.drawable.normal_1_2_nand_nyala),
                        "NAND",
                        "OR",
                        "XOR",
                        "XOR"
                },
                {"9",
                        String.valueOf(R.drawable.normal_1_2_or_mati),
                        String.valueOf(R.drawable.normal_1_2_or_nyala),
                        "XOR",
                        "XNOR",
                        "NAND",
                        "XNOR"
                },
                {"10",
                        String.valueOf(R.drawable.normal_1_2_nand_mati),
                        String.valueOf(R.drawable.normal_1_2_nand_nyala),
                        "XOR",
                        "NOR",
                        "AND",
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
