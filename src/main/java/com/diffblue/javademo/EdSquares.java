// Copyright 2016-2018 Diffblue limited. All rights reserved.

package com.diffblue.javademo;

public class EdSquares {
  /**
   * Maths madness.
  */
  public int doMaths(int javaMaths) {
    if (javaMaths < 0) {
      return 1000;
    }
    for (int i = 0; i < 9; i++) {
      javaMaths = i * i;
    }
    return javaMaths;
  }
}
