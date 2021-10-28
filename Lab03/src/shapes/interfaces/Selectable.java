package shapes.interfaces;

/**
 * @(#)Selectable.java
 * Interface to make objects {@link Selectable}
 *
 * @author Berke Gokmen
 * @date 2021/10/28
 */
public interface Selectable {
  /**
   * Getter method for isSelected property
   *
   * @return {@link Boolean} isSelected
   */
  public boolean getSelected();

  /**
   * Setter method for isSelected property
   *
   * @param selected boolean value to set to
   */
  public void setSelected(boolean selected);

  /**
   * Method to check if the given point is inside the circle
   *
   * @param x coordinate of the point
   * @param y coordinate of the point
   * @return {@link Boolean} result
   */
  public boolean contains(int x, int y);
}
