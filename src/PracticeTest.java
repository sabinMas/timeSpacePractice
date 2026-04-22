import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  @Test
  public void testMostCommonTimeEfficient() {
    //Assert
    int[] nums = {0, 1, 2, 3, 4, 0, 4};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Arrange
    //Should be 0, as it is tied with 4, howevever, it is seen first
    assertEquals(0, actual);

  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
