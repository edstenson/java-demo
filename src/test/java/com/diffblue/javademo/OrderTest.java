/*
 * Test generated by Diffblue Deeptest.
 * This test case covers:
 *  - conditional line 10 branch to line 13
 *  - com/diffblue/javademo/EdSquares.java:13: loop: 9 iterations
 */

@Test
public void doMathsInpu000d02606bce1671198() {

  // Arrange
  final EdSquares objectUnderTest = new EdSquares();
  final int javaMaths = 0;

  // Act
  final int retval = objectUnderTest.doMaths(javaMaths);

  // Assert result
  Assert.assertEquals(64, retval);
}
