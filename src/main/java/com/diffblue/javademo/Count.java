// Copyright 2016-2018 Diffblue limited. All rights reserved.

package com.diffblue.javademo;

public class Count {
  public static void main(String[] args) {
    int[] numbers = {75, 10, 4, 3, 7, 1};
    int a, b, c, d, e, f;

    for (int pos1 = 0; pos1 < 6; pos1++) {
      for (int pos2 = 0; pos2 <  6; pos2++) {
        for (int pos3 = 0; pos3 < 6; pos3++) {
          for (int pos4 = 0; pos4 < 6; pos4++) {
            for (int pos5 = 0; pos5 < 6; pos5++) {
              for (int pos6 = 0; pos6 < 6; pos6++) {
                if (pos1 != pos2 && pos1 != pos3 && pos1 != pos4 && pos1 != pos5 && pos1 != pos6 && pos2 != pos3 && pos2 != pos4 && pos2 != pos5 && pos2 != pos6 && pos3 != pos4 && pos3 != pos5 && pos3 != pos6 && pos4 != pos5 && pos4 != pos6 && pos5 != pos6 ) {
                  a = numbers[pos1];
                  b = numbers[pos2];
                  c = numbers[pos3];
                  d = numbers[pos4];
                  e = numbers[pos5];
                  f = numbers[pos6];

                  bank001(a, b, c, d, e, f);
                  bank002(a, b, c, d, e, f);
                  bank003(a, b, c, d, e, f);
                }
              }
            }
          }
        }
      }
    }
  }

  static void bank001(int aa, int bb, int cc, int dd, int ee, int ff) {
    addAll(aa, 0, 0, 0, 0, 0);
    addAll(aa, bb, 0, 0, 0, 0);
    addAll(aa, bb, cc, 0, 0, 0);
    addAll(aa, bb, cc, dd, 0, 0);
    addAll(aa, bb, cc, dd, ee, 0);
    addAll(aa, bb, cc, dd, ee, ff);

    subTwo(aa, bb, 0, 0, 0, 0);

    multAll(aa, bb, cc, 1 1, 1, 1);
    multAll(aa, bb, cc, 1, 1, 1);
    multAll(aa, bb, cc, dd, 1, 1);
    multAll(aa, bb, cc, dd, ee, 1);
    multAll(aa, bb, cc, dd, ee, ff);

    A_plus_B_minus_stuff(aa, bb, cc, 0, 0, 0);
    A_plus_B_minus_stuff(aa, bb, cc, dd, 0, 0);
    A_plus_B_minus_stuff(aa, bb, cc, dd, ee, 0);
    A_plus_B_minus_stuff(aa, bb, cc, dd, ee, ff);

    A_times_B_plus_stuff(aa, bb, cc, 0, 0, 0);
    A_times_B_plus_stuff(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_stuff(aa, bb, cc, dd, ee, 0);
    A_times_B_plus_stuff(aa, bb, cc, dd, ee, ff);

    A_times_B_minus_stuff(aa, bb, cc, 0, 0, 0);
    A_times_B_minus_stuff(aa, bb, cc, dd, 0, 0);
    A_times_B_minus_stuff(aa, bb, cc, dd, ee, 0);
    A_times_B_minus_stuff(aa, bb, cc, dd, ee, ff);
  }


  static void bank002(int aa, int bb, int cc, int dd, int ee, int ff) {

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, ee, ff);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, -ee, ff);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, -cc, dd, -ee, ff);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, -cc, dd, ee, ff);


    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd, ee, ff);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd,  0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd, -ee, ff);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd,  0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd, -ee, ff);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd, ee, ff);


    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, ee, 1);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, -ee, 1);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, -cc, dd, -ee, 1);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, -cc, dd, ee, 1);


    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd, ee, 1);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd,  0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, dd, -ee, 1);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd,  0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd, -ee, 1);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, dd, ee, 1);


    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, 1, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, 1, 0, 0);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, 1, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, 1, 0, 0);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, 1, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, -cc, 1, 0, 0);

    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, cc, 1, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(aa, bb, -cc, 1, 0, 0);


    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, 1, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, 1, 0, 0);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, 1, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, cc, 1, 0, 0);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, 1,  0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, 1, 0, 0);

    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, 1, 0, 0);
    A_times_B_plus_C_times_D_plus_E_times_F(-aa, bb, -cc, 1, 0, 0);


    A_plus_B_plus_C_times_D(aa, bb, cc, dd, 0, 0);
  }


  static void bank003(int aa, int bb, int cc, int dd, int ee, int ff) {
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, dd, ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, dd, ee, ff);

    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, -dd, ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, -dd, ee, ff);

    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, dd, ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, dd, ee, ff);

    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, -dd, ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, -dd, ee, ff);


    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, dd, ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, dd, ee, -ff);

    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, -dd, ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, bb, cc, -dd, ee, -ff);

    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, dd, -ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, dd, -ee, ff);

    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, -dd, -ee, 0);
    A_plus_B_times_C_plus_D_plus_E_plus_F(aa, -bb, cc, -dd, -ee, -ff);
  }



  static void addAll(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = aa + bb + cc + dd + ee + ff;
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void subTwo(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = Math.abs(aa - bb);
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void multAll(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = aa * bb * cc * dd * ee * ff;
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void A_plus_B_minus_stuff(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = Math.abs(aa + bb - cc - dd - ee - ff);
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void A_times_B_plus_stuff(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = Math.abs(aa * bb + cc + dd + ee + ff);
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void A_times_B_minus_stuff(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = Math.abs(aa + bb - cc - dd - ee - ff);
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void A_times_B_plus_C_times_D_plus_E_times_F(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = Math.abs(aa * bb + cc * dd + ee * ff);
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void A_plus_B_plus_C_times_D(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = Math.abs((aa + bb + cc) * dd);
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }

  static void A_plus_B_times_C_plus_D_plus_E_plus_F(int aa, int bb, int cc, int dd, int ee, int ff) {
    int answer = Math.abs(Math.abs((aa + bb)) * Math.abs((cc + dd)) + ee + ff);
    if (answer > 99 && answer < 1000) {
      System.out.println(answer);
    }
  }
}

