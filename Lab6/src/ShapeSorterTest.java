import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		ShapeSorter sorter2 = new ShapeSorter();

		for(int i = 0; i < 4; i ++) {
			if (sorter.shapes.get(i).compareTo(sorter.shapes.get(i+1)) == -1) {
				sorter2.addShape(sorter.shapes.get(i));
			}
			else {
				sorter2.addShape(sorter.shapes.get(i+1));
			}
			
		}
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter2.shapes.get(0), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter2.shapes.get(1), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter2.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter2.shapes.get(3), c);
		
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 4);//12
		Shape b = new EquilateralTriangle("test2", 4);//6.928
		Shape c = new Square("test3", 3);//9
		Shape d = new Circle("test4", 1.5);//7.07

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), c);
		
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 4);//14
		Shape b = new EquilateralTriangle("test2", 4);//12
		Shape c = new Square("test3", 5);//20
		Shape d = new Circle("test4", 1.5);//9.42

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(0), d);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(2), a);
		Assert.assertEquals("Shapes sorted incorrectly...", sorter.shapes.get(3), c);
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		Assert.assertEquals("To String is incorect", "Rectangle	test	area = 9	perimerter = 12",
				sorter.shapes.get(0).toString());
		
	}
}
